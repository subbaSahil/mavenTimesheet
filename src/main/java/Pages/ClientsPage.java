package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Helper.Interactions;
import Locators.ClientTabLocators;

public class ClientsPage {
    private Interactions interactions;
    private ClientTabLocators locators;
    private WebDriver driver;
    public ClientsPage(WebDriver driver) {
        this.interactions = new Interactions(driver);
        this.locators = new ClientTabLocators();
        this.driver = driver;
    }
    
    public void dynamicClientSelection(String clientName) {
    	String path = "//div[text() = '"+clientName+"']/ancestor::div[contains(@class,'appmagic-content-control-name appmagic-control-view canvasContentDiv')]/following-sibling::div/div/div/div/div";
    	interactions.click(By.xpath(path));
    }
    
    public boolean TC_022_addClient_Editor(String clientName) {
        try {
        	interactions.click(this.locators.clientsTab);
            interactions.click(this.locators.addClientButton);
            interactions.enterText(this.locators.inputClientNameField, clientName); 
            interactions.click(this.locators.saveClientButton);
            Thread.sleep(1000);
            System.out.println("Client added successfully: " + clientName);
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while adding the client: " + clientName);
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean TC_026_searchClientByName_Editor(String clientName) {
        try {
            interactions.click(this.locators.clientsTab);
            interactions.clearTextAndEnterText(this.locators.searchInputSelector, clientName);
            dynamicClientSelection(clientName);
            Thread.sleep(2000);
            System.out.println("Client Searched"); 
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while searching for the client: " + clientName);
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_023_editClientDetails_Editor(String newClientName, String status) {
        try {
//        	interactions.click(this.locators.clientNameSelector);
            interactions.click(this.locators.editClientButtonSelector);
            interactions.clearTextAndEnterText(this.locators.editclientInputSelector, newClientName);
            interactions.click(this.locators.editstatusButtonSelector);
            String statusPath = "//span[text()='"+status+"']/ancestor::li";
            interactions.click(By.xpath(statusPath));

            interactions.click(this.locators.editSaveButtonSelector);
            Thread.sleep(2000);
            System.out.println("Client details updated successfully.");
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while editing client details.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_024_deleteClient_Editor(boolean confirmDelete, String clientName) {
    	//TC_025
        try {
        	TC_026_searchClientByName_Editor(clientName);
            interactions.click(this.locators.clientsDiv);
            interactions.click(this.locators.searcherClientName);
            interactions.click(this.locators.clientNameSelector);        
            interactions.click(this.locators.clientDeleteButton);
            Thread.sleep(2000);
            if (confirmDelete) {
                interactions.click(this.locators.clientDeleteyesButtonSelector);
                System.out.println("Client successfully deleted: " + clientName);
            } else {
                interactions.click(this.locators.clientDeletenoButtonSelector);
                System.out.println("Client deletion canceled for: " + clientName);
            }
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while trying to delete the client: " + clientName);
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_027_refreshButton_Editor(String clientName) {
        try {
            TC_026_searchClientByName_Editor(clientName);
            interactions.click(this.locators.refreshButton);
            Thread.sleep(1500);
            System.out.println("Refresh button working"); 
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while refreshing the client list.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_279_addProjectButtonVisibility_Editor(String clientName) {
        try {
            TC_026_searchClientByName_Editor(clientName);
            interactions.click(this.locators.clientsDiv);
            interactions.click(this.locators.searcherClientName);
            interactions.elementVisibility(this.locators.addProjectButtonSelector);
            Thread.sleep(1500);
            System.out.println("Add project button visibility"); 
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while checking the visibility of the add project button.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_285_addProjectForClient(String clientName,String projectName, String description, String notes) {
        try {
        	
        	 TC_026_searchClientByName_Editor(clientName);
//            interactions.click(this.locators.clientsDiv);
            interactions.click(this.locators.clientNameSelector);
            interactions.click(this.locators.addProjectButtonSelector);
            interactions.enterText(this.locators.projectNameInputSelector, projectName);
            interactions.enterText(this.locators.descriptionInputElement, description);
            interactions.enterText(this.locators.notesInputElement, notes);
            interactions.click(this.locators.saveProjectButtonSelector);
            Thread.sleep(2000);
            System.out.println("Project added successfully: " + projectName);
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while adding the project: " + projectName);
            e.printStackTrace();
            return false;
        }
    }

    public void selectClient(String clientName) {
    	interactions.click(this.locators.clientDropdownList);
    	String xpath = "//span[text()='"+clientName+"']/ancestor::li";
    	interactions.scroll(By.xpath(xpath));
    	interactions.click(By.xpath(xpath));
    }
    
    public boolean TC_286_editClientProjectTest_Editor(String clientName,String newClientName, String projectName,String newProjectName, 
    		String newDescription, String newNotes) {
        try {
            TC_026_searchClientByName_Editor(clientName);
            interactions.click(this.locators.clientsDiv);
            interactions.click(this.locators.searcherClientName);
            clickProjectUnderClient(projectName);	
            interactions.click(this.locators.editButtonElement);
            interactions.enterText(this.locators.editProjectNameInput, newProjectName);
            selectClient(newClientName);
            interactions.enterText(this.locators.descriptionElement, newDescription);
            interactions.enterText(this.locators.notesElement, newNotes);

            interactions.click(this.locators.saveButtonElement);
            Thread.sleep(2000);
            System.out.println("Project details updated successfully.");
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while editing the project details.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_287_deleteProject_Editor(String clientName, char deleteFlag) {
        try {
        	 TC_026_searchClientByName_Editor(clientName);
            interactions.click(this.locators.clientNameSelector);
            interactions.click(this.locators.deleteProjectButton);

            if (deleteFlag == 'N') {
                interactions.click(this.locators.deleteNoButton);
            } else {
                interactions.click(this.locators.deleteYesButton);
            }
            Thread.sleep(2000);
            System.out.println("Project deletion action completed.");
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while deleting the project.");
            e.printStackTrace();
            return false;
        }
    }
    
    public void clickProjectUnderClient(String projectName) {
    	String projectPath = "//div[text()='"+projectName+"']/ancestor::div[@class='appmagic-label no-focus-outline middle']";
    	interactions.click(By.xpath(projectPath));
    }
    
    public boolean navigateToClientsTab_HR() {
    	try {
	    	this.interactions.click(this.locators.clientsTab_HR);
	    	Thread.sleep(3000);
	    	return true;
    	}
    	catch(Exception e) {
    		System.err.println("Error while navigating to client tab");
            e.printStackTrace();
            return false;
    	}
    }
    
    public boolean TC_026_searchClientByName_HR(String clientName) {
        try {
        	navigateToClientsTab_HR();
        	interactions.clearTextAndEnterText(this.locators.searchInputSelector, clientName);
        	dynamicClientSelection(clientName);
        	Thread.sleep(1500);
            System.out.println("Client Searched"); 
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while searching for the client: " + clientName);
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean TC_027_refreshButton_HR(String clientName) {
        try {
            TC_026_searchClientByName_HR(clientName);
            interactions.click(this.locators.refreshButton);
            Thread.sleep(2000);
            System.out.println("Refresh button working"); 
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while refreshing the client list.");
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean viewClientDetails_HR(String clientName) {
    	try{
    		 TC_026_searchClientByName_HR(clientName);
            interactions.click(this.locators.clientsDiv);
            interactions.click(this.locators.clientNameSelector);
            System.out.println("view clients deatils hr executed");
            Thread.sleep(1500);
    		return true;
    	}catch(Exception e) {
    		 System.err.println("Error while viewing client details");
	            e.printStackTrace();
	            return false;
    	}
    }
    
    public boolean viewProjectDetails_HR(String clientName, String projectName) {
        try {
        	TC_026_searchClientByName_HR(clientName);
            interactions.click(this.locators.clientsDiv);
            interactions.click(this.locators.clientNameSelector);
            clickProjectUnderClient(projectName);	
            System.out.println("view projects deatils hr executed");
            Thread.sleep(1500);
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while checking client details");
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean navigateToClientTab_PL() {
    	try {
    		interactions.click(this.locators.clientsTab);
    		return true;
    	}
    	catch(Exception e) {
    		System.err.println(e.getMessage());
            e.printStackTrace();
            return false;
    	}
    }
    
    public boolean TC_022_addClient_PL(String clientName) {
        try {
        	navigateToClientTab_PL();
        	interactions.click(this.locators.addClientButton);
        	interactions.enterText(this.locators.inputClientNameField, clientName);
            interactions.click(this.locators.saveClientButton);
            Thread.sleep(2000);
            System.out.println("Client added successfully: " + clientName);
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while adding the client: " + clientName);
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean TC_023_editClientDetails_PL(String newClientName, String status) {
        try {
        	navigateToClientTab_PL();
        	interactions.click(this.locators.clientNameSelector);
            interactions.click(this.locators.editClientButtonSelector);
            interactions.clearTextAndEnterText(this.locators.editclientInputSelector, newClientName);
            interactions.click(this.locators.editstatusButtonSelector);
            String statusPath = "//span[text()='"+status+"']";
            interactions.click(By.xpath(statusPath));
            interactions.click(this.locators.editSaveButtonSelector);
            Thread.sleep(2000);
            System.out.println("Client details updated successfully.");
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while editing client details.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_024_deleteClient_PL(boolean confirmDelete, String clientName) {
    	//TC_025
        try {
        	TC_026_searchClientByName_PL(clientName);
            interactions.click(this.locators.clientsDiv);
            interactions.click(this.locators.searcherClientName);
            interactions.click(this.locators.clientNameSelector);        
            interactions.click(this.locators.clientDeleteButton);
            Thread.sleep(1500);
            if (confirmDelete) {
                interactions.click(this.locators.clientDeleteyesButtonSelector);
                System.out.println("Client successfully deleted: " + clientName);
            } else {
                interactions.click(this.locators.clientDeletenoButtonSelector);
                System.out.println("Client deletion canceled for: " + clientName);
            }
            Thread.sleep(2000);
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while trying to delete the client: " + clientName);
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_026_searchClientByName_PL(String clientName) {
        try {
        	navigateToClientTab_PL();
            interactions.clearTextAndEnterText(this.locators.searchInputSelector, clientName);
            System.out.println("Client Searched"); 
            Thread.sleep(1500);
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while searching for the client: " + clientName);
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_027_refreshButton_PL(String clientName) {
        try {
            TC_026_searchClientByName_PL(clientName);
            interactions.click(this.locators.refreshButton);
            System.out.println("Refresh button working"); 
            Thread.sleep(1500);
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while refreshing the client list.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_279_addProjectButtonVisibility_PL(String clientName) {
        try {
            TC_026_searchClientByName_PL(clientName);
            interactions.click(this.locators.clientsDiv);
            interactions.click(this.locators.searcherClientName);
            interactions.elementVisibility(this.locators.addProjectButtonSelector);
            System.out.println("Add project button visibility"); 
            Thread.sleep(1500);
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while checking the visibility of the add project button.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_285_addProjectForClient_PL(String clientName,String projectName, String description, String notes) {
        try {
        	 TC_026_searchClientByName_PL(clientName);
            interactions.click(this.locators.clientsDiv);
            interactions.click(this.locators.clientNameSelector);
            interactions.click(this.locators.addProjectButtonSelector);
            interactions.enterText(this.locators.projectNameInputSelector, projectName);
            interactions.enterText(this.locators.descriptionInputElement, description);
            interactions.enterText(this.locators.notesInputElement, notes);
            interactions.click(this.locators.saveProjectButtonSelector);
            Thread.sleep(2000);
            System.out.println("Project added successfully: " + projectName);
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while adding the project: " + projectName);
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_286_editClientProjectTest_PL(String clientName,String newClientName, String projectName,String newProjectName, 
    		String newDescription, String newNotes) {
        try {
            TC_026_searchClientByName_Editor(clientName);
            interactions.click(this.locators.clientsDiv);
            interactions.click(this.locators.searcherClientName);
            clickProjectUnderClient(projectName);	
            interactions.click(this.locators.editButtonElement);
            interactions.enterText(this.locators.editProjectNameInput, newProjectName);
            selectClient(newClientName);
            interactions.enterText(this.locators.descriptionElement, newDescription);
            interactions.enterText(this.locators.notesElement, newNotes);

            interactions.click(this.locators.saveButtonElement);
            Thread.sleep(2000);
            System.out.println("Project details updated successfully.");
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while editing the project details.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean TC_287_deleteProject_PL(String clientName,char deleteFlag) {
        try {
        	 TC_026_searchClientByName_PL(clientName);
             interactions.click(this.locators.clientsDiv);
            interactions.click(this.locators.clientNameSelector);
            interactions.click(this.locators.deleteProjectButton);

            if (deleteFlag == 'N') {
                interactions.click(this.locators.deleteNoButton);
            } else {
                interactions.click(this.locators.deleteYesButton);
            }
            System.out.println("Project deletion action completed.");
            Thread.sleep(1500);
            return true;
        } catch (Exception e) {
            System.err.println("Error occurred while deleting the project.");
            e.printStackTrace();
            return false;
        }
    }
}
