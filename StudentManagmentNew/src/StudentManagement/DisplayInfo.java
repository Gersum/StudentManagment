package StudentManagement;
import java.io.FileNotFoundException;

public class DisplayInfo extends Function {

	public static void studentInfo() throws FileNotFoundException {// for displaying all the student information

		for (Student s : stList) {
			System.out.print("ID\t");
			System.out.print("NAME\t");
			System.out.print("SEX\t");
			System.out.print("AGE\t");
			System.out.print("DEPARTMENT\t");
			System.out.print("STUDY YEAR\n");
			System.out.print(s.stId + "\t");
			System.out.print(s.getStName() + "\t");
			System.out.print(s.getStSex() + "\t");
			System.out.print(s.getStAge() + "\t");
			System.out.print(s.stDepartment + "\t");
			System.out.print(s.stYear + "\n");
			System.out.println();
			if (s.stYear >= 1) {
				System.out.print("Year 1\nSemister 1\n");
				for (int i = 0; i < s.frsYrFrsSemCrs.size(); i++) {
					System.out.print(s.frsYrFrsSemCrs.get(i) + '\t' + s.frsYrFrsSemGrade.get(i) + "\n");
				}
				System.out.print("Gpa:\t");
				System.out.print(s.frsYrFrsSemGpa);
				System.out.println();
				System.out.print("\nSemister 2\n");
				for (int i = 0; i < s.frsYrSecSemCrs.size(); i++) {
					System.out.print(s.frsYrSecSemCrs.get(i) + '\t' + s.frsYrSecSemGrade.get(i) + "\n");
				}
				System.out.print("Gpa:\t");
				System.out.print(s.frsYrSecSemGpa);
				System.out.println();
			}

			if (s.stYear >= 2) {
				System.out.print("\n\nYear 2\nSemister 1\n");
				for (int i = 0; i < s.secYrFrsSemCrs.size(); i++) {
					System.out.print(s.secYrFrsSemCrs.get(i) + '\t' + s.secYrFrsSemGrade.get(i) + "\n");
				}
				System.out.print("Gpa:\t");
				System.out.print(s.secYrFrsSemGpa);
				System.out.println();
				System.out.print("\nSemister 2\n");
				for (int i = 0; i < s.secYrSecSemCrs.size(); i++) {
					System.out.print(s.secYrSecSemCrs.get(i) + '\t' + s.secYrSecSemGrade.get(i) + "\n");
				}
				System.out.print("Gpa:\t");
				System.out.print(s.frsYrSecSemGpa);
				System.out.println();
			}

			if (s.stYear >= 3) {
				System.out.print("\n\nYear 3\nSemister 1\n");
				for (int i = 0; i < s.trdYrFrsSemCrs.size(); i++) {
					System.out.print(s.trdYrFrsSemCrs.get(i) + '\t' + s.trdYrFrsSemGrade.get(i) + "\n");
				}
				System.out.print("Gpa:\t");
				System.out.print(s.trdYrFrsSemGpa);
				System.out.println();
				System.out.print("\nSemister 2\n");
				for (int i = 0; i < s.trdYrSecSemCrs.size(); i++) {
					System.out.print(s.trdYrSecSemCrs.get(i) + '\t' + s.trdYrSecSemGrade.get(i) + "\n");
				}
				System.out.print("Gpa:\t");
				System.out.print(s.trdYrSecSemGpa);
				System.out.println();
			}

			if (s.stYear >= 4) {
				System.out.print("\n\nYear 4\nSemister 1\n");
				for (int i = 0; i < s.frthYrFrsSemCrs.size(); i++) {
					System.out.print(s.frthYrFrsSemCrs.get(i) + '\t' + s.frthYrFrsSemGrade.get(i) + "\n");
				}
				System.out.print("Gpa:\t");
				System.out.print(s.frthYrFrsSemGpa);
				System.out.println();
				System.out.print("\nSemister 2\n");
				for (int i = 0; i < s.frthYrSecSemCrs.size(); i++) {
					System.out.print(s.frthYrSecSemCrs.get(i) + '\t' + s.frthYrSecSemGrade.get(i) + "\n");
				}
				System.out.print("Gpa:\t");
				System.out.print(s.frthYrSecSemGpa);
				System.out.println();
			}

			System.out.println();
			System.out.print("Cumulative GPA\t" + s.cumGpa);
			System.out.println();
			System.out.println();

		}
	}

