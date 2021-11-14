package package1;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class StepDefinition {
	WebDriver driver;

	@Before
	public void initData() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jedidi Rania\\ChromeDriver\\chromedriver.exe");
		String URL = "https://demo.guru99.com/test/newtours/reservation.php";
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
	}
	@Test
	public void RadioButtonCheckOk() {
		
		List<WebElement> RadioButtons = driver.findElements(By.name("servClass"));
		RadioButtons.get(1).click();
		
		//assert
		String ExpectedResult ="Business";
		for (WebElement RadioButton : RadioButtons) {
			if(RadioButton.isSelected()) {
				
				assertEquals(ExpectedResult, RadioButton.getAttribute("value"));
			}
		}
	}

	@After
	public void finishThisProcedure() {

		//driver.close();
		//driver.quit();

	
}
}
