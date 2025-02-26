package Locators;

import org.openqa.selenium.By;

public class CommonLocators {
	
	public By microsoftEmailField = By.xpath("//input[@type = 'email']");
	public By microsoftPasswordField = By.xpath("//input[@type = 'password']");
	public By authText = By.xpath("//div[@class=\"display-sign-container\"]/div");
	public By nextButton = By.xpath("//input[@type = 'submit']");
	
	public By iframeLocator = By.id("fullscreen-app-host");
	public By iframe2 = By.id("cacheable-iframe:a6b63365-31a4-4f43-92ec-710b71557af9");
	public By roleEditorButton = By.xpath("//*[@id=\"publishedCanvas\"]/div/div[1]/div[3]/div/div/div[3]/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div/div/button");
	
	public By PlRoleButton = By.xpath("//button[@title='A person in an organization who develops the practice and is involved in skill and capability development across the organization. He/She has access to not only direct reportees data but also of the whole hierarchy of people below them along with their own data']");
	public By RL_role_button = By.xpath
			("(//button[@class='appmagic-button-container no-focus-outline' and @title='A person in an organization who manages the team for projects, directs the work in the context of the project matching tasks to skills available. He/She has access to the data only of their direct Reportees along with their own data'])");
	public By employeeRole = By.xpath("(//button[@class='appmagic-button-container no-focus-outline'])[4]");
	public By teamsButton = By.id("2a84919f-59d8-4441-a975-2a8c2643b741");
	public By timeSheet_QA = By.cssSelector("#\\31 9\\:aUEqwPO54V4vfmxEVgeq_c0ws9WTc5zisdnIEV6s3oE1\\@thread\\.tacv2 > span > div > div > div.fui-Flex.___qj3tpe0.f22iagw.f1a3p1vp");
	public By timeSheetGeneral = By.xpath("//*[@id=\"channel-19:aUEqwPO54V4vfmxEVgeq_c0ws9WTc5zisdnIEV6s3oE1@thread.tacv2-19:aUEqwPO54V4vfmxEVgeq_c0ws9WTc5zisdnIEV6s3oE1@thread.tacv2\"]/a");
	public By timeSheetTab = By.xpath("//*[@id=\"tab::b4f5eb53-5d7d-47e6-87da-dae0338d347c\"]/span[1]/div/div");
	public By hrRoleLocator = By.xpath("//div[@class='appmagic-label-text' and text()='Human Resource']");
}



//(//button[@class='appmagic-button-container no-focus-outline' and @title='A person who may or may not belong to this organization but has access to everyone's data with the abilities to view , create, edit or  delete everyone's data'])