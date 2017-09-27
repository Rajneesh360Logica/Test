import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "/home/ndcpc/Downloads/chromedriver");
		System.setProperty("webdriver.chrome.driver", "/home/ndcpc/eclipse-workspace/TestSelenium/webdriver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement googleSearchbox=driver.findElement(By.id("lst-ib"));
		googleSearchbox.sendKeys("Docker");
        WebElement searchButton=driver.findElement(By.xpath("//input[@value='Google Search']"));
        searchButton.click();
	}

}
