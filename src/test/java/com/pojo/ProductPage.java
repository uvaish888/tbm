package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.UtilityBaseClass;

public class ProductPage extends UtilityBaseClass {

	public ProductPage() {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//button[text()='Buy Now']")
	private WebElement btnBuyNow;
	

	public WebElement getBtnBuyNow() {
		return btnBuyNow;
	}
	

	
	
}
