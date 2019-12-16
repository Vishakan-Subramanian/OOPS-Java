/*
Create a class named ‘Employee’ with id, name, designation, date-of-birth, date-of-join, basic, 
DA, HRA, LIC, PF and no. of hours worked. Calculate the Gross salary and net salary as per the 
following:
a. If the designation is “Intern” then the salary can be calculated based on working hours. 
Gross salary = no.of hours worked * hourly wage + DA as 2000 + HRA as 1000
Deductions=LIC premium amount (if employee opted for that) + PF as 500 
Net salary= Gross salary – Deductions 
b. If the designation is “Manager”:
Gross salary = Basicpay + DA as 40% of basicpay + HRA as 10% of basicpay 
Deductions=LIC premium amount (if employee opted for that) + PF as 8% of basicpay 
Net salary= Gross salary – Deductions
c. If the designation is “others – Trainee, Analyst, Software engineer, TeamLead”:
Gross salary = Basicpay + DA as 30% of basicpay + HRA as 10% of basicpay
Deductions=LIC premium amount (if employee opted for that) + PF as 8% of basicpay
Net salary= Gross salary – Deductions
•
Calculate the Payroll for ‘n’ employees and display the salary details for all employees.
•
Prepare the payslip for a particular employee.
•
Provide an option to promote a particular employee based on the years of experience.
*/

import java.util.*;

public class Employee{
	static int chk=0;
	int id,basic,hours,exp;
	String job,dob,doj,name;
	double gsal=0.0,nsal=0.0,dedn=0.0,da,hra,pf,lic;

	public void calcSalary(){
		if(job.equalsIgnoreCase("intern")){
			da=2000;
			hra=1000;
			pf=500;
			gsal=(hours*basic)+hra+da;	
		}
		else if(job.equalsIgnoreCase("manager")){
			da=0.4*basic;
			hra=0.1*basic;
			pf=0.08*basic;
		}

		else if(job.equalsIgnoreCase("trainee")==false&&job.equalsIgnoreCase("teamlead")==false&&job.equalsIgnoreCase("software engineer")==false&&job.equalsIgnoreCase("analyst")==false){
			System.out.println("Invalid Designation!");
			chk++;
		}

		else{
			da=0.3*basic;
			hra=0.1*basic;
			pf=0.08*basic;
		}

			gsal=basic+hra+da;		
			dedn=lic+pf;
			nsal=gsal-dedn;
		
	}

	public void userInput(){
		Scanner s= new Scanner(System.in);		
		System.out.println("Enter Employee Details: ");
		System.out.println("Enter Employee ID: ");
		id=s.nextInt();
		System.out.println("Enter Employee Name: ");
		s.nextLine();
		name=s.nextLine(); 
		System.out.println("Enter Employee Designation: ");
		//s.nextLine();
		job=s.nextLine();
		System.out.println("Enter Employee DOB(DD/MM/YYYY): ");
		//s.nextLine();
		dob=s.nextLine(); 
		System.out.println("Enter Employee DOJ(DD/MM/YYYY): ");
		//s.nextLine();
		doj=s.nextLine();  

		if(job.equalsIgnoreCase("intern")){
			System.out.println("Enter Hours Worked: ");
			hours=s.nextInt();
			System.out.println("Enter Hourly Wage: ");
			basic=s.nextInt();
		}
		else{
			System.out.println("Enter the Basic Pay: ");
			basic=s.nextInt();
		}
		System.out.println("Enter LIC Premium Amount(if enrolled, otherwise enter 0: ");
		lic=s.nextInt();

		int year = Calendar.getInstance().get(Calendar.YEAR);		//getting the current year from System
		exp=(year-Integer.parseInt(doj.substring(6)));			//calculating years of experience		
		
	}

	public void paySlip(){
		System.out.println("\n\nWelcome "+name+"\nYour Gross Salary is: "+gsal+"\nYour Net Salary is: "+nsal+"\nYour HRA is: "+hra+"\nYour DA is: "+da+"\nYour Basic Pay is: "+basic+"\nYour LIC premium is: "+lic+"\nYour PF is: "+pf+"\n\nThank You");

	}	

