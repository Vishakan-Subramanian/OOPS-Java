//Program to separately print sum of all even and odd digits of a six digit number

public class EvenOddPrint{
	public static void main(String args[]){
		int num=Integer.parseInt(args[0]);
		int esum=0,osum=0,digit=0;
		while(num>0){
			digit=num%10;
			if(digit%2==0){		//summing even numbers together separately
				esum+=digit;
			}
			else{			//summing odd numbers together separately
				osum+=digit;
			}
			num/=10;
		}

		System.out.println("The even digits sum is: ");
		System.out.print(esum+" ");
		System.out.println("");
		System.out.println("The odd digits sum is: ");
		System.out.print(osum+" ");
	}

}

/*
cs1196@u22:~/Desktop$ java EvenOddPrint 12345
The even digits sum is: 
6 
The odd digits sum is: 
9 
*/
