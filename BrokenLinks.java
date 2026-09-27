package selenium.java;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		List<WebElement> eles = driver.findElements(By.tagName("a"));
		int count = eles.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			WebElement links = eles.get(i);
			String linktext = links.getDomAttribute("href");
			System.out.println(linktext);
			verifylinks(linktext);
		}
	}
	
	static void verifylinks(String u2) throws IOException {
		
		try {
			URL u1 = new URL(u2);
			HttpURLConnection h1 = (HttpURLConnection) u1.openConnection();
			
			if(h1.getResponseCode()==200) {
				System.out.println("This is valid link : " + "Response Message is : " 
			+ h1.getResponseMessage() + " Response Code is : " + h1.getResponseCode());
			}
			else {
				System.out.println("This is broken link : " + "Response Message is : " 
			+ h1.getResponseMessage() + " Response Code is : " + h1.getResponseCode());
			}
		}
		catch(MalformedURLException m1) {
			System.out.println("This is null link and handled through exception "
					+ "handling");
		}
	}
}
