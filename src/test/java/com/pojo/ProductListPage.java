package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.UtilityBaseClass;

public class ProductListPage extends UtilityBaseClass {

	public ProductListPage() {
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//div[text()='Operating System']")
	private WebElement btnOs;
	
	@FindBy(xpath="//div[text()='RAM']")
	private WebElement btnRam;
	
	@FindBy(xpath="//div[text()='iPadOS']//preceding-sibling::div")
	private WebElement btniPad;
	
	@FindBy(xpath="(//a[@class='_1fQZEK'])[1]")
	private WebElement btnProduct;


	public WebElement getBtnProduct() {
		return btnProduct;
	}

	public WebElement getBtniPad() {
		return btniPad;
	}

	public WebElement getBtnOs() {
		return btnOs;
	}

	public WebElement getBtnRam() {
		return btnRam;
	}
	
	
	
	
	
}
