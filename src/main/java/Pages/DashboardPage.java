package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Interactions;
import Locators.DashboardLocators;


public class DashboardPage {
	WebDriverWait wait;

	private Interactions clickingHelper;
	private DashboardLocators locator;

	// Constructor
	public DashboardPage(WebDriver driver) {
		this.clickingHelper = new Interactions(driver);
		this.locator = new DashboardLocators();
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	// Methods to navigate to the Dashboard for HR
	public void navigateToDashboard_HR() {
		clickingHelper.clickElement(this.locator.dashboardButton);
	}

	public void clickGreenRlButton_HR() {
		clickingHelper.clickElement(this.locator.greenrl);
	}

	public void clickPurplePlButton_HR() {
		clickingHelper.clickElement(this.locator.purplepl);
	}

	public void clickBlackUserButton_HR() {
		clickingHelper.clickElement(this.locator.blackuser);
	}

	// Methods to navigate to the PL Dashboard
	public void navigateToDashboard_PL() {
		clickingHelper.clickElement(this.locator.Leaddb);
	}

	public void clickreportee_PL() {
		clickingHelper.clickElement(this.locator.clickreporteePL);
	}

	public void switchoff_PL() {
		clickingHelper.clickElement(this.locator.switchoffpl);
	}

	public void switchon_PL() {
		clickingHelper.clickElement(this.locator.switchonpl);
	}

	public void allclients_pl() {
		System.out.println(clickingHelper.getText(this.locator.allclientsPL));
	}

	public void claimedtask_pl() {
		System.out.println(clickingHelper.getText(this.locator.claimedtaskPL));
	}

	public void clickyeardd_pl() {
		clickingHelper.clickElement(this.locator.yeardropdown_pl);
	}

	public void selectYear(String year) {
		WebElement yearElement = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), '" + year + "')]")));
		clickingHelper.clickElement(yearElement);
	}

	public void rightarrowPL() {
		clickingHelper.clickElement(this.locator.rightarrowPL);
	}

	public void approbebtn() {
		clickingHelper.clickElement(this.locator.approbebtn);
	}

	public void reporteedropdown() {
		clickingHelper.clickElement(this.locator.reporteedropdown);
	}

	public void choosereportee(String r) {
		WebElement reporteeElement = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), '" + r + "')]")));
		clickingHelper.clickElement(reporteeElement);
	}
	
	public void filterbtnPL() {
		clickingHelper.clickElement(this.locator.filterbtnPL);
	}

	public void notstartedyetPL() {
		System.out.println(clickingHelper.getText(this.locator.notstartedyetPL));
	}

	public void draftPL() {
		System.out.println(clickingHelper.getText(this.locator.draftPL));
	}

	public void SubmittedPL() {
		System.out.println(clickingHelper.getText(this.locator.SubmittedPL));
	}

	public void Partially_SubmittedPL() {
		System.out.println(clickingHelper.getText(this.locator.Partially_SubmittedPL));
	}

	public void ApprovedPL() {
		System.out.println(clickingHelper.getText(this.locator.ApprovedPL));
	}

	public void Partially_ApprovedPL() {
		System.out.println(clickingHelper.getText(this.locator.Partially_ApprovedPL));
	}

	public void RejectedPL() {
		System.out.println(clickingHelper.getText(this.locator.RejectedPL));
	}

//	public void choosereporteenew() {
//		clickingHelper.clickElement(this.locator.choosereporteenew);
//	}

	public void submittedtimesheetPL() {
		System.out.println(clickingHelper.getText(this.locator.submittedtimesheetPL));
	}

	public void consumedhrsPL() {
		System.out.println(clickingHelper.getText(this.locator.consumedhrsPL));
	}

	// Methods to navigate to the Viewer Dashboard
	public void navigateToDashboard_Viewer() {
		clickingHelper.clickElement(this.locator.adminViewer);
	}

	public void clickreportee_Viewer() {
		clickingHelper.clickElement(this.locator.clickreporteeViewer);
	}
