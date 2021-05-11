package com.lilith.autoweb.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

/**
 * @Author:JiaJingnan
 * @Date: 上午1:52 2021/5/12
 */
public class LiSelenium {

    public static void main(String[] args) {
        String driverPath = "src/main/java/com/lilith/autoweb/driver/chromedriver";
        System.setProperty("webdriver.chrome.driver",driverPath);
        System.setProperty("webdriver.chrome.driver",driverPath);
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://github.com/");
        webDriver.close();
    }
}
