package map;

import core.Element;

import static enums.ByValue.id;
import static enums.ByValue.xpath;

public class Elements {
    public Element login = new Element("user-name", id);
    public Element password = new Element("password", id);
    public Element submit = new Element("login-button", id);
    public Element addToCart = new Element("add-to-cart-sauce-labs-backpack", id);
    public Element shoppingCart = new Element("shopping_cart_container", id);
    public Element checkout = new Element("checkout", id);
    public Element firstName = new Element("first-name", id);
    public Element lastName = new Element("last-name", id);
    public Element postalCode = new Element("postal-code", id);
    public Element continueCheckout = new Element("continue", id);
    public Element productCheckout = new Element("//*[@id='item_4_title_link']/div", xpath);
    public Element finish = new Element("finish", id);
    public Element finalPage = new Element("//*[@id='checkout_complete_container']/h2", xpath);

}
