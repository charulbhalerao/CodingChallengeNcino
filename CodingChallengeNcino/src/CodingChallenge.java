import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CodingChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Charul\\Downloads\\chromedriver_win32\\chromedriver.exe"); //set the system properties 
		WebDriver driver = new ChromeDriver(); //create the web instance
		driver.manage().window().maximize(); //maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50)); //we have to add wait timeout, because Selenium webdriver is faster than Chrome 
		
		driver.get("https://todomvc.com/"); //call the reqd url using the get() method
		
		driver.findElement(By.xpath("//*[@role='tab']/*[text()='Labs']")).click();//combining multiple xpath to click on "Labs" (//[@attribute='value']/[text()='specific text'] (parent-child & text();)
		driver.findElement(By.partialLinkText("Angular 2.0")).click();//findElement by partiallinktext
		
		driver.findElement(By.cssSelector("input[placeholder='What needs to be done?']")).sendKeys("Test Scenario 1" );//findElement by tagname[attribute='']" & send text using sendKeys "abc"
		driver.findElement(By.cssSelector("input[placeholder='What needs to be done?']")).sendKeys(Keys.ENTER );//find the element & use sendKeys(Keys.ENTER) to use keyboard input
		
		Actions act = new Actions(driver);//create "Actions" instance 
		
		act.doubleClick(driver.findElement(By.xpath("//ul[@class='todo-list']/li//label"))).perform();//perform the double click action. We have combined xpaths //parent[@attribute='value']/child//relative attribute" & used perform() for the action we have created
		driver.findElement(By.xpath("//ul[@class='todo-list']//input[@class='edit']")).clear();//for scenario we clear the given text using clear();
		
		act.doubleClick(driver.findElement(By.xpath("//ul[@class='todo-list']/li//label"))).perform();//after clearing, we double click to locate the element
		driver.findElement(By.xpath("//ul[@class='todo-list']//input[@class='edit']")).sendKeys("Test Scenario 2");//parent[@attribute='value']//tagname[@attribute='value'] & send input "xyz" using send.Kets
		driver.findElement(By.xpath("//ul[@class='todo-list']//input[@class='edit']")).sendKeys(Keys.ENTER);//find the element & use sendKeys(Keys.ENTER) to use keyboard input
		driver.close();
		

	}

}
