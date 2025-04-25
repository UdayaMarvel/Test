package com.demopack1;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakesSSDemo {

	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.findElement(By.name("q")).sendKeys("csk"+Keys.ENTER);
        
        //Screenshot using TakesScreenshot
        Thread.sleep(300);
        TakesScreenshot sshot = (TakesScreenshot) driver;
        File sourcefile = sshot.getScreenshotAs(OutputType.FILE);
        
        File destfile = new File("E://sample.png");
        FileHandler.copy(sourcefile, destfile);
        
        //Screenshot using Robot Class
        Robot robot = new Robot();
        Dimension scrsize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle scrrect = new Rectangle(scrsize);
        BufferedImage fullsrc = robot.createScreenCapture(scrrect);
        
        File destfile2 = new File("E://robosample.png");
        ImageIO.write(fullsrc, "png", destfile2);

	}

}
