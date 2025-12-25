/*Case Study - TestNG Launch Multiple Browser	
	Sample test, we will automate the following test scenarios:
	1.	User TestNG Framework  and Open URL's
			a.	Chrome Browser
			b.	Firefox
			c.	Edge
	2.URL's	"https://www.selenium.dev/downloads/";
	        "https://www.hollandandbarrett.com/";
	        "https://testng.org/";
	3.Get Page Title ,Current URL and Title length
	4.Print Page Title and Page URL  on the Eclipse Console
	5.Again come back to the Home page using To command and Refresh the Browser
	5.Get page URL and verify whether it is the desired page or not
	6.Close the Browser
*/

package com.MavenTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleBrowserTest {
	WebDriver driver;
	String ChromeBaseUrl = "https://www.selenium.dev/downloads/";
	String FirefoxBaseUrl = "https://www.hollandandbarrett.com/";
	String EdgeBaseUrl = "https://testng.org/";

	@Test(priority = 2)
	public void ChromeTest() {
		System.setProperty("webdriver.chrome.driver", "./Chrome Browser Jars/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ChromeBaseUrl);
		
		String expectedTitle = "Downloads | Selenium";
		String actualTitle = driver.getTitle();		
		String url = driver.getCurrentUrl();
        int urlLength = url.length();
        System.out.println("Current URL: " + url);
        System.out.println("URL Length: " + urlLength);
        
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title matched: Test Script Passed: Did a Wonderful Job.....!");
		} else {
			System.out.println("Title not matched: Test Script Failed: Mentor Is Bad ");
		}
		
		String actualURL = url;
		String expectedURL = driver.getCurrentUrl();	
		driver.navigate().refresh();
		if (actualURL.equals(expectedURL)) {
			System.out.println("URL matched: Test Script Passed: Did a Wonderful Job.....! ");
		} else {
			System.out.println("URL not matched: Test Script Failed: Did Job");
		}
		driver.quit();
	}
	
	@Test(priority = 1)
	public void FirefoxTest() {
		System.setProperty("webdriver.gecko.driver", "./Firefox Driver Jars/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(FirefoxBaseUrl);

		String expectedTitle = "Holland & Barrett - The UK's Leading Health & Wellness Store";
		String actualTitle = driver.getTitle();
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title matched: Test Script Passed");
		} else {
			System.out.println("Title not matched: Test Script Failed");
		}
		driver.quit();
	}
	
	@Test(priority = 0)
	public void EdgeTest() {
		System.setProperty("webdriver.edge.driver", "./Edge Driver Jars/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(EdgeBaseUrl);
		
		String expectedTitle = "TestNG Documentation";
		String actualTitle = driver.getTitle();
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title matched: Test Script Passed");
		} else {
			System.out.println("Title not matched: Test Script Failed");
		}
		driver.quit();
	}
	
	@Test(priority = 3)
	public void ChromeTest1() {
		System.setProperty("webdriver.chrome.driver", "./Chrome Browser Jars/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ChromeBaseUrl);
		
		String expectedTitle = "Selenium";
		String actualTitle = driver.getTitle();		
		String url = driver.getCurrentUrl();
        int urlLength = url.length();
        System.out.println("Current URL: " + url);
        System.out.println("URL Length: " + urlLength);
        
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title matched: Test Script Passed: Did a Wonderful Job.....!");
		} else {
			System.out.println("Title not matched: Test Script Failed: Mentor Is Bad ");
		}
		
		String actualURL = url;
		String expectedURL = driver.getCurrentUrl();	
		driver.navigate().refresh();
		if (actualURL.equals(expectedURL)) {
			System.out.println("URL matched: Test Script Passed: Did a Wonderful Job.....! ");
		} else {
			System.out.println("URL not matched: Test Script Failed: Did Job");
		}
		driver.quit();
	}
	@Test(priority = 4)
	public void ChromeTest2() {
		System.setProperty("webdriver.chrome.driver", "./Chrome Browser Jars/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ChromeBaseUrl);
		
		String expectedTitle = "Raghavendra";
		String actualTitle = driver.getTitle();		
		String url = driver.getCurrentUrl();
        int urlLength = url.length();
        System.out.println("Current URL: " + url);
        System.out.println("URL Length: " + urlLength);
        
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title matched: Test Script Passed: Did a Wonderful Job.....!");
		} else {
			System.out.println("Title not matched: Test Script Failed: Mentor Is Bad ");
		}
		
		String actualURL = url;
		String expectedURL = driver.getCurrentUrl();	
		driver.navigate().refresh();
		if (actualURL.equals(expectedURL)) {
			System.out.println("URL matched: Test Script Passed: Did a Wonderful Job.....! ");
		} else {
			System.out.println("URL not matched: Test Script Failed: Did Job");
		}
		driver.quit();
	}
	@Test(priority = 5)
	public void ChromeTest4() {
		System.setProperty("webdriver.chrome.driver", "./Chrome Browser Jars/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ChromeBaseUrl);
		
		String expectedTitle = "Downloads 3| Selenium";
		String actualTitle = driver.getTitle();		
		String url = driver.getCurrentUrl();
        int urlLength = url.length();
        System.out.println("Current URL: " + url);
        System.out.println("URL Length: " + urlLength);
        
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title matched: Test Script Passed: Did a Wonderful Job.....!");
		} else {
			System.out.println("Title not matched: Test Script Failed: Mentor Is Bad ");
		}
		
		String actualURL = url;
		String expectedURL = driver.getCurrentUrl();	
		driver.navigate().refresh();
		if (actualURL.equals(expectedURL)) {
			System.out.println("URL matched: Test Script Passed: Did a Wonderful Job.....! ");
		} else {
			System.out.println("URL not matched: Test Script Failed: Did Job");
		}
		driver.quit();
	}

	@Test(priority = 6)
	public void EdgeTestUpdate() {
		System.setProperty("webdriver.edge.driver", "./Edge Driver Jars/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(EdgeBaseUrl);
		
		String expectedTitle = "TestNG Documentation";
		String actualTitle = driver.getTitle();
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title matched: Test Script Passed");
		} else {
			System.out.println("Title not matched: Test Script Failed");
		}
		driver.quit();
	}
	
	@Test(priority = 6)		
		public class LinkTextandPartialLink {
			WebDriver driver;

			@BeforeTest
			public void setUp() {
				System.setProperty("webdriver.chrome.driver", "./Chrome Browser Jars/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}

			@Test
			public void linkTest() throws Exception {
				driver.get("https://www.hollandandbarrett.com/");
				Thread.sleep(5000);
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div/button[2]")).click();
				driver.findElement(By.partialLinkText("Vitamins")).click();

				List<WebElement> links = driver.findElements(By.xpath("//a"));
				int nolinks = links.size();
				System.out.println("No.Of links in hollandandbarrett Application: " + nolinks);

				for (int i = 0; i < links.size(); i++) {
					System.out.println(links.get(i).getText());
					
					String str = links.get(i).getText();
					String str1 = "Vitamins";
					if (str == str1) {
						driver.findElement(By.linkText("Vitamins")).click();
					//    driver.findElement(By.xpath("(//a[contains(@type,'button')])[4]")).click();
					}
				}
			}

			@AfterTest
			public void teardown() {
				driver.quit();
			}
}
}

