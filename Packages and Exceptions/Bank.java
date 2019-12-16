/* QUESTION 2: Create a class named “Account” which contains customer name, acct_num, branch, balance,
PAN. Write a method for deposit and withdrawal.
a. In deposit, if the customer deposits amount more than 50000, then throw the user defined
exception “PANRequiredException”.
b. In withdrawal, check for the minimum balance before the withdrawal i.e., the minimum
balance > balance - withdrawal. Else throw “MinBalRequiredException” exception.
If the withdrawal is more than the balance then throw
“NotEnougMoneyInAccountException”.
c. Search for a particular acct_num. If not present then throw
“AccountNotFoundException”.
*/

import java.util.*;

class PANRequiredException extends Exception{
	PANRequiredException(){

	}
	public String toString(){
		return "Deposit of more than 50000 requires PAN Number.";
	}
}

class MinBalanceRequiredException extends Exception{
	double bal,amt;	
	MinBalanceRequiredException(double balance,double amt){
		bal=balance;
		this.amt=amt;
	}
	
	public String toString(){
		return "Withdrawal of Rs."+amt+" will lead to account having less than minimum balance of Rs.1000.\nCurrent balance: "+bal;
	}
}

class NotEnoughMoneyInAccountException extends Exception{
	double bal,amt;
	NotEnoughMoneyInAccountException(double bal,double amt){
		this.bal=bal;
		this.amt=amt;
	} 

	public String toString(){
		return "The withdrawal amount of Rs."+amt+" exceeds current account balance: Rs."+bal+".\nTherefore the transaction was not complete.";
	}

}

class AccountNotFoundException extends Exception{
	int accno;
	AccountNotFoundException(int accno){
		this.accno=accno;
	}
	public String toString(){
		return "The account number "+accno+" was not found.";
	}
}

class Account{
	private int pan,accno;
	private double balance;
	private String branch,cname;

	Account(String cname,int pan,int accno,String branch,double balance){
		this.cname=cname;
		this.pan=pan;
		this.accno=accno;
		this.branch=branch;
		this.balance=balance;
	}

	public String getName(){
		return this.cname;
	}

	public String getBranch(){
		return this.branch;
	}

	public int getAccNo(){
		return this.accno;
	}

	public int getPAN(){
		return this.pan;
	}

	public double getBalance(){
		return this.balance;
	}

	public void deposit(int accno,double amt){
		balance+=amt;
		System.out.println("Old balance: "+(balance-amt)+"\nThe deposit amount: "+amt+"\nThe updated balance: "+balance+".\n");
	}

	public void withdrawal(int accno,double amt){
		balance-=amt;
		System.out.println("Old balance: "+(balance+amt)+"\nThe withdrawn amount: "+amt+"\nThe updated balance: "+balance+".\n");
	}

	public static int search(int accno,Account a[],int lim) throws AccountNotFoundException{
		int i=0;
		for(i=0;i<lim;i++){
			if(a[i].accno==accno)
				return i;
		}

		throw new AccountNotFoundException(accno);
	}
}

