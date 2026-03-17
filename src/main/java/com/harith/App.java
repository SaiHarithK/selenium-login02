package com.harith;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class App {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();



        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();

        String heading = driver.findElement(By.tagName("h1")).getText();
        System.out.println("Page Heading: " + heading);

    }
}
