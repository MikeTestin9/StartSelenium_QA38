import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestLeumiBank {

    WebDriver wd;

    @BeforeMethod
    public void init(){
        wd = new ChromeDriver();
        wd.get("https://www.leumi.co.il/");
        //  wd.navigate().to("https://www.leumi.co.il/");
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void testLeumi(){
            System.out.println(wd.findElement(By.xpath("//span[.='פרטי']")).getText());
//            System.out.println(wd.findElement(By.xpath("//span[.=\u05E4\u05E8\u05D8\u05D9]")).getText());
//            System.out.println(wd.findElement(By.linkText("פרטי")).getText());

    }


}
