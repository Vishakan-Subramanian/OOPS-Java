//Program to print Fibonacci series upto n

public class Fibonacci{
	public static void main(String args[]){
		int num=Integer.parseInt(args[0]);
		int a=1,b=1,temp;
		System.out.println("The Fibonacci Series: ");
		System.out.print(a+" ");
		System.out.print(b+" ");		//printing initial numbers
		for(int i=3;i<=num;i++){
			temp=b;
			b=b+a;
			a=temp;
			System.out.print(b+" ");
			

		}	
	
	}

}

/*
cs1196@u22:~/Desktop$ javac Fibonacci.java
cs1196@u22:~/Desktop$ java Fibonacci 5
The Fibonacci Series: 
1 1 2 3 5 
*/
