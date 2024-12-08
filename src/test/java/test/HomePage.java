package test;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class HomePage {

	ExtentReports reports;
	ExtentTest tests;
	ExtentReports extent = new ExtentReports();

	public static WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='checkbox']")
	public WebElement hamburgerClick;

	public void click_on_hamburger() throws InterruptedException {
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].click()", hamburgerClick);*/
	
		hamburgerClick.click();
	}

	@FindBy(xpath = "//li[normalize-space()='Online Products']")
	public WebElement online_search_product;

	public void click_on_online_product() {
		online_search_product.click();
	}

	@FindBy(xpath = "//h2[normalize-space()='Formal Shoes']")
	public WebElement formalShoes;

	public void verify_on_formal_shoe() {
		System.out.println(driver.getTitle());
		String expected = "Formal Shoes";
		String actual = formalShoes.getText();

		Assert.assertEquals(actual, expected);

	
		if (actual.equals(expected)) {
			
			System.out.println("pass");

		} else {
			System.out.println("fail");
		}

	}

	public void click_on_sport_shoe() {
	}
}
