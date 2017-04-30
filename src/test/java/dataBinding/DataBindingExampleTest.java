package dataBinding;

import net.sf.testng.databinding.DataBinding;
import net.sf.testng.databinding.TestInput;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by KV on 4/29/2017.
 */
@DataBinding()
public class DataBindingExampleTest {

    @Test
        public static void testDataBinding(@TestInput(name ="search") final String searchterm){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\KV\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys(searchterm);

        driver.quit();


    }


    @Test
    public static void testDataBindingXml(@TestInput(name ="search") final String searchterm){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\KV\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys(searchterm);

        driver.quit();


    }
}
