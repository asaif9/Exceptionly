package test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ionicpartners {

	@Test
	public static void blogscroll() {
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Reporter rs = new Reporter();
		// maximize window
		driver.manage().window().maximize();

		// Applied wait time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// open browser with desried URL
		driver.get("https://www.ionicpartners.com");

		// Find blog webelement
		WebElement element = driver.findElement(By.xpath("//*[@id='slider-11-slide-92-layer-160']"));

		// Javascript to execute hidden element
		String clickonhiddenelement = "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';arguments[0].click();";
		js.executeScript(clickonhiddenelement, element);
		rs.log("Clicked on blog sucessfully");
		String title_blog = driver.getTitle();
		assertEquals(title_blog, "Blog");
		rs.log("Page title verified");
		// Javascript to execute scroll to bottom of page
		String Scrolldown = "window.scrollBy(0,document.body.scrollHeight);";
		js.executeScript(Scrolldown);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rs.log("Scroll to the bottom of page");
		String copyright = driver
				.findElement(By.xpath("//p[contains(text(),'500 W 5th St, Suite 1010 Austin, TX 78701 - Copyri')]"))
				.getText();
		assertEquals(copyright,
				"500 W 5th St, Suite 1010 Austin, TX 78701 - Copyright © 2021 Ionicpartners - All Rights Reserved.");
		driver.close();

	}

	@Test
	public static void Aboutscroll() {
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Reporter rs = new Reporter();
		// maximize window
		driver.manage().window().maximize();

		// Applied wait time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// open browser with desried URL
		driver.get("https://www.ionicpartners.com");

		// Find blog webelement
		WebElement element = driver.findElement(By.xpath("//*[@id='slider-11-slide-47-layer-32']"));

		// Javascript to execute hidden element
		String clickonhiddenelement = "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';arguments[0].click();";
		js.executeScript(clickonhiddenelement, element);
		rs.log("Clicked on About Us sucessfully");
		String title_blog = driver.getTitle();
		assertEquals(title_blog, "About Us");
		rs.log("Page title verified");
		// Javascript to execute scroll to bottom of page
		String Scrolldown = "window.scrollBy(0,document.body.scrollHeight);";
		js.executeScript(Scrolldown);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rs.log("Scroll to the bottom of page");
		String copyright = driver
				.findElement(By.xpath("//p[contains(text(),'500 W 5th St, Suite 1010 Austin, TX 78701 - Copyri')]"))
				.getText();
		assertEquals(copyright,
				"500 W 5th St, Suite 1010 Austin, TX 78701 - Copyright © 2021 Ionicpartners - All Rights Reserved.");
		WebElement twitter = driver.findElement(By.xpath("//*[@id=\"footer\"]/div/div/div/div[2]/div[2]/a[1]/i"));

		if (twitter.isDisplayed()) {
			assert (true);
			twitter.click();
			rs.log("Clicked on the twitter icon successfully");
		} else
			assert (false);

		driver.close();

	}

}
