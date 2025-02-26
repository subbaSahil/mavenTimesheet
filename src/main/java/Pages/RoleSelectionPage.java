package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Interactions;
import Locators.CommonLocators;

import java.time.Duration;

public class RoleSelectionPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private Interactions interactions;
    private CommonLocators commonlocators;;
    private String loginPassword = "";
    
    public RoleSelectionPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.interactions = new Interactions(driver);
        this.commonlocators = new CommonLocators();
        this.loginPassword = System.getenv("PASSWORD");
    }  
    
    public String getPassword(){
    	return this.loginPassword;
    }
      public void signIn() {
    	this.interactions.enterText(this.commonlocators.microsoftEmailField, "sahil_s@pursuitsoftware.com");
    	this.interactions.click(this.commonlocators.nextButton);
    	this.interactions.enterText(this.commonlocators.microsoftPasswordField, getPassword());
    	this.interactions.click(this.commonlocators.nextButton);
    	System.out.println(this.interactions.getText(this.commonlocators.authText));
    	this.interactions.click(this.commonlocators.nextButton);
    }
    public void switchToIframe() throws InterruptedException {
    	signIn();
        this.interactions.clickThreeTimes(this.commonlocators.teamsButton);
        if (elementIsPresent(this.commonlocators.timeSheetGeneral)) {
        	this.interactions.clickThreeTimes(this.commonlocators.timeSheetGeneral);
        } else {
        	this.interactions.clickThreeTimes(this.commonlocators.timeSheet_QA);
        	this.interactions.clickThreeTimes(this.commonlocators.timeSheetGeneral);
        }
        this.interactions.clickThreeTimes(this.commonlocators.timeSheetTab);
        // Switch to first iframe
        switchToFrame(this.commonlocators.iframe2);
        // Switch to nested iframe
        switchToFrame(this.commonlocators.iframeLocator);
    }

    public void selectEditorRole() {
    	this.interactions.click(this.commonlocators.roleEditorButton);
    }
    public void selectEmployeeRole() {
    	this.interactions.click(this.commonlocators.employeeRole);
    }
    
    public void selectHrRole() {
    	this.interactions.click(this.commonlocators.hrRoleLocator);
    }
    public void selectPL() {
    	this.interactions.click(this.commonlocators.PlRoleButton);
    }
    public void select_RL() {
    	this.interactions.click(this.commonlocators.RL_role_button);
    }
    
    private boolean elementIsPresent(By locator) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    private void switchToFrame(By locator) {
        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        driver.switchTo().frame(iframe);
    }
}
