package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tes_demo {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Desktop/demologin.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("shivaji");
		driver.findElement(By.name("PW")).sendKeys("961993");
		
		
		

	}

}
