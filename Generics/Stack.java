import java.util.*;


public class Stack<T>{
	private int size;
	private int top=-1;
	private T[] arr;

	public Stack(){
		size=5;
		arr=(T[]) new Object[5];
		top=-1;
	}

	public void push(T x){
		if(this.top==this.size-1)
			System.out.println("Stack Overflow");
		else
			arr[++top]=x;
	}

	public T pop(){
		T popped=arr[top--];
		if(this.top==-1)
			System.out.println("Stack Underflow");	 	
		return popped;
	}
	
	public void display(){
		System.out.println("Stack elements from Bottom To Top: ");
		for(int i=0;i<=top;i++){
			System.out.println(arr[i]);
		}
	}

	public static void main(String args[]){
		Stack<String> strstack = new Stack<String>();
		Stack<Integer> intstack = new Stack<Integer>();
		Scanner s=new Scanner(System.in);		
		int opt=1,sopt=1;
		while(opt!=0){
			System.out.println("\t\tMain Menu\n\t1 for Int Stack\n\t2 for Str Stack\n\t0 to Quit\nEnter your choice: ");
			opt=s.nextInt();
			switch(opt){
				case 1:
					System.out.println("1 to Push\n2 to Pop\n3 to Display\nChoice: ");
					sopt=s.nextInt();
					switch(sopt){
						case 1:
							System.out.println("Enter the Integer: ");
							intstack.push(s.nextInt());
							break;
						case 2:
							System.out.println("The Popped Integer: "+intstack.pop());
							break;
						case 3:
							intstack.display();
							break;
						default:
							System.out.println("Invalid Option");
					}
					break;
				case 2:
					System.out.println("1 to Push\n2 to Pop\n3 to Display\nChoice: ");
					sopt=s.nextInt();
					switch(sopt){
						case 1:
							System.out.println("Enter the String: ");
							strstack.push(s.next());
							break;
						case 2:
							System.out.println("The Popped String: "+strstack.pop());
							break;
						case 3:
							strstack.display();
							break;
						default:
							System.out.println("Invalid Option");
					}
					break;

				case 0:
					System.out.println("\t\tThank You");
					break;

				default:
					System.out.println("Invalid Option");
					
			}
		}
	}
}
