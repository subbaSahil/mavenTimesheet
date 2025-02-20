package Data;

import org.testng.annotations.DataProvider;

public class DashboardTabDataProvider {
	@DataProvider(name = "dashboardData")
    public Object[][] getyearData() {
	 return new Object[][] {
		 {"2024-2025"},
		 
         {"2022-2023"}
	 };

 }
	@DataProvider(name = "selectreportee")
    public Object[][] selectreportee() {
	 return new Object[][] {
		 {"A test"},
		 {"Aditya Dubey"}
	 	};	 
	}
}
