//to find factorial of a number
public class Factorial{
	public static void main(String args[]){
		int num=Integer.parseInt(args[0]);
		int fact=1;
		for(int i=1;i<=num;i++){
			fact*=i;				//multiplying to find factor
		}
		System.out.println("The factorial is: "+fact);		
	
	}

}

/*
cs1196@u22:~/Desktop$ javac Factorial.java
cs1196@u22:~/Desktop$ java Factorial 7
The factorial is: 5040
*/
