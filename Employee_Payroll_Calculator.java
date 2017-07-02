//Assignment 5.3
 
//Create an class Employee with following properties and functions
//Properties:
//int empId
//String empName int
//total_leaves double total_salary
//Methods:
//void calculate_balance_leaves(); boolean
//avail_leave(int no_of_leaves, char type_of_leave); void calculate_salary();
//Create two subclasses PermanentEmp and TemporaryEmp that extend Employee class with following properties and functions
//PermanentEmp
//Properties: int paid_leave, sick_leave, casual_leave
//double basic, hra,pfa
//Methods: void print_leave_details() override void
//calculate_balance_leaves() override boolean avail_leave(int no_of_leaves,
//char type_of_leave) override void calculate_salary()
//TemporaryEmp: No new properties
//Methods: override void calculate_balance_leaves() override
//boolean avail_leave(int no_of_leaves, char type_of_leave)
//override void calculate_salary()




package assignment_5_3;

public class Employee_Payroll_Calculator {
	//class declaration containing main function. 
	
		public static void main(String[] args)   //main function declaration. and because it is static, program execution starts from main function. 
		{
			//PERMANENT EMPLOYEE
			PermanentEmp firstEmployee = new PermanentEmp(16, "Sameer", 12, 5, 15, 30000);
			//Creating object of PermanentEmp and passed values of parameters in the Constructor.
			
			//Printing details of Employee.
			System.out.println("For the Permanent Employee :");
			System.out.println("ID of Employee "+firstEmployee.empId);
			System.out.println("Name of Employee : "+firstEmployee.empName);
			
			//If we ask for 5 days leave of type sick_leave
			if(firstEmployee.avail_leave(7,'s'))
				System.out.println("Leave is granted for 5 days of type sick_leave.");
			else
				System.out.println("Sorry! we can not grant you leave for five days of type sick_leave");
			
			//Printing total_leaves.
			firstEmployee.calculate_balance_leaves();
			
			//Printing total salary.
			firstEmployee.calculate_salary();
			
			
			//TEMPORARY EMPLOYEE
			TemporaryEmp secondEmployee = new TemporaryEmp(24, "Shailaja", 29, 20000);
			//Creating object of TemporaryEmp and passed values of parameters in the Constructor.
			
			//Printing Details of Employee.
			System.out.println("\n\n\n\nFor the Temporary Employee :");
			System.out.println("ID of Employee "+secondEmployee.empId);
			System.out.println("Name of Employee : "+secondEmployee.empName);
			
			//If we ask for 10 days leave for this Employee.
			if(secondEmployee.avail_leave(10, 'l'))
			{
				System.out.println("Leave is granted for 10 days for this Employee.");
			}
			else
				System.out.println("Sorry! we can not grant you leave for five days of type sick_leave");
			
			//Printing total_leaves.
					secondEmployee.calculate_balance_leaves();
					
		    //Printing total salary.
					secondEmployee.calculate_salary();		
					
		 }
		
	   }     //End of main Function


