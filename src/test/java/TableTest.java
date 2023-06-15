import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TableTest {

    WebDriver wd;

    @BeforeMethod
    public void precondition(){
        wd = new ChromeDriver();
        wd.get("https://www.w3schools.com/css/css_table.asp");
      //  wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }

    @Test
    public void testCss(){
        wd.findElement(By.cssSelector("#customers tr:nth-child(7) td:last-child"));

        System.out.println(wd.findElements(By.cssSelector("#customers tr")).size()); // print amount of table rows
        System.out.println(wd.findElements(By.cssSelector("#customers th")).size()); // print amount of table columns
        wd.findElement(By.cssSelector("#customers tr:nth-child(3)")); // find locator for the row3
        wd.findElement(By.cssSelector("#customers td:last-child"));   // find locator for the last column

    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }

}
