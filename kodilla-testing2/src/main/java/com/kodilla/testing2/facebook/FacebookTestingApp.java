package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_BDAY_DAY = "//*[@id=\"day\"]";
    public static final String XPATH_BDAY_MONTH ="//*[@id=\"month\"]";
    public static final String XPATH_BDAY_YEAR ="//*[@id=\"year\"]";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement selectComboBdayDay = driver.findElement(By.xpath(XPATH_BDAY_DAY));
        Select selectBoardDay =  new Select(selectComboBdayDay);
        selectBoardDay.selectByIndex(1);

        WebElement selectComboBdayMonth = driver.findElement(By.xpath(XPATH_BDAY_MONTH));
        Select selectBoardMonth =  new Select(selectComboBdayMonth);
        selectBoardMonth.selectByIndex(1);

        WebElement selectComboBdayYear = driver.findElement(By.xpath(XPATH_BDAY_YEAR));
        Select selectBoardYear =  new Select(selectComboBdayYear);
        selectBoardYear.selectByIndex(1);
    }

}
