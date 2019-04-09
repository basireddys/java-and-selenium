package selenium1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
    
    public static void main(String[] args) {
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shivakumar\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

                driver.get(baseUrl);           
                WebElement link_Home = driver.findElement(By.linkText("Home"));
                WebElement td_Home = driver
                        .findElement(By
                        .xpath("//html/body/div"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr"));    
                System.out.println(td_Home.toString());
                 // /html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a
//                Actions builder = new Actions(driver);
//                Action mouseOverHome = builder
//                        .moveToElement(link_Home)
//                        .build();
                ///html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]
                
                // /html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]
//                 // /html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]
//                String bgColor = td_Home.getCssValue("background-color");
                // /html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]
//                System.out.println("Before hover: " + bgColor);        
//                mouseOverHome.perform();        
//                bgColor = td_Home.getCssValue("background-color");
//                System.out.println("After hover: " + bgColor);
//                driver.close();
                ///html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]
        }
}