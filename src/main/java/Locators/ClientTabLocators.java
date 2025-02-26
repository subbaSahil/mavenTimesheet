package Locators;

import org.openqa.selenium.By;

public class ClientTabLocators {
	
	public By clientsTab_HR = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[4]/div/div/div[9]/div/div/div/div/div[2]/div/div/div/div/div[2]/div/div/div[3]/div[2]/div/div[1]/div/div/div/div/button");
	public By clientTab_PL = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(4) > div > div > div:nth-child(5) > div > div > div > div > div:nth-child(2) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div:nth-child(2) > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(1) > div > div > div > div > button");

	
	public By clientsTab = By.xpath("//div[text()='Clients']/ancestor::div[contains(@class, 'canvasContentDiv')]/preceding-sibling::div//button");
	public By addClientButton = By.xpath("//div[contains(text(), 'Add')]/ancestor::button[contains(@class, 'appmagic-button-container')]");
    public By inputClientNameField = By.xpath("//input[@class='appmagic-text mousetrap block-undo-redo']/ancestor::div[@data-control-name='DataCardValue35']");
    public By saveClientButton = By.xpath("//div[contains(text(), 'Save')]/ancestor::button[contains(@class, 'appmagic-button-container')]");
    public By clientNameSelector = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[5]/div/div/div[14]/div/div/div/div/div[2]/div/div/div/div[2]/div/div[3]/div/div/div/div");
    public By deleteProjectButton = By.xpath("//div[@class='powerapps-icon no-focus-outline']/ancestor::div[@data-control-name='DeleteProjectIcon']");
    public By deleteYesButton = By.xpath("//div[@class='appmagic-button-label no-focus-outline' and text()='Yes']");
    public By deleteNoButton = By.xpath("//div[@class='appmagic-button-label no-focus-outline' and text()='No']");
    
    public By clientsDiv = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(14) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div");
    
	public By refreshButton = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[5]/div/div/div[8]/div/div/div/div");

    public By projectElement = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[6]/div/div/div[22]/div/div/div/div/div[2]/div/div/div/div[2]/div/div[1]/div/div/div/div");
	
	public By editButtonElement = By.xpath("//div[@class='powerapps-icon no-focus-outline']/ancestor::div[@data-control-name='Icon1_16']");
	
	public By projectNameInput = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[9]/div/div/div[6]/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[3]/div/div/div/div/input");
	
	public By clientDropdownList = By.xpath("//div[contains(@class, 'combobox-view-chevron arrowContainer')]");
	
	public By searcherClientName = By.cssSelector("#publishedCanvas > div > div.app-canvas > div:nth-child(5) > div > div > div:nth-child(14) > div > div > div > div > div.virtualized-gallery.hideScrollbar > div > div > div > div.canvasContentDiv.container_1vt1y2p > div > div:nth-child(3) > div > div > div > div");
	
	public By descriptionElement = By.xpath("(//input[@class=\"appmagic-text mousetrap block-undo-redo\"])[2]");
	
	public By notesElement = By.xpath("(//input[@class=\"appmagic-text mousetrap block-undo-redo\"])[3]");
	
	public By saveButtonElement = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[9]/div/div/div[10]/div/div/div/div/button");
	
	public By searchInputSelector = By.xpath("//input[@appmagic-control='Searchinput_Clienttextbox']");

	public By clearButtonSelector = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[5]/div/div/div[8]/div/div/div/div");
	
	public By addProjectButtonSelector = By.xpath("//div[text()='Add Project']/ancestor::button");
	
	public By projectNameInputSelector = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[6]/div/div/div[17]/div/div/div/div/div[1]/div/div/div/div[2]/div/div/div/div[3]/div/div/div/div/input");
	
	public By descriptionInputElement = By.xpath("//input[@appmagic-control='DescAddProjPoptextbox']");
	
	public By notesInputElement = By.xpath("//input[@appmagic-control=\"NotesAddProjPoptextbox\"]");
	
	public By saveProjectButtonSelector = By.xpath("//div[text()='Add']/ancestor::button[@class='appmagic-button-container no-focus-outline']");

	public By clientDeleteButton = By.xpath("//div[@class='powerapps-icon no-focus-outline']/ancestor::div[@data-control-name='DeleteClientIcon']");
											
	public By clientDeleteyesButtonSelector = By.xpath("//div[@class='appmagic-button-label no-focus-outline' and text()='Yes']");
	
	public By clientDeletenoButtonSelector = By.xpath("//div[@class='appmagic-button-label no-focus-outline' and text()='No']");
	
	public By editClientButtonSelector = By.xpath("//div[@class='powerapps-icon no-focus-outline']/ancestor::div[@data-control-name='Icon1_15']");
	
	public By editclientInputSelector = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[7]/div/div/div[6]/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div/div[3]/div/div/div/div/input");
	
	public By editstatusButtonSelector = By.xpath("//*[@id=\"react-combobox-view-0\"]/div[1]");
	
	public By editinActiveSelector = By.xpath("//ul[@class='appmagic-combobox-itemlist itemsContainer_14xc3ab']//li[.//span[text()='Inactive']]");
	
	public By editActiveSelector = By.xpath("//ul[@class='appmagic-combobox-itemlist itemsContainer_14xc3ab']//li[.//span[text()='Active']]");

	public By editSaveButtonSelector = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[7]/div/div/div[10]/div/div/div/div/button");
	
	public By dropDownListOfclients = By.cssSelector("#powerapps-flyout-react-combobox-view-1 > div > ul");
	
	public By editProjectNameInput = By.xpath("//input[@appmagic-control='ProjectNameInputtextbox']");
	
}