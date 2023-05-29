package Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Method_1.Wait_For_Element;

public class Logout_Page extends Wait_For_Element {
		
		WebDriver driver;
		
		public Logout_Page(WebDriver driver) {
			
			super(driver);
			//initialization
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		//PageFactory
		
		//@FindBy(xpath="//*[contains(text(),'Log Out')]")
		//WebElement Logout;
		
		By Logout = By.xpath("//*[contains(text(),'Log Out')]");
		
		public void logoutApplication() {
			wait_For_Element_ToAppear_And_Click(Logout);
		}
			
	}

