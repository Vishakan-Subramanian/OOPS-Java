import java.util.*;


public class ListOperations{		//Maximum Of Given Object Array
	public static <T extends Comparable> T max(T[] list){		//Return Type: T of Comparable Interface, Parameter: Array of T
		T max=list[0];						//Assigning the first element of list as max
		for(int i=1;i<list.length;i++){				//Iterating over the remaining elements to find max
			if(list[i].compareTo(max)>0)
				max=list[i];
		}
		return max;
	}

	public static <T extends Comparable> void sortList(T list[]){		//To sort an Object Array of Comparable Type
		T temp;
		int i,j;
		System.out.println("Sorted List: ");
		for(i=0;i<list.length;i++){
			for(j=i+1;j<list.length;j++){
				if(list[i].compareTo(list[j])>0){
					temp=list[i];
					list[i]=list[j];	
					list[j]=temp;
				}
			}
		}
	}
	
	public static <T extends Comparable> void displayList(T list[]){		//To display an Object Array of Comparable Type
		int i=0;
		System.out.println("List Contents: ");
		for(i=0;i<list.length;i++)
			System.out.print(list[i]+"  ");
		System.out.println("\n");
	}
	
	public static void main(String args[]){
		Integer[] ilist={1,2,3,4,5,2,3423,324,24};		//Test for Integer Type
		String[] slist={"Veera","Vikram","Venkat","Vishwak","Java","C++","Boolean"};		//Test for String Type
		Double[] dlist={22.43,324.3442,2331.323,2344.12,566.434};		//Test for Double Type
		
		System.out.println("Using the Comparable Interface to Compare Objects");
		System.out.println("Integer Max: "+max(ilist)+"\nString Max: "+max(slist)+"\nDouble Max: "+max(dlist));
		sortList(ilist);
		displayList(ilist);
		sortList(slist);
		displayList(slist);
		sortList(dlist);
		displayList(dlist);

	}	
}

/*
OUTPUT:
vishakan@legion:~/Desktop/Semester III/Lab/Java/Generics$ javac Max.java
vishakan@legion:~/Desktop/Semester III/Lab/Java/Generics$ java Max
Using Comparable Interface
Integer Max: 3423
String Max: Vishwak
Double Max: 2344.12
*/
