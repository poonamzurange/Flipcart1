package AllseleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(700);
		d.switchTo().frame("singleframe");
		Thread.sleep(500);
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("poonam");
		
	}

}