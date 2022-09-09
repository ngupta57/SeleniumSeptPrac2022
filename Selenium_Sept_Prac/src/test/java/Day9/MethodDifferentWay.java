package Day9;

public class MethodDifferentWay {
	
	/*
	 * No Params No return value 2) No Params Return value 3) Take params No Return
	 * 4) Take params Return a value
	 */
	
	// method without parameter without return value
	
	void displayMsg () {
		System.out.println("This Is friday");
		}
	//Take params No Return
	void  TellMeDAY(String day ) {		
		System.out.println("today is:" + day);		
	}	
	//Take params  Return value
	int giveMeYourAge(int Age) {
		System.out.println("My AGE IS :" +Age);
		return Age;
	}
	//No parameter but return value
	
	String getMessage() {
		return "Happy Birthday";
	}
	
	}
