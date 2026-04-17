package steps;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksImplementation extends BaseClass{
    @Before
    public void preConditions(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8081/register.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }
    @After
    public void postConditons(){
        driver.close();
    }
    
}
