package selenium.java;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class AutosuggestionsProgram2 {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("start-maximized");
		EdgeDriver driver = new EdgeDriver(options);
		driver.get("https://www.amazon.in/");
		WebElement srch = driver.findElement(By.id("twotabsearchtextbox"));
		srch.sendKeys("Pen drive");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		System.out.println("Total autosuggestions are : "+ list.size());
		WebElement clickEle = list.get(9);
		Thread.sleep(2000);
		clickEle.click();
	}
}
