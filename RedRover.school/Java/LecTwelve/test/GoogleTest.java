import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {

    //Set up driver
    WebDriver driver = new ChromeDriver();

    @Test
    public void testSearch(){
        driver.get("https://www.google.com/");
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("selenium\n");
//        searchbox.sendKeys(Keys.RETURN);

//        WebElement button = driver.findElement(By.name("btnK"));
//        button.submit();

        WebElement text = driver.findElement(By.xpath("//h3[text() = 'Selenium']"));

        Assert.assertEquals(text.getText(), "Selenium");

        driver.quit();
    }
}
