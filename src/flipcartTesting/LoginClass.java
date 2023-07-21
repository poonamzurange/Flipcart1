package flipcartTesting;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LoginClass {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		Actions act=new Actions(d);
		WebElement sign=d.findElement(By.xpath("//span[@class='_1sLnDu']"));
		act.moveToElement(sign).perform();
		d.findElement(By.xpath("(//span[@class='_1Mikcj'])[1]")).click();;
		//Set<String> id = d.getWindowHandles();
		//List<String> l= new ArrayList(id);
		//String home=l.get(0);
		//String childpage=l.get(1);
		//d.switchTo().window(childpage);
		//d.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("9561872009");
		
	}

}
