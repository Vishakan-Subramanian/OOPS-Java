//Program to ask the user's name and greets the user after converting the name to uppercase

public class Greetings{
	public static void main(String args[]){
		System.out.print("Enter your name: ");
		String name=System.console().readLine();	//reading username
		System.out.println("Hello "+name.toUpperCase()+"! Welcome to OOPS with JAVA");
	}

}

/*
cs1196@u22:~/Desktop$ javac Greetings.java
cs1196@u22:~/Desktop$ java Greetings
Enter your name: Vikram
Hello VIKRAM! Welcome to OOPS with JAVA
*/
