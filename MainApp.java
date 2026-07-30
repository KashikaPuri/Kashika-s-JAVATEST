package p1;
 
public class MainApp {
 
		public static void main(String[] args) {
 
			MainApp obj = new MainApp();
			/*Sample display of data
			 passing employee code and display the data based on output*/
			
			//obj.doPrintEmployee("P00101500");
 
			    OrgOperations org = new OrgOperations();
 
			    System.out.println("  Employees From Mumbai  ");
 
			    String arr1[] =
			            org.getAllEmployeesBasedOnLocation("Mumbai");
 
			    obj.display(arr1);
 
			    System.out.println("\n  Production Employees  ");
 
			    String arr2[] =
			            org.getAllEmployeesBasedOnDepartment("Production");
 
			    obj.display(arr2);
 
			    System.out.println("\n  Employees By Department And City  ");
 
			    System.out.println(
			            org.getEmployeesByCityNameAndDepartment());
 
			    System.out.println("\n  Count  ");
 
			    System.out.println(
			            org.countEmployeesByDepartmentAndCity(
			                    "Production",
			                    "Banglore"));
			}
		
 
		public void display(String[] arr) {
			for (String empCode : arr) {
				doPrintEmployee(empCode);
				
			}
		}
 
		public void doPrintEmployee(String empCode) {
			// P00101500
			// P : production
			// 00101 : five digit employee code
			// 500 : city Pincode , Hydrabad
 
			char departmentCode = empCode.charAt(0);
			String empId = empCode.substring(1, 6);
			int cityCode = Integer.parseInt(empCode.substring(6, empCode.length()));
			String cityName = getCityName(cityCode);
			String deepartmentName = getDepartmentName(departmentCode);
 
			System.out.println("Employee Id : "+empId+", Department Name : "+deepartmentName+", Location : "+cityName);
		}
 
		public String getCityName(int cityCode) {
 
		    String cityName = "";
 
		    switch (cityCode) {
 
		    case 500:
		        cityName = "Hydrabad";
		        break;
		        
		    case 560:
		        cityName = "Banglore";
		        break;
 
		    case 411:
		        cityName = "Pune";
		        break;
 
		    case 201:
		        cityName = "Noida";
		        break;
 
		    case 400:
		        cityName = "Mumbai";
		        break;
 
		    case 600:
		        cityName = "Chennai";
		        break;
		    }
 
		    return cityName;
		}
		public String getDepartmentName(char code) {
 
		    String departmentName = "";
 
		    switch (code) {
 
		    case 'P':
		        departmentName = "Production";
		        break;
 
		    case 'T':
		        departmentName = "Testing";
		        break;
 
		    case 'R':
		        departmentName = "Research";
		        break;
 
		    case 'B':
		        departmentName = "Business";
		        break;
 
		    case 'M':
		        departmentName = "Marketing";
		        break;
		    }
 
		    return departmentName;
		}
	}
 
 
 