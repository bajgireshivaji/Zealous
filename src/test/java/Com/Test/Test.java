package Com.Test;

import org.openqa.selenium.support.PageFactory;

import Com.Utility.BaseClass;
import Com.pageObject.LoginPom;

public class Test extends BaseClass{
@org.testng.annotations.Test
public static void tc_001() {
	LoginPom login=PageFactory.initElements(driver, LoginPom.class);
	login.getTxt_email().sendKeys(null);
	login.getTxt_pass().sendKeys(null);
}
	
	
	
	
	
	
	
	
}
