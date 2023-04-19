package StudentManagement;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Search extends Function {//the class where the methods for searching are placed
	
	public static void byId(String stId) throws FileNotFoundException{//search by the student id and displays the information
		FileFunction.readStInfo();//reads the data from the file and adds it to the list of students in the function super class
		boolean flag=false;//a boolean for checking if the student of that specific id exists
		for(Student st:stList){//for each students in the list:
			if(st.stId.compareTo(stId)==0){//compare to the id of every student in the list until it gets the specific id
				DisplayInfo.studentInfo(st);//displaying the information of the searched student
				flag=true;//true if there is a student with the id given
			}
		}
		if(flag==false)//if there is no student with given id
			System.out.println("There is no student with the id "+stId);
		
		
	}
	
	public static void byName(String stName) throws FileNotFoundException{// search by the student name
		FileFunction.readStInfo();//*
		boolean flag=false;//*
		for(Student st:stList){//*
			if(st.getStName().compareTo(stName)==0){//*
				DisplayInfo.studentInfo(st);//*
				flag=true;//*
			}
		}
		if(flag==false)//*
			System.out.println("There is no student with the name "+stName);//*
		
	}
	
	public static void bySex(String stSex) throws FileNotFoundException{//search by the student sex
		FileFunction.readStInfo();
		boolean flag=false;
		for(Student st:stList){
			if(st.getStSex().compareTo(stSex)==0){
				DisplayInfo.studentInfo(st);
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("There is no student with the sex "+stSex);
		
	}
	
	public static void byAge(Short stAge) throws FileNotFoundException{//*
		FileFunction.readStInfo();
		boolean flag=false;
		for(Student st:stList){
			if(st.getStAge()==stAge){
				DisplayInfo.studentInfo(st);
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("There is no student with the age "+stAge);
		
		
	}
	
	public static void byDepartment(String stDep) throws FileNotFoundException{//*
		FileFunction.readStInfo();
		boolean flag=false;
		for(Student st:stList){
			if(st.stDepartment.compareTo(stDep)==0){
				DisplayInfo.studentInfo(st);
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("There is no student in the department "+stDep);
			
		
	}
	
	public static void byYear(short stYear) throws FileNotFoundException{//*
		FileFunction.readStInfo();
		boolean flag=false;
		for(Student st:stList){
			if(st.stYear==stYear){
				DisplayInfo.studentInfo(st);
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("There is no student with in "+stYear+"nd Year");
		
		
	}
	
	public static void byCumGpa(double stCumGpa) throws FileNotFoundException{//*
		FileFunction.readStInfo();
		boolean flag=false;
		for(Student st:stList){
			if(st.cumGpa==stCumGpa){
				DisplayInfo.studentInfo(st);
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("There is no student with the Gpa "+stCumGpa);
		
		
	}
	
	public static boolean ifStExist(String id) throws FileNotFoundException{//search by the cumulative gpa
		FileFunction.readStInfo();
		boolean flag=false;
		for(Student st:stList){
			if(st.stId.compareTo(id)==0){
				flag=true;
			}
		}
		return flag;
	}
	
}

