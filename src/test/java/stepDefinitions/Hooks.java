package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {

    @Before("@SanityTest")
    public void beforeValidation() {
        System.out.println("Before SanityTest");
    }

    @After("@SanityTest")
    public void afterValidation() {
        System.out.println("After SanityTest");
    }

    @After("@BrowserTest")
    public void afterBrowserTest() {
        driver.close();
    }
}
