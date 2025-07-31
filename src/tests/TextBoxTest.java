package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxTest extends TestCase{
	public static void main(String[] args) {
		submitDataSuccesfully();
	}
	public static void submitDataSuccesfully() {
		//Go to Home page
		System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://demoqa.com/");
		//expand browser
		webDriver.manage().window().maximize();
		//Find + click
		webDriver.findElement(By.xpath("//h5[text()='Elements']")).click();
		webDriver.findElement(By.xpath("//span[text()='Text Box']")).click();
		//Find + input value
		webDriver.findElement(By.id("userName")).sendKeys("demoQA");
		webDriver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
		webDriver.findElement(By.id("currentAddress")).sendKeys("Huyng Thuc Khang");
		webDriver.findElement(By.id("permanentAddress")).sendKeys("501");
		webDriver.findElement(By.id("submit")).click();
	}
}

