package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPage;

public class Register extends BaseClass {

    RegisterPage registerPage= new RegisterPage();
    
    @When("Enter the FirstName as {string}")
    public void name(String name){
        registerPage.enterFirstName(name);
    }

    @And("Enter the EmailAdress as {string}")
    public void emailAdd(String email){
        registerPage.enterEmail(email);
    }

    @And("Enter the PassWord as {string}")
    public void password(String password){
        registerPage.enterPass(password);
    }

    @And("click on Register button")
    public void clickbutton(){
        registerPage.clickRegister();
    }

    @Then("The user should be registered successfully")
    public void verifyregister(){
        System.out.println("register sucessfully");
    }
}
