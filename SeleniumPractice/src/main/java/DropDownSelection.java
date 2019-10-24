import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownSelection {
    public static void main(String[] args) {
        String url = "https://www.wikipedia.org/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement dropdown = driver.findElement(By.id("searchLanguage"));
        Select language = new Select(dropdown);


        List<WebElement> dropDownOpttions = driver.findElements(By.tagName("option"));
        System.out.println(dropDownOpttions.size());

        for(WebElement we: dropDownOpttions){
            System.out.println(we.getText());
            if(we.getText().equalsIgnoreCase("Latina")){
                language.selectByVisibleText("Latina");
                break;
            }


        }
    }

}
