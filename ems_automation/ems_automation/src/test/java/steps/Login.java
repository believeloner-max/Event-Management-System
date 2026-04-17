package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class Login extends BaseClass{
    LoginPage login=new LoginPage();
@When("Enter the Email Address as {string}")
    public void Email(String email){
        login.enterEmailAddress(email);
    }
@And("Enter the Password as {string}")
    public void password(String password){
        login.enterPassword(password);
    }
@And("click on login button")
    public void Password(){
        login.clickLoginbtn();
    }
@Then("The user should be logged in")
public void verifyLogin(){
    System.out.println("Login is successful");
}
    
}
