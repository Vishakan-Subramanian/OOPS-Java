/*
4. Consider the following members for a ‘Student’ with regno, name, dept, 3 marks.
• Calculate the total and grade for the given student number. [apply encapsulation]
• Search the student using id, department. [use method overloading]
• Perform these operations for ‘n’ number of students.
*/

import java.util.Scanner;

public class Student{
	static int n;
	int regno;
	float m1,m2,m3,tot,avg;
	String name,dept;
	char grade;

	public void calcTotal(){
		tot=m1+m2+m3;
		avg=tot/3;
		
	}
	
	public void calcGrade(){
		if(avg>=90)
			grade='O';
		else if(avg>=80)
			grade='A';
		else if(avg>=60)
			grade='B';
		else if(avg>=40)
			grade='D';
		else
			grade='F';
	}
	

	public void getInput(){
		System.out.println("Enter Student Details: ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student ID: ");
		regno=sc.nextInt();
		System.out.println("Enter Student Name: ");
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("Enter Student Department: ");
		dept=sc.nextLine();
		System.out.println("Enter Student Marks (Separated by spaces): ");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
	}

	public static void main(String args[]){
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the number of students: ");		
		int n=sn.nextInt();
		Student s[]=new Student[n+1];
		for(int i=0;i<n;i++){
			s[i]=new Student();
			s[i].getInput();
			s[i].calcTotal();
			s[i].calcGrade();

		}
		while(true){
			int stuflag=0;
			System.out.println("\nDo you wish to search for a particular student?(Y-1,N-0)");
			int ch=sn.nextInt();
			if(ch==1){
				System.out.println("Enter 1 to search by department\nEnter 2 to search by ID");
				int sch=sn.nextInt();
				if(sch==2){			
					System.out.println("Enter Student ID: ");
					int stuid=sn.nextInt();
					for(int i=0;i<n;i++){
						if(stuid==s[i].regno){
							System.out.println("\n\nStudent name: "+s[i].name+"\nStudent Total: "+s[i].tot+"\nStudent Grade: "+s[i].grade);
							stuflag++;
						}
					}
					if(stuflag==0)
						System.out.println("Sorry, the specified student ID does not exist.");
				}
				else if(sch==1){
					System.out.println("Enter Student Department: ");
					sn.nextLine();
					String studept=sn.nextLine();
					System.out.println("Enter Student Name: ");
					String stuname=sn.nextLine();
					for(int i=0;i<n;i++){
						if(studept.equalsIgnoreCase(s[i].dept)&&stuname.equalsIgnoreCase(s[i].name)){
							System.out.println("\n\nStudent ID: "+s[i].regno+"\nStudent Total: "+s[i].tot+"\nStudent Grade: "+s[i].grade);
							stuflag++;
						}	
					}
					if(stuflag==0)
						System.out.println("Sorry, the specified student in the specified department does not exist.");
				}
				else
					System.out.println("Invalid Input! Enter 1 or 2 only!");
			}
			else if(ch==0){
				System.out.println("\n\nThank you!");
				System.exit(0);
				break;
			}
			else
				System.out.println("Invalid Input! Enter 0 or 1 only.");

		}
	
	}

}

/*
OUTPUT:

vishakan@vishakan-legion:~/Desktop/Java/Ex2$ javac Student.java
vishakan@vishakan-legion:~/Desktop/Java/Ex2$ java Student
Enter the number of students: 
3
Enter Student Details: 
Enter Student ID: 
1
Enter Student Name: 
Vikram
Enter Student Department: 
CSE
Enter Student Marks (Separated by spaces): 
100
100
100
Enter Student Details: 
Enter Student ID: 
2
Enter Student Name: 
Eshwar
Enter Student Department: 
EEE
Enter Student Marks (Separated by spaces): 
95 94 93
Enter Student Details: 
Enter Student ID: 
3
Enter Student Name: 
Yvonne
Enter Student Department: 
MECH
Enter Student Marks (Separated by spaces): 
98 87 88

Do you wish to search for a particular student?(Y-1,N-0)
1
Enter 1 to search by department
Enter 2 to search by ID
1
Enter Student Department: 
CSE
Enter Student Name: 
Vikram


Student ID: 1
Student Total: 300.0
Student Grade: O

Do you wish to search for a particular student?(Y-1,N-0)
1
Enter 1 to search by department
Enter 2 to search by ID
2
Enter Student ID: 
1
Student name: Vikram
Student Total: 300.0
Student Grade: O
Do you wish to search for a particular student?(Y-1,N-0)
0


Thank you!
*/

