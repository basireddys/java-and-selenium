package selenium;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Test {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\shivakumar\\Eclipse\\geckodriver.exe");
//        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//        capabilities.setCapability("marionette", true);
//        @SuppressWarnings("deprecation")
    	FirefoxOptions options = new FirefoxOptions();
    	options.setLegacy(true);
		WebDriver driver = new FirefoxDriver();
//		comment the above 2 lines and uncomment below 2 lines to use Chrome
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\shivakumar\\Eclipse\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://demo.guru99.com";
        String expectedTitle = "Guru99 Bank Home Page";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        
      //  System.exit(0);
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
 
        //close Fire fox
       // driver.close();
       
    }

}