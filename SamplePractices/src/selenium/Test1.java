package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
    public static void main(String[] args) {
//    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
//    	WebDriver driver = new FirefoxDriver();
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\shivakumar\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String baseUrl = "http://www.facebook.com";
        String tagName = "";
        
        driver.get(baseUrl);
       WebElement tagName1 = driver.findElement(By.id("email"));
        if(tagName1.isEnabled())
        {
        	tagName1.sendKeys("Sandeepkumar.basireedy@gmail.com");
        }
        System.out.println(tagName1+"  \n");
//        tagName = driver.findElement(By.id("email")).getText();
//        System.out.println(tagName+"  \n");
////        tagName = driver.getPageSource();
////        System.out.println(tagName+"  \n");
//        tagName = driver.getCurrentUrl();
//        System.out.println(tagName+"  \n");
//        tagName = driver.getTitle();
//        System.out.println(tagName+"  \n");
////        tagName = driver.findElement(By.id("email")).getTagName();
////        System.out.println(tagName);
//      // driver.close();
//        //System.exit(0);
//        driver.quit();
}
}

// /html/body/header/div/ol/li[6]/a[2]