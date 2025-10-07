package assignments;

public class EmpGroups {	
	
	
	
	public static void main(String[] args) {
				
		Employees obj1 = new Employees();
		
		String empNames1[] = new String[3];
		empNames1[0] = obj1.empNames[0];
		empNames1[1] = obj1.empNames[1];
		empNames1[2] = obj1.empNames[2];
		
		
		int empID1[] = new int[3];
		empID1[0] = obj1.empID[0];
		empID1[1] = obj1.empID[1];
		empID1[2] = obj1.empID[2];
		   
		System.out.println("Employee Name: "+empNames1[0]+ ", EmployeeID"+empID1[0]);
		System.out.println("Employee Name: "+empNames1[1]+ ", EmployeeID"+empID1[1]);
		System.out.println("Employee Name: "+empNames1[2]+ ", EmployeeID"+empID1[2]);
		
		
	}

}
