package steps;

import io.cucumber.java.After;
import setup.DriverFactory;

public class Hooks {
    @After
    public void finish() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        DriverFactory.killbrowser();
    }
}
