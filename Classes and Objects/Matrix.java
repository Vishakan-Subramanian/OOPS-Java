//To perform Matrix Multiplication, Addition and Subtraction

import java.util.Scanner;

public class MatrixNew{
	int mat1[][]=new int[3][3];
        int mat2[][]=new int[3][3];
	int add[][]=new int[3][3];
	int mul[][]=new int[3][3];
	int sub[][]=new int[3][3];
	int row,col;           
	public void inputMat(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		row=s.nextInt();
		System.out.println("Enter no. of columns: ");
		col=s.nextInt();

		System.out.println("Enter first matrix elements: ");
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				mat1[i][j]=s.nextInt();
		System.out.println("Enter second matrix elements: ");
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				mat2[i][j]=s.nextInt();
		System.out.println("Input successful!");
			
	}

	public void addMat(){
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				add[i][j]=mat1[i][j]+mat2[i][j];


	}
	
	public void subMat(){
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				sub[i][j]=mat1[i][j]-mat2[i][j];

	}

	public void mulMat(){
		
            for(int i=0;i<row;i++)
             {
               for(int j=0;j<col;j++)
                {
                  for(int k=0;k<row;k++) 
                    {
                       mul[i][j]=mul[i][j]+mat1[i][k]*mat2[k][j];
                     }
                  }
             }
                     
	}	
            
       public void displayMat(int opt){
	if(opt==1)
	for(int i=0;i<row;i++){
          	for(int j=0;j<col;j++)
                	System.out.print(add[i][j]+ " ");
             System.out.println("");
	}
	if(opt==2)
	for(int i=0;i<row;i++){
           	for(int j=0;j<col;j++)
                 System.out.print(sub[i][j]+ " ");
             System.out.println("");
	}
	if(opt==3)
        for(int i=0;i<row;i++){
             	for(int j=0;j<col;j++)
                 System.out.print(mul[i][j]+ " ");
             System.out.println("");
	}
       }
 
	public static void main(String args[]){
		String op;
		int opt=1;			
		Scanner s=new Scanner(System.in);
		MatrixNew m=new MatrixNew();
		m.inputMat();
		while(opt>0){	
			System.out.println("\n\nEnter your choice : (ADD/SUB/MUL/QUIT) ");			
			op=s.nextLine();
			switch(op){
				case "ADD":
					m.addMat();
					opt=1;
					m.displayMat(opt); 
					break;
				case "SUB":
					m.subMat();
					opt=2;
					m.displayMat(opt); 
					break;
				case "MUL":
					m.mulMat();
					opt=3;
					m.displayMat(opt); 
					break;
				case "QUIT":
					System.exit(0);
				default:
					System.out.println("Invalid Option.");
					opt=5;
			
			}
		}
		System.out.println("The result is:\n ");
			                               
	}
}

/*
OUTPUT:
cs1196@u22:~/Desktop/Java/Ex3$ javac MatrixNew.java
cs1196@u22:~/Desktop/Java/Ex3$ java MatrixNew
Enter no. of rows: 
3
Enter no. of columns: 
3
Enter first matrix elements: 
1 2 3 4 5 6 7 8 9
Enter second matrix elements: 
1 2 3 4 5 6 7 8 9
Input successful!


Enter your choice : (ADD/SUB/MUL/QUIT) 
ADD
2 4 6 
8 10 12 
14 16 18 


Enter your choice : (ADD/SUB/MUL/QUIT) 
SUB
0 0 0 
0 0 0 
0 0 0 


Enter your choice : (ADD/SUB/MUL/QUIT) 
MUL
30 36 42 
66 81 96 
102 126 150 


Enter your choice : (ADD/SUB/MUL/QUIT) 
e   
Invalid Option.


Enter your choice : (ADD/SUB/MUL/QUIT) 
QUIT
*/

