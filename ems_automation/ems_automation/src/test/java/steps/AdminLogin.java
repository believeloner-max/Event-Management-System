package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminLoginPage;

public class AdminLogin extends BaseClass {

    AdminLoginPage admin = new AdminLoginPage();

   // @Given("click on the adminLoginLink")
    //public void Link(){
      //  admin.clickLink();
    //}
    

    @When("Enter the AdminEmail Address as {string}")
    public void email(String email){
        admin.enterEmailAddress(email);
    }

    @And("Enter the AdminPassword as {string}")
    public void password(String password){
        admin.enterPassword(password);
    }

    @And("click on Adminlogin button")
    public void clickLogin(){
        admin.clickLoginbutton();
    }

    @Then("The admin should be logged in successfully")
    public void checkLogin(){
        System.out.println(" Login sucessfully");
    }
}
