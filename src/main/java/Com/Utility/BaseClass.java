package Com.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static ExcelDataProvider excel;
	public static configDataProvider config;
	@BeforeSuite
	public void BS() {
		excel=new ExcelDataProvider();
		config=new configDataProvider();
		
	}
          @BeforeMethod
          public void setup() {
        	  
        	  WebDriverManager.chromedriver().setup();
        	  driver=new ChromeDriver();
        	  driver.get("");
        	  driver.manage().window().maximize();
        	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	  
          }
	@AfterMethod
	public void teardown() {
		//driver.quit();
	}
	
	
	
	
	
	
	
	
	
}
