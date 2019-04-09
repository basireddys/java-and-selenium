package selenium1;

import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.text.NumberFormat;


public class MaxFromColumn {
    public static void main(String[] args) throws ParseException {
    	WebDriver wd;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shivakumar\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		 wd= new ChromeDriver();
		 wd.get("http://demo.guru99.com/test/web-table-element.php"); 
		 String max;
	     double m=0,r=0;
		 
	       //No. of Columns
	        List<WebElement>  col = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
	        System.out.println("Total No of columns are : " +col.size());
	        //No.of rows
	        List<WebElement>  rows = wd.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
	        System.out.println(rows.size());
	        for (int i =1;i<rows.size();i++)
	        {    
//	        	wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	            max= wd.findElement(By.xpath("//*[@class = \"dataTable\"]/tbody/tr[" + (i+1)+ "]/td[4]")).getText();
//	            NumberFormat f =NumberFormat.getNumberInstance(); 
//	            Number num = f.parse(max);
//	            max = num.toString();
	            m = Double.parseDouble(max);
	            if(m>r)
	             {    
	                r=m;
//	                wd.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS) ;
	             }
	        }
	        System.out.println("Maximum current price is : "+ r);
//	        wd.close();
    }
}
