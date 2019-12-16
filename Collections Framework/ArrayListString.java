/* QUESTION 1:
Write a program to perform string operations using ArrayList. Write functions for the following
Append - add at end
Insert – add at particular index
Find the index of a particular element (Search)
Display the list
List all string starts with given letter
List of all string contains the Substring
Sort the elements in ArrayList
Remove a particular element
Replace one string with another string in ArrayList
Remove duplicate elements
*/

import java.util.*;
import java.util.Collections;   
import java.util.LinkedHashSet;

public class ArrayListString{
	public void append(String str,ArrayList<String> al){
		al.add(str);
	}
	public void appendWithIndex(String str,int indx,ArrayList<String> al){
		al.add(indx,str);
	}
	
	public void display(ArrayList<String> al){
		System.out.println("Elements of the List : "+al);
	}
	
	public int findIndex(String str,ArrayList<String> al){
		return al.indexOf(str);
	}
	public void startWithLtr(char ch,ArrayList<String> al){
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()){
			String ele=itr.next();
			char chr=ele.charAt(0);
			if(ch==chr)	
				System.out.println(itr.next());
		}
	}
	public void sort(ArrayList<String> al){
		Collections.sort(al);
		System.out.println("Sorted List: "+al);
	}
	public int removeString(String str,ArrayList<String> al){
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()){
			String element = itr.next();
			if(element.equals(str)){
				while(al.indexOf(str)!=-1)
					al.remove(al.indexOf(str));
				System.out.println("Element Removed!");
				return 1;
			}
		}
		return -1; 
	}
	public int replaceString(String str1,String str2,ArrayList<String> al){
		int indx=al.indexOf(str1);
		if(indx!=-1){
			al.set(indx,str2);
			return 1;
		}
		else
			return -1;
	}
	public void removeDuplicates(ArrayList<String> al){
		LinkedHashSet<String> hashSet = new LinkedHashSet<>(al);
		 ArrayList<String> listWithoutDuplicates = new ArrayList<>(hashSet);
		 System.out.println("List after Removing Duplicates : "+listWithoutDuplicates);
	}
	public void findSubstring(String str,ArrayList<String> al){
		int flag=0;
		Iterator<String> itr = al.iterator();
		System.out.println("Elements : ");
		while(itr.hasNext()) {
			String element = itr.next();
			if(element.contains(str)){
				System.out.print(" "+element);
				flag=1;
			}
		}
		if(flag==0)
			System.out.println("Substring not found");
	} 
	public static void main(String args[]){
		int wish,opt,indx,itr=0;
		boolean found;
		String str,ch;
		char chr;
		Scanner obj=new Scanner(System.in);
		ArrayListString als=new ArrayListString();
		
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("\n\tString Operations using ArrayList\n");
		do{
			System.out.println("\nEnter the Option: \n\t1 to Append - Add at End\n\t2 to Insert – Add at Particular Index\n\t3 to Find the Index of a Particular Element\n\t4 to Display the List\n\t5 to List all Strings starting with given Letter\n\t6 to List all String Containing a Substring\n\t7 to Sort the Elements in ArrayList\n\t8 to Remove a Particular Element\n\t9 to Replace one string with another string in ArrayList\n\t10 to  Remove the Duplicate Elements: ");
			opt=obj.nextInt();
		
			switch(opt){
				case 1 :
					System.out.println("\nEnter String to Add: ");	
					obj.nextLine();
					str=obj.nextLine();itr++;
					als.append(str,al);
					break;
				case 2: 
					System.out.println("Enter Index to Insert (From 0 to "+itr+"): ");
					indx=obj.nextInt();
					System.out.println("\nEnter String to Add : ");	
					obj.nextLine();
					str=obj.nextLine();
					als.appendWithIndex(str,indx,al);
					break;
				case 3:
					System.out.println("\nEnter String to Find: ");	
					obj.nextLine();
					str=obj.nextLine();
					indx=als.findIndex(str,al);
					if(indx==-1)
						System.out.println("Given String is Not Present in the ArrayList.");
					else
						System.out.println("Index: "+indx);
					break;
				case 4:
					als.display(al);
					break;
				case 5:
					System.out.println("Enter a Character: ");
					chr=obj.next().charAt(0);
					als.startWithLtr(chr,al);
					break;
				case 6:
					System.out.println("Enter the Sub-String to Find: ");
					obj.nextLine();
					ch=obj.nextLine();
					als.findSubstring(ch,al);
					break;
				case 7:
					als.sort(al);
					break;
				case 8:
					System.out.println("\nEnter String to Find: ");	
					obj.nextLine();
					str=obj.nextLine();
					indx=als.removeString(str,al);
					if(indx==-1)
						System.out.println("Given String is not present in the ArrayList");
					break;
				case 9:
					System.out.println("\nEnter String to Find: ");	
					obj.nextLine();
					str=obj.nextLine();
					System.out.println("\nEnter String to Replace with: ");	
					ch=obj.nextLine();
					indx=als.replaceString(str,ch,al);
					if(indx==-1)
						System.out.println("Given String is not present in the ArrayList");
					else
						System.out.println("Element Replaced successfully!");
					break;
				case 10:
					als.removeDuplicates(al);
					break;
				default: 
					System.out.println("\nInvalid Input");
			}

			System.out.println("\nDo you wish to continue?(1-Yes/2-No): ");
			wish=obj.nextInt();
		}while(wish!=2);
	}
}

