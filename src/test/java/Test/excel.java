package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class excel {
@Test
public void test_001() throws Exception {
	 WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com/login/");
     driver.manage().window().maximize();
     String path="C:\\Users\\LENOVO\\eclipse-workspace\\eclips data\\Zealous\\testdata\\Testdata.xlsx";
     FileInputStream file=new FileInputStream(path);
	      XSSFWorkbook wb=new XSSFWorkbook(file);
	     String shiva=  wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	      String dilip= wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	      WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
	   WebElement pass= driver.findElement(By.xpath("//input[@id='pass']"));
	      email.sendKeys(shiva);
	      pass.sendKeys(dilip);
	      System.out.println(shiva);
	      System.out.println(dilip);
	      
}
}
