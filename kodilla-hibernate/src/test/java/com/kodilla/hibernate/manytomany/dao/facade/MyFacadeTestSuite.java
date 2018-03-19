package com.kodilla.hibernate.manytomany.dao.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.facade.MyFacade;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyFacadeTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private MyFacade myFacade;

    @Test
    public void testMyFacadeSearchCompanies() {

        //Given
        Company softwareMachine = new Company("Machine Software");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter Machine");

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        //When
        List<Company> findCompany = myFacade.findCompanies("Machine");

        //Then
        try {
            Assert.assertEquals(11, findCompany.size());
        } finally {
        //CleanUp
            companyDao.delete(softwareMachine.getId());
            companyDao.delete(dataMaesters.getId());
            companyDao.delete(greyMatter.getId());
        }
    }

    @Test
    public void testMyFacadeSearchEmployees() {

        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", " Smith Clarckson");
        Employee lindaKovalsky = new Employee("Linda Stephanie", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        //When
        List<Employee> findEmployee = myFacade.findEmployee("Smith");

        //Then
        try {
            Assert.assertEquals(7, findEmployee.size());
        } finally {
            //CleanUp
            companyDao.delete(softwareMachine.getId());
            companyDao.delete(dataMaesters.getId());
            companyDao.delete(greyMatter.getId());
        }
    }
}
