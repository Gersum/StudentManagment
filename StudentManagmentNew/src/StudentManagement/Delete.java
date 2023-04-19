package StudentManagement;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Delete extends Function {//the class for deleting data

	public static void studentInfo() throws IOException {//deletes the student information by reciving the id of the student to be deleted
		FileFunction.readStInfo();
		String id;
		boolean flag = false;
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the id of the student is going to be removed:\n");
		id = s.nextLine();
		FileFunction.clearFiles();
		for (Student st : stList) {//searchs for that specific Id and removes it by deleting the file by using File class
			if (st.stId.compareTo(id) != 0) {
				FileFunction.writeStInfo(st);
			} else if (st.stId.compareTo(id) == 0) {
				File idCrsFile = new File(id + "CourseGrade.txt");
				idCrsFile.deleteOnExit();
				File idGpaFile = new File(id + "Gpa.txt");
				idGpaFile.deleteOnExit();
				flag = true;

			}

		}
		if (flag == true)
			System.out.print("\nStudent information deleted successfully");
		else
			System.out.print("\nThere is no student with the id " + id);
	}

}
