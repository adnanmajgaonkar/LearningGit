package selenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutosuggestionsProgram {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Learning Java");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("((//ul[@class='G43f7e'])[1]/li)/div[@class='eIPGRd']"));
		Thread.sleep(2000);
		WebElement index = list.get(3);
		index.click();
	}
}
