package testCase_POM;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utility_packages.Listen1;

public class Launch_Quit1 extends Listen1{
	
	@BeforeMethod
	public void launch()
	{
		driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
	}
	
	@AfterMethod()
	public void post1()
	{
		driver.quit();
	}

	

}
