package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.UtilityBaseClass;

public class CartPage extends UtilityBaseClass {
	
	public CartPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@type='text']")
	private WebElement txtPhNo;
	
	public WebElement getTxtPhNo() {
		return txtPhNo;
	}

}
