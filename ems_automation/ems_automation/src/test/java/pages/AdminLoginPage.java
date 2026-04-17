package pages;

import org.openqa.selenium.By;

import steps.BaseClass;

public class AdminLoginPage extends BaseClass{

    //public void clickLink(){
      //  driver.findElement(By.linkText("Admin Login")).click();
    //}

    public void enterEmailAddress(String email){
        driver.findElement(By.id("admin_id")).sendKeys("admin@ems.com");
    }
    public void enterPassword(String password){
        driver.findElement(By.id("password")).sendKeys("Admin@`123");
    }
    public void clickLoginbutton(){
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    
}
