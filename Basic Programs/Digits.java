//Program to print sum of all digits of a 5 digit number

public class Digits{
	public static void main(String args[]){
		int num=Integer.parseInt(args[0]);
		int i=0,digit=0,sum=0;
		while(num>0){
			digit=num%10;
			sum+=digit;		//adding each digit
			num/=10;
		}
		System.out.print("The sum of digits is: "+sum+" ");
	}

}

/*
cs1196@u22:~/Desktop$ javac Digits.java
cs1196@u22:~/Desktop$ java Digits 12345
The sum of digits is: 15 
*/
