import com.sun.swing.internal.plaf.synth.resources.synth_sv;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPageTitle {
    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);


        String actualTitle = "Orange";
        String title = driver.getTitle();
        if(title.equals(actualTitle)){
            System.out.println("Test pass");

        }else{
            System.out.println("test fail");
        }
    }
}