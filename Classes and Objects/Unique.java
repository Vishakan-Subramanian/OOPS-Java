/*4. Write a program to Find the Number of Non-Repeated Elements in an Array.*/

import java.util.Scanner;

public class Unique{
	int len;
	int arr[]=new int[100];
	Unique(int n){
		len=n;
	}
	
	
	public void inputElements(){
		System.out.println("Enter array elements: ");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<len;i++){
			System.out.println("Enter Element "+(i+1));
			arr[i]=s.nextInt();
		}
	}

	public void uniqueSearch(){
		int res=len,tc=0,j=0;
    	for(int i=0;i<len;i++){
    		tc=0;
    		for(j=0;j<len;j++){
    			if(arr[j]==arr[i])
    					tc++;
    		}
    		if(tc>=2)
    			res-=1;
    	}
		System.out.println("The number of unique elements is: "+res);
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Unique Searcher");
		int n;
		System.out.println("Enter the number of elements in array: ");
		n=sc.nextInt();
		Unique u=new Unique(n);
		u.inputElements();
		u.uniqueSearch();

	}
}

/*
OUTPUT:

vishakan@vishakan-legion:~/Desktop/Java/Ex3$ java Unique
Unique Searcher
Enter the number of elements in array: 
6
Enter array elements: 
Enter Element 1
1
Enter Element 2
2
Enter Element 3
3
Enter Element 4
3
Enter Element 5
4
Enter Element 6
5
The number of unique elements is: 4

*/