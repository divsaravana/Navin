import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage extends Baseclass {
Locators loc;
@Given("^User launch facebook application$")
public void user_launch_facebook_application()  {
launchBrowser("https://www.flipkart.com/");
    loc=new Locators();
}

@Given("^User check url and title$")
public void user_check_url_and_title()  {
System.out.println("URL and Title");
    
}

@When("^User enter username and password$")
public void user_enter_username_and_password()  {
	fillText(loc.getTxtemail(), "divya");
	fillText(loc.getTxtpassword(), "123");
    
}

@When("^User clicks login button$")
public void user_clicks_login_button()  {
clickButton(loc.getBtnLogin());
    
}

@Then("^User close the browser$")
public void user_close_the_browser()  {

    closeBrowser();
}


}
