package com.cybertek.tests.day02_browser_level_operation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrlAndSource {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        String url = "https://www.etsy.com";

        WebDriver driver = new ChromeDriver();

        driver.get(url);

        // read title of the page and print

        System.out.println("Title: " + driver.getTitle());

        // store the title into a String variable

        String etsyTitle = driver.getTitle();
        System.out.println("etsyTitle = " + etsyTitle); // soutv

        // read the url of the current page
        System.out.println("Current url: " + driver.getCurrentUrl());
        // store the url into a String variable currentUrl
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);


        // read page source and print it
        System.out.println("HTML page source: "+ driver.getPageSource());
        
        // store the source code into a variable then print the char count
       
        String pageSource = driver.getPageSource();
        System.out.println("pageSource.length() = " + pageSource.length());

        Thread.sleep(4000);

        // close the browser: driver.close() , driver.quit()
        driver.quit();

    }
}
