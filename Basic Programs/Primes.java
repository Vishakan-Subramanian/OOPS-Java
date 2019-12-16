//to print prime numbers
public class Primes{
	public static void main(String args[]){
		int limit=Integer.parseInt(args[0]);
		int num=2,factor=0,i=1;
		while(i<=limit){
			factor=0;
			for(int j=2;j<num;j++){
				if(num%j==0)
					factor++;		//counting factors of num
			}
			if(factor==0){			//if num doesn't have factors
				System.out.println(num+" is a prime.");
				i++;
			}
			num++;
		}
				
	
	}

}

/*
cs1196@u22:~/Desktop$ javac Primes.java
cs1196@u22:~/Desktop$ java Primes 10
2 is a prime.
3 is a prime.
5 is a prime.
7 is a prime.
11 is a prime.
13 is a prime.
17 is a prime.
19 is a prime.
23 is a prime.
29 is a prime.
*/
