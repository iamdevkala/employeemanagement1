import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);

//        WebElement username = driver.findElement(By.id("txtUsername"));
//        WebElement username = driver.findElement(By.name("txtUsername"));
//        WebElement username = driver.findElement(By.className("textInputContainer"));
//        WebElement usernmae = driver.findElement(By.tagName("form"));
//        WebElement username = driver.findElement(By.linkText("Forgot your password?"));
//        WebElement username = driver.findElement(By.partialLinkText("your password"));


//      1.  authentic page should be loaded when entered the url.
//        2. username and password  fields should be displayed.
//        3. should be login button present on the page.
//        4. right page should be open after login .
//        5. only valid credentials should be logged in.
//        6. invalid credentials should not be logged in.
//        7. if invalid credentials are provided appropriate error message should be displayed.


        String actualTitle = "OrangeHRM";
        String title = driver.getTitle();
        if (title.equals(actualTitle)) {
            System.out.println(" verify that OrangeHRM home page will be displayed when user enters the url: Test pass");

            WebElement usernameField = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input"));
            WebElement passwordField = driver.findElement(By.id("txtPassword"));
            WebElement loginBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input"));
            if (usernameField != null && passwordField != null &&loginBtn!=null) {
                System.out.println("verify that username ,password and loginBtn field are present in login form: Test pass");
                usernameField.sendKeys("Admin");
                passwordField.sendKeys("admin123");
                loginBtn.click();


            }else{
                System.out.println("verify that  username ,password and loginBtn field are present in login form: Test failed");
            }

        } else {
            System.out.println("verify that OrangeHRM home page will be displayed when user enters the url:test failed");
        }



//        WebElement username = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input"));
//        username.sendKeys("Admin");
//        WebElement txtPassword = driver.findElement(By.id("txtPassword"));
//        txtPassword.sendKeys("admin123");
//        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input")).click();
//


//                driver.close();
//        driver.quit();


    }
}
