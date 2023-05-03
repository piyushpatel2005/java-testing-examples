package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAndCartTest extends Base {

//    private WebDriver driver = Base.getDriver();
    @Given("User is on the landing page of GreenKart.")
    public void userIsOnTheLandingPageOfGreenKart() {

//        driver.get("http://localhost:8000/landing.html");
    }

    @When("User searched for {string} vegetable")
    public void userSearchedForVegetable(String searchPhrase) {
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(searchPhrase);
    }

    @Then("{string} results are displayed.")
    public void resultsAreDisplayed(String searchPhrase) {
        Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(searchPhrase));
    }

    @And("Added items to cart")
    public void addedItemsToCart() {
        driver.findElement(By.cssSelector("a.increment")).click();
        driver.findElement(By.xpath("//button[contains(text(), 'ADD TO CART')]")).click();
    }

    @And("User proceeded to checkout page for purchase")
    public void userProceededToCheckoutPageForPurchase() {
        driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class, '')]")).click();
        driver.findElement(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();
    }

    @Then("verify selected {string} items are displayed in Checkout page.")
    public void verifySelectedItemsAreDisplayedInCheckoutPage(String item) {
        Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(item));
    }
}
