package selenium.java;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinkFromAmazon {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Below are the list of Links present on amazon.in");
		System.out.println("Total links are : " + list.size());
		
		for(WebElement link : list) {
			
			String linkText = link.getText();
			System.out.println(linkText);
		}
	}
}
