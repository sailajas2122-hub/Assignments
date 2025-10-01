package language.basics;

public class EmpGroups {	
	
	
	String empNames1[] = new String[2];
	
	int empID1[] = new int[2];

	
	public static void main(String[] args) {
				
		Employees obj1 = new Employees();
		   
		System.out.println("Employee Name: "+obj1.empNames[0]+ ", EmployeeID"+obj1.empID[0]);
		System.out.println("Employee Name: "+obj1.empNames[1]+ ", EmployeeID"+obj1.empID[1]);
		System.out.println("Employee Name: "+obj1.empNames[2]+ ", EmployeeID"+obj1.empID[2]);
		
		
	}

}
