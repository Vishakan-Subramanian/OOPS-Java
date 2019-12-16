import java.util.*;


public class Sorting<Item>{
	private Item list[];
	
	Sorting(int size){
		list = (Item[]) new Object[size];
	}

	public void sortList(){
		Item temp;
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

	public void displayList(){
		int i=0;
		System.out.println("List Contents: ");
		for(i=0;i<list.length;i++)
			System.out.println(list[i]);
	}

	public static void main(String args[]){
		System.out.println("Sorting on Integer List");
		Sorting<Integer> i = new Sorting<Integer>(10);
		System.out.println("Inserting the Following Integers Onto the List: 1,3,4,21,4452,7,42,2,122,45");
		i.list[0]=1;
		i.list[1]=3;
		i.list[2]=4;
		i.list[3]=21;
		i.list[4]=4452;
		i.list[5]=7;
		i.list[6]=42;
		i.list[7]=2;
		i.list[8]=122;
		i.list[9]=45;
		i.sortList();
		i.displayList();

		System.out.println("Sorting on String List");
		Sorting<String> s = new Sorting<String>(10);
		System.out.println("Inserting the Following Strings Onto the List: 'Hi','Hello','Yay','Zeta','Beta','Gamma','Phi','Xi','Mu','Wa'");
		s.list[0]="Hi";
		s.list[1]="Hello";
		s.list[2]="Yay";
		s.list[3]="Zeta";
		s.list[4]="Beta";
		s.list[5]="Gamma";
		s.list[6]="Phi";
		s.list[7]="Xi";
		s.list[8]="Mu";
		s.list[9]="Wa";
		s.sortList();
		s.displayList();
	}

}
