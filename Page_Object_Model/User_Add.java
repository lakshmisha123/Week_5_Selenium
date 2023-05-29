package Page_Object_Model;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Method_1.Wait_For_Element;
public class User_Add extends Wait_For_Element{
		
		WebDriver driver;
		
		public User_Add (WebDriver wd) {
			
			super(wd);
		
			this.driver=wd;	
			PageFactory.initElements(driver, this);
		} 
		
		@FindBy(xpath="(//*[contains(text(),'HR Administration')])[2]")
		WebElement HRAdmini;
		
		@FindBy(xpath="//*[contains(text(),'Username ')]")
		WebElement username1;
		
		@FindBy(xpath="//i[contains(text(),'add')]")
		WebElement Add;
		
		@FindBy(xpath="//*[@id='selectedEmployee_value']")
		WebElement EName;
		
		@FindBy(xpath="(//*[@class='angucomplete-title'])[1]")
		WebElement Selectename;
		
		@FindBy(xpath="//*[@id='user_name']")
		WebElement UserName;
		
		@FindBy(xpath="(//*[contains(text(),'arrow_drop_down')])[4]")
		WebElement Selectrole;
		
		@FindBy(xpath="(//*[contains(text(),'Asset Manager')])[2]")
		WebElement SelectroleName;
		
		@FindBy(xpath="//*[@id='password']")
		WebElement password;
		
		@FindBy(xpath="//*[@id='confirmpassword']")
		WebElement Confirm;
		
		@FindBy(xpath="//*[@id='modal-save-button']")
		WebElement save;
		
		@FindBy(xpath="(//*[@class='btn btn-secondary'])")
		WebElement saveUser;
		
		@FindBy(xpath="//*[contains(text(),'more_horiz')]")
		WebElement Dropdown;
		
		@FindBy(xpath="//*[@id='systemUserDiv']//tr[1]//td[1]")
		WebElement selectAll;
		
		@FindBy(xpath="//*[@class='name']")
		WebElement name;
		
		@FindBy(xpath="//*[contains(text(),'Delete Selected')]")
		WebElement deleteSelected;
		
		@FindBy(xpath="//*[contains(text(),'Yes, Delete')]")
		WebElement yes;
		
		
		By HRAdministration = By.xpath("(//span[contains(text(),'HR Administration')])[1]");
	
		By usernameforwait = By.xpath("//*[contains(text(),'Username ')]");
		By addUser = By.xpath("//i[contains(text(),'add')]");
		
		By eName = By.xpath("//*[@id='selectedEmployee_value']");
		By selectEname = By.xpath("(//*[@class='angucomplete-title'])[1]");
		By Username = By.xpath("//*[@id='user_name']");
		By SelectRole = By.xpath("(//*[contains(text(),'arrow_drop_down')])[4]");
		By SelectRoleName = By.xpath("(//*[contains(text(),'Asset Manager')])[2]");
		By Password = By.xpath("//*[@id='password']");
		By ConfirmPassword = By.xpath("//*[@id='confirmpassword']");
		
		By Save = By.xpath("//*[@id='modal-save-button']");
		By Saveuser = By.xpath("(//*[@class='btn btn-secondary'])");
		
		By Name = By.xpath("//*[@class='name']");
		
		By DropDown = By.xpath("//*[contains(text(),'more_horiz')]");
		By SelectAll = By.xpath("//*[@id='systemUserDiv']//tr[1]//td[1]");
		By DeleteSelected = By.xpath("//*[contains(text(),'Delete Selected')]");
		By Yes = By.xpath("//*[contains(text(),'Yes, Delete')]");
		
		
		public void HRAdmin() {
			
			wait_For_Element_ToAppear_And_Click(HRAdministration);
			waitForElementToAppear(usernameforwait);

			wait_For_Element_ToAppear_And_Click(addUser);
		}	
			
		public void UserDetails(String EmployeName,String userName,String PassWord,String confirmPassWord) {
			
			waitForElementToAppear(eName);
			EName.sendKeys(EmployeName);
			
			wait_For_Element_ToAppear_And_Click(selectEname);
			
			waitForElementToAppear(Username);
			UserName.sendKeys(userName);
			
			wait_For_Element_ToAppear_And_Click(SelectRole);
			
			wait_For_Element_ToAppear_And_Click(SelectRoleName);
			
			waitForElementToAppear(Password);
			password.sendKeys(PassWord);
			waitForElementToAppear(ConfirmPassword);
			Confirm.sendKeys(confirmPassWord);

			wait_For_Element_ToAppear_And_Click(Save);
			
			wait_For_Element_ToAppear_And_Click(Saveuser);
		}
		
		public void Verifying() {
			
			waitForElementToAppear(Name);
			String a = name.getText();
			System.out.print(a);
		    String b = "Aaliyah Haq";
		    if(a==b) {
		    	System.out.print(true);
		    }else {
		    	System.out.print(false);
		    }    
		}
		
		public void DeleteUser() {
			wait_For_Element_ToAppear_And_Click(HRAdministration);
			
			waitForElementToAppear(usernameforwait);
			
			wait_For_Element_ToAppear_And_Click(SelectAll);
			
			wait_For_Element_ToAppear_And_Click(DropDown);
			
			wait_For_Element_ToAppear_And_Click(DeleteSelected);
			
			wait_For_Element_ToAppear_And_Click(Yes);
			
		}
		
	}
