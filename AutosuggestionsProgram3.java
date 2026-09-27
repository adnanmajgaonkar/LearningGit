package selenium.java;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class AutosuggestionsProgram3 {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("start-maximized");
		EdgeDriver driver = new EdgeDriver(options);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement srch = driver.findElement(By.name("q"));
		Thread.sleep(2000);
		srch.sendKeys("Motor Bike");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//form/ul/li"));
		System.out.println("Total autosuggestions are : "+list.size());
		WebElement clkEle = list.get(7);
		Thread.sleep(2000);
		clkEle.click();
	}
}
