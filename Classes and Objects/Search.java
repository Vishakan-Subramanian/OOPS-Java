/* To perform LINEAR and BINARY search over an array of elements using Java */

import java.util.Scanner;

public class Search{
	int n,arr[];
	Search(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n=s.nextInt();
		arr=new int[n];
	}
	

	void inputElements(){
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++){
			Scanner sc=new Scanner(System.in);
			System.out.println("Element "+(i+1));
			arr[i]=sc.nextInt();
		}
	}

	void searchLinear(int e){
		int flag=0;
		System.out.println("\n\t\tLinear Search");
		for(int i=0;i<n;i++){
			if(arr[i]==e){
				System.out.println("\nElement "+e+" found at position "+(i+1));
				flag=1;
			}
		}
		if(flag==0)
			System.out.println("\nElement was not found.");
		
	}

	void searchBinary(int e){
		System.out.println("\n\t\tBinary Search");
		int start=0,end=n-1,mid,flag=0;
		
		while(start<=end){
			mid=(start+end)/2;
			if(arr[mid]==e){
				flag=1;
				System.out.println("\nElement "+e+" found at position "+(mid+1));
				break;
			}

			if(arr[mid]<e)
				start=mid+1;

			else
				end=mid-1;

			

		}

		if(flag!=1)
			System.out.println("\nElement was not found.");

	}

	void sortBubble(){
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				
				}
			}
		}

	}

	public static void main(String args[]){
		int e;
		Scanner scn=new Scanner(System.in);
		Search s=new Search();
		s.inputElements();
		System.out.println("Enter an element to search: ");
		e=scn.nextInt();
		s.searchLinear(e);
		s.sortBubble();
		s.searchBinary(e);

	}

}


/*
OUTPUT:
vishakan@vishakan-legion:~/Desktop/Java/Ex2$ javac Search.java
vishakan@vishakan-legion:~/Desktop/Java/Ex2$ java Search
Enter the number of elements: 
10
Enter the elements of the array: 
Element 1
1
Element 2
2
Element 3
4
Element 4
2
Element 5
4 
Element 6
6
Element 7
4
Element 8
9
Element 9
5
Element 10
3
Enter an element to search: 
4

		Linear Search

Element 4 found at position 3

Element 4 found at position 5

Element 4 found at position 7

		Binary Search

Element 4 found at position 5
*/