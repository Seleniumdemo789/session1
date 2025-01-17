import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.beust.ah.A;

public class demo3Switch {

    @Test
    public void demo2() throws InterruptedException {


        WebDriver driver = new ChromeDriver();    //open a broswer
        driver.get("file:///C:/Users/kiran/Downloads/Demo%20site%20for%20Automation.html");    //to hit the url (it will wait for to load the page comp)
        driver.manage().window().maximize();
        Thread.sleep(3000);

        // ///alerts
        // driver.findElement(By.xpath("//button[.='Click for Popup Alert']")).click();
    
        // Alert alt = driver.switchTo().alert();

        // String alrtmsg = alt.getText();
        // System.out.println("Alert message is " + alrtmsg);

        // // alt.dismiss();
        
        // // String canceltxt = alt.getText();
        // // System.out.println(canceltxt);

        // alt.accept();
        
        // String accepttxt = alt.getText();
        // System.out.println(accepttxt);
        ///alerts
        

        


        // driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[2]")));

        // driver.switchTo().frame(1);  // 0 1 2
        // driver.findElement(By.xpath("//input[@id='frame-text']")).sendKeys("Kiran");
        // driver.switchTo().parentFrame();


        //windows
        String intialwindowID = driver.getWindowHandle();
        System.out.println("intialwindowID  : " + intialwindowID) ;

        driver.findElement(By.xpath("//button[.='Go to Selenium Website']")).click(); // open a new window


        Set<String> listofwinid = driver.getWindowHandles();
        
        int size =  listofwinid.size();
        System.out.println("size is : " + size);

        // for (int i = 0; i < listofwinid.size(); i++) {
        //     listofwinid.iterator().next();
        //     driver.switchTo().window(listofwinid.);
        //     String title = driver.getTitle();
        //     System.out.println(title);
        // }




        for (String win : listofwinid) {
            System.out.println(win.toString());
            
        }


        driver.switchTo().window("C9DA5207FCA893EAC49246071942234A");



        

        


        













    }



}
