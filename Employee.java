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

public abstract class Employee       //Class declaration of Employee.
{
	int empId;         //int variable too store the value of employee id.
	String empName;        //String variable to store the employee name.
	int total_leaves;      //int variables to store the total number of leaves.
	double total_salary;     //double variable to store the total salary of the employee.
	
	//METHODS
	public abstract void calculate_balance_leaves();     //abstract method to calculate the balance of leaves.
	
	public abstract boolean avail_leave(int no_of_leaves, char type_of_leave);    //To check that leave is available or not.
	
	public abstract void calculate_salary();         //Function to calculate the salary.
	
}  //End of abstract class. 