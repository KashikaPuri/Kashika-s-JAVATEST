package p1;
 
	public class OrgOperations implements EmployeeData {
 
		@Override
		public String[] getAllEmployeesBasedOnLocation(String cityName) {
 
		    String code = "";
 
		    for(int i=0;i<city.length;i++)
		    {
		        if(city[i].equalsIgnoreCase(cityName))
		        {
		            code = citycode[i];
		            break;
		        }
		    }
 
		    int count = 0;
 
		    for(int i=0;i<allEmployeesId.length;i++)
		    {
		        if(allEmployeesId[i].endsWith(code))
		        {
		            count++;
		        }
		    }
		    String result[] = new String[count];
		    int index = 0;
		    for(int i=0;i<allEmployeesId.length;i++)
		    {
		        if(allEmployeesId[i].endsWith(code))
		        {
		            result[index] = allEmployeesId[i];
		            index++;
		        }
		    }
 
		    return result;
		}
 
		@Override
		public String[] getAllEmployeesBasedOnDepartment(String departmentName) {
 
		    char deptCode = Character.toUpperCase(departmentName.charAt(0));
 
		    int count = 0;
 
		    for(int i = 0; i < allEmployeesId.length; i++)
		    {
		        if(allEmployeesId[i].charAt(0) == deptCode)
		        {
		            count++;
		        }
		    }
 
		    String result[] = new String[count];
 
		    int index = 0;
 
		    for(int i = 0; i < allEmployeesId.length; i++)
		    {
		        if(allEmployeesId[i].charAt(0) == deptCode)
		        {
		            result[index] = allEmployeesId[i];
		            index++;
		        }
		    }
 
		    return result;
		}
		@Override
		public String getEmployeesByCityNameAndDepartment() {
 
		    String result = "";
 
		    for(int d = 0; d < department.length; d++)
		    {
		        char deptCode = Character.toUpperCase(department[d].charAt(0));
 
		        result = result + department[d].toUpperCase() + " Department\n";
 
		        for(int c = 0; c < city.length; c++)
		        {
		            result = result + city[c] + " : ";
 
		            for(int i = 0; i < allEmployeesId.length; i++)
		            {
		                if(allEmployeesId[i].charAt(0) == deptCode
		                        && allEmployeesId[i].endsWith(citycode[c]))
		                {
		                    result = result + allEmployeesId[i] + " ";
		                }
		            }
 
		            result = result + "\n";
		        }
 
		        result = result + "\n";
		    }
 
		    return result;
		}
 
		@Override
		public int countEmployeesByDepartmentAndCity(String departmentName, String cityName) {
 
		    char deptCode = Character.toUpperCase(departmentName.charAt(0));
 
		    String code = "";
 
		    for(int i = 0; i < city.length; i++)
		    {
		        if(city[i].equalsIgnoreCase(cityName))
		        {
		            code = citycode[i];
		            break;
		        }
		    }
 
		    int count = 0;
 
		    for(int i = 0; i < allEmployeesId.length; i++)
		    {
		        if(allEmployeesId[i].charAt(0) == deptCode
		                && allEmployeesId[i].endsWith(code))
		        {
		            count++;
		        }
		    }
 
		    return count;
		}
 
		
 
		
	}
 
 
 