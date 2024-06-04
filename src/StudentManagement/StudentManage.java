package StudentManagement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManage {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Student> studentList = new ArrayList<Student>();
		int count =0;
		while(true) {
			if(count!=0) {
				System.out.println("\n\n\n Do you want to continue?, then press 'yes'");
				String continues = sc.next();
				if(continues.equalsIgnoreCase("yes")) {
					
				}else {
					System.exit(0);
				}
			}
			count++;
			System.out.println("\t\t\t Student Project Management");
			System.out.println("===================================================================");
			System.out.println("1.Add Student\n"
					+ "2.Update Student\n"
					+ "3.Display All Student\n"
					+ "4.Delete Student\n"
					+ "5.Exit\n");
			System.out.println("Please select operation : ");
			int option=sc.nextInt();
			// switch for particular operation
			switch (option) {
			case 1: 
				// Add student
				Student student =  StudentUtility.addStudent();
				studentList.add(student);
				System.out.println("Student Addes Successfully.!");
				break;
			case 2:
				// update student
				StudentUtility.updateStudent(studentList);
				System.out.println("Student Updated Successfully.!");
				break;
			case 3:
				// display student
				StudentUtility.displayAllStudent(studentList);
				
				break;
			case 4:
				// delete Student
				System.out.println("Delete Student option is procees?");
				System.out.println("Enter studentId:");
				int sid=sc.nextInt();
				StudentUtility.deleteStudent(studentList, sid);
				System.out.println("Student Deleted Successfully.");
				break;
			case 5:
				// stop the program execution
				System.out.println("Page does exit!");
				System.exit(0);
			default :
				System.err.println("Please enter correct option?");
				break;
			
			}
		}
	}
}
