package page;

import map.Elements;

import static org.junit.Assert.assertEquals;

public class SimplePurchase {
    Elements elements = new Elements();

    public void checkout() {
        elements.checkout.click();
    }

    public void shoppingCart() {
        elements.shoppingCart.click();
    }

    public void addProduct() {
        elements.addToCart.click();
    }

    public void setLogin(String login) {
        elements.login.sendKeys(login);
    }

    public void setPassword(String password) {
        elements.password.sendKeys(password);
    }

    public void clickSubmit() {
        elements.submit.click();
    }

    public void setFirstName(String firstName) {
        elements.firstName.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        elements.lastName.sendKeys(lastName);
    }

    public void setPostalCode(String postalCode) {
        elements.postalCode.sendKeys(postalCode);
    }

    public void continueCheckout() {
        elements.continueCheckout.click();
    }

    public void checkProductInCart(String productName) {
        assertEquals(productName, elements.productCheckout.getText());
    }

    public void clickToFinishPurchase() {
        elements.finish.click();
    }

    public void confirmOrderMessage(String confirmationOrder) {
        assertEquals(confirmationOrder, elements.finalPage.getText());
    }
}
