import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLoginTestFalse {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try{
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();

            WebElement userNameInput = driver.findElement(By.xpath("//*[@id='user-name']"));
            WebElement passWordInput = driver.findElement(By.xpath("//*[@id='password']"));
            WebElement loginButton = driver.findElement(By.xpath("//*[@id='login-button']"));

            userNameInput.sendKeys("standard_user");
            passWordInput.sendKeys("wrong password");
            loginButton.click();


            System.out.println("Teste Passed");
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Test failed!!!!");
        }finally {
            driver.close();
        }

    }
}
