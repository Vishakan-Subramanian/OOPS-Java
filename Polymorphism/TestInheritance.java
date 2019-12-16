/*QUESTION 1: PERSON->STUDENT PERSON->FACULTY */

import java.util.*;

class Person{
	private int aadhar;
	private String name,address;
	private char gender;

	Person(int aadhar, String name, String address, char gender){
		this.aadhar=aadhar;
		this.name=name;
		this.address=address;
		this.gender=gender;
	}

	public String getName(){
		return name;
	}

	public String getAddress(){
		return address;
	}

	public char getGender(){
		return gender;
	}

	public void setAddress(String address){
		this.address=address;
	}

}


class Student extends Person{
	private String program;
	private int year;
	private float totalmark;

	Student(int aadhar, String name, String address, char gender, String program, int year, float totalmark){
		super(aadhar, name, address, gender);
		this.program=program;
		this.year=year;
		this.totalmark=totalmark;
	} 

	public String getProgram(){
		return program;
	}
	
	public int getYear(){
		return year;
	}

	public void setYear(int year){
		this.year=year;
	}

	public float getTotal(){
		return totalmark;
	}
	
	public void setTotal(float total){
		this.totalmark=total;
	}

	public double calGPA(){
		double gpa=this.totalmark/50.0;
		return gpa;
	}
	
}


class Faculty extends Person{
	private String job,dept;
	private float bp;
	
	Faculty(int aadhar, String name, String address, char gender, String job, String dept, float bp){
		super(aadhar,name,address,gender);
		this.job=job;
		this.dept=dept;
		this.bp=bp;
	}

	public String getDesig(){
		return job;
	}

	public float getBasic(){
		return bp;
	}

	public void setBasic(float bp){
		this.bp=bp;
	}

	public void setDesig(String job){
		this.job=job;
	}

	public double calSalary(){
		double gsal,da,hra,med,pf,sal,ded;
		da=0.6*bp;
		hra=0.1*bp;
		med=0.085*bp;
		pf=0.08*bp;
		
		ded=med+pf;
		gsal=bp+da+hra;
		sal=gsal-ded;
		return sal;
	}
	
}

public class TestInheritance{

	public static void main(String args[]){
		double gpa,sal;
		String address,job,name;
		float bp,tot;
		int year;

		Student s = new Student(100,"Vikram","Vadapalani",'M',"TestInheritance",2022,485);
		
		System.out.println("Enter Address"+" of "+s.getName()+" : ");
		Scanner e=new Scanner(System.in);
		address=e.nextLine();
		s.setAddress(address);
	
		System.out.println("Enter Year of "+s.getName()+" : ");		
		year=e.nextInt();
		s.setYear(year);


		System.out.println("Enter Total Mark(out of 500) of "+s.getName()+" : ");
		tot=e.nextFloat();
		s.setTotal(tot);

		gpa=s.calGPA();
		System.out.println("The GPA of "+s.getName()+" : "+gpa);

		System.out.println("The details of "+s.getName()+" are:\n\nAddress: "+s.getAddress()+"\nYear: "+s.getYear()+"\nTotal Mark: "+s.getTotal());
		
		Faculty f = new Faculty(101,"Vishwaksenan","SSN College",'M',"Associate Professor","ECE",50000);
		Scanner t = new Scanner(System.in);
		
		System.out.println("Enter Address"+" of "+f.getName()+" : ");
		address=t.nextLine();		
		f.setAddress(address);

		System.out.println("Enter Designation"+" of "+f.getName()+" : ");
		job=t.nextLine();
		f.setDesig(job);
		
		System.out.println("Enter Basic Pay"+" of "+f.getName()+" : ");
		bp=t.nextInt();
		f.setBasic(bp);

		sal=f.calSalary();
		System.out.println("The salary of "+f.getName()+" is: "+sal);

		System.out.println("The details of "+f.getName()+" are:\n\nAddress: "+f.getAddress()+"\nDesignation: "+f.getDesig()+"\nBasic Pay: "+f.getBasic());	
	}

}

/*
OUTPUT:

cs1196@u22:~/Desktop/Java/Ex5$ javac TestInheritance.java
cs1196@u22:~/Desktop/Java/Ex5$ java TestInheritance
Enter Address of Vikram : 
Valsaravakkam
Enter Year of Vikram : 
2022 
Enter Total Mark(out of 500) of Vikram : 
485
The GPA of Vikram : 9.7
The details of Vikram are:

Address: Valsaravakkam
Year: 2022
Total Mark: 485.0
Enter Address of Vishwaksenan : 
SSN College of Engineering
Enter Designation of Vishwaksenan : 
Associate Professor
Enter Basic Pay of Vishwaksenan : 
50000
The salary of Vishwaksenan is: 76750.0
The details of Vishwaksenan are:

Address: SSN College of Engineering
Designation: Associate Professor
Basic Pay: 50000.0

*/
