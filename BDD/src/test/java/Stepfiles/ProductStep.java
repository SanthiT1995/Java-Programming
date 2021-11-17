package Stepfiles;


import static org.junit.Assert.assertTrue;

import java.io.IOException;



import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

import Pages.ProductPage;

import WebActions.Base;



@RunWith(Cucumber.class)
public class ProductStep extends Base {


	

	
		public WebDriver driver;
		
		ProductPage productPage;

		@Given("User is on ebay website")
		public void user_is_on_ebay_website() throws IOException, Exception {
			productPage.launch();
		}

		@When("User search for {string} mobile")
		public void user_search_for_product(String string) throws InterruptedException {
			productPage.search(string);
		}
		
		@And("User Clicked on the first mobile (.*?)$")
		public void click_onproduct(String name) throws Exception {
			productPage.clickon(name);
		}
		@And("Added mobile  to cart")
public void addtocart() {
			productPage.addToCart();
		}
		@Then("^Verify selected (.*?) book is displayed on check out page$")
		public void verify_selected_book_is_displayed_on_check_out_page(String name) throws Throwable {
			assertTrue(driver.findElement(By.xpath("//span[@class='BOLD']")).getText().contains(name));
		}
		

	}

	


