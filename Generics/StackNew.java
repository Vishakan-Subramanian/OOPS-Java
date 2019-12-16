import java.util.*;

interface Stack<Item>{		//Stack Interface
	Item pop();
	void push(Item i);
	boolean isEmpty();
	boolean isFull();
	void display();
}

public class StackNew<Item> implements Stack<Item>{		//Implementing Class
	private Item stack[];
	private int top;
	private int size;

	public StackNew(int size){
		stack = (Item[]) new Object[size];
		top=-1;
		this.size=size;
	}

	public boolean isFull(){
		if(this.top==this.size-1)
			return true;
		return false;
	}

	public boolean isEmpty(){
		return top==-1;
	}

	public Item pop(){
		if(this.isEmpty()){
			System.out.println("Stack Underflow!");
			return null;
		}
		else
			return stack[top--];
		
	}

	public void push(Item i){
		if(this.isFull())
			System.out.println("Stack Overflow!");
		else
			stack[++top]=i;
	}

	public void display(){
		System.out.println("Stack Elements from Top to Bottom: ");		
		for(int i=this.top;i>=0;i--){
			System.out.println(stack[i]);
		}
	}


	public static void main(String args[]){
		int size=5;		
		Scanner sc=new Scanner(System.in);		
		System.out.println("Stack Testing for Integer Datatype.\n");

		StackNew<Integer> i = new StackNew<Integer>(5);
		System.out.println("Pushing 5 into Stack");
		i.push(5);
		System.out.println("Pushing 10 into Stack");
		i.push(10);
		System.out.println("Pushing 15 into Stack");
		i.push(15);
		i.display();
		System.out.println("\nPopping the Stack");
		System.out.println("Popped Element: "+i.pop());
		System.out.println("Pushing 3,4,5,6 into Stack");
		i.push(3);
		i.push(4);
		i.push(5);
		i.push(6);		//Stack Will Overflow
		System.out.println("\nInteger Stack Verified\n");

		System.out.println("Stack Testing for String Datatype.\n");

		StackNew<String> s = new StackNew<String>(5);
		System.out.println("Pushing 'Hello' into Stack");
		s.push("Hello");
		System.out.println("Pushing 'Java' into Stack");
		s.push("Java");
		System.out.println("Pushing 'C++' into Stack");
		s.push("C++");
		s.display();
		System.out.println("\nPopping the Stack");
		System.out.println("Popped Element: "+s.pop());
		System.out.println("\nPushing 'Two','Pop','List','Gravity' into Stack");
		s.push("Two");
		s.push("Pop");
		s.push("List");
		s.push("Gravity");		//Stack Will Overflow
		System.out.println("\nString Stack Verified\n");
	}		
}

/*
OUTPUT:

vishakan@legion:~/Desktop/Semester III/Lab/Java/Generics$ javac StackNew.java
Note: StackNew.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
vishakan@legion:~/Desktop/Semester III/Lab/Java/Generics$ java StackNew
Stack Testing for Integer Datatype.

Pushing 5 into Stack
Pushing 10 into Stack
Pushing 15 into Stack
Stack Elements from Top to Bottom: 
15
10
5

Popping the Stack
Popped Element: 15
Pushing 3,4,5,6 into Stack
Stack Overflow!

Integer Stack Verified

Stack Testing for String Datatype.

Pushing 'Hello' into Stack
Pushing 'Java' into Stack
Pushing 'C++' into Stack
Stack Elements from Top to Bottom: 
C++
Java
Hello

Popping the Stack
Popped Element: C++

Pushing 'Two','Pop','List','Gravity' into Stack
Stack Overflow!

String Stack Verified

*/
