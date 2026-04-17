package pages;

import org.openqa.selenium.By;

import steps.BaseClass;

public class LoginPage extends BaseClass{

    public void enterEmailAddress(String email){
        driver.findElement(By.id("email")).sendKeys("vick@gmail.com");
    }
    public void enterPassword(String password){
        driver.findElement(By.id("password")).sendKeys("Vicky@345");
    }
    public void clickLoginbtn(){
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    
}
