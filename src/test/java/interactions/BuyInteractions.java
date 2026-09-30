package interactions;

import pages.PageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BuyInteractions {

    private WebDriver driver;
    private PageObject pageObject;
    private WebDriverWait wait;

    public BuyInteractions(WebDriver driver){
        this.driver = driver;
        this.pageObject = new PageObject(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    private void pause(long seconds){
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    public void openHomePage(){
        driver.get("https://www.kalunga.com.br/");
        wait.until(ExpectedConditions.visibilityOf(pageObject.getLogoKalunga()));
        pause(1500);
        System.out.println("OK");
    }

    public void searchProduct(String product){
        WebElement search = wait.until(ExpectedConditions.elementToBeClickable(pageObject.getTxtsearch()));
        search.click();
        for (char ch : product.toCharArray()){
            search.sendKeys(String.valueOf(ch));
            pause(150);
        }
        pause(800);
        search.sendKeys(Keys.ENTER);
        pause(1500);

    }

    public void clickSearchButton(){
        wait.until(ExpectedConditions.elementToBeClickable(pageObject.getBtnsearch())).click();
        pause(1500);

    }

    public void selectSortOption(String option){
        WebElement sortOption = wait.until(ExpectedConditions.elementToBeClickable(pageObject.getBtnoption()));
        Select select = new Select(sortOption);
        select.selectByValue("3");
        pause(2000);
    }

    public void selectFirstProduct(){
        WebElement product = wait.until(ExpectedConditions.elementToBeClickable(pageObject.getFistproduct()));
        product.click();
        pause(1500);
    }

    public void clickBuyButton(){
        WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(pageObject.getBtnbuy()));
        btn.click();
        pause(2000);
    }
     public void clickLogo(){
        WebElement logo = wait.until(ExpectedConditions.elementToBeClickable(pageObject.getLogoKalunga()));
        logo.click();
        pause(1500);

     }



}
