package p1;

public interface EmployeeData {
	public String allEmployeesId[] = 
		{"P00101560","P00102560","T00103560","T00104560","T00105560",
		  "P00106411","P00107411","B00106411","B00107411","M001074110","M001084110",
		  "R00112500","R00113500",
		  "M00114400","M00115400","B00116400","B00117400",
		  "P00118201","P00119201","R00121600","R00122600","R00123600","B00124600",
		  "P00301400","P00301400","B00302400","T00303400",
		  "T00410201","T00402201","T00403600","B00404600","R00405411","M00406411",
		};
	
	public String city[] = {"Banglore","Pune","Hydrabad","Noida","Mumbai","Chennai"};
	public String citycode[] = {"560","411","500","201","400","600"};
	public String department[] = {"production","testing","research","business","marketing"};

	public String[] getAllEmployeesBasedOnLocation(String cityName);
	public String[] getAllEmployeesBasedOnDepartment(String departmentName);
	public String getEmployeesByCityNameAndDepartment();
	public int countEmployeesByDepartmentAndCity(String departmentName,String cityName);
	
	

}