package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testsuite1 {
 @Test
public void negativelogin() throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait (30, TimeUnit.SECONDS);
		driver.get("http://magento.com");
		driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")).click();
		driver.findElement(By.id("email")).sendKeys("sanju.poudel05@gmail.com");
     driver.findElement(By.id("pass")).sendKeys("welcome123");
     driver.findElement(By.id("send2")).click();
     Thread.sleep(5000);
     String error = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")).getText();
     System.out.println(error);
     driver.quit();
     
}
}
