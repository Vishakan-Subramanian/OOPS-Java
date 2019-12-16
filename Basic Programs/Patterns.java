/*
1. Write 4 programs, called 
PrintCheckerPattern
, 
PrintSquarePattern
, 
PrintTriangularPattern
 and 
PrintStarPattern
 to print each of the following patterns. 
* * * * *      * * * * *    * * * * *        *
 * * * * *     *       *     *     *     * *   * *
* * * * *      *       *      *   *         * *
 * * * * *     *       *       * *         *   *
* * * * *      * * * * *        *         *     *
   (a)            (b)          (c)           (d)
Try: Use nested loops to print the above patterns.
*/

import java.util.Scanner;

public class Patterns{
	public void PrintCheckerPattern(int r,int c){
		int row=1,col=1;
		for(;row<=r;row++){
			col=1;
			for(;col<=(2*c);col++){
				if(row%2==0)
					if(col%2==0)
						System.out.print("*");
					else
						System.out.print(" ");
				else
					if(col%2==0)
						System.out.print(" ");
					else
						System.out.print("*");
			}
		System.out.println("");
		}
	}
	
	public void PrintSquarePattern(int r,int c){
		int row=1,col=1;
		System.out.println("");
		for(;row<=r;row++){
			col=1;
			for(;col<=(2*c-1);col++){
				if(row==1||row==r){
					if(col%2==0)
						System.out.print(" ");
					else
						System.out.print("*");
					 
					}
				else
					if(col==1||col==(2*c-1))
						System.out.print("*");
					else
						System.out.print(" ");

				}

			System.out.println("");
		}
	}

	public void PrintTriangularPattern(int b){
		System.out.println("");
		int row=1,col=1,spc=0;
		for(;row<=b;row++){
			col=(2*b)-spc;
			while(spc>0){
				System.out.print(" ");
				spc--;
			}
			if(row==1)
				while(col>0){
					if(col%2==0)
						System.out.print("*");
					else
						System.out.print(" ");
			
				col--;
				}
			else{
				col--; 
				while(col>0){
					if(col==row||col==((2*b)-row))
						System.out.print("*");
					else
						System.out.print(" ");
					col--;
				}

			}
			System.out.println("");
			spc=row;
		}

	}

	public void PrintStarPattern(int r,int c){
		System.out.println("");
		int row=1,col=1,spc=0,leg=0;
		int temp=(2*c-1)/2;
		for(;row<=r;row++){
			if(row==1){		//printing centre of star on top row
				for(col=1;col<=(2*temp);col++)
					if(col==temp)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			else if(row==2){	//printing arm of star on second row
				for(col=1;col<=(2*temp);col++)
					if(col==temp)
						System.out.print(" ");
					else if(col%2==0)
						System.out.print(" ");
					else
						System.out.print("*");
				}
			else{			//printing the star legs
				leg++;
				spc=temp-row;
				while(spc>0){
					System.out.print(" ");
					spc--;
				}
				for(col=(temp-row)+1;col<=(2*temp);col++){
					if(col==(temp-leg)||col==(temp+leg))
						System.out.print("*");
					else
						System.out.print(" ");
					
				}
			}
			System.out.println("");		
		}

	}
	
	public static void main(String args[]){
		int r,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		r=s.nextInt();
		System.out.println("Enter the number of columns: ");
		c=s.nextInt();
		Patterns p= new Patterns();
		p.PrintCheckerPattern(r,c);
		p.PrintSquarePattern(r,c);
		p.PrintTriangularPattern(r);
		p.PrintStarPattern(r,c+1);
	}

}


/*
cs1196@u22:~/Desktop$ javac Patterns.java
cs1196@u22:~/Desktop$ java Patterns
Enter the number of rows: 
6
Enter the number of columns: 
6
* * * * * * 
 * * * * * *
* * * * * * 
 * * * * * *
* * * * * * 
 * * * * * *

* * * * * *
*         *
*         *
*         *
*         *
* * * * * *

* * * * * * 
 *       * 
  *     *  
   *   *   
    * *    
     *     

     *      
* * * * * * 
    * *     
   *   *    
  *     *   
 *       *  

*/
