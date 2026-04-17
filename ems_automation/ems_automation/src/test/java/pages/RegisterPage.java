package pages;
import org.openqa.selenium.By;
import steps.BaseClass;

public class RegisterPage extends BaseClass {

    public void enterFirstName(String name) {   
        driver.findElement(By.id("full_name")).sendKeys("Latha");
    }

    public void enterEmail(String email){
        driver.findElement(By.id("email")).sendKeys("nvlatha04@gmail.com");
    }

    public void enterPass(String password){
        driver.findElement(By.id("password")).sendKeys("Latha@2003");
    }

    public void clickRegister(){
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}

