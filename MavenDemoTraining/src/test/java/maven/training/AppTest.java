package maven.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {
	
	@Test
	public void OpenBrowser()
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\BrowserDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver cdriver=new ChromeDriver();
		cdriver.manage().window().maximize();
		System.out.println("Browser launched");
	}
	
	@Test(enabled=false)
	
	public void TestMethod1()
	{
		System.out.println("Test method1 executed");
		
	}
	
	@BeforeTest
	
	public void B4Test()
	{
		System.out.println("@BeforeTest is executed");
	}
	
	@BeforeMethod
	
	public void B4Methiod()
	{
		
		System.out.println("@BeforeMethod is executed");
	}
	
	@AfterTest
	
	public void AtferTest()
	{
		System.out.println("@AfterTest is executed");
	}
	
	@org.testng.annotations.AfterMethod
	
	public void AfterMethod()
	{
		
		System.out.println("@After Methof is executed");
	}
	@Test(dependsOnMethods="XyzMethod")
	
	public void AbcMethod()
	{
		
		System.out.println("Alphabetically First method is executed");
	}
	
	
	@Test(groups=("FirstPriority"))
	public void XyzMethod()
	{
		
		System.out.println("Alphabetically last method is executed");
		System.out.println("From annotationsTestNG");
	}
	
}
