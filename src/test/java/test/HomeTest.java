package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class HomeTest {
	
	static ExtentReports reports;
	static ExtentTest tests;
	static ExtentReports extent=new ExtentReports();
	
public static WebDriver driver;
	@BeforeTest
	public void setup() {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse_cobrand\\jenkins_demo\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
		//ExtentSparkReporter spark=new ExtentSparkReporter("target/spark.html");
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//extent.flush();
	
		
	}
	
	
	@Test
	public void testOne() throws InterruptedException {
		extent.createTest("first TC", "executing first tc....");
		HomePage home=new HomePage(driver);
		
		home.click_on_hamburger();
		home.click_on_online_product();
		home.verify_on_formal_shoe();//
		
	}
	
	@Test
	public void testTwo() {
		
		System.out.println("2nd tc.........");
		
	}
	
	
	
	
	

}