//    public void clickreporteeViewer_Viewer() {
//        clickingHelper.clickElement(this.locator.clickreporteeViewer);
//    }

	public void clickGreenRlButton_Viewer() {
		clickingHelper.clickElement(this.locator.greenrl);
	}

	public void clickPurplePlButton_Viewer() {
		clickingHelper.clickElement(this.locator.purplepl);
	}

	public void blackuser_Viewer() {
		clickingHelper.clickElement(this.locator.blackuserViewer);
	}

	public void switchoff_Viewer() {
		clickingHelper.clickElement(this.locator.switchoffViewer);
	}

	public void switchon_Viewer() {
		clickingHelper.clickElement(this.locator.switchonViewer);
	}

	public void allclients_Viewer() {
		System.out.println(clickingHelper.getText(this.locator.allclients));
	}

	public void claimedtask_Viewer() {
		System.out.println(clickingHelper.getText(this.locator.claimedtask));
	}

	public void clickyeardd_Viewer() {
		clickingHelper.clickElement(this.locator.yeardropdown_Viewer);
	}

	public void chooseyear_Viewer() {
		clickingHelper.clickElement(this.locator.chooseyear);
	}

	public void repdd_Viewer() {
		clickingHelper.clickElement(this.locator.repddViewer);
	}

	public void repname_Viewer() {
		clickingHelper.clickElement(this.locator.repnameViewer);
	}

	public void filterbtn_Viewer() {
		clickingHelper.clickElement(this.locator.filterbtn);
	}

	public void notstartedyet_Viewer() {
		System.out.println(clickingHelper.getText(this.locator.notstartedyetViewer));
	}

	public void draft_Viewer() {
		System.out.println(clickingHelper.getText(this.locator.draft));
	}

	public void Submitted_Viewer() {
		System.out.println(clickingHelper.getText(this.locator.Submitted));
	}

	public void Partially_Submitted_Viewer() {
		System.out.println(clickingHelper.getText(this.locator.Partially_Submitted));
	}

	public void Approved_Viewer() {
		System.out.println(clickingHelper.getText(this.locator.Approved));
	}

	public void Partially_Approved_Viewer() {
		System.out.println(clickingHelper.getText(this.locator.Partially_Approved));
	}

	public void Rejected_Viewer() {
		System.out.println(clickingHelper.getText(this.locator.Rejected));
	}

	public void submittedtimesheet_Viewer() {
		System.out.println(clickingHelper.getText(this.locator.submittedtimesheet));
	}

	// Method to navigate to the Editor Dashboard
	public void navigateToDashboard_Editor() {
		clickingHelper.clickElement(this.locator.admindb);
	}

	public void clickreportee_Editor() {
		clickingHelper.clickElement(this.locator.edreportee);
	}

	public void clickGreenRlButton_Editor() {
		clickingHelper.clickElement(this.locator.greenrl);
	}

	public void clickPurplePlButton_Editor() {
		clickingHelper.clickElement(this.locator.purplepl);
	}

	public void clickBlackUserButton_Editor() {
		clickingHelper.clickElement(this.locator.blackuser);
	}

	public void allclients_editor() {
		System.out.println(clickingHelper.getText(this.locator.allclients_editor));
	}

	public void claimedtask_editor() {
		System.out.println(clickingHelper.getText(this.locator.claimedtask_editor));
	}

	public void clickswitchon_Editor() {
		clickingHelper.clickElement(this.locator.switchon);
	}

	public void clickswitchoff_Editor() {
		clickingHelper.clickElement(this.locator.switchoff);
	}

	public void clickyeardd_Editor() {
		clickingHelper.clickElement(this.locator.yeardropdown);
	}

	public void selectyear_Editor() {
		clickingHelper.clickElement(this.locator.selectyear);
	}

	public void rightarr_Editor() {
		clickingHelper.clickElement(this.locator.rightarrow);
	}

	public void approvbtn_Editor() {
		clickingHelper.clickElement(this.locator.approvebtn);
	}

	public void reporteedd_Editor() {
		clickingHelper.clickElement(this.locator.repddeditor);
	}

	public void reporteename_Editor() {
		clickingHelper.clickElement(this.locator.repnameeditor);
	}

	public void reporteefilter_Editor() {
		clickingHelper.clickElement(this.locator.filterbtneditor);
	}

	public void notstartedyeteditor() {
		System.out.println(clickingHelper.getText(this.locator.notstartedyeteditor));
	}

	public void drafteditor() {
		System.out.println(clickingHelper.getText(this.locator.drafteditor));
	}

	public void Submittededitor() {
		System.out.println(clickingHelper.getText(this.locator.Submittededitor));
	}

	public void Partially_Submittededitor() {
		System.out.println(clickingHelper.getText(this.locator.Partially_Submittededitor));
	}

	public void Approvededitor() {
		System.out.println(clickingHelper.getText(this.locator.Approvededitor));
	}

	public void Partially_Approvededitor() {
		System.out.println(clickingHelper.getText(this.locator.Partially_Approvededitor));
	}

	public void Rejectededitor() {
		System.out.println(clickingHelper.getText(this.locator.Rejectededitor));
	}

	public void submittedtimesheeteditor() {
		System.out.println(clickingHelper.getText(this.locator.submittedtimesheeteditor));
	}

	public void notification_Editor() {
		clickingHelper.clickElement(this.locator.notify);
	}

	public void refreshh_Editor() {
		clickingHelper.clickElement(this.locator.refresh);
	}

	public void aprovnotify_Editor() {
		clickingHelper.clickElement(this.locator.approvenotify);
	}

	public void selectdate(String date) {
		clickingHelper.enterText(this.locator.selectdate, date);
	}

	public void reject_Editor() {
		clickingHelper.clickElement(this.locator.rejectbtn);
	}

	public void rejectreason(String reason) {
		clickingHelper.enterText(this.locator.rejectreason, reason);
	}

	public void closebtn_Editor() {
		clickingHelper.clickElement(this.locator.close);
	}

	public void reporteeydd_Editor() {
		clickingHelper.clickElement(this.locator.repyy);
	}

	public void repdd_Editor() {
		clickingHelper.clickElement(this.locator.repddViewer);
	}

	public void repname_Editor() {
		clickingHelper.clickElement(this.locator.repnameViewer);
	}

	// Methods to navigate to the RL Dashboard
	public void navigateToDashboard_RL() {
		clickingHelper.clickElement(this.locator.teamsdb);
	}

	public void switchoff_RL() {
		clickingHelper.clickElement(this.locator.switchoffViewer);
	}

	public void switchon_RL() {
		clickingHelper.clickElement(this.locator.switchonViewer);
	}

	public void associatedclients_RL() {
		System.out.println(clickingHelper.getText(this.locator.associatedclients));
	}

	public void claimedtask_RL() {
		System.out.println(clickingHelper.getText(this.locator.claimedtask_RL));
	}

	public void financialdropdown() {
		clickingHelper.clickElement(this.locator.financialdropdown);
	}

