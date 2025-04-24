package com.petstore;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.github.dockerjava.transport.DockerHttpClient.Request.Method;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	
	public void method() {
		
	}
	
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
//		System.setProperty("webdriver.edgedriver.driver", "path");
		
		System.out.println("started");
		EdgeOptions options = new EdgeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-popups");
//		options.addArguments("--headless");
		WebDriver driver = new EdgeDriver(options);
		System.out.println("ended");
		JavascriptExecutor js = (JavascriptExecutor)driver;
	}

}
