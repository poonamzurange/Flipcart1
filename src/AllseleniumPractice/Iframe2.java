package AllseleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://demo.automationtesting.in/Frames.html");
		//Thread.sleep(500);
		d.findElement(By.xpath("//a[@href='#Multiple']")).click();
        WebElement f=d.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		d.switchTo().frame(f);
		 WebElement f1=d.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
			d.switchTo().frame(f1);
	
		d.findElement(By.xpath("// input[@type='text']")).sendKeys("poonam");
	}

}
