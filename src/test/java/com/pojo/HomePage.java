package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.UtilityBaseClass;

public class HomePage extends UtilityBaseClass {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement btnClose;
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement txtSearch;
	
	

	public WebElement getBtnClose() {
		return btnClose;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
	}
	
	

	

	
}
