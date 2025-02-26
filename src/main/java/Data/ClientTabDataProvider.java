package Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.DataProvider;

public class ClientTabDataProvider {
	
	@DataProvider(name = "newClientsToAdd")
	public Object[][] getNewClientToAdd() {
	    return new Object[][] {
	        {"Client A"},
	    };
	}
	
	@DataProvider(name = "editClientDetails")
	public Object[][] editClientDetails() {
	    return new Object[][] {
	        {"Client A", "Client C", "Active"},
	    };
	}
	 
	@DataProvider(name = "clientsDataToUpdate")
	public List<List<Object>> getUpdatedClientData1() {
        List<List<Object>> data = new ArrayList<>();
//        data.add(Arrays.asList("Test Client 11","Test Client 111" ,"Active"));
        data.add(Arrays.asList("Test Client 2","Test Client 223" , "Inactive"));
        data.add(Arrays.asList("Test Client 4","Test Client 44" , "Active"));
        return data;
    }
	@DataProvider(name = "clientsDataToUpdate")
    public Object[][] getUpdatedClientData() {
        return new Object[][]{
            {"Test Client 2", "Test Client 223", "Inactive"},
            {"Test Client 4", "Test Client 44", "Active"}
        };
    }

    @DataProvider(name = "newProjectDetailsData")
    public Object[][] getNewProjectDetailsData() {
        return new Object[][]{
            {"Client C", "Project Client C", "Description Alpha", "Notes Alpha"},
//            {"Test Client 2", "Project Beta", "Description Beta", "Notes Beta"},
//            {"Test Client 3", "Project Gamma", "Description Gamma", "Notes Gamma"}
        };
    }

    @DataProvider(name = "updatedProjectData")
    public Object[][] getUpdatedProjectData() {
        return new Object[][]{
//            {"Test Client 2", "Pizza Hut", "test 1", "Test Client 2 test 1", "Updated Description 1", "Updated Notes 1"},
            {"Client C", "HDFC", "test 2", "Project Client C", "Updated Description 2", "Updated Notes 2"},
//            {"Test Client 5", "Test Client 2", "test 3", "Test Client 5 test 3", "Updated Description 3", "Updated Notes 3"}
        };
    }

    @DataProvider(name = "employeeData")
    public Object[][] getEmployeeData() {
        return new Object[][]{
            {"fname", "lname", "123", "fname@gmail.com", "Male", "lead name", "Yes", "Wed, Jan 29, 2025"}
        };
    }
    
    @DataProvider(name = "deleteClientProject")
    public Object[][] deleteClientProject(){
    	return new Object[][] {
    		{
    			"HDFC", "Y"
    		}
    	};
    }
    
    @DataProvider(name= "deleteClient")
    public Object[][] deleteClient(){
    	return new Object[][] {
    		{
    			"Test Client 5", false
    		}
    	};
    }
    
    @DataProvider(name= "searchClientData")
    public Object[][] searchClientData(){
    	return new Object[][] {
    		{
    			"Test Client 5"
    		}
    	};
    }
    @DataProvider(name= "viewClientProject")
    public Object[][] viewClientProject(){
    	return new Object[][] {
    		{
    			"Test Client 5", "Project"
    		}
    	};
    }
}
