package com.steps;

import com.pojo.CartPage;
import com.pojo.HomePage;
import com.pojo.ProductListPage;
import com.pojo.ProductPage;

import java.awt.AWTException;
import java.util.Map;

import com.base.UtilityBaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends UtilityBaseClass {

	@Given("User should hit the url of the flipkart application in google chrome browser")
	public void user_should_hit_the_url_of_the_flipkart_application_in_google_chrome_browser() {

		launchChromeBrowser();
		launchUrl("https://www.flipkart.com/");
		browserMaximize();
		impWait();
		HomePage h = new HomePage();
		btnClick(h.getBtnClose());
	}
	
	@When("User should enter the product name in the search text box")
	public void user_should_enter_the_product_name_in_the_search_text_box(io.cucumber.datatable.DataTable d) {

	}
	
	@When("User should search the product")
	public void user_should_search_the_product(io.cucumber.datatable.DataTable d) throws AWTException, InterruptedException  {
		 HomePage h = new HomePage();
		 Map<String, String> asMap = d.asMap(String.class, String.class);
		 fill(h.getTxtSearch(), asMap.get("product"));	
		 pressDown();
		 toWait();
		 pressEnter();
		 
	}
	

	@When("User should apply filters and select the product")
	public void user_should_apply_filters_and_select_the_product() {
		ProductListPage p = new ProductListPage();
		scrollDown(p.getBtnRam());
		driverWait(p.getBtnRam());
		btnClick(p.getBtnOs());
		driverWait(p.getBtniPad());
		btnClick(p.getBtniPad());
		toRefresh();
		driverWait(p.getBtnProduct());
		btnClick(p.getBtnProduct());
	}
	
	@When("User should check out the product")
	public void user_should_check_out_the_product() {
		ProductPage p = new ProductPage();
	   moveToChildWind();
	   driverWait(p.getBtnBuyNow());
	   btnClick(p.getBtnBuyNow());
	}
	
	@Then("User should enter contact number")
	public void user_should_enter_contact_number(io.cucumber.datatable.DataTable d) {
		Map<String, String> asMap = d.asMap(String.class, String.class);
		CartPage c = new CartPage();
		toRefresh();
		driverWait(c.getTxtPhNo());
		btnClick(c.getTxtPhNo());
		fill(c.getTxtPhNo(), asMap.get("contact"));
		
	}
}