	public void promoteEmployee(){		
				
		Scanner sn=new Scanner(System.in);
		System.out.println("The current position of "+name+" is "+job+" with "+exp+" years of experience");
		System.out.println("Enter the job you wish to promote him/her to: ");
		job=sn.nextLine();
		System.out.println("\nThe Updation was successful. The current position of "+name+" is "+job+".");

	}

	public static void main(String args[]){
		int find=0,flag=0;
	
		System.out.println("Employee Payroll Manager");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employees: ");
		int n=sc.nextInt();
		Employee e[]=new Employee[n+1];

		for(int i=0;i<n;i++){
			e[i]=new Employee();
			e[i].userInput();
			e[i].calcSalary();
		}

		if(chk!=0){
			System.out.println("Invalid Designation Details! Please re-enter data correctly.");
			System.exit(0);

		}
	
		System.out.println("Enter Employee Name for Payroll Slip Generation: ");
		sc.nextLine();
		String ename=sc.nextLine();
		
		for(int i=0;i<n;i++){
			if((e[i].name).equalsIgnoreCase(ename)){
				find++;
				e[i].paySlip();
			}
		}
		if(find==0)
			System.out.println("Sorry!Employee not found!");

		while(true){
			System.out.println("Do you wish to promote any particular employee?(Y-1/N-0)");
			int c=sc.nextInt();
			if(c==1){
				System.out.println("Enter employee ID: ");
				int eid=sc.nextInt();
				for(int i=0;i<n;i++){
					if(eid==e[i].id){
						e[i].promoteEmployee();
						flag=1;
						break;
					}
				}
				if(flag==0)
					System.out.println("Sorry, Employee ID not found!");
			}
			else if(c==0){
				System.out.println("Thank you!");
				break;
			}

			else
				System.out.println("Invalid Input! Enter 0 or 1!");
					
		}
		
	}
}

/*
Output:

vishakan@vishakan-legion:~/Desktop/Java/Ex2$ javac Employee.java
vishakan@vishakan-legion:~/Desktop/Java/Ex2$ java Employee
Employee Payroll Manager
Enter the number of employees: 
3
Enter Employee Details: 
Enter Employee ID: 
100
Enter Employee Name: 
John
Enter Employee Designation: 
Trainee
Enter Employee DOB(DD/MM/YYYY): 
12/12/1995
Enter Employee DOJ(DD/MM/YYYY): 
06/06/2018
Enter the Basic Pay: 
20000
Enter LIC Premium Amount(if enrolled, otherwise enter 0: 
500
Enter Employee Details: 
Enter Employee ID: 
101
Enter Employee Name: 
Ricky
Enter Employee Designation: 
Analyst
Enter Employee DOB(DD/MM/YYYY): 
05/05/1990
Enter Employee DOJ(DD/MM/YYYY): 
04/03/2015
Enter the Basic Pay: 
35000
Enter LIC Premium Amount(if enrolled, otherwise enter 0: 
750
Enter Employee Details: 
Enter Employee ID: 
102
Enter Employee Name: 
Holt
Enter Employee Designation: 
Manager
Enter Employee DOB(DD/MM/YYYY): 
03/07/1980
Enter Employee DOJ(DD/MM/YYYY): 
12/09/2005
Enter the Basic Pay: 
55000
Enter LIC Premium Amount(if enrolled, otherwise enter 0: 
1000
Enter Employee Name for Payroll Slip Generation: 
Ricky


Welcome Ricky
Your Gross Salary is: 49000.0
Your Net Salary is: 45450.0
Your HRA is: 3500.0
Your DA is: 10500.0
Your Basic Pay is: 35000
Your LIC premium is: 750.0
Your PF is: 2800.0


Do you wish to promote any particular employee?(Y-1/N-0)
1
Enter employee ID: 
100 
The current position of John is Trainee with 1 years of experience
Enter the job you wish to promote him/her to: 
Analyst

The Updation was successful. The current position of John is Analyst.
Do you wish to promote any particular employee?(Y-1/N-0)
0
Thank you!
*/
