//Program to perform a simple calculator operations

public class Calc{
	public static void main(String args[]){
		System.out.println("Enter first number: ");
		int m=Integer.parseInt(System.console().readLine());
		System.out.println("Enter second number: ");
		int n=Integer.parseInt(System.console().readLine());
		System.out.println("Enter operation (ADD/SUB/MUL/DIV) : ");
		String op= System.console().readLine();	
		switch(op){
			case "ADD":
					System.out.println("Result is: "+(m+n));
					break;
			case "SUB":
					System.out.println("Result is: "+(m-n));
					break;
			case "MUL":
					System.out.println("Result is: "+(m*n));
					break;
			case "DIV":
					System.out.println("Result is: "+(m/n));
					break;
			default:
					System.out.println("Invalid operation");
					break;
		}		
	}

}

/*
cs1196@u22:~/Desktop$ javac Calc.java
cs1196@u22:~/Desktop$ java Calc
Enter first number: 
1
Enter second number: 
2
Enter operation (ADD/SUB/MUL/DIV) : 
ADD
Result is: 3
cs1196@u22:~/Desktop$ java Calc
Enter first number: 
3
Enter second number: 
4
Enter operation (ADD/SUB/MUL/DIV) : 
SUB
Result is: -1
cs1196@u22:~/Desktop$ java Calc
Enter first number: 
5
Enter second number: 
6
Enter operation (ADD/SUB/MUL/DIV) : 
MUL
Result is: 30
cs1196@u22:~/Desktop$ java Calc
Enter first number: 
9
Enter second number: 
3
Enter operation (ADD/SUB/MUL/DIV) : 
DIV
Result is: 3
cs1196@u22:~/Desktop$ java Calc
Enter first number: 
2
Enter second number: 
3
Enter operation (ADD/SUB/MUL/DIV) : 
xyz
Invalid operation
*/
