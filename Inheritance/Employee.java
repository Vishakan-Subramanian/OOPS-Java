/*
Develop a Java application with Employee class with Emp_name, Emp_id, Address, Mail_id,
Mobile_no as members. Inherit the classes, Programmer, Assistant Professor, Associate Professor
and Professor from employee class. Add Basic Pay (BP) as the member of all the inherited classes
with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff club fund.
Generate pay slips for the employees with their gross and net salary.
*/

import java.util.*;

public class Employee{
	int emp_id;
	String emp_name, address, mail_id;
	long mobile_no;

	
	public void empInput(){
		Scanner s=new Scanner(System.in);
		System.out.println("\n\nEnter Employee's Details: ");
		System.out.println("\nEmployee Name: ");
		emp_name=s.nextLine();
		System.out.println("\nEmployee ID: ");
		emp_id=s.nextInt();
		System.out.println("\nEmployee Address: ");
		s.nextLine();
		address=s.nextLine();
		System.out.println("\nEmployee Mail ID: ");
		mail_id=s.nextLine();
		System.out.println("\nEmployee Mobile Number: ");
		mobile_no=s.nextInt();
		System.out.println("\nDetails successfully entered!");
	}


	public void paySlip(int bp){
		double da,hra,pf,scf;		
		double netpay,grosspay;

		da=0.97*bp;
		hra=0.1*bp;
		pf=0.12*bp;
		scf=0.001*bp;
		grosspay=bp+da+hra;
		netpay=grosspay-pf-scf;
		System.out.println("\nYour Gross Salary is: "+grosspay);
		System.out.println("\nYour Net Salary is: "+netpay);
	}

	public static void main(String args[]){
		Programmer p= new Programmer();
		p.empInput();
		p.paySlip(p.bp);
		AssistantProfessor ap= new AssistantProfessor();
		ap.empInput();
		ap.paySlip(ap.bp);
		AssociateProfessor asp= new AssociateProfessor();
		asp.empInput();
		asp.paySlip(asp.bp);
		Professor pr= new Professor();
		pr.empInput();
		pr.paySlip(pr.bp);
	}
}

class Programmer extends Employee{
	int bp=15000;

}

class AssistantProfessor extends Employee{
	int bp=20000;

}

class AssociateProfessor extends Employee{
	int bp=25000;

}

class Professor extends Employee{
	int bp=30000;
	
}

/*
OUTPUT:
vishakan@vishakan-legion:~/Desktop/Java/Ex3$ javac Employee.java
vishakan@vishakan-legion:~/Desktop/Java/Ex3$ java Employee


Enter Employee's Details: 

Employee Name: 
Jonny Bairstow

Employee ID: 
121

Employee Address: 
England

Employee Mail ID: 
jbairstow@mail.com

Employee Mobile Number: 
123

Details successfully entered!

Your Gross Salary is: 31050.0

Your Net Salary is: 29235.0


Enter Employee's Details: 

Employee Name: 
Joe Root

Employee ID: 
131

Employee Address: 
London

Employee Mail ID: 
jroot@google.com

Employee Mobile Number: 
345

Details successfully entered!

Your Gross Salary is: 41400.0

Your Net Salary is: 38980.0


Enter Employee's Details: 

Employee Name: 
Ben Stokes

Employee ID: 
141

Employee Address: 
Yorkshire

Employee Mail ID: 
stokesy@gmail.com

Employee Mobile Number: 
1010

Details successfully entered!

Your Gross Salary is: 51750.0

Your Net Salary is: 48725.0


Enter Employee's Details: 

Employee Name: 
Chris Woakes

Employee ID: 
122              

Employee Address: 
Countyshire

Employee Mail ID: 
woakes_c@yahoo.com

Employee Mobile Number: 
333

Details successfully entered!

Your Gross Salary is: 62100.0

Your Net Salary is: 58470.0

*/