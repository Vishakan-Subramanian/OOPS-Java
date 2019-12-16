/* QUESTION 3:
Using Collection framework, create a doubly linked list of integers and perform the following operations.
a. Insert element on both sides
b. Delete element on both sides
c. Insert an element at a particular position
d. Delete a particular element
e. Search for a particular element
f.Display list in forward order and backward order
g.Sort the elements in LinkedList
h. Replace one element in the list with another list
i.Remove duplicate elements
*/

import java.util.*;


public class DLL{
	public static void main(String args[]){
		  LinkedList<Integer> list = new LinkedList<>();
		  Iterator it;
		  Iterator looper;
		  Scanner s=new Scanner(System.in);
		  int x,y,i,count;
		  int opt=1;
		  while(opt!=0){
		  	System.out.println("\n\t\tLINKED LIST MANIPULATION\n");
		  	System.out.println("Enter An Option\n\t1 to Insert At Front\n\t2 to Insert At End\n\t3 to Insert Before Element\n\t4 to Delete An Element\n\t5 to Search An Element\n\t6 to Display the List in Forward\n\t7 to Display the List in Reverse\n\t8 to Sort the List\n\t9 to Replace An Element with Another\n\t10 to Remove Duplicates\n\t0 to Exit\n\tYour Choice: ");
		  	opt=s.nextInt();
		  	switch(opt){
		  		case 1:
		  			System.out.println("Enter an Element: ");
		  			x=s.nextInt();
		  			list.addFirst(x);
		  			break;
		  		case 2:
		  			System.out.println("Enter an Element: ");
		  			x=s.nextInt();
		  			list.add(x);
		  			break;
		  		case 3:
		  			System.out.println("Enter an Element: ");
		  			x=s.nextInt();
		  			System.out.println("Enter Element Before Which to Insert "+x);
		  			y=s.nextInt();
		  			i=list.indexOf(y);
		  			if(i==-1)
		  				System.out.println(y+" was not found in the Linked List.\n Element "+x+" was not inserted.");
		  			else
		  				list.add(i,x);
		  			break;
		  		case 4:
		  			System.out.println("Enter an Element: ");
		  			x=s.nextInt();
		  			while(list.indexOf(x)!=-1){
		  				y=list.indexOf(x);
		  				list.remove(y);
		  			}
		  			System.out.println("Element "+x+" was succesfully removed from the Linked List.");
		  			break;
		  		case 5:
		  			System.out.println("Enter an Element: ");
		  			x=s.nextInt();
		  			i=list.indexOf(x);
		  			if(i==-1)
		  				System.out.println("Element "+x+" was not found in the Linked List.");
		  			else
		  				System.out.println("Element "+x+" was found at Index "+i);
		  			break;
		  		case 6:
		  			it = list.listIterator();
		  			System.out.println("Elements in Forward Order: ");
		  			while (it.hasNext()) 
            				System.out.print(it.next()+ " ");
            		break;
            	case 7:
            		it = list.descendingIterator();
		  			System.out.println("Elements in Backward Order: ");
		  			while (it.hasNext()) 
            				System.out.print(it.next()+ " ");
            		break;
            	case 8:
            		Collections.sort(list);
            		System.out.println("Sorted List: \n");
            		it = list.listIterator();
		  			System.out.println("Elements in Forward Order: ");
		  			while (it.hasNext()) 
            				System.out.print(it.next()+ " ");
            		break;
            	case 9:
            		System.out.println("Enter Replacing Element: ");
		  			x=s.nextInt();
		  			System.out.println("Enter Element to be replaced by "+x);
		  			y=s.nextInt();
		  			while(list.indexOf(y)!=-1){
		  				list.set(list.indexOf(y),x);
		  			}
		  			System.out.println("All instances of "+y+" have been replaced by "+x+".");
		  			break;
		  		case 10:
		  			LinkedList<Integer> temp = new LinkedList<>();
		  			int size=list.size();
		  			for(i=0;i<size;i++){
		  				x=list.get(i);
		  				if(!temp.contains(x))
		  					temp.add(x);
		  			}
		  			list=temp;
		  			System.out.println("Duplicates have been removed!"); 
		  			break;
		  		case 0:
		  			System.out.println("\t\tThank You!");
		  			break;
		  		default:
		  			System.out.println("\t\tInvalid Option!");
		  			break;
		  	}
		  }
	}
}

