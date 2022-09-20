package day15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// ArrayList different declarations
		
		ArrayList AL =new ArrayList();
		ArrayList <String>AL1 =new ArrayList<String>();//Restricts only string type allowed
		List AL2 =new ArrayList();
		
		//Adding Data Elements into ArrayList
		AL.add(10);
		AL.add("Radha");
		AL.add(10.2);
		AL.add(10);
		AL.add(null);
		AL.add(true);
		System.out.println(AL);//To get the data element value
		System.out.println(AL.size());//to get the size of the array List
		AL.remove(3);//REMOVES THE VALUE AT INDEX 3  (10)
		System.out.println(AL);//To get the data element value
		System.out.println(AL.size());//to get the size of the array List
		AL.add(3,"vbscript");
		System.out.println(AL);//To get the data element value
		System.out.println(AL.size());//to get the size of the array List
		System.out.println(AL.get(4));//To get the data element value
		
		//Read all the data from arraylist
		for (Object X:AL) {
			System.out.println(X);
		}
		
		//fOR CLEARING ALL THE VALUES FROM Array List
		AL.clear();
		System.out.println(AL);
		
		
		
		
	}
}
		