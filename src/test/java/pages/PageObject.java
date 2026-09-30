package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {

    WebDriver driver;

    public PageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "img.componentheader__logo--image.img-fluid")
    private WebElement logoKalunga;

    @FindBy(css = "[aria-label='Campo de busca']")
    private WebElement txtsearch;

    @FindBy(id = "button-addon2")
    private WebElement btnsearch;

    @FindBy(id = "cboOrdenacao")
    private WebElement btnoption;

    @FindBy(css = "a[title*='Caderno de Desenho 1/4 Capa Flexível']")
    private WebElement fistproduct;

    @FindBy(css = "button[click-comprar= 'comprar']")
    private WebElement btnbuy;

    @FindBy(css = "a.blocoproduto__link[href*='441106']")
    private WebElement secondproduct;

    @FindBy(id = "contador_carrinho")
    private WebElement carbuy;


    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getLogoKalunga() {
        return logoKalunga;
    }
    public WebElement getTxtsearch(){
        return txtsearch;
    }

    public WebElement getBtnsearch() {
        return btnsearch;
    }

    public WebElement getBtnoption() {
        return btnoption;
    }
    public WebElement getFistproduct(){
        return fistproduct;
    }
    public WebElement getBtnbuy(){
        return btnbuy;
        }
}