/*
OUTPUT:
vishakan@legion:~/Desktop$ javac DLL.java
vishakan@legion:~/Desktop$ java DLL

		LINKED LIST MANIPULATION

Enter An Option
	1 to Insert At Front
	2 to Insert At End
	3 to Insert Before Element
	4 to Delete An Element
	5 to Search An Element
	6 to Display the List in Forward
	7 to Display the List in Reverse
	8 to Sort the List
	9 to Replace An Element with Another
	10 to Remove Duplicates
	0 to Exit
	Your Choice: 
1
Enter an Element: 
1

		LINKED LIST MANIPULATION

Enter An Option
	1 to Insert At Front
	2 to Insert At End
	3 to Insert Before Element
	4 to Delete An Element
	5 to Search An Element
	6 to Display the List in Forward
	7 to Display the List in Reverse
	8 to Sort the List
	9 to Replace An Element with Another
	10 to Remove Duplicates
	0 to Exit
	Your Choice: 
1
Enter an Element: 
2

		LINKED LIST MANIPULATION

Enter An Option
	1 to Insert At Front
	2 to Insert At End
	3 to Insert Before Element
	4 to Delete An Element
	5 to Search An Element
	6 to Display the List in Forward
	7 to Display the List in Reverse
	8 to Sort the List
	9 to Replace An Element with Another
	10 to Remove Duplicates
	0 to Exit
	Your Choice: 
1
Enter an Element: 
3

		LINKED LIST MANIPULATION

Enter An Option
	1 to Insert At Front
	2 to Insert At End
	3 to Insert Before Element
	4 to Delete An Element
	5 to Search An Element
	6 to Display the List in Forward
	7 to Display the List in Reverse
	8 to Sort the List
	9 to Replace An Element with Another
	10 to Remove Duplicates
	0 to Exit
	Your Choice: 
2
Enter an Element: 
92

		LINKED LIST MANIPULATION

Enter An Option
	1 to Insert At Front
	2 to Insert At End
	3 to Insert Before Element
	4 to Delete An Element
	5 to Search An Element
	6 to Display the List in Forward
	7 to Display the List in Reverse
	8 to Sort the List
	9 to Replace An Element with Another
	10 to Remove Duplicates
	0 to Exit
	Your Choice: 
1
Enter an Element: 
293

		LINKED LIST MANIPULATION

Enter An Option
	1 to Insert At Front
	2 to Insert At End
	3 to Insert Before Element
	4 to Delete An Element
	5 to Search An Element
	6 to Display the List in Forward
	7 to Display the List in Reverse
	8 to Sort the List
	9 to Replace An Element with Another
	10 to Remove Duplicates
	0 to Exit
	Your Choice: 
1
Enter an Element: 
23

		LINKED LIST MANIPULATION

Enter An Option
	1 to Insert At Front
	2 to Insert At End
	3 to Insert Before Element
	4 to Delete An Element
	5 to Search An Element
	6 to Display the List in Forward
	7 to Display the List in Reverse
	8 to Sort the List
	9 to Replace An Element with Another
	10 to Remove Duplicates
	0 to Exit
	Your Choice: 
2
Enter an Element: 
38

		LINKED LIST MANIPULATION

Enter An Option
	1 to Insert At Front
	2 to Insert At End
	3 to Insert Before Element
	4 to Delete An Element
	5 to Search An Element
	6 to Display the List in Forward
	7 to Display the List in Reverse
	8 to Sort the List
	9 to Replace An Element with Another
	10 to Remove Duplicates
	0 to Exit
	Your Choice: 
6
Elements in Forward Order: 
23 293 3 2 1 92 38 
		LINKED LIST MANIPULATION

Enter An Option
	1 to Insert At Front
	2 to Insert At End
	3 to Insert Before Element
	4 to Delete An Element
	5 to Search An Element
	6 to Display the List in Forward
	7 to Display the List in Reverse
	8 to Sort the List
	9 to Replace An Element with Another
	10 to Remove Duplicates
	0 to Exit
	Your Choice: 
3
Enter an Element: 
27
Enter Element Before Which to Insert 27
2

		LINKED LIST MANIPULATION

Enter An Option
	1 to Insert At Front
	2 to Insert At End
	3 to Insert Before Element
	4 to Delete An Element
	5 to Search An Element
	6 to Display the List in Forward
	7 to Display the List in Reverse
	8 to Sort the List
	9 to Replace An Element with Another
	10 to Remove Duplicates
	0 to Exit
	Your Choice: 
5
Enter an Element: 
27
Element 27 was found at Index 3

		LINKED LIST MANIPULATION

Enter An Option
	1 to Insert At Front
	2 to Insert At End
	3 to Insert Before Element
	4 to Delete An Element
	5 to Search An Element
	6 to Display the List in Forward
	7 to Display the List in Reverse
	8 to Sort the List
	9 to Replace An Element with Another
	10 to Remove Duplicates
	0 to Exit
	Your Choice: 
4
Enter an Element: 
2
Element 2 was succesfully removed from the Linked List.

		LINKED LIST MANIPULATION

Enter An Option
	1 to Insert At Front
	2 to Insert At End
	3 to Insert Before Element
	4 to Delete An Element
	5 to Search An Element
	6 to Display the List in Forward
	7 to Display the List in Reverse
	8 to Sort the List
	9 to Replace An Element with Another
	10 to Remove Duplicates
	0 to Exit
	Your Choice: 
6
Elements in Forward Order: 
23 293 3 27 1 92 38 
		LINKED LIST MANIPULATION

Enter An Option
	1 to Insert At Front
	2 to Insert At End
	3 to Insert Before Element
	4 to Delete An Element
	5 to Search An Element
	6 to Display the List in Forward
	7 to Display the List in Reverse
	8 to Sort the List
	9 to Replace An Element with Another
	10 to Remove Duplicates
	0 to Exit
	Your Choice: 
7
Elements in Backward Order: 
38 92 1 27 3 293 23 
		LINKED LIST MANIPULATION

Enter An Option
	1 to Insert At Front
	2 to Insert At End
	3 to Insert Before Element
	4 to Delete An Element
	5 to Search An Element
	6 to Display the List in Forward
	7 to Display the List in Reverse
	8 to Sort the List
	9 to Replace An Element with Another
	10 to Remove Duplicates
	0 to Exit
	Your Choice: 

1
Enter an Element: 
1

		LINKED LIST MANIPULATION

Enter An Option
	1 to Insert At Front
	2 to Insert At End
	3 to Insert Before Element
	4 to Delete An Element
	5 to Search An Element
	6 to Display the List in Forward
	7 to Display the List in Reverse
	8 to Sort the List
	9 to Replace An Element with Another
	10 to Remove Duplicates
	0 to Exit
	Your Choice: 
1
Enter an Element: 
3

		LINKED LIST MANIPULATION

Enter An Option
	1 to Insert At Front
	2 to Insert At End
	3 to Insert Before Element
	4 to Delete An Element
	5 to Search An Element
	6 to Display the List in Forward
	7 to Display the List in Reverse
	8 to Sort the List
	9 to Replace An Element with Another
	10 to Remove Duplicates
	0 to Exit
	Your Choice: 
8
Sorted List: 

Elements in Forward Order: 
1 1 3 3 23 27 38 92 293 
		LINKED LIST MANIPULATION

Enter An Option
	1 to Insert At Front
	2 to Insert At End
	3 to Insert Before Element
	4 to Delete An Element
	5 to Search An Element
	6 to Display the List in Forward
	7 to Display the List in Reverse
	8 to Sort the List
	9 to Replace An Element with Another
	10 to Remove Duplicates
	0 to Exit
	Your Choice: 
9
Enter Replacing Element: 
31
Enter Element to be replaced by 31
23
All instances of 23 have been replaced by 31.

		LINKED LIST MANIPULATION

Enter An Option
	1 to Insert At Front
	2 to Insert At End
	3 to Insert Before Element
	4 to Delete An Element
	5 to Search An Element
	6 to Display the List in Forward
	7 to Display the List in Reverse
	8 to Sort the List
	9 to Replace An Element with Another
	10 to Remove Duplicates
	0 to Exit
	Your Choice: 
6
Elements in Forward Order: 
1 1 3 3 31 27 38 92 293 
		LINKED LIST MANIPULATION

Enter An Option
	1 to Insert At Front
	2 to Insert At End
	3 to Insert Before Element
	4 to Delete An Element
	5 to Search An Element
	6 to Display the List in Forward
	7 to Display the List in Reverse
	8 to Sort the List
	9 to Replace An Element with Another
	10 to Remove Duplicates
	0 to Exit
	Your Choice: 
10
Duplicates have been removed!

		LINKED LIST MANIPULATION

Enter An Option
	1 to Insert At Front
	2 to Insert At End
	3 to Insert Before Element
	4 to Delete An Element
	5 to Search An Element
	6 to Display the List in Forward
	7 to Display the List in Reverse
	8 to Sort the List
	9 to Replace An Element with Another
	10 to Remove Duplicates
	0 to Exit
	Your Choice: 
6
Elements in Forward Order: 
1 3 31 27 38 92 293 
		LINKED LIST MANIPULATION

Enter An Option
	1 to Insert At Front
	2 to Insert At End
	3 to Insert Before Element
	4 to Delete An Element
	5 to Search An Element
	6 to Display the List in Forward
	7 to Display the List in Reverse
	8 to Sort the List
	9 to Replace An Element with Another
	10 to Remove Duplicates
	0 to Exit
	Your Choice: 
0
		Thank You!
