import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest {
    @Test
    public  void testFirsst() throws InterruptedException{
        String chromeDriver = "webdriver.chrome.driver";
        String driverPatch = "D:\\New_Course\\ChromeDriver\\chromedriver.exe";
        String url = " http://www.99-bottles-of-beer.net/";
        String expectedResult = "http://www.99-bottles-of-beer.net/";

        System.setProperty(chromeDriver,driverPatch);
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        Thread.sleep(3000);



        String actualResult=driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult);

        driver.close();
        driver.quit();

    }
}
