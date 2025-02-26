package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Data.ClientTabDataProvider;
import Pages.ClientsPage;
import Helper.BaseTest;
import Helper.RetryAnalyzer;
public class ClientTabTest extends BaseTest {
    @Test(priority = 1, dataProvider = "newClientsToAdd", dataProviderClass = ClientTabDataProvider.class,retryAnalyzer = RetryAnalyzer.class)
    public void TC_022_addClient(String clientName) throws InterruptedException {
        ClientsPage ClientsPage = new ClientsPage(driver);  
//        ClientTabDataProvider dataProvider = new ClientTabDataProvider();
//        for (String client : dataProvider.getNewClientToAdd()) {
                	boolean isSuccess = ClientsPage.TC_022_addClient_Editor(clientName);
//                	System.out.println(client);
            Assert.assertTrue(isSuccess, "Failed to add client.");
//        }    
    }
    @Test(priority = 2,dataProvider = "editClientDetails", dataProviderClass = ClientTabDataProvider.class,retryAnalyzer = RetryAnalyzer.class)
    public void TC_023_editClientDetails(String clientName, String newClientName,String status) {
        ClientsPage ClientsPage = new ClientsPage(driver);
        	 ClientsPage.TC_026_searchClientByName_Editor(clientName);
        	 boolean isSuccess = ClientsPage.TC_023_editClientDetails_Editor(newClientName,status);
             Assert.assertTrue(isSuccess, "Failed to edit client details.");
    }
    @Test(priority = 3)
    public void TC_026_searchClientByName() {
        ClientsPage ClientsPage = new ClientsPage(driver);
        	boolean isSuccess = ClientsPage.TC_026_searchClientByName_Editor("Test Client 22");
            Assert.assertTrue(isSuccess, "Failed to search client by name.");
    }
    @Test(priority = 4)
    public void TC_027_refreshButton() {
        ClientsPage ClientsPage = new ClientsPage(driver);
        boolean isSuccess = ClientsPage.TC_027_refreshButton_Editor("Test Client 2");
        Assert.assertTrue(isSuccess, "Failed to refresh client list.");
    }
    @Test(priority = 5)
    public void TC_279_280_addProjectButtonVisibility() {
        ClientsPage ClientsPage = new ClientsPage(driver);
        boolean isVisible = ClientsPage.TC_279_addProjectButtonVisibility_Editor("Test Client 2");
        Assert.assertTrue(isVisible, "Add Project button is not visible.");
    }
    @Test(priority = 6,dataProvider = "newProjectDetailsData", dataProviderClass = ClientTabDataProvider.class,retryAnalyzer = RetryAnalyzer.class)
    public void TC_285_addProjectForClient(String clientName, String projectName, String description, String notes) {
        ClientsPage ClientsPage = new ClientsPage(driver);
//        ClientTabDataProvider clientData = new ClientTabDataProvider();
//        List<List<Object>> data = clientData.getNewProjectDetailsData();
//        for(List<Object> row : data) {
        	boolean isSuccess = ClientsPage.TC_285_addProjectForClient(clientName,projectName,description,notes);
//            Assert.assertTrue(isSuccess, "Failed to add project for client.");
//        }        
    }
    @Test(priority = 7, dataProvider = "updatedProjectData", dataProviderClass = ClientTabDataProvider.class,retryAnalyzer = RetryAnalyzer.class)
    public void TC_286_editClientProjectTest(String clientName,String newClientName, String projectName,String newProjectName,String newDescription, String newNotes) {
        ClientsPage ClientsPage = new ClientsPage(driver);
//        ClientTabDataProvider clientData = new ClientTabDataProvider();
//        List<List<Object>> dataProvider = clientData.getUpdatedProjectData();
//        for(List<Object> row : dataProvider) {
        boolean isSuccess = ClientsPage.TC_286_editClientProjectTest_Editor(
        		clientName,newClientName,projectName,
        		newProjectName,newDescription,newNotes);
        Assert.assertTrue(isSuccess, "Failed to edit client project.");
    }
    @Test(priority = 8, dataProvider = "deleteClientProject",dataProviderClass = ClientTabDataProvider.class,retryAnalyzer = RetryAnalyzer.class)
    public void TC_287_deleteProject(String client, char flag) {
        ClientsPage ClientsPage = new ClientsPage(driver);
        boolean isSuccess = ClientsPage.TC_287_deleteProject_Editor(client,flag);
        Assert.assertTrue(isSuccess, "Failed to delete project.");
    }
    @Test(priority = 9, dataProvider = "deleteClient",dataProviderClass = ClientTabDataProvider.class,retryAnalyzer = RetryAnalyzer.class)
    public void TC_024_025_deleteClient(String clientName, boolean flag) {
        ClientsPage ClientsPage = new ClientsPage(driver);
        boolean isSuccess = ClientsPage.TC_024_deleteClient_Editor(flag, clientName);
        Assert.assertTrue(isSuccess, "Failed to delete client.");
    }
	//HR test
//	@Test(priority = 1, retryAnalyzer=RetryAnalyzer.class)
//	public void navigateToClientsTab_HR() {
//		ClientsPage ClientsPage = new ClientsPage(driver);
//      boolean isSuccess = ClientsPage.navigateToClientsTab_HR();
//      Assert.assertTrue(isSuccess, "navigated to clients tab");
//	}
//	@Test(priority = 2,retryAnalyzer=RetryAnalyzer.class, dataProvider = "searchClientData",dataProviderClass = ClientTabDataProvider.class)
//	public void TC_026_searchClientByName_HR(String clientName) {
//	  ClientsPage ClientsPage = new ClientsPage(driver);
//      boolean isSuccess = ClientsPage.TC_026_searchClientByName_HR(clientName);
//      Assert.assertTrue(isSuccess, "searched client");
//	}
//	@Test(priority = 3,retryAnalyzer=RetryAnalyzer.class, dataProvider = "searchClientData",dataProviderClass = ClientTabDataProvider.class)
//	public void TC_027_refreshButton_HR(String clientName) {
//		ClientsPage ClientsPage = new ClientsPage(driver);
//      boolean isSuccess = ClientsPage.TC_027_refreshButton_HR(clientName);
//      Assert.assertTrue(isSuccess, "refresh button");
//	}
//	@Test(priority = 4,retryAnalyzer=RetryAnalyzer.class, dataProvider = "searchClientData",dataProviderClass = ClientTabDataProvider.class)
//	public void viewClientDetails_HR(String clientName) {
//		ClientsPage ClientsPage = new ClientsPage(driver);
//      boolean isSuccess = ClientsPage.viewClientDetails_HR(clientName);
//      Assert.assertTrue(isSuccess, "client details executed");
//	}
//	@Test(priority = 5,retryAnalyzer=RetryAnalyzer.class, dataProvider = "viewClientProject",dataProviderClass = ClientTabDataProvider.class)
//	public void viewProjectDetails_HR(String clientName, String project) {
//		ClientsPage ClientsPage = new ClientsPage(driver);
//      boolean isSuccess = ClientsPage.viewProjectDetails_HR(clientName,project);
//      Assert.assertTrue(isSuccess, "project details viewed");
//	}
	//PL test
//	@Test(priority = 1, dataProvider = "newClientsToAdd", dataProviderClass = ClientTabDataProvider.class, retryAnalyzer = RetryAnalyzer.class)
//    public void addClientTest_PL(String clientName) {
//        ClientsPage clientsPage = new ClientsPage(driver);
//        boolean isSuccess = clientsPage.TC_022_addClient_PL(clientName);
//        Assert.assertTrue(isSuccess, "Failed to add client.");
//    }
//
//    @Test(priority = 2, dataProvider = "newClientsToAdd", dataProviderClass = ClientTabDataProvider.class, retryAnalyzer = RetryAnalyzer.class)
//    public void editClientDetailsTest_PL(String clientName, String newClientName, String status) {
//        ClientsPage clientsPage = new ClientsPage(driver);
//        clientsPage.TC_026_searchClientByName_Editor(clientName);
//        boolean isSuccess = clientsPage.TC_023_editClientDetails_Editor(newClientName, status);
//        Assert.assertTrue(isSuccess, "Failed to edit client details.");
//    }
//
//    @Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
//    public void searchClientTest_PL() {
//        ClientsPage clientsPage = new ClientsPage(driver);
//        boolean isSuccess = clientsPage.TC_026_searchClientByName_PL("Test Client 4");
//        Assert.assertTrue(isSuccess, "Failed to search for the client.");
//    }
//
//    @Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
//    public void refreshButtonTest_PL() {
//        ClientsPage clientsPage = new ClientsPage(driver);
//        boolean isSuccess = clientsPage.TC_027_refreshButton_PL("Test Client 5");
//        Assert.assertTrue(isSuccess, "Failed to verify the refresh button functionality.");
//    }
//
//    @Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
//    public void addProjectButtonVisibilityTest_PL() {
//        ClientsPage clientsPage = new ClientsPage(driver);
//        boolean isSuccess = clientsPage.TC_279_addProjectButtonVisibility_PL("Test Client 5");
//        Assert.assertTrue(isSuccess, "Failed to verify the add project button visibility.");
//    }
//
//    @Test(priority = 6, dataProvider = "newProjectDetailsData", dataProviderClass = ClientTabDataProvider.class, retryAnalyzer = RetryAnalyzer.class)
//    public void addProjectForClientTest_PL(String clientName, String projectName, String description, String notes) {
//        ClientsPage clientsPage = new ClientsPage(driver);
//        boolean isSuccess = clientsPage.TC_285_addProjectForClient_PL(clientName, projectName, description, notes);
//        Assert.assertTrue(isSuccess, "Failed to add project for client.");
//    }
//
//    @Test(priority = 7, dataProvider = "updatedProjectData", dataProviderClass = ClientTabDataProvider.class, retryAnalyzer = RetryAnalyzer.class)
//    public void editClientProjectTest_PL(String clientName, String newClientName, String projectName, String newProjectName, String newDescription, String newNotes) {
//        ClientsPage clientsPage = new ClientsPage(driver);
//        boolean isSuccess = clientsPage.TC_286_editClientProjectTest_PL(clientName, newClientName, projectName, newProjectName, newDescription, newNotes);
//        Assert.assertTrue(isSuccess, "Failed to edit client project.");
//    }
//
//    @Test(priority = 8, retryAnalyzer = RetryAnalyzer.class, dataProvider = "deleteClientProject",dataProviderClass = ClientTabDataProvider.class)
//    public void deleteProjectTest_PL(String client, char flag) {
//        ClientsPage clientsPage = new ClientsPage(driver);
//        boolean isSuccess = clientsPage.TC_287_deleteProject_PL(client, flag);
//        Assert.assertTrue(isSuccess, "Failed to delete the project.");
//    }
//
//    @Test(priority = 9, dataProvider = "deleteClient", dataProviderClass = ClientTabDataProvider.class, retryAnalyzer = RetryAnalyzer.class)
//    public void deleteClientTest_PL(String clientName, boolean flag) {
//        ClientsPage clientsPage = new ClientsPage(driver);
//        boolean isSuccess = clientsPage.TC_024_deleteClient_PL(flag, clientName);
//        Assert.assertTrue(isSuccess, "Failed to delete the client.");
//    }

}
