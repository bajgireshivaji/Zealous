package Test;


import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AlertHandelling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	String path="C:\\Users\\LENOVO\\eclipse-workspace\\eclips data\\Zealous\\TestData\\Data.xlsx";
	FileInputStream file=new FileInputStream(path);
	XSSFWorkbook wb=new XSSFWorkbook(file);
	String TestData=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	String TestData1=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	WebElement email=driver.findElement(By.xpath("//input[@name='email'"));
WebElement pass=driver.findElement(By.xpath("//input[@name='pass'"));
WebElement login=driver.findElement(By.xpath("//button[@name='login'"));
email.sendKeys(TestData);
pass.sendKeys(TestData1);
login.click();
	
	
	}

}
