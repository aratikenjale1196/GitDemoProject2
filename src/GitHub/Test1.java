package GitHub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
public static void main(String[] args) throws InterruptedException
{

		System.setProperty("webdriver.chrome.driver","E:\\Arati-Automation\\12th March Automation-Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
			
		driver.close();
		
	}
		

	
}

