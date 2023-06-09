import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StartSelenium {

    WebDriver wd;

    @BeforeTest
    public void precondition(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/home");
    }

    @Test
    public void test(){
                // old strategies vs new
        wd.findElement(By.tagName("a"));
        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.xpath("//a"));

        wd.findElement(By.id("root"));
        wd.findElement(By.cssSelector("#root")); // # == id
        wd.findElement(By.xpath("//*[@id='root']"));

        wd.findElement(By.className("container"));
        wd.findElement(By.cssSelector(".container")); // . == class
        wd.findElement(By.xpath("//*[@class='container']"));
        //
        wd.findElement(By.linkText("HOME"));
        wd.findElement(By.xpath("//a[text()='HOME']"));
        wd.findElement(By.xpath("//a[.='HOME']"));
            wd.findElement(By.partialLinkText("OM")); //part of text
            wd.findElement(By.cssSelector("[href='/home']")); //css
            wd.findElement(By.cssSelector("[href*='om']")); // * atribute contains some txt
            wd.findElement(By.cssSelector("[href^='/ho']")); // ^ atr begins in that letters
            wd.findElement(By.cssSelector("[href$='ome']")); //$ ends with some text
        ////  in xpath no part search. it looks onlt for artibutes. part pg text is not atribute
        wd.findElement(By.cssSelector("[href='/login']"));
            wd.findElement(By.xpath("//a[@href='/login']"));
        wd.findElement(By.cssSelector("[href*='og']"));
            wd.findElement(By.xpath("//a[contains(@href,'og')]"));
        wd.findElement(By.cssSelector("[href^='/log']"));
            wd.findElement(By.xpath("//a[starts-with(@href,'/log')]"));
        wd.findElement(By.cssSelector("[href$='gin']"));
        ///
        wd.findElement(By.cssSelector("[href='/about']"));
            wd.findElement(By.xpath("//a[@href='/about']"));
        wd.findElement(By.cssSelector("[href*='bou']"));
        wd.findElement(By.linkText("ABOUT"));

    }

    @AfterTest
    public void postcondition(){
        wd.quit();

    }
}
