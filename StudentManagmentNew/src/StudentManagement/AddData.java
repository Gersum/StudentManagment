package StudentManagement;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AddData extends Function {
	
	public static void studentInfo() throws IOException {//the method to add student information
		Student st = new Student();
		Scanner s1 = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		String age, gradee;
		System.out.print("Enter the name of the student: ");
		st.setStName(s.nextLine());//it adds the name to the student object

		System.out.print("Enter the ID of the student: ");
		st.stId = s.nextLine();//it adds the Id to the student object

		System.out.print("Enter the Sex of the student: ");
		st.setStSex(s.nextLine());//*
		
		System.out.print("Enter the Age of the student(i.e 1-120): ");

		age = s1.nextLine();
		st.setStAge(Short.parseShort(chkAge(age)));//checks if the age inserted is correct andd adds the age to the object student

		System.out.print("Enter the department of the student: ");
		st.stDepartment = s.nextLine();//*

		System.out.print("Enter the year(1-4): ");
		st.stYear = s1.nextShort();//the admin enter the year and based on that year the admin will insert the semister grades and courses
		int nOfCrs = 0;
		DisplayInfo.courseInfo();
		if (st.stYear >= 1) {//if the year is greater or equals to one the admin enters the courses and grades of the first year
			System.out.print("Enter the number of courses in the first year first semister:");
			nOfCrs = s1.nextInt();
			
			for (int i = 0; i < nOfCrs; i++) {
				System.out.print("Enter the course id:");
				st.frsYrFrsSemCrs.add(s.nextLine());
				System.out.print("Enter the grade:");
				st.frsYrFrsSemGrade.add(s.nextLine());
			}
			st.frsYrFrsSemGpa = Calculate.gpa(st.frsYrFrsSemCrs, st.frsYrFrsSemGrade);

			System.out.print("Enter the number of courses in the first year second semister:");
			nOfCrs = s1.nextInt();
			for (int i = 0; i < nOfCrs; i++) {
				System.out.print("Enter the course id:");
				st.frsYrSecSemCrs.add(s.nextLine());
				System.out.print("Enter the grade:");
				st.frsYrSecSemGrade.add(s.nextLine());
			}
			st.frsYrSecSemGpa = Calculate.gpa(st.frsYrSecSemCrs, st.frsYrSecSemGrade);

		}

		if (st.stYear >= 2) {//if the year is greater or equals to two the admin enters the courses and grades of the second year
			System.out.print("Enter the number of courses in the second year first semister:");
			nOfCrs = s1.nextInt();
			for (int i = 0; i < nOfCrs; i++) {
				System.out.print("Enter the course id:");
				st.secYrFrsSemCrs.add(s.nextLine());
				System.out.print("Enter the grade:");
				st.secYrFrsSemGrade.add(s.nextLine());
			}
			st.secYrFrsSemGpa = Calculate.gpa(st.secYrFrsSemCrs, st.secYrFrsSemGrade);

			System.out.print("Enter the number of courses in the second year second semister:");
			nOfCrs = s1.nextInt();
			for (int i = 0; i < nOfCrs; i++) {
				System.out.print("Enter the course id:");
				st.secYrSecSemCrs.add(s.nextLine());
				System.out.print("Enter the grade:");
				st.secYrSecSemGrade.add(s.nextLine());
			}
			st.secYrSecSemGpa = Calculate.gpa(st.secYrSecSemCrs, st.secYrSecSemGrade);

		}

		if (st.stYear >= 3) {//if the year is greater or equals to three the admin enters the courses and grades of the third year
			System.out.print("Enter the number of courses in the third year first semister:");
			nOfCrs = s1.nextInt();
			for (int i = 0; i < nOfCrs; i++) {
				System.out.print("Enter the course id:");
				st.trdYrFrsSemCrs.add(s.nextLine());
				System.out.print("Enter the grade:");
				st.trdYrFrsSemGrade.add(s.nextLine());
			}
			st.trdYrFrsSemGpa = Calculate.gpa(st.trdYrFrsSemCrs, st.trdYrFrsSemGrade);

			System.out.print("Enter the number of courses in the third year second semister:");
			nOfCrs = s1.nextInt();
			for (int i = 0; i < nOfCrs; i++) {
				System.out.print("Enter the course id:");
				st.trdYrSecSemCrs.add(s.nextLine());
				System.out.print("Enter the grade:");
				st.trdYrSecSemGrade.add(s.nextLine());
			}
			st.trdYrSecSemGpa = Calculate.gpa(st.trdYrSecSemCrs, st.trdYrSecSemGrade);

		}

		if (st.stYear >= 4) {//if the year is greater or equals to four the admin enters the courses and grades of the fourth year
			System.out.print("Enter the number of courses in the fourth year first semister:");
			nOfCrs = s1.nextInt();
			for (int i = 0; i < nOfCrs; i++) {
				System.out.print("Enter the course id:");
				st.frthYrFrsSemCrs.add(s.nextLine());
				System.out.print("Enter the grade:");
				st.frthYrFrsSemGrade.add(s.nextLine());
			}
			st.frthYrFrsSemGpa = Calculate.gpa(st.frthYrFrsSemCrs, st.frthYrFrsSemGrade);

			System.out.print("Enter the number of courses in the fourth year second semister:");
			nOfCrs = s1.nextInt();
			for (int i = 0; i < nOfCrs; i++) {
				System.out.print("Enter the course id:");
				st.frthYrSecSemCrs.add(s.nextLine());
				System.out.print("Enter the grade:");
				st.frthYrSecSemGrade.add(s.nextLine());
			}
			st.frthYrSecSemGpa = Calculate.gpa(st.frthYrSecSemCrs, st.frthYrSecSemGrade);
		}

		st.cumGpa = Calculate.gpa(st);
		FileFunction.writeStInfo(st);

	}

	public static void courseInfo() throws IOException {//the method to add course information

		String crName;
		String crId;
		int crHr;

		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);

		System.out.print("Enter the name of the course:");
		crName = s.nextLine();

		System.out.print("Enter the id of the course");
		crId = s.nextLine();

		System.out.print("Enter the credit hr");
		crHr = s1.nextInt();

		FileWriter writeCrNameF = new FileWriter("CrNameList.txt", true);
		BufferedWriter writeCrNameB = new BufferedWriter(writeCrNameF);
		PrintWriter writeCrName = new PrintWriter(writeCrNameB);
		writeCrName.print(crId + "\t" + crName);
		writeCrName.println();
		writeCrName.close();

		FileWriter writeCrHrF = new FileWriter("CrHrList.txt", true);
		BufferedWriter writeCrHrB = new BufferedWriter(writeCrHrF);
		PrintWriter writeCrHr = new PrintWriter(writeCrHrB);
		writeCrHr.print(crId + "\t" + crHr);
		writeCrHr.println();
		writeCrHr.close();

	}
	
	public static String chkAge(String age) {//checks if the age inserted is correct
		for (int i = 0; i < age.length(); i++) {
			Scanner sc = new Scanner(System.in);
			if ((int) age.charAt(i) > 57 || (int) age.charAt(i) < 48) {
				System.out.println("Invalid age\nEnter z correct AGE ");
				age = sc.nextLine();
				chkAge(age);
			}
		}

		return age;
	}
	
}

