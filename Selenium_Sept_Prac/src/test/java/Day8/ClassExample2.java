package Day8;

public class ClassExample2 {
	
	int studentId;
	String StudentRollNo;
	double StudentStifund ;
	
	// Method to display Student details
	void ShowStudentDetails() {
		System.out.println("Here are StudentDetails: ID:" + studentId  + "  Roll No:" + StudentRollNo + " Stiphend:" + StudentStifund);
	}
	
	//method to SetStudentData
	
	void SetStuData() {
		studentId = 66;
		StudentRollNo= "56";
		StudentStifund =450.50;
		System.out.println("student data has been set");
	}
	//Method to setup instance data using parameter
	void SetStuData( int id, String Rno, double Sfund) {
		studentId=id;
		StudentRollNo=Rno;		
		StudentStifund=Sfund;
		System.out.println("The student data has been setup as desired");
	}
	
	ClassExample2(){
		studentId=500;
		StudentRollNo="12";		
		StudentStifund=600.90;
		System.out.println("The student data has been setup by constructor");
	}
		
		int getID() {
			System.out.println("Student id requested is  : " + studentId);
			return studentId;
			
		}
		
	}
	
	
	


