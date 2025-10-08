package language.basics;

public class Debugprogram {
	
	static String customerName = "John Doe";
	static int creditScore = 720;
	static float income = 55000.0f;
	static boolean isEmployed = true;
	static float debtToIncomeRatio = 35.0f;

	public static void main(String[] args) {
		
		if(creditScore>750)
		{
			System.out.println("Loan is Automatically Approved");
		}
		else if(creditScore>=650 && creditScore<=750)
			{
				System.out.println("Additional checks are performed");
				
				if(income>50000.0)
				{
					if(isEmployed=true)
					{
						System.out.println("Customer is employed");
						
					if(debtToIncomeRatio<40)
					{
						System.out.println("Loan is Approved");
					}
					else if(debtToIncomeRatio>40)
					{
						System.out.println("Loan is Denied");
					}
					}
				else
				{
					System.out.println("Loan is Denied becuase customer is unemployed");
				}
				
			}
				
				else if(creditScore<650){
					System.out.println("Loan is Denied due to low redit score");
					
				}
		}
		
	

	}

}
