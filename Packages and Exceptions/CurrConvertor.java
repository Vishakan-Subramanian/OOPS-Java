/* QUESTION 1: Create a package named myPack.CurrConvertor to implement the currency converter
(Dollar to INR, EURO to INR, Yen to INR and vice versa). Write a java program which uses this
package to convert the given currency into other currency type.
Use the pre-defined exception java.lang.NumberFormatException (checked) to throw
the error whenever the given input currency is not in the required format.
*/


package mypack;

import java.util.*;

public class CurrConvertor{
	public static double convertMoney(double amt,String fromdeno,String todeno){
		double conv=0;
		switch(fromdeno){
			case "Rupee":
				switch(todeno){
					case "Rupee":
						System.out.println("From Denomination and To Denomination are both same.");
						conv=amt;
						break;
					case "Dollar":
						conv=0.014*amt;
						break;
					case "Yen":
						conv=1.5*amt;
						break;
					case "Euro":
						conv=0.012*amt;
						break;
					default:
						System.out.println("Invalid To Denomination.");
				}
				break;
			case "Dollar":
				switch(todeno){
					case "Dollar":
						System.out.println("From Denomination and To Denomination are both same.");
						conv=amt;
						break;
					case "Rupee":
						conv=71.14*amt;
						break;
					case "Yen":
						conv=106.38*amt;
						break;
					case "Euro":
						conv=0.90*amt;
						break;
					default:
						System.out.println("Invalid To Denomination.");
				}
				break;
			case "Yen":
				switch(todeno){
					case "Yen":
						System.out.println("From Denomination and To Denomination are both same.");
						conv=amt;
						break;
					case "Rupee":
						conv=0.67*amt;
						break;
					case "Dollar":
						conv=0.0094*amt;
						break;
					case "Euro":
						conv=0.0085*amt;
						break;
					default:
						System.out.println("Invalid To Denomination.");
				}
				break;
			case "Euro":
				switch(todeno){
					case "Euro":
						System.out.println("From Denomination and To Denomination are both same.");
						conv=amt;
						break;
					case "Rupee":
						conv=78.93*amt;
						break;
					case "Dollar":
						conv=1.11*amt;
						break;
					case "Yen":
						conv=118.02*amt;
						break;
					default:
						System.out.println("Invalid To Denomination.");
				}
				break;
			default:
				System.out.println("Invalid From Denomination");
		}
		return conv;
	}

	public static void main(String args[]) {
		String fromdeno,todeno;
		double amt=0;
		System.out.println("\t\tWelcome to Currency Convertor!");
		System.out.println("\nWe convert from and to the following denominations:\n\tDollar\n\tEuro\n\tRupee\n\tYen\n");
		Scanner s=new Scanner(System.in);

		System.out.println("\nEnter From Denomination: ");
		fromdeno=s.nextLine();
		fromdeno=fromdeno.substring(0, 1).toUpperCase() + fromdeno.substring(1).toLowerCase();
		System.out.println("\nEnter To Denomination: ");
		todeno=s.nextLine();
		todeno=todeno.substring(0, 1).toUpperCase() + todeno.substring(1).toLowerCase();

		try{
			System.out.println("\nEnter "+fromdeno+" value to convert: ");
			amt=Double.parseDouble(s.nextLine());
		}
		catch(NumberFormatException nfe){
			System.out.println("The denomination you entered is not a number.Please try again.");
		}

		System.out.println("\nThe value of "+fromdeno+" in "+todeno+" is: "+convertMoney(amt,fromdeno,todeno));
		System.out.println("\n\t\tThank You!");
	}
}


/*
OUTPUT:

NORMAL CASE:

vishakan@legion:~/Desktop/Semester III/Lab/Java/Pgk & Ex Handling$ javac -d . CurrConvertor.java
vishakan@legion:~/Desktop/Semester III/Lab/Java/Pgk & Ex Handling$ java mypack.CurrConvertor
		Welcome to Currency Convertor!

We convert from and to the following denominations:
	Dollar
	Euro
	Rupee
	Yen


Enter From Denomination: 
Dollar

Enter To Denomination: 
EuRo

Enter Dollar value to convert: 
9

The value of Dollar in Euro is: 8.1

		Thank You!


EXCEPTION CASE:

vishakan@legion:~/Desktop/Semester III/Lab/Java/Pgk & Ex Handling$ java mypack.CurrConvertor
		Welcome to Currency Convertor!

We convert from and to the following denominations:
	Dollar
	Euro
	Rupee
	Yen


Enter From Denomination: 
RuPeE

Enter To Denomination: 
YeN

Enter Rupee value to convert: 
150x
The denomination you entered is not a number.Please try again.

The value of Rupee in Yen is: 0.0

		Thank You!

*/