package Test_Case;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import Page_Object_Model.Logout_Page;
import Page_Object_Model.Login_Page;
import Page_Object_Model.User_Add;
public class First_Scenario {
WebDriver driver;
	
	@BeforeSuite
	public void Launching() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	
	
	@BeforeTest
	public void Login() {
		
		Login_Page Object_For_Login_Page = new Login_Page(driver);
		Object_For_Login_Page.goTo();
		Object_For_Login_Page.loginApplication("Admin","1@bpETBV2d");
	}
	
	
	
	@Test(enabled=true, priority=0) 
	public void Adding_New_User_In_Addmin_Section() throws InterruptedException {
			
		//Navigating to User Add Page
		User_Add HrAdministration = new User_Add(driver);
		HrAdministration.HRAdmin();
		
		//User details;
		HrAdministration.UserDetails("a", "Aavinasha", "1234Avi#", "1234Avi#");
		
		//Logout page
		Logout_Page Object_For_Logout_Page = new Logout_Page(driver);
		Object_For_Logout_Page.logoutApplication();
		
		//Login With Added User
		Login_Page Object_For_Login_Page = new Login_Page(driver);
		Object_For_Login_Page.loginByNewUser("Aavinasha", "1234Avi#");
		
		// Verifying UserName added
		HrAdministration.Verifying();
	    
		// Deleting Added User
		Object_For_Logout_Page.logoutApplication();
		Object_For_Login_Page.loginApplication("Admin","1@bpETBV2d");
		HrAdministration.DeleteUser();
		Object_For_Logout_Page.logoutApplication();
		
	}
	
	@AfterSuite
	public void Quit() {
		//Closing chrome Controlled By Sele
		driver.quit();
	}
}

