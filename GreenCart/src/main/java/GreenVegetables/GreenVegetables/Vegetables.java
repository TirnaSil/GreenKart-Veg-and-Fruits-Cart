package GreenVegetables.GreenVegetables;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vegetables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\silti\\OneDrive\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[2]//div[3]//button[1]")).click();
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//explicit wait
		WebDriverWait w =new WebDriverWait(driver,Duration.ofMillis(7000));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		 driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
		
        WebElement stadrp= driver.findElement(By.xpath("//div[@class='wrapperTwo']//div//select"));
        
        Select dropdown = new Select(stadrp);
        dropdown.selectByIndex(88);
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[normalize-space()='Proceed']")).click();
        Thread.sleep(2000);
        driver.close();
	}



		
		
		
	}


