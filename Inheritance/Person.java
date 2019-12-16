/*
Write a Java program with a class named ‘Person’ which consists of name, age, DOB and
address. Have functions to get input and calculate_performance. Derive a class named ‘Student’
from ‘Person’ class with additional members like department, marks, extra-curricular. Calculate
performance of Student (Outstanding, Excellent, Good, Fair) based on the grade and extra-
curricular activities. Derive a class named ‘Professor’ from ‘Person’ with additional members like
department, number of publications and funded projects. Calculate performance of Professor based
on the number of publications and funded projects. In main get ‘n’ number of Persons' information
and calculate the performance.
*/

import java.util.*;

public class Person{
	String name,dob,address;
	int age;
	char grade;

	public void personInput(){
		Scanner ip=new Scanner(System.in);
		System.out.println("\nEnter the name: ");
		name=ip.nextLine();
		System.out.println("\nEnter the date of birth: ");
		dob=ip.nextLine();
		System.out.println("\nEnter the address: ");
		address=ip.nextLine();
		System.out.println("\nEnter the age: ");
		age=ip.nextInt();
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int ns,np;
		System.out.println("\nEnter the number of professors: ");
		np=sc.nextInt();
		System.out.println("\nEnter the number of students: ");
		ns=sc.nextInt();

		Professor p[]= new Professor[np];
		System.out.println("\nEnter the professors' details: ");
		for(int i=0;i<np;i++){
			System.out.println("\n\tProfessor "+(i+1)+":");
			p[i]= new Professor();
			p[i].personInput();
			p[i].proInput();
			p[i].calcPerformance();
			System.out.println("\nThe performance of Professor "+p[i].name+" is "+p[i].pfm+"."); 
		}

		Student s[]= new Student[ns];
		System.out.println("\nEnter the students' details: ");
		for(int i=0;i<ns;i++){
			System.out.println("\n\tStudent "+(i+1)+":");
			s[i]= new Student();
			s[i].personInput();
			s[i].stuInput();
			s[i].calcGrade();
			System.out.println("\nThe performance of Student "+s[i].name+" is "+s[i].pfm+"."); 
		}
	}
}

class Student extends Person{
	String dept,pfm;
	int mark[]=new int[5];
	int exc;
	
	void stuInput(){
		Scanner s=new Scanner(System.in);
		System.out.println("\n\nEnter Student Marks: ");
		for(int i=0;i<5;i++){			
			System.out.println("\nSubject "+(i+1)+": ");
			mark[i]=s.nextInt();
		}
		System.out.println("\n\nEnter the no.of extra-curricular activities participated in: ");
		exc=s.nextInt();
	}
	
	void calcGrade(){
		float tot;
		tot=mark[0]+mark[1]+mark[2]+mark[3]+mark[4];
		tot/=5;

		if(tot>=90)
			grade='O';
		else if(tot>=80)
			grade='A';
		else if(tot>=70)
			grade='B'
		else if(tot>=55)
			grade='C';
		else if(tot>=40)
			grade='D';
		else
			grade='F';

		if(exc<2){
			if(grade=='O')
				pfm="Outstanding";
			else if(grade=='A')
				pfm="Excellent";
			else if(grade=='B')
				pfm="Good";
			else if(grade=='C')
				pfm="Fair";
			else
				pfm="Scope for Improvment";
		}
		else if(exc>=2&&exc<=4){
			if(grade=='A'||grade=='O')
				pfm="Outstanding";
			else if(grade=='B')
				pfm="Excellent";
			else if(grade=='C')
				pfm="Good";
			else if(grade=='D')
				pfm="Fair";
			else
				pfm="Scope for Improvment";
		}
		else{
			if(grade=='A'||grade=='O')
				pfm="Outstanding";
			else if(grade=='B')
				pfm="Excellent";
			else if(grade=='D'||grade=='C')
				pfm="Good";
			else
				pfm="Fair";
		}
	}

}


class Professor extends Person{
	int NoP,fp;
	String dept,pfm;	
	
	void proInput(){
		Scanner ipo=new Scanner(System.in);
		System.out.println("\nEnter the department: ");
		dept=ipo.nextLine();
		System.out.println("\nEnter the number of internally funded projects: ");
		fp=ipo.nextInt();
		System.out.println("\nEnter the number of publications: ");
		NoP=ipo.nextInt();
	}

	void calcPerformance(){
		if((NoP>=4&&fp>=2)||(NoP>=5&&fp>=1))
			pfm="Excellent";
		else if((NoP>=3&&fp>=3)||(NoP>=5)) 
			pfm="Very Good";
		else if((NoP>=2&&fp>=3)||(NoP>=4))
			pfm="Good";
		else if((NoP>=1&&fp>=3)||(NoP>=2))
			pfm="Fair";
		else
			pfm="Scope for Improvement";
	}

}

/*
OUTPUT:
vishakan@vishakan-legion:~/Desktop/Java/Ex3$ javac Person.java
vishakan@vishakan-legion:~/Desktop/Java/Ex3$ java Person

Enter the number of professors: 
2

Enter the number of students: 
2

Enter the professors' details: 

	Professor 1:

Enter the name: 
Vishwaksenan

Enter the date of birth: 
04/05/1960

Enter the address: 
SSN

Enter the age: 
53

Enter the department: 
ECE

Enter the number of internally funded projects: 
2

Enter the number of publications: 
10

The performance of Professor Vishwaksenan is Excellent.

	Professor 2:

Enter the name: 
Manohar

Enter the date of birth: 
04/04/1985

Enter the address: 
Chennai

Enter the age: 
35

Enter the department: 
EEE

Enter the number of internally funded projects: 
1

Enter the number of publications: 
4

The performance of Professor Manohar is Good.

Enter the students' details: 

	Student 1:

Enter the name: 
Pithamagan

Enter the date of birth: 
08/08/2000

Enter the address: 
Kanchipuram

Enter the age: 
18 


Enter Student Marks: 

Subject 1: 
70

Subject 2: 
80

Subject 3: 
70

Subject 4: 
60

Subject 5: 
50


Enter the no.of extra-curricular activities participated in: 
3

The performance of Student Pithamagan is Excellent.

	Student 2:

Enter the name: 
Jonny Bairstow

Enter the date of birth: 
03/04/2000

Enter the address: 
Tiruvallur

Enter the age: 
19


Enter Student Marks: 

Subject 1: 
90

Subject 2: 
95

Subject 3: 
94

Subject 4: 
93

Subject 5: 
90


Enter the no.of extra-curricular activities participated in: 
0

The performance of Student Jonny Bairstow is Outstanding.
*/