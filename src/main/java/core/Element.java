package core;

import enums.ByValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Element {

    private final String map;
    private final ByValue by;

    public Element(String map, ByValue _by) {
        this.map = map;
        by = _by;
    }

    public WebElement getElement(By by) {
        return Driver.getDriver().findElement(by);
    }

    public WebElement createElement() {
        WebElement element = null;
        switch (by) {
            case id:
                element = getElement(By.id(map));
                break;
            case xpath:
                element = getElement(By.xpath(map));
                break;
            case css:
                element = getElement(By.cssSelector(map));
                break;
            case linkText:
                element = getElement(By.linkText(map));
                break;
            case name:
                element = getElement(By.name(map));
                break;

            default:
                break;
        }

        return element;
    }

    public void click() {
        createElement().click();
    }

    public String getText() {
        return createElement().getText();
    }

    public void sendKeys(CharSequence value) {
        createElement().sendKeys(value);
    }
}
