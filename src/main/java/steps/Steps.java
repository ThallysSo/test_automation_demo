package steps;

import core.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.SimplePurchase;

public class Steps {

    SimplePurchase simplePurchase = new SimplePurchase();

    @Given("that I'm on the login page and enter the username {string}")
    public void queEstouNaPaginaRegister(String login) {
        simplePurchase.setLogin(login);
    }

    @And("fill the password field with {string}")
    public void fillInThePasswordField(String password) {
        simplePurchase.setPassword(password);
    }

    @And("Click in Login button")
    public void clickLoginButton() {
        simplePurchase.clickSubmit();
    }

    @And("Add product to the Cart")
    public void addProductCart() {
        simplePurchase.addProduct();
    }

    @And("Go to shopping Cart")
    public void shoppingCart() {
        simplePurchase.shoppingCart();
    }

    @When("Proceed with checkout")
    public void ProceedWithCheckout() {
        simplePurchase.checkout();
    }

    @And("fill first name {string}")
    public void firstName(String firstName) {
        simplePurchase.setFirstName(firstName);
    }

    @And("fill last name {string}")
    public void lastName(String lastName) {
        simplePurchase.setLastName(lastName);
    }

    @And("fill postal Code {string}")
    public void postalCode(String postalCode) {
        simplePurchase.setPostalCode(postalCode);
    }

    @And("click to continue checkout")
    public void continueCheckout() {
        simplePurchase.continueCheckout();
    }

    @And("check if the {string} product is in the checkout overview")
    public void checkProduct(String productName) {
        simplePurchase.checkProductInCart(productName);
    }

    @And("click to finish purchase")
    public void clickToFinish() {
        simplePurchase.clickToFinishPurchase();
    }

    @Then("Receive the confirmation message that the purchase was complete {string}")
    public void purchaseComplete(String confirmationOrderMessage) {
        simplePurchase.confirmOrderMessage(confirmationOrderMessage);
    }


    @Before
    public void openBrowser() {
        Driver.setDriver("https://www.saucedemo.com");
    }

    @After
    public void CloseBrowser() {
        Driver.getDriver().quit();
    }
}
