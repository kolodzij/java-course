package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoce.Invoice;
import com.kodilla.hibernate.invoce.Item;
import com.kodilla.hibernate.invoce.Product;
import com.kodilla.hibernate.invoce.dao.InvoiceDao;
import com.kodilla.hibernate.invoce.dao.ItemDao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
 //   @Autowired
  //  private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        Item item1 = new Item(new BigDecimal(110),3);
        Item item2 = new Item(new BigDecimal(80),1);
        Item item3 = new Item(new BigDecimal(45),6);
        item1.setProduct(new Product("product1"));
        item2.setProduct(new Product("product2"));
        item3.setProduct(new Product("product3"));

        Invoice invoice = new Invoice("2017/03/12/0023");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.delete(id);
    }
}
