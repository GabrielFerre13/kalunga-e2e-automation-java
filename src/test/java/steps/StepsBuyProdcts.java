package steps;

import interactions.BuyInteractions;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import setup.DriverFactory;

public class StepsBuyProdcts {

    private WebDriver driver;
    private BuyInteractions buyInteractions;

    @Before
    public void setup(){
        driver = DriverFactory.getDriver();
        buyInteractions = new BuyInteractions(driver);
    }

    @Dado("que estou na página inicial da Kalunga")
    public void que_estou_na_página_inicial_da_kalunga() {
        buyInteractions.openHomePage();
    }
    @Dado("pesquiso pelo produto {string}")
    public void pesquiso_pelo_produto(String product) {
        buyInteractions.searchProduct(product);

    }
    @Quando("aplico a ordenação por {string}")
    public void aplico_a_ordenação_por(String option) {
        buyInteractions.selectSortOption(option);
    }


    @Dado("compro")
    public void compro() {
        buyInteractions.selectFirstProduct();
        buyInteractions.clickBuyButton();

    }

    @Entao("volto para o inicio")
    public void voltoParaOInicio() {
        buyInteractions.clickLogo();
    }
}


