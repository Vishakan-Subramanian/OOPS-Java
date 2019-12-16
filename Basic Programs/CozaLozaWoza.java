/*
 Write a program called 
CozaLozaWoza
 which prints the numbers 
1
 to 
110
, 
11
 numbers per 
line. The program shall print "Coza" in place of the numbers which are multiples of 3, "Loza" for 
multiples of 5, "Woza" for multiples of 7, "CozaLoza" for multiples of 3 and 5, and so on. The 
output shall look like:
1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11 
Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22 
23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza
*/


public class CozaLozaWoza{
	public static void main(String args[]){
		int i=1,k=0;
		for(;i<=110;i++){
			System.out.print(" ");
			k=0;
			if(i%3==0){
				System.out.print("Coza");
				k++;
			}
			if(i%5==0){
				System.out.print("Loza");
				k++;
			}
			if(i%7==0){
				System.out.print("Woza");
				k++;	
			}
			if(k==0)
				System.out.print(i);
			if(i%11==0)
				System.out.println("");
		}

	}


}

/*
cs1196@u22:~/Desktop$ javac CozaLozaWoza.java
cs1196@u22:~/Desktop$ java CozaLozaWoza
1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11
 Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22
 23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza
 34 LozaWoza Coza 37 38 Coza Loza 41 CozaWoza 43 44
 CozaLoza 46 47 Coza Woza Loza Coza 52 53 Coza Loza
 Woza Coza 58 59 CozaLoza 61 62 CozaWoza 64 Loza Coza
 67 68 Coza LozaWoza 71 Coza 73 74 CozaLoza 76 Woza
 Coza 79 Loza Coza 82 83 CozaWoza Loza 86 Coza 88
 89 CozaLoza Woza 92 Coza 94 Loza Coza 97 Woza Coza
 Loza 101 Coza 103 104 CozaLozaWoza 106 107 Coza 109 Loza

*/


/*
OLD CODE
if(i%3==0)
				if(i%5==0)
					if(i%7==0)
						System.out.print(" CozaLozaWoza");	//3,5,7
					else		
						System.out.print(" CozaLoza");		//3,5
				else
					System.out.print(" Coza");			//3
			else if(i%5==0)
				if(i%7==0)
					System.out.print(" LozaWoza");			//5,7
				else
					System.out.print(" Loza");			//5
			else if(i%7==0)
				if(i%3==0)
					System.out.print(" CozaWoza");			//7,3
				else				
					System.out.print(" Woza");			//7
			else
				System.out.print(" "+i);

*/
