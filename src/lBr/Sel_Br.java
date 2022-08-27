package lBr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_Br {
	
	public static void main(String[] args) {
		//Set up of system property
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijaya\\Apr2022_selenium\\Selenium\\driver\\chromedriver.exe");
		
		//Object of Chrome driver
		WebDriver driver = new ChromeDriver();
		//go to a website
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
	}

}
