package stepDefinitionCVS;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class OnlineShopCVS {
	WebDriver driver;

	@Given("^browser details of CVC$")
	public void browser_details_of_cvc() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dinav\\Downloads\\chromedriver_win32_Version2.35\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@When("^browser trigerred to CVC website$")
	public void browser_trigerred_to_cvc_website() throws Throwable {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.cvs.com/");

	}

	@Then("^check whether CVC browser is opened.$")
	public void check_whether_cvc_browser_is_opened() throws Throwable {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Given("^The user clicks on Shop Online and selects the category Vitamins$")
	public void the_user_clicks_on_shop_online_and_selects_the_category_vitamins() throws Throwable {
		driver.findElement(By.linkText("Shop Online")).click();
		driver.findElement(By.xpath("//p[text()='Vitamins']")).click();

	}

	@When("^the user selects Children's Vitamins and selects Enfamil Polyvisol and add to basket$")
	public void the_user_selects_childrens_vitamins_and_selects_enfamil_polyvisol() throws Throwable {

		// d.until(ExpectedConditions
		// .elementToBeClickable(driver.findElement(By.xpath("//p[text()='Children’s
		// Health']")))).click();
		driver.findElement(By.xpath("//p[text()='Children’s Health']")).click();
		try {
			driver.findElement(By.xpath("//a[@title='No, thanks']")).click();
		} catch (Exception e) {
			System.out.println("Pop up not found");
		}
		driver.findElement(By.xpath("//img[@alt='Enfamil Poly-Vi-Sol With Iron, 1.69 OZ']")).click();
		driver.findElement(By.xpath(
				"//button[@class='cvsui-c-button gbcvs-c-addToCart__atcBtn cvsui-c-button--lg cvsui-c-button--primary    ']"))
				.click();
	}

	@Then("^Enfamil Polyvisol should be added to cart$")
	public void enfamil_polyvisol_should_be_added_to_cart() throws Throwable {
		try {
			driver.findElement(By.xpath("//a[@title='No, thanks']")).click();
		} catch (Exception e) {
			System.out.println("Pop up not found");
		}
		String addBasket = driver.findElement(By.xpath("//h2[@id='modalTitle']")).getText();
		System.out.println("added to cart " + addBasket);
		driver.close();

	}

	@Given("^the user is in Home Page$")
	public void the_user_is_in_Home_Page() throws Throwable {
		String title = driver.getTitle();
		System.out.println(title);
		

	}

	@When("^the user types \"([^\"]*)\" in Search Button$")
	public void the_user_types_something_in_search_button(String item) throws Throwable {
		System.out.println("item is  " + item);
		driver.findElement(By.xpath("//input[@id='searchbox']")).sendKeys(item);
		driver.findElement(By.xpath("//button[@alt='Submit Search']")).click();
		// driver.findElement(By.xpath("//input[@id='searchbox']")).sendKeys(Keys.ENTER);

		WebDriverWait d = new WebDriverWait(driver, 20);
		
		d.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath("//img[@alt='Tylenol 8 Hour Arthritis Pain Caplets 650mg']")))).click();
	//	d.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//label[contains(text(),'100 CT')]")))).click();
		driver.findElement(By.xpath("//label[contains(text(),'100 CT')]")).click();
		try {
			driver.findElement(By.xpath("//a[@title='No, thanks']")).click();
		} catch (Exception e) {
			System.out.println("Pop up not found");
		}
		driver.findElement(By.xpath("//div[@class='gbcvs-c-addToCart']")).click();

		
	}

	@Then("^the tynelol search result should display$")
	public void the_tynelol_search_result_should_display() throws Throwable {
		driver.close();
	}
	
	@Given("^the user is in homepage and click on Create an Account$")
    public void the_user_is_in_homepage_and_click_on_create_an_account() throws Throwable {
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[@value='custom:home:header:create an account link']")).click();
    }

    @When("^the user sends the Form Information$")
    public void the_user_sends_the_form_information(DataTable data) throws Throwable {
    	
       List<List<String>> info =data.raw();
       driver.findElement(By.id("firstName")).sendKeys(info.get(0).get(0));
       
       driver.findElement(By.id("lastName")).sendKeys(info.get(0).get(1));
       driver.findElement(By.id("email")).sendKeys(info.get(0).get(2));
       
       driver.findElement(By.id("password")).sendKeys(info.get(0).get(3));
       
       driver.findElement(By.id("confirmPassword")).sendKeys(info.get(0).get(4));
       
       Select s = new Select(driver.findElement(By.id("securityQuestion")));
      
       s.selectByValue("string:1002");
      
       
       
       driver.findElement(By.id("securityAns")).sendKeys(info.get(0).get(5));
       
       WebDriverWait d1 = new WebDriverWait(driver, 20);
		
       d1.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.id("continueAccount")))).click();
       d1.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("street")))).sendKeys(info.get(0).get(6));
      // driver.findElement(By.id("street")).sendKeys(info.get(0).get(0));
       driver.findElement(By.id("aptBldg")).sendKeys(info.get(0).get(7));
       
       driver.findElement(By.id("city")).sendKeys(info.get(0).get(8));
       Select s1 = new Select(driver.findElement(By.id("state")));
       
       s1.selectByValue("MN");
       driver.findElement(By.id("zip")).sendKeys(info.get(0).get(9));
       driver.findElement(By.id("phoneNum")).sendKeys(info.get(0).get(10));
       driver.findElement(By.id("month")).sendKeys(info.get(0).get(11));
       driver.findElement(By.id("day")).sendKeys(info.get(0).get(12));
       driver.findElement(By.id("year")).sendKeys(info.get(0).get(13));
 Select s2 = new Select(driver.findElement(By.id("gender")));
       
       s2.selectByValue("F");
     
    
       
    }
    
    @Then("^the information is filled in and control ends in Create Account$")
    public void the_information_is_filled_in_and_control_ends_in_create_account() throws Throwable {
    	 driver.findElement(By.id("creatAccount")).click(); 
    	 driver.close();
    }
    
   
    @Given("^the user is in homepage and clicks on Sign in$")
    public void the_user_is_in_homepage_and_clicks_on_Sign_in() throws Throwable {
    	System.out.println(driver.getTitle());
    }

    @When("^the user provides (.+) and (.+)$")
    public void the_user_provides_and(String email, String password) throws Throwable {
    	
    	Thread.sleep(3000);
    	driver.findElement(By.id("signInBtn")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.id("email")).sendKeys(email);
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//button[@type='button']")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//button[@type='button']")).click();
    }

    @Then("^validate the user and password$")
    public void validate_the_user_and_password() throws Throwable {
    	driver.close();

    }

}
