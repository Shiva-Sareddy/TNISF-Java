package javaC2TC;

public class VariableTypes {
		// Instance Variables
		int age;
		int passOutYear;
		
		public void studentDetails(){
			//local Variables
			int studentID = 23;
			double gradePoints = 9.25;
			String studentName = "Shiva Sareddy";
			System.out.println("The Student Details: \n\n" + "Student Roll Number: " + studentID + "\nStudent Name: " + studentName + "\nAge: " + age + "\nStudent grade points: " + gradePoints + "\nPass out year: "+ passOutYear);
		}
		public static void main(String[] args) {
			// Local variables
			VariableTypes obj = new VariableTypes();
			obj.age = 21;
			obj.passOutYear = 2025;
			obj.studentDetails();
			
		}
}