public class Bank{
	public static void main(String args[]){
		int i=0,opt=0,accno,pan,j=0;
		double balance,amt;
		String name,branch;
		Account a[]=new Account[10];
		Scanner s=new Scanner(System.in);

		do{
			System.out.println("\nEnter an option:\n1 to Create Account\n2 to Deposit\n3 to Withdraw\n\n0 to Exit");
			opt=s.nextInt();
			switch(opt){
				case 1:
					if(i<10){
						System.out.println("\nEnter Name: ");
						name=s.next();
						System.out.println("Enter Branch: ");
						branch=s.next();
						System.out.println("Enter Initial Deposit: ");
						balance=s.nextDouble();
						System.out.println("Enter PAN Number(-1 if N/A): ");
						pan=s.nextInt();
						System.out.println("Enter Account Number: ");
						accno=s.nextInt();
						a[i]= new Account(name,pan,accno,branch,balance);
						System.out.println("\nAccount Created Successfully!\n\nDetails:\nName: "+a[i].getName()+"\nBranch: "+a[i].getBranch()+"\nPAN Number: "+a[i].getPAN()+"\nAccount Number: "+a[i].getAccNo()+"\nCurrent Balance: "+a[i].getBalance()+"\n");
						i++;
						break;
					}
					else{
						System.out.println("\nMaximum number of accounts created.\nCannot create anymore accounts.");
					}
					break;
				case 2:
					try{
						System.out.println("\nEnter Account Number: ");
						accno=s.nextInt();
						j=Account.search(accno,a,i);
						System.out.println("\nEnter Deposit Amount: ");
						amt=s.nextDouble();
						if((a[j].getPAN()==-1)&&(amt>50000))
							throw new PANRequiredException();
						else{
							a[j].deposit(accno,amt);
							break;
						}
					}

					catch(AccountNotFoundException anfe){
						System.out.println(anfe);
					}

					catch(PANRequiredException pre){
						System.out.println(pre);
					}
					break;
				case 3:
					try{
						System.out.println("\nEnter Account Number: ");
						accno=s.nextInt();
						j=Account.search(accno,a,i);
						System.out.println("\nEnter Withdrawal Amount: ");
						amt=s.nextDouble();
						if(a[j].getBalance()<amt)
							throw new NotEnoughMoneyInAccountException(a[j].getBalance(),amt);
						else if(a[j].getBalance()-amt<1000)
							throw new MinBalanceRequiredException(a[j].getBalance(),amt);
						else{
							a[j].withdrawal(accno,amt);
							break;
						}

					}

					catch(AccountNotFoundException anfe){
						System.out.println(anfe);
					}

					catch(NotEnoughMoneyInAccountException nemiae){
						System.out.println(nemiae);
					}

					catch(MinBalanceRequiredException mbre){
						System.out.println(mbre);
					}
					break;

				case 0:
					System.out.println("Thank You!");
					break;	

				default:
					System.out.println("\n\t\tInvalid Option.");
			}

		}while(opt!=0);

	}	
}

/*
OUTPUT:
vishakan@legion:~/Desktop/Semester III/Lab/Java/Pgk & Ex Handling$ javac Bank.java
vishakan@legion:~/Desktop/Semester III/Lab/Java/Pgk & Ex Handling$ java Bank

Enter an option:
1 to Create Account
2 to Deposit
3 to Withdraw

0 to Exit
1

Enter Name: 
Vishakan
Enter Branch: 
Chennai
Enter Initial Deposit: 
50000
Enter PAN Number(-1 if N/A): 
-1
Enter Account Number: 
10

Account Created Successfully!

Details:
Name: Vishakan
Branch: Chennai
PAN Number: -1
Account Number: 10
Current Balance: 50000.0


Enter an option:
1 to Create Account
2 to Deposit
3 to Withdraw

0 to Exit
2

Enter Account Number: 
10

Enter Deposit Amount: 
54000
Deposit of more than 50000 requires PAN Number.

Enter an option:
1 to Create Account
2 to Deposit
3 to Withdraw

0 to Exit
3

Enter Account Number: 
55000
The account number 55000 was not found.

Enter an option:
1 to Create Account
2 to Deposit
3 to Withdraw

0 to Exit
3

Enter Account Number: 
10

Enter Withdrawal Amount: 
55000
The withdrawal amount of Rs.55000.0 exceeds current account balance: Rs.50000.0.
Therefore the transaction was not complete.

Enter an option:
1 to Create Account
2 to Deposit
3 to Withdraw

0 to Exit
3

Enter Account Number: 
10

Enter Withdrawal Amount: 
49500 
Withdrawal of Rs.49500.0 will lead to account having less than minimum balance of Rs.1000.
Current balance: 50000.0

Enter an option:
1 to Create Account
2 to Deposit
3 to Withdraw

0 to Exit
3

Enter Account Number: 
10

Enter Withdrawal Amount: 
30000
Old balance: 50000.0
The withdrawn amount: 30000.0
The updated balance: 20000.0.


Enter an option:
1 to Create Account
2 to Deposit
3 to Withdraw

0 to Exit
1

Enter Name: 
Vikram
Enter Branch: 
Hyderabad
Enter Initial Deposit: 
15000
Enter PAN Number(-1 if N/A): 
123
Enter Account Number: 
11

Account Created Successfully!

Details:
Name: Vikram
Branch: Hyderabad
PAN Number: 123
Account Number: 11
Current Balance: 15000.0


Enter an option:
1 to Create Account
2 to Deposit
3 to Withdraw

0 to Exit
2

Enter Account Number: 
11

Enter Deposit Amount: 
55000
Old balance: 15000.0
The deposit amount: 55000.0
The updated balance: 70000.0.


Enter an option:
1 to Create Account
2 to Deposit
3 to Withdraw

0 to Exit
0

Thank You!
*/