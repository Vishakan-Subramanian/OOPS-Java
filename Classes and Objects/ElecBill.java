/*
Consider the following members to generate a Electricity bill: Consumer no., consumer name, 
previous month reading, current month reading, type of EB connection (i.e domestic or 
commercial).
a. Bill is calculated using the following tariff:
For the domestic type: 
First 100 units - Rs. 1 per unit 
101-200 units - Rs. 2.50 per unit 
201 -500 units - Rs. 4 per unit
> 501 units - Rs. 6 per unit 
For the commercial type: 
First 100 units - Rs. 2 per unit
101-200 units - Rs. 4.50 per unit
201 -500 units - Rs. 6 per unit
> 501 units - Rs. 7 per unit 
*/

import java.util.Scanner;

public class ElecBill{
	int c_no,chk;
	String c_name;
	int prevread,curread,read;
	String conntype;
	double cost=0.0;

	public void calcBill(){		//to calculate the bill
		read=curread-prevread;
		if(conntype.equalsIgnoreCase("domestic")){		//domestic tarriff
			if(read<=100){
				cost+=(1*read);
			}
			if(read>100&&read<=200){
				cost+=(2.50*(read-100)+100);
			}
			if(read>200&&read<=500){
				cost+=(5*(read-200)+100+250);
			}
			if(read>=501){
				cost+=(6*(read-500)+100+250+1500);
			}
		}
	
		else if(conntype.equalsIgnoreCase("commercial")){	//commercial tarriff		
			if(read<=100){
				cost+=(2*read);
			}
			if(read>100&&read<=200){
				cost+=(4.50*(read-100)+200);
			}
			if(read>200&&read<=500){
				cost+=(6*(read-200)+200+450);
			}
			if(read>=501){
				cost+=(7*(read-500)+200+450+1800);
			}

		}
	
		else{
			System.out.println("Invalid Connection Type!");
			chk=1;
		}
	}
	
	public void inputBill(){		//to get user input
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Details:");
		System.out.println("Enter Consumer Number: ");
		c_no=s.nextInt();
		System.out.println("Enter Consumer Name: ");
		s.nextLine();
		c_name=s.nextLine();
		System.out.println("Enter Consumer's Previous Month Reading: ");
		prevread=s.nextInt();
		System.out.println("Enter Consumer's Current Month Reading: ");
		curread=s.nextInt();
		System.out.println("Enter Connection Type: ");
		s.nextLine();
		conntype=s.nextLine();

	}
	
	public void outputBill(){		//to print bill
		System.out.println("\n\nDear customer "+c_name+"\nYour used units are: "+read+"\nYour bill amount is: "+cost+"\nThank you!"); 

	}
	
	public static void main(String args[]){
		ElecBill e=new ElecBill();
		e.inputBill();
		e.calcBill();
		if(e.chk!=1)
			e.outputBill();

	}

}

/*
Output:

cs1196@u22:~/Desktop/Java$ javac ElecBill.java
cs1196@u22:~/Desktop/Java$ java ElecBill
Enter Details:
Enter Consumer Number: 
123
Enter Consumer Name: 
Vikram
Enter Consumer's Previous Month Reading: 
1000
Enter Consumer's Current Month Reading: 
1600
Enter Connection Type: 
domestic


Dear customer Vikram
Your used units are: 600
Your bill amount is: 2450.0
Thank you!


