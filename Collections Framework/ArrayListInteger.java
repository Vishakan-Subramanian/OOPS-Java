/* QUESTION 2:
Write a program to get two integer ArrayList. Perform the following operations
Merge the two lists
Find Union of two lists
Find Intersection of two lists
Compare two lists
*/


import java.util.*;
import java.util.Collections;   
import java.util.HashSet;

public class ArrayListInteger{
	public static void main(String args[]){
		int opt,wish,num;
		boolean equal;
		System.out.println("\n\tInteger Manipulation using ArrayList \n");
		Scanner obj=new Scanner(System.in);
		ArrayListInteger ali=new ArrayListInteger();
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<Integer>();
			
		do{
			System.out.println("Enter An Option :\n\t1.Enter Elements to Lists\n\t2.Merge the 2 Lists\n\t3.Find Union of the two Lists\n\t4.Find Intersection of the two Lists\n\t5.Compare the two Lists\n\tEnter Your Choice: ");
			opt=obj.nextInt();
			switch(opt){
				case 1:
					System.out.println("\nEnter Integer to Add : ");	
					System.out.println("\nList 1 : ");
					num=obj.nextInt();
					al1.add(num);
					System.out.println("\nList 2 : ");
					num=obj.nextInt();
					al2.add(num);
					break;
				case 2:
					al1.addAll(al2);
					System.out.println("List After Merging : "+al1);
					break;
				case 3:
					Set<Integer> set = new HashSet<Integer>();
					set.addAll(al1);
   					set.addAll(al2);
					System.out.println("Union of the two Lists : "+set);
        			break;
        		case 4: 
        				List<Integer> list = new ArrayList<Integer>();
        				for(Integer t : al1){
            					if(al2.contains(t))	
            						list.add(t);
          			 	}
          			 	System.out.println("Intersection of the two Lists : "+list);
        				break;
        		case 5:
        				equal=al1.equals(al2);
        				if(equal==true)	
        					System.out.println("The two Lists are Equal");
        				else	
        					System.out.println("The two Lists are Not Equal");
        				break;
				default:
						System.out.println("\n\tInvalid Input.");
			}

			System.out.println("\nDo You wish to continue ?(1-Yes/2-No): ");
			wish=obj.nextInt();

		}while(wish!=2);
	}
}

/*
OUTPUT:
vishakan@legion:~/Desktop$ javac ArrayListInteger.java
vishakan@legion:~/Desktop$ java ArrayListInteger

	Integer Manipulation using ArrayList 

Enter An Option :
	1.Enter Elements to Lists
	2.Merge the 2 Lists
	3.Find Union of the two Lists
	4.Find Intersection of the two Lists
	5.Compare the two Lists
	Enter Your Choice: 
1

Enter Integer to Add : 

List 1 : 
1

List 2 : 
1

Do You wish to continue ?(1-Yes/2-No): 
1
Enter An Option :
	1.Enter Elements to Lists
	2.Merge the 2 Lists
	3.Find Union of the two Lists
	4.Find Intersection of the two Lists
	5.Compare the two Lists
	Enter Your Choice: 
1

Enter Integer to Add : 

List 1 : 
2

List 2 : 
3

Do You wish to continue ?(1-Yes/2-No): 
1
Enter An Option :
	1.Enter Elements to Lists
	2.Merge the 2 Lists
	3.Find Union of the two Lists
	4.Find Intersection of the two Lists
	5.Compare the two Lists
	Enter Your Choice: 
1

Enter Integer to Add : 

List 1 : 
34

List 2 : 
35

Do You wish to continue ?(1-Yes/2-No): 
1
Enter An Option :
	1.Enter Elements to Lists
	2.Merge the 2 Lists
	3.Find Union of the two Lists
	4.Find Intersection of the two Lists
	5.Compare the two Lists
	Enter Your Choice: 
1

Enter Integer to Add : 

List 1 : 
32

List 2 : 
32

Do You wish to continue ?(1-Yes/2-No): 
1
Enter An Option :
	1.Enter Elements to Lists
	2.Merge the 2 Lists
	3.Find Union of the two Lists
	4.Find Intersection of the two Lists
	5.Compare the two Lists
	Enter Your Choice: 
3
Union of the two Lists : [32, 1, 2, 34, 3, 35]

Do You wish to continue ?(1-Yes/2-No): 
1
Enter An Option :
	1.Enter Elements to Lists
	2.Merge the 2 Lists
	3.Find Union of the two Lists
	4.Find Intersection of the two Lists
	5.Compare the two Lists
	Enter Your Choice: 
4
Intersection of the two Lists : [1, 32]

Do You wish to continue ?(1-Yes/2-No): 
1
Enter An Option :
	1.Enter Elements to Lists
	2.Merge the 2 Lists
	3.Find Union of the two Lists
	4.Find Intersection of the two Lists
	5.Compare the two Lists
	Enter Your Choice: 
5
The two Lists are Not Equal

Do You wish to continue ?(1-Yes/2-No): 
1
Enter An Option :
	1.Enter Elements to Lists
	2.Merge the 2 Lists
	3.Find Union of the two Lists
	4.Find Intersection of the two Lists
	5.Compare the two Lists
	Enter Your Choice: 
2
List After Merging : [1, 2, 34, 32, 1, 3, 35, 32]

Do You wish to continue ?(1-Yes/2-No): 
2

*/
