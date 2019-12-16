/*
Write a java program with a class named ‘Box’ with three parameters length, width and depth.
Inherit a class named ‘BoxWeight’ from ‘Box’ with an additional member weight of the box. Inherit
‘BoxShipment’ from ‘BoxWeight’ with an additional member shipmentcost. Calculate the volume
and cost for the box on shipment.
*/

import java.util.*;

public class Box{
	int length,width,depth;

	public static void main(String args[]){
		BoxShipment b= new BoxShipment();
		b.inputBox();
		b.shippingCost();
	}
	
}

class BoxWeight extends Box{
	int weight;
}

class BoxShipment extends BoxWeight{
	int shipmentcost;

	public void inputBox(){
		Scanner s=new Scanner(System.in);
		System.out.println("\nEnter the box's length:  ");
		length=s.nextInt();
		System.out.println("\nEnter the box's width:  ");
		width=s.nextInt();
		System.out.println("\nEnter the box's depth:  ");
		depth=s.nextInt();
		System.out.println("\nEnter the box's weight:  ");
		weight=s.nextInt();
		System.out.println("\nEnter the shipment rate:  ");
		shipmentcost=s.nextInt();
	}

	public void shippingCost(){
 		int totalcost=shipmentcost*weight;
		int volume=depth*length*width;
		System.out.println("\nThe volume of the box is : "+volume+"\nThe total shipping cost of the box is : "+totalcost);		
	}
	
}

/*
OUTPUT:
cs1196@u22:~/Desktop/Java/Ex4$ javac Box.java
cs1196@u22:~/Desktop/Java/Ex4$ java Box

Enter the box's length:  
10

Enter the box's width:  
10

Enter the box's depth:  
10

Enter the box's weight:  
10

Enter the shipment rate:  
10

The volume of the box is : 1000
The total shipping cost of the box is : 100
*/
