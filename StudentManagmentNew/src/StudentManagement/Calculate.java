package StudentManagement;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Calculate extends Function {//the class calculate extends the class function cause calculate is a function
										//and it uses the variable of the class function
	static double gpa(ArrayList<String> course, ArrayList<String> grade) throws FileNotFoundException {//calculate the gpa for a specific semister
		FileFunction.readCrsInfo();//reads the course informations in the file to use their credit hour for calcultin the gpa
		int totalCrHr=0;
		int crHr ;
		double gr;
		double crGr=0.0;
		double gpa;
		for (int i = 0; i < (course.size()); i++) {
			crHr = getCrHr((course).get(i));//gets the credit hour from the arraylist "course list"for the specific course
			gr = changeGrade((grade).get(i));//changes the grade to number
			crGr += crHr * gr;//calculating the sum of all the crhr*grade;
			totalCrHr += crHr;//calculating the total credit hour
		}
		gpa = crGr / totalCrHr;//calculating the gpa

		return gpa;
	}

	static double gpa(Student st) {//this is an overloded method for calculating the cumulative gpa of a specific student
		double cumGpa = 0.0;
		if (st.stYear >= 1) {
			cumGpa += st.frsYrFrsSemGpa;
			cumGpa += st.frsYrSecSemGpa;
		}
		if (st.stYear >= 2) {
			cumGpa += st.secYrFrsSemGpa;
			cumGpa += st.secYrSecSemGpa;
		}
		if (st.stYear >= 3) {
			cumGpa += st.trdYrFrsSemGpa;
			cumGpa += st.trdYrSecSemGpa;
		}
		if (st.stYear >= 4) {
			cumGpa += st.frthYrFrsSemGpa;
			cumGpa += st.frthYrSecSemGpa;
		}
		cumGpa /= (st.stYear * 2);
		return cumGpa;
	}

	static double changeGrade(String grade) {//change the grade
		double gr = 0.0;
		if (grade.compareTo("A+") == 0 || grade.compareTo("A") == 0)
			gr = 4;
		else if (grade.compareTo("A-") == 0)
			gr = 3.75;
		else if (grade.compareTo("B+") == 0)
			gr = 3.5;
		else if (grade.compareTo("B") == 0)
			gr = 3;
		else if (grade.compareTo("B-") == 0)
			gr = 2.75;
		else if (grade.compareTo("C+") == 0)
			gr = 2.5;
		else if (grade.compareTo("C") == 0)
			gr = 2;
		else if (grade.compareTo("C-") == 0)
			gr = 1.75;
		else if (grade.compareTo("D") == 0)
			gr = 1.5;
		else if (grade.compareTo("F") == 0)
			gr = 0;
		return gr;
	}

	static int getCrHr(String course) {//gets the crHr for a specific course by searching from the arrayList "courseList"

		int crHr = 0;
		for (Course c : crList) {
			if (c.crId.compareTo(course) == 0)
				crHr = c.crHr;

		}
		return crHr;
	}

}
