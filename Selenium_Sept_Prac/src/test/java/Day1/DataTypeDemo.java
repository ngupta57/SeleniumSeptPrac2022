package Day1;

public class DataTypeDemo {

	public static void main(String[] args) {
		/*
		 * // Data Type Size Description
		 * byte 1 byte Stores whole numbers from -128 to 127 short 2 bytes Stores whole numbers from -32,768 to
		 * 32,767 int 4 bytes Stores whole numbers from -2,147,483,648 to 2,147,483,647
		 * long 8 bytes Stores whole numbers from -9,223,372,036,854,775,808 to
		 * 9,223,372,036,854,775,807 ------- float 4 bytes Stores fractional numbers.
		 * Sufficient for storing 7 decimal digits double 8 bytes Stores fractional
		 * numbers. Sufficient for storing 15 decimal digits
		 * 
		 * boolean 1 bit Stores true or false values char 2 bytes Stores a single
		 * character/letter or ASCII values
		 * 
		 * String pernameName="John" int person_age=30;
		 * 
		 * 
		 * long l L float f F
		 * 
		 * variable names ----------------- a=30;
		 * 
		 * age=30; person_age=30; customer_id=102; ------------------
		 * 
		 * 1) int x; data type must be spesified
		 * 
		 * 2) int x;
		 * 
		 * float x; // not possible
		 * 
		 * 
		 * 3) int x=100;
		 * 
		 * x=200; // chnag the value is possible
		 * ----------------------------------------------
		 * 
		 * statically typed language - java
		 * 
		 * int x=100; double x=10.5 ; not allowed
		 * 
		 * 
		 * dynamically typed language - python x=100; x=100.55
		 */
		int age=16, income=4000, profit=3000;
		System.out.println("I earned a Profit of "  +  profit + "at the age of "+ age + "from my total income of: "+ income);
		boolean rich = true;
		System.out.println(rich);
		


	}

}