	public static void studentInfo(Student s) throws FileNotFoundException {// for displaying a specific student
																			// information

		System.out.print("ID\t");
		System.out.print("NAME\t");
		System.out.print("SEX\t");
		System.out.print("AGE\t");
		System.out.print("DEPARTMENT\t");
		System.out.print("STUDY YEAR\n");
		System.out.print(s.stId + "\t");
		System.out.print(s.getStName() + "\t");
		System.out.print(s.getStSex() + "\t");
		System.out.print(s.getStAge() + "\t");
		System.out.print(s.stDepartment + "\t");
		System.out.print(s.stYear + "\n");
		System.out.println();
		if (s.stYear >= 1) {
			System.out.print("Year 1\nSemister 1\n");
			for (int i = 0; i < s.frsYrFrsSemCrs.size(); i++) {
				System.out.print(s.frsYrFrsSemCrs.get(i) + '\t' + s.frsYrFrsSemGrade.get(i) + "\n");
			}
			System.out.print("Gpa:\t");
			System.out.print(s.frsYrFrsSemGpa);
			System.out.println();
			System.out.print("\nSemister 2\n");
			for (int i = 0; i < s.frsYrSecSemCrs.size(); i++) {
				System.out.print(s.frsYrSecSemCrs.get(i) + '\t' + s.frsYrSecSemGrade.get(i) + "\n");
			}
			System.out.print("Gpa:\t");
			System.out.print(s.frsYrSecSemGpa);
			System.out.println();
		}

		if (s.stYear >= 2) {
			System.out.print("\n\nYear 2\nSemister 1\n");
			for (int i = 0; i < s.secYrFrsSemCrs.size(); i++) {
				System.out.print(s.secYrFrsSemCrs.get(i) + '\t' + s.secYrFrsSemGrade.get(i) + "\n");
			}
			System.out.print("Gpa:\t");
			System.out.print(s.secYrFrsSemGpa);
			System.out.println();
			System.out.print("\nSemister 2\n");
			for (int i = 0; i < s.secYrSecSemCrs.size(); i++) {
				System.out.print(s.secYrSecSemCrs.get(i) + '\t' + s.secYrSecSemGrade.get(i) + "\n");
			}
			System.out.print("Gpa:\t");
			System.out.print(s.frsYrSecSemGpa);
			System.out.println();
		}

		if (s.stYear >= 3) {
			System.out.print("\n\nYear 3\nSemister 1\n");
			for (int i = 0; i < s.trdYrFrsSemCrs.size(); i++) {
				System.out.print(s.trdYrFrsSemCrs.get(i) + '\t' + s.trdYrFrsSemGrade.get(i) + "\n");
			}
			System.out.print("Gpa:\t");
			System.out.print(s.trdYrFrsSemGpa);
			System.out.println();
			System.out.print("\nSemister 2\n");
			for (int i = 0; i < s.trdYrSecSemCrs.size(); i++) {
				System.out.print(s.trdYrSecSemCrs.get(i) + '\t' + s.trdYrSecSemGrade.get(i) + "\n");
			}
			System.out.print("Gpa:\t");
			System.out.print(s.trdYrSecSemGpa);
			System.out.println();
		}

		if (s.stYear >= 4) {
			System.out.print("\n\nYear 4\nSemister 1\n");
			for (int i = 0; i < s.frthYrFrsSemCrs.size(); i++) {
				System.out.print(s.frthYrFrsSemCrs.get(i) + '\t' + s.frthYrFrsSemGrade.get(i) + "\n");
			}
			System.out.print("Gpa:\t");
			System.out.print(s.frthYrFrsSemGpa);
			System.out.println();
			System.out.print("\nSemister 2\n");
			for (int i = 0; i < s.frthYrSecSemCrs.size(); i++) {
				System.out.print(s.frthYrSecSemCrs.get(i) + '\t' + s.frthYrSecSemGrade.get(i) + "\n");
			}
			System.out.print("Gpa:\t");
			System.out.print(s.frthYrSecSemGpa);
			System.out.println();
		}

		System.out.println();
		System.out.print("Cumulative GPA\t" + s.cumGpa);
		System.out.println();
		System.out.println();

	}

	public static void courseInfo() throws FileNotFoundException {//for displaying the course informations
		crList.clear();
		FileFunction.readCrsNameInfo();

		System.out.print("NAME\t");
		System.out.println("ID\t");
		for (Course cr : crList) {

			System.out.println(cr.crName + "\t" + cr.crId);

		}
	}
}

