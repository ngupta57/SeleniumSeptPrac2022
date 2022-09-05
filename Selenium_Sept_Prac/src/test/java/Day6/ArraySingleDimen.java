package Day6;

import java.util.Arrays;

public class ArraySingleDimen {

	public static void main(String[] args) {
		// Array Single Dimension
		
		int marks[]= new int [7];
		marks[0]=6;
		marks[1]=9;
		marks[2]=91;
		marks[3]=19;		
		marks[4]=29;
		marks[5]=49;
		marks[6]=291;
		
		System.out.println(" THE VALUE IS  "    +  marks[1]);
		
		//2nd way of declaring array
		
		int properties []= {23,24,25,27,28};
		System.out.println(properties.length);
		//	//get all the values from array
		System.out.println(Arrays.toString(properties));
		
		//using for loop
		
		for (int i=0; i <marks.length; i++) {
			System.out.println(marks[i]);
		}
		// read data from array using enhanced for loop
		
				for(int x:marks)
				{
					System.out.println(x);
				}
				
		
		
		
		

	}

}
