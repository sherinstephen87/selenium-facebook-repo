package com.assignment.my_assignment;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
		/*
		 * Calculator calc = new Calculator(); int sum = calc.sum(10, 20); int diff =
		 * calc.diff(20, 10);
		 * 
		 * System.out.println("Sum is: " + sum); System.out.println("Difference is: " +
		 * diff);
		 */
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.facebook.com");

        driver.getTitle();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[3]/div[2]/form/div[2]/div[1]/input"));
        WebElement submitButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[3]/div[2]/form/div[2]/div[3]/button"));
        
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        textBox.sendKeys("testing4567@gmail.com");
        
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        submitButton.click();

        WebElement message = driver.findElement(By.xpath("//div[@class='fsl fwb fcb']"));
        //message.getText();
        System.out.println(message.getText());
        
        //Capture Screenshot
        TakesScreenshot scrshot = ((TakesScreenshot)driver);
        File srcFile = scrshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("test-report.jpg");
        try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
        
        
        
        driver.quit();
        
        
    }
}
