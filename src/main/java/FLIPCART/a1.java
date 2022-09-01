package FLIPCART;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.ScrollBy(0,500)", "");
		
		
		
		
		
		
		//WebElement search_bar=driver.findElement(By.xpath("//input[@name='q']"));
		//search_bar.sendKeys("iphone");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		
		
		
		
	}

}