/*
OUTPUT:
vishakan@legion:~/Desktop$ javac ArrayListString.java
vishakan@legion:~/Desktop$ java ArrayListString

	String Operations using ArrayList


Enter the Option: 
	1 to Append - Add at End
	2 to Insert – Add at Particular Index
	3 to Find the Index of a Particular Element
	4 to Display the List
	5 to List all Strings starting with given Letter
	6 to List all String Containing a Substring
	7 to Sort the Elements in ArrayList
	8 to Remove a Particular Element
	9 to Replace one string with another string in ArrayList
	10 to Remove the Duplicate Elements: 
1

Enter String to Add: 
Hi

Do you wish to continue?(1-Yes/2-No): 
1

Enter the Option: 
	1 to Append - Add at End
	2 to Insert – Add at Particular Index
	3 to Find the Index of a Particular Element
	4 to Display the List
	5 to List all Strings starting with given Letter
	6 to List all String Containing a Substring
	7 to Sort the Elements in ArrayList
	8 to Remove a Particular Element
	9 to Replace one string with another string in ArrayList
	10 to Remove the Duplicate Elements: 
1

Enter String to Add: 
Hey

Do you wish to continue?(1-Yes/2-No): 
1

Enter the Option: 
	1 to Append - Add at End
	2 to Insert – Add at Particular Index
	3 to Find the Index of a Particular Element
	4 to Display the List
	5 to List all Strings starting with given Letter
	6 to List all String Containing a Substring
	7 to Sort the Elements in ArrayList
	8 to Remove a Particular Element
	9 to Replace one string with another string in ArrayList
	10 to Remove the Duplicate Elements: 
1

Enter String to Add: 
Vikram

Do you wish to continue?(1-Yes/2-No): 
1

Enter the Option: 
	1 to Append - Add at End
	2 to Insert – Add at Particular Index
	3 to Find the Index of a Particular Element
	4 to Display the List
	5 to List all Strings starting with given Letter
	6 to List all String Containing a Substring
	7 to Sort the Elements in ArrayList
	8 to Remove a Particular Element
	9 to Replace one string with another string in ArrayList
	10 to Remove the Duplicate Elements: 
1 

Enter String to Add: 
Vish

Do you wish to continue?(1-Yes/2-No): 
1

Enter the Option: 
	1 to Append - Add at End
	2 to Insert – Add at Particular Index
	3 to Find the Index of a Particular Element
	4 to Display the List
	5 to List all Strings starting with given Letter
	6 to List all String Containing a Substring
	7 to Sort the Elements in ArrayList
	8 to Remove a Particular Element
	9 to Replace one string with another string in ArrayList
	10 to Remove the Duplicate Elements: 
1

Enter String to Add: 
Java

Do you wish to continue?(1-Yes/2-No): 
1

Enter the Option: 
	1 to Append - Add at End
	2 to Insert – Add at Particular Index
	3 to Find the Index of a Particular Element
	4 to Display the List
	5 to List all Strings starting with given Letter
	6 to List all String Containing a Substring
	7 to Sort the Elements in ArrayList
	8 to Remove a Particular Element
	9 to Replace one string with another string in ArrayList
	10 to Remove the Duplicate Elements: 
1

Enter String to Add: 
JavaProg

Do you wish to continue?(1-Yes/2-No): 
1

Enter the Option: 
	1 to Append - Add at End
	2 to Insert – Add at Particular Index
	3 to Find the Index of a Particular Element
	4 to Display the List
	5 to List all Strings starting with given Letter
	6 to List all String Containing a Substring
	7 to Sort the Elements in ArrayList
	8 to Remove a Particular Element
	9 to Replace one string with another string in ArrayList
	10 to Remove the Duplicate Elements: 
2
Enter Index to Insert (From 0 to 6): 
3

Enter String to Add : 
Machine

Do you wish to continue?(1-Yes/2-No): 
1

Enter the Option: 
	1 to Append - Add at End
	2 to Insert – Add at Particular Index
	3 to Find the Index of a Particular Element
	4 to Display the List
	5 to List all Strings starting with given Letter
	6 to List all String Containing a Substring
	7 to Sort the Elements in ArrayList
	8 to Remove a Particular Element
	9 to Replace one string with another string in ArrayList
	10 to Remove the Duplicate Elements: 
3

Enter String to Find: 
Machine
Index: 3

Do you wish to continue?(1-Yes/2-No): 
1

Enter the Option: 
	1 to Append - Add at End
	2 to Insert – Add at Particular Index
	3 to Find the Index of a Particular Element
	4 to Display the List
	5 to List all Strings starting with given Letter
	6 to List all String Containing a Substring
	7 to Sort the Elements in ArrayList
	8 to Remove a Particular Element
	9 to Replace one string with another string in ArrayList
	10 to Remove the Duplicate Elements: 
4
Elements of the List : [Hi, Hey, Vikram, Machine, Vish, Java, JavaProg]

Do you wish to continue?(1-Yes/2-No): 
1

Enter the Option: 
	1 to Append - Add at End
	2 to Insert – Add at Particular Index
	3 to Find the Index of a Particular Element
	4 to Display the List
	5 to List all Strings starting with given Letter
	6 to List all String Containing a Substring
	7 to Sort the Elements in ArrayList
	8 to Remove a Particular Element
	9 to Replace one string with another string in ArrayList
	10 to Remove the Duplicate Elements: 
5
Enter a Character: 
H
Hey

Do you wish to continue?(1-Yes/2-No): 
1

Enter the Option: 
	1 to Append - Add at End
	2 to Insert – Add at Particular Index
	3 to Find the Index of a Particular Element
	4 to Display the List
	5 to List all Strings starting with given Letter
	6 to List all String Containing a Substring
	7 to Sort the Elements in ArrayList
	8 to Remove a Particular Element
	9 to Replace one string with another string in ArrayList
	10 to Remove the Duplicate Elements: 
6
Enter the Sub-String to Find: 
Java
Elements : 
 Java JavaProg
Do you wish to continue?(1-Yes/2-No): 
1

Enter the Option: 
	1 to Append - Add at End
	2 to Insert – Add at Particular Index
	3 to Find the Index of a Particular Element
	4 to Display the List
	5 to List all Strings starting with given Letter
	6 to List all String Containing a Substring
	7 to Sort the Elements in ArrayList
	8 to Remove a Particular Element
	9 to Replace one string with another string in ArrayList
	10 to Remove the Duplicate Elements: 
7
Sorted List: [Hey, Hi, Java, JavaProg, Machine, Vikram, Vish]

Do you wish to continue?(1-Yes/2-No): 
1

Enter the Option: 
	1 to Append - Add at End
	2 to Insert – Add at Particular Index
	3 to Find the Index of a Particular Element
	4 to Display the List
	5 to List all Strings starting with given Letter
	6 to List all String Containing a Substring
	7 to Sort the Elements in ArrayList
	8 to Remove a Particular Element
	9 to Replace one string with another string in ArrayList
	10 to Remove the Duplicate Elements: 
8

Enter String to Find: 
Hey
Element Removed!

Do you wish to continue?(1-Yes/2-No): 
1

Enter the Option: 
	1 to Append - Add at End
	2 to Insert – Add at Particular Index
	3 to Find the Index of a Particular Element
	4 to Display the List
	5 to List all Strings starting with given Letter
	6 to List all String Containing a Substring
	7 to Sort the Elements in ArrayList
	8 to Remove a Particular Element
	9 to Replace one string with another string in ArrayList
	10 to Remove the Duplicate Elements: 
4
Elements of the List : [Hi, Java, JavaProg, Machine, Vikram, Vish]

Do you wish to continue?(1-Yes/2-No): 
1

Enter the Option: 
	1 to Append - Add at End
	2 to Insert – Add at Particular Index
	3 to Find the Index of a Particular Element
	4 to Display the List
	5 to List all Strings starting with given Letter
	6 to List all String Containing a Substring
	7 to Sort the Elements in ArrayList
	8 to Remove a Particular Element
	9 to Replace one string with another string in ArrayList
	10 to Remove the Duplicate Elements: 
9

Enter String to Find: 
Java

Enter String to Replace with: 
C++
Element Replaced successfully!

Do you wish to continue?(1-Yes/2-No): 
1

Enter the Option: 
	1 to Append - Add at End
	2 to Insert – Add at Particular Index
	3 to Find the Index of a Particular Element
	4 to Display the List
	5 to List all Strings starting with given Letter
	6 to List all String Containing a Substring
	7 to Sort the Elements in ArrayList
	8 to Remove a Particular Element
	9 to Replace one string with another string in ArrayList
	10 to Remove the Duplicate Elements: 
4
Elements of the List : [Hi, C++, JavaProg, Machine, Vikram, Vish]

Do you wish to continue?(1-Yes/2-No): 
1

Enter the Option: 
	1 to Append - Add at End
	2 to Insert – Add at Particular Index
	3 to Find the Index of a Particular Element
	4 to Display the List
	5 to List all Strings starting with given Letter
	6 to List all String Containing a Substring
	7 to Sort the Elements in ArrayList
	8 to Remove a Particular Element
	9 to Replace one string with another string in ArrayList
	10 to Remove the Duplicate Elements: 
1

Enter String to Add: 
Hi

Do you wish to continue?(1-Yes/2-No): 
1

Enter the Option: 
	1 to Append - Add at End
	2 to Insert – Add at Particular Index
	3 to Find the Index of a Particular Element
	4 to Display the List
	5 to List all Strings starting with given Letter
	6 to List all String Containing a Substring
	7 to Sort the Elements in ArrayList
	8 to Remove a Particular Element
	9 to Replace one string with another string in ArrayList
	10 to Remove the Duplicate Elements: 
4
Elements of the List : [Hi, C++, JavaProg, Machine, Vikram, Vish, Hi]

Do you wish to continue?(1-Yes/2-No): 
1

Enter the Option: 
	1 to Append - Add at End
	2 to Insert – Add at Particular Index
	3 to Find the Index of a Particular Element
	4 to Display the List
	5 to List all Strings starting with given Letter
	6 to List all String Containing a Substring
	7 to Sort the Elements in ArrayList
	8 to Remove a Particular Element
	9 to Replace one string with another string in ArrayList
	10 to Remove the Duplicate Elements: 
10
List after Removing Duplicates : [Hi, C++, JavaProg, Machine, Vikram, Vish]

Do you wish to continue?(1-Yes/2-No): 
2

*/