package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment4_Collections {

	public static void main(String[] args) {
		
		//Student1
		Map<String,String> Student1 = new HashMap<String,String>();
		Student1.put("Name", "John Doe");
		Student1.put("Age", "twenty");
		Student1.put("Gender", "Male");
		Student1.put("RollNumber", "SBA123456");
		Student1.put("Grade", "A++");
		Student1.put("Major", "Computer");
		Student1.put("GPA", "A3.8");
		Student1.put("Email", "John@example.com");
		Student1.put("PAN Number", "SDF12919");
		Student1.put("Address", "123 EKM");
		
		//Student2
		Map<String,String> Student2 = new HashMap<String,String>();
		Student2.put("Name", "Jane smith");
		Student2.put("Age", "twenty one");
		Student2.put("Gender", "Female");
		Student2.put("RollNumber", "SBA23456");
		Student2.put("Grade", "B+");
		Student2.put("Major", "Maths");
		Student2.put("GPA", "A3.5");
		Student2.put("Email", "jane@example.com");
		Student2.put("PAN Number", "REW97458");
		Student2.put("Address", "456 OAK");
		
		//Student3
		Map<String,String> Student3 = new HashMap<String,String>();
		Student3.put("Name", "Mike Brown");
		Student3.put("Age", "twenty two");
		Student3.put("Gender", "Male");
		Student3.put("RollNumber", "SBA98790");
		Student3.put("Grade", "A+");
		Student3.put("Major", "Physics");
		Student3.put("GPA", "A3.9");
		Student3.put("Email", "mike@example.com");
		Student3.put("PAN Number", "TYR45898");
		Student3.put("Address", "789 PNE");
		
		List<Map<String,String>> StudentDetails = new ArrayList<Map<String,String>>();
		StudentDetails.add(Student1);
		StudentDetails.add(Student2);
		StudentDetails.add(Student3);
		
		System.out.println("StudentDetails:"+StudentDetails);
		
		
		//Employee1
		Map<String,String> Employee1 = new HashMap<String,String>();
		Employee1.put("EmployeeID", "E001");
		Employee1.put("Name", "Alice Green");
		Employee1.put("Age", "thirty");
		Employee1.put("Gender", "Female");
		Employee1.put("Department", "Engineering");
		Employee1.put("Position", "Software Engineer");
		Employee1.put("Salary", "75K Pounds");
		Employee1.put("Email", "alice@example.com");
		Employee1.put("PAN Number", "SDF55898");
		
		//Employee2
		Map<String,String> Employee2 = new HashMap<String,String>();
		Employee2.put("EmployeeID", "E002");
		Employee2.put("Name", "Bob johnson");
		Employee2.put("Age", "thirty Five");
		Employee2.put("Gender", "Male");
		Employee2.put("Department", "Marketing");
		Employee2.put("Position", "Marketing Engineer");
		Employee2.put("Salary", "85K Pounds");
		Employee2.put("Email", "bob@example.com");
		Employee2.put("PAN Number", "REW78898");
		
		//Employee3
		Map<String,String> Employee3 = new HashMap<String,String>();
		Employee3.put("EmployeeID", "E003");
		Employee3.put("Name", "Carol White");
		Employee3.put("Age", "thirty Eight");
		Employee3.put("Gender", "Female");
		Employee3.put("Department", "Sales");
		Employee3.put("Position", "Sales Executive");
		Employee3.put("Salary", "65K Pounds");
		Employee3.put("Email", "carol@example.com");
		Employee3.put("PAN Number", "TYR22898");
		
		List<Map<String, String>> EmployeeDetails = new ArrayList<Map<String,String>>();
		EmployeeDetails.add(Employee1);
		EmployeeDetails.add(Employee2);
		EmployeeDetails.add(Employee3);
		 
		System.out.println("EmployeeDetails:"+EmployeeDetails);
		
		//Product1
		Map<String,String> Product1 = new HashMap<String,String>();
		Product1.put("ProductID", "P001");
		Product1.put("Name", "Laptop");
		Product1.put("category", "Electronics");
		Product1.put("Price", "12K Pounds");
		Product1.put("Stock Quality", "Not Available");
		Product1.put("Supplier", "Tech Supplies");
		Product1.put("Waranty", "2 Years");
		Product1.put("Rating", "4.5 Stars");
		Product1.put("Manufactuting Date", "Aug 2023");
		Product1.put("Expiry Date", "Aug 2028");
		
		
		//Product2
		Map<String,String> Product2 = new HashMap<String,String>();
		Product2.put("ProductID", "P002");
		Product2.put("Name", "Desk Chair");
		Product2.put("category", "Furniture");
		Product2.put("Price", "150K Pounds");
		Product2.put("Stock Quality", "two");
		Product2.put("Supplier", "Office Deport");
		Product2.put("Waranty", "1 Years");
		Product2.put("Rating", "4 Stars");
		Product2.put("Manufactuting Date", "Sep 2024");
		Product2.put("Expiry Date", "N/A");
		
		//Product3
		Map<String,String> Product3 = new HashMap<String,String>();
		Product3.put("ProductID", "P003");
		Product3.put("Name", "Coffee Maker");
		Product3.put("category", "Kitchen");
		Product3.put("Price", "75K Pounds");
		Product3.put("Stock Quality", "two Hundred");
		Product3.put("Supplier", "Kitchen World");
		Product3.put("Waranty", "6 Months");
		Product3.put("Rating", "4.2 Stars");
		Product3.put("Manufactuting Date", "Jan 2025");
		Product3.put("Expiry Date", "Jan 2027");
		
		List<Map<String,String>> ProductDetails = new ArrayList<Map<String,String>>();
		ProductDetails.add(Product1);
		ProductDetails.add(Product2);
		ProductDetails.add(Product3);
		
		//System.out.println(ProductDetails);
		System.out.println("ProductDetails: "+ProductDetails);
		
		
		Map<String,List<Map<String,String>>> data = new HashMap<String,List<Map<String,String>>>();
		
		data.put("StudentData", StudentDetails);
		data.put("EmployeeData", EmployeeDetails);
		data.put("ProductData", ProductDetails);
		
		System.out.println("SupplierName of the product"+data.get("ProductData").get(1).get("Supplier"));
		//System.out.println(ProductDetails.get(0).get("Supplier"));
	}
	
	
	

}