//	public void selectyear_RL() {
//		clickingHelper.clickElement(this.locator.selectyear_RL);
//	}
	
	public void selectyear_RL(String year) {
		WebElement yearElement = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), '" + year + "')]")));
		clickingHelper.clickElement(yearElement);
	}

	public void rightarrow_RL() {
		clickingHelper.clickElement(this.locator.rightarrow_RL);
	}

	public void approvebtn_RL() {
		clickingHelper.clickElement(this.locator.approvebtn_Rl);
	}

	public void reporteedropdown_RL() {
		clickingHelper.clickElement(this.locator.reporteedropdown_RL);
	}


	public void choosereportee_RL(String reportee) {
		String path = "//div[contains(text(),'"+reportee+"') and contains(@class, 'appmagic-dropdownListItem')]";
//		System.out.println(path);
		WebElement reporteeElement = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
		clickingHelper.clickElement(reporteeElement);
	}
//	
//	public void repname_RL() {
//		clickingHelper.clickElement(this.locator.repnamePL);
//	}

	public void filterbtn_RL() {
		clickingHelper.clickElement(this.locator.filterbtn_RL);
	}

	public void notstartedyetRL() {
		System.out.println(clickingHelper.getText(this.locator.notstartedyetRL));
	}

	public void draftRL() {
		System.out.println(clickingHelper.getText(this.locator.draftRL));
	}

	public void SubmittedRL() {
		System.out.println(clickingHelper.getText(this.locator.SubmittedRL));
	}

	public void Partially_SubmittedRL() {
		System.out.println(clickingHelper.getText(this.locator.Partially_SubmittedRL));
	}

	public void ApprovedRL() {
		System.out.println(clickingHelper.getText(this.locator.ApprovedRL));
	}

	public void Partially_ApprovedRL() {
		System.out.println(clickingHelper.getText(this.locator.Partially_ApprovedRL));
	}

	public void RejectedRL() {
		System.out.println(clickingHelper.getText(this.locator.RejectedRL));
	}

	public void consumedhrs_RL() {
		System.out.println(clickingHelper.getText(this.locator.consumedhrsRL));
	}
	
	

	

//	public void financialdd_RL() {
//		clickingHelper.clickElement(this.locator.finandd);
//	}
//
//	public void yearr_RL() {
//		clickingHelper.clickElement(this.locator.year);
//	}
//
//	public void calculate_RL() {
//		clickingHelper.clickElement(this.locator.calculatebtn);
//	}
//
//	public void approvbtn_RL() {
//		clickingHelper.clickElement(this.locator.approvebtn);
//	}
//
//	public void reporteename_RL() {
//		clickingHelper.clickElement(this.locator.repname);
//	}
//
//	public void reporteeydd_RL() {
//		clickingHelper.clickElement(this.locator.repyy);
//	}
}