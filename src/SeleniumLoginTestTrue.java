import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
Local , página de login,
Quando, clico em "Username"
E, insiro o username "standard_user"
Quando, clico em "Password"
E, insiro a pass "secret_sauce"
Quando, clico em "Login"
Então, acesso a página principal

 */
public class SeleniumLoginTestTrue {
    public static void main(String[] args) {
        //Criação de objeto com a função
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        try {
            //Chamada e maximização
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();
            //Ações de login
            WebElement userNameInput = driver.findElement(By.xpath("//*[@id='user-name']"));
            WebElement passwordInput = driver.findElement(By.xpath("//*[@id='password']"));
            WebElement loginButton = driver.findElement(By.xpath("//*[@id='login-button']"));

            userNameInput.sendKeys("standard_user");
            passwordInput.sendKeys("secret_sauce");
            loginButton.click();

            System.out.println("Test Passed");

        } catch(Exception e){
            System.out.println("Test Failed!!! Message : "+e.getMessage());
        }finally {
            driver.close();
        }

    }
}
