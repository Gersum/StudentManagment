package StudentManagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileFunction extends Function {
	
	// we used File writer, Buffered writer and Print Writer to write to file
	public static void writeStInfo(Student st) throws IOException{//writes the information for the student in a text file
	
		FileWriter data0 =new FileWriter("StIdList.txt",true);
    	BufferedWriter DATA0=new BufferedWriter(data0);
		PrintWriter output0=new PrintWriter(DATA0);
		output0.print(st.stId);
		output0.println();
		output0.close();
		
		
        FileWriter data1 =new FileWriter("StNameList.txt",true);
        BufferedWriter DATA1=new BufferedWriter(data1);
        PrintWriter output1=new PrintWriter(DATA1);
		output1.print(st.stId+"\t"+st.getStName());
		output1.println();
		output1.close();			
			
		FileWriter data2 =new FileWriter("StAgeList.txt",true);
        BufferedWriter DATA2=new BufferedWriter(data2);
		PrintWriter output2=new PrintWriter(DATA2);
		output2.print(st.stId+"\t"+st.getStAge());
		output2.println();
		output2.close();	
			
		FileWriter data3 =new FileWriter("StSexList.txt",true);
        BufferedWriter DATA3=new BufferedWriter(data3);
		PrintWriter output3=new PrintWriter(DATA3);
		output3.print(st.stId+"\t"+st.getStSex());
		output3.println();
		output3.close();
			
		FileWriter data4 =new FileWriter("StDepartmentList.txt",true);
        BufferedWriter DATA4=new BufferedWriter(data4);
		PrintWriter output4=new PrintWriter(DATA4);
		output4.print(st.stId+"\t"+st.stDepartment);
		output4.println();
		output4.close();
			
		FileWriter data5 =new FileWriter("StYearList.txt",true);
        BufferedWriter DATA5=new BufferedWriter(data5);
		PrintWriter output5=new PrintWriter(DATA5);
		output5.print(st.stId+"\t"+st.stYear);
		output5.println();
		output5.close();
						
		FileWriter data6 =new FileWriter(st.stId+"CourseGrade.txt",true);
        BufferedWriter DATA6=new BufferedWriter(data6);
		PrintWriter output6=new PrintWriter(DATA6);
		if(st.stYear>=1){
			output6.println("Year1");
			output6.println("Semister1");
			for(int i=0;i<st.frsYrFrsSemCrs.size();i++){
				output6.print(st.frsYrFrsSemCrs.get(i)+"\t");
				output6.println(st.frsYrFrsSemGrade.get(i)+"");
			}
			output6.println("Semister2");
			for(int i=0;i<st.frsYrSecSemCrs.size();i++){
				output6.print(st.frsYrSecSemCrs.get(i)+"\t");
				output6.println(st.frsYrSecSemGrade.get(i)+"");
			}
			output6.println("EndY1");
		}
		if(st.stYear>=2){
			output6.println("Year2");
			output6.println("Semister1");
			for(int i=0;i<st.secYrFrsSemCrs.size();i++){
				output6.print(st.secYrFrsSemCrs.get(i)+"\t");
				output6.println(st.secYrFrsSemGrade.get(i)+"");
			}
			output6.println("Semister2");
			for(int i=0;i<st.secYrSecSemCrs.size();i++){
				output6.print(st.secYrSecSemCrs.get(i)+"\t");
				output6.println(st.secYrSecSemGrade.get(i)+"");
			}
			output6.println("EndY2");
		}
		if(st.stYear>=3){
			output6.println("Year3");
			output6.println("Semister1");
			for(int i=0;i<st.trdYrFrsSemCrs.size();i++){
				output6.print(st.trdYrFrsSemCrs.get(i)+"\t");
				output6.println(st.trdYrFrsSemGrade.get(i)+"");
				}
				output6.println("Semister2");
				for(int i=0;i<st.trdYrSecSemCrs.size();i++){
					output6.print(st.trdYrSecSemCrs.get(i)+"\t");
					output6.println(st.trdYrSecSemGrade.get(i)+"");
				}
				output6.println("EndY3");
			}
			if(st.stYear>=4){
				output6.println("Year4");
				output6.println("Semister1");
				for(int i=0;i<st.frthYrFrsSemCrs.size();i++){
					output6.print(st.frthYrFrsSemCrs.get(i)+"\t");
					output6.println(st.frthYrFrsSemGrade.get(i)+"");
				}
				output6.println("Semister2");
				for(int i=0;i<st.frthYrSecSemCrs.size();i++){
					output6.print(st.frthYrSecSemCrs.get(i)+"\t");
					output6.println(st.frthYrSecSemGrade.get(i)+"");
				}
				output6.println("EndY4");
			}
			
			output6.close();
			
			FileWriter stGpaWriterF =new FileWriter(st.stId+"Gpa.txt",true);
            BufferedWriter stGpaWriterB=new BufferedWriter(stGpaWriterF);
			PrintWriter stGpaWriter=new PrintWriter(stGpaWriterB);
			
			if(st.stYear>=1){
				stGpaWriter.println("Year1");
				stGpaWriter.print("Semister1\t");
				stGpaWriter.println(st.frsYrFrsSemGpa);
				stGpaWriter.print("Semister2\t");
				stGpaWriter.println(st.frsYrSecSemGpa);
				
			}
			if(st.stYear>=2){
				stGpaWriter.println("Year2");
				stGpaWriter.print("Semister1\t");
				stGpaWriter.println(st.secYrFrsSemGpa);
				stGpaWriter.print("Semister2\t");
				stGpaWriter.println(st.secYrSecSemGpa);
				
			}
			if(st.stYear>=3){
				stGpaWriter.println("Year3");
				stGpaWriter.print("Semister1\t");
				stGpaWriter.println(st.trdYrFrsSemGpa);
			stGpaWriter.print("Semister2\t");
			stGpaWriter.println(st.trdYrSecSemGpa);
				
		}
		if(st.stYear>=4){
			stGpaWriter.println("Year4");
			stGpaWriter.print("Semister1\t");
			stGpaWriter.println(st.frthYrFrsSemGpa);
			stGpaWriter.print("Semister2\t");
			stGpaWriter.println(st.frthYrSecSemGpa);
				
		}
		
		stGpaWriter.close();
			
		FileWriter stCumGpaWriterF=new FileWriter("StCumGpaList.txt",true);
		BufferedWriter stCumGpaWriterB=new BufferedWriter(stCumGpaWriterF);
		PrintWriter stCumGpaWriter=new PrintWriter(stCumGpaWriterB);
			
		stCumGpaWriter.print(st.stId+"\t"+st.cumGpa);
		stCumGpaWriter.println();
		stCumGpaWriter.close();
			
}

	//we used File reader,buffered writer and scanner to read from file
	
	public static void readStInfo() throws FileNotFoundException{//reading the student information
		stList.clear();
		Student s;
		
		//for reading and writing the student id from the file StIdList.txt
		
		FileReader readStIdF=new FileReader("StIdList.txt");
		BufferedReader readStIdB=new BufferedReader(readStIdF);
		Scanner readStId=new Scanner(readStIdB);
		
		while(readStId.hasNext()){
			s=new Student();
			s.stId=readStId.next();	
			stList.add(s);
		}

		readStId.close();
		
		
		int count=0;
		FileReader readStNameF=new FileReader("StNameList.txt");
		BufferedReader readStNameB=new BufferedReader(readStNameF);
		Scanner readStName=new Scanner(readStNameB);
		
		while(readStName.hasNext()){
			readStName.next();
			stList.get(count).setStName(readStName.next());	
			count++;
		}
		count=0;
		readStName.close();
		
		FileReader readStSexF=new FileReader("StSexList.txt");
		BufferedReader readStSexB=new BufferedReader(readStSexF);
		Scanner readStSex=new Scanner(readStSexB);
		
		while(readStSex.hasNext()){
			readStSex.next();
			stList.get(count).setStSex(readStSex.next());
			count++;
		}
		count=0;
		readStSex.close();
		
		FileReader readStAgeF=new FileReader("StAgeList.txt");
		BufferedReader readStAgeB=new BufferedReader(readStAgeF);
		Scanner readStAge=new Scanner(readStAgeB);
		
		while(readStAge.hasNext()){
			
			readStAge.next();
			stList.get(count).setStAge(Short.parseShort(readStAge.next()));
			count++;

		}
		count=0;
		readStAge.close();
		
		FileReader readStDepF=new FileReader("StDepartmentList.txt");
		BufferedReader readStDepB=new BufferedReader(readStDepF);
		Scanner readStDep=new Scanner(readStDepB);
		
		while(readStDep.hasNext()){

			readStDep.next();
			stList.get(count).stDepartment=readStDep.next();
			count++;

		}
		count=0;
		readStDep.close();
		
		FileReader readStYearF=new FileReader("StYearList.txt");
		BufferedReader readStYearB=new BufferedReader(readStYearF);
		Scanner readStYear=new Scanner(readStYearB);
		
		while(readStYear.hasNext()){
			
			readStYear.next();
			stList.get(count).stYear=Short.parseShort(readStYear.next());
			count++;

		}
		count=0;
		readStYear.close();
		
		FileReader readStGpaF=new FileReader("StCumGpaList.txt");
		BufferedReader readStGpaB=new BufferedReader(readStGpaF);
		Scanner readStGpa=new Scanner(readStGpaB);
		
		while(readStGpa.hasNext()){
			
			readStGpa.next();
			stList.get(count).cumGpa=Double.parseDouble(readStGpa.next());
			count++;

		}
		count=0;
		readStGpa.close();

		
		
		
		
		//for reading the courses and grades of the specific student and writing to the studentList
		for(Student s1:stList){
			FileReader crsGrd=new FileReader(s1.stId+"CourseGrade.txt");
			BufferedReader crsGrdData=new BufferedReader(crsGrd);
			Scanner readCrsGrd=new Scanner(crsGrdData);
			
		
			if(readCrsGrd.hasNext("Year1")){
				readCrsGrd.next();
				readCrsGrd.next();
				
				while(!(readCrsGrd.hasNext("Semister2"))){
					s1.frsYrFrsSemCrs.add(readCrsGrd.next());
					s1.frsYrFrsSemGrade.add(readCrsGrd.next());
				}
				readCrsGrd.next();
				while(!(readCrsGrd.hasNext("EndY1"))){
					s1.frsYrSecSemCrs.add(readCrsGrd.next());
					s1.frsYrSecSemGrade.add(readCrsGrd.next());
				}
				readCrsGrd.next();
			}
			if(readCrsGrd.hasNext("Year2")){
				readCrsGrd.next();
				readCrsGrd.next();
				while(!readCrsGrd.hasNext("Semister2")){
					s1.secYrFrsSemCrs.add(readCrsGrd.next());
					s1.secYrFrsSemGrade.add(readCrsGrd.next());
				}
				readCrsGrd.next();
				while(!(readCrsGrd.hasNext("EndY2"))){	
					s1.secYrSecSemCrs.add(readCrsGrd.next());
					s1.secYrSecSemGrade.add(readCrsGrd.next());
				}
				readCrsGrd.next();
			}
				
				
			if(readCrsGrd.hasNext("Year3")){
				readCrsGrd.next();
				readCrsGrd.next();
				while(!readCrsGrd.hasNext("Semister2")){
					s1.trdYrFrsSemCrs.add(readCrsGrd.next());
					s1.trdYrFrsSemGrade.add(readCrsGrd.next());
				}
				readCrsGrd.next();
				while(!readCrsGrd.hasNext("EndY3")){	
					s1.trdYrSecSemCrs.add(readCrsGrd.next());
					s1.trdYrSecSemGrade.add(readCrsGrd.next());
				}

				readCrsGrd.next();
			}
			
			if(readCrsGrd.hasNext("Year4")){
				readCrsGrd.next();
				readCrsGrd.next();
				while(!readCrsGrd.hasNext("Semister2")){
					s1.frthYrFrsSemCrs.add(readCrsGrd.next());
					s1.frthYrFrsSemGrade.add(readCrsGrd.next());
				}
				readCrsGrd.next();
				while(!readCrsGrd.hasNext("EndY3")){	
					s1.frthYrSecSemCrs.add(readCrsGrd.next());
					s1.frthYrSecSemGrade.add(readCrsGrd.next());
				}

				readCrsGrd.next();
			}
			
			readCrsGrd.close();	
		}
		for(Student s1:stList){
			FileReader stGpaReaderF=new FileReader(s1.stId+"Gpa.txt");
			BufferedReader stGpaReaderB=new BufferedReader(stGpaReaderF);
			Scanner stGpaReader=new Scanner(stGpaReaderB);
			
			if(stGpaReader.hasNext("Year1")){
				stGpaReader.next();
				stGpaReader.next();
				s1.frsYrFrsSemGpa=Double.parseDouble(stGpaReader.next());
				stGpaReader.next();
				s1.frsYrSecSemGpa=Double.parseDouble(stGpaReader.next());
			}
			if(stGpaReader.hasNext("Year2")){
				stGpaReader.next();
				stGpaReader.next();
				s1.secYrFrsSemGpa=Double.parseDouble(stGpaReader.next());
				stGpaReader.next();
				s1.secYrSecSemGpa=Double.parseDouble(stGpaReader.next());
			}
			if(stGpaReader.hasNext("Year3")){
				stGpaReader.next();
				stGpaReader.next();
				s1.trdYrFrsSemGpa=Double.parseDouble(stGpaReader.next());
				stGpaReader.next();
				s1.trdYrSecSemGpa=Double.parseDouble(stGpaReader.next());
			}
			if(stGpaReader.hasNext("Year4")){
				stGpaReader.next();
				stGpaReader.next();
				s1.frthYrFrsSemGpa=Double.parseDouble(stGpaReader.next());
				stGpaReader.next();
				s1.frthYrSecSemGpa=Double.parseDouble(stGpaReader.next());
			}
			
			stGpaReader.close();
		}

	}

	public static void readCrsInfo() throws FileNotFoundException{//reading the course credit hours from the text file
		Course c;
		//for getting the credit hour of the courses 
		FileReader readCourseF=new FileReader("crHrList.txt");
		BufferedReader readCourseB=new BufferedReader(readCourseF);
		Scanner readCourse=new Scanner(readCourseB);
		
		while(readCourse.hasNext()){
			c=new Course();
			c.crId=readCourse.next();
			c.crHr=Integer.parseInt(readCourse.next());
			crList.add(c);
		}
		readCourse.close();
	}

	public static void readCrsNameInfo() throws FileNotFoundException{ //reading the course names
		Course c;
		//for getting the name of the courses 
		FileReader readCrNameF=new FileReader("crNameList.txt");
		BufferedReader readCrNameB=new BufferedReader(readCrNameF);
		Scanner readCrName=new Scanner(readCrNameB);
		
		while(readCrName.hasNext()){
			c=new Course();
			c.crId=readCrName.next();
			c.crName=readCrName.next();
			crList.add(c);
		}
		readCrName.close();
	}

	public static void clearFiles() throws FileNotFoundException{//clearing all the student text files..we used PrintWriter

		String id;
		FileReader readStIdF=new FileReader("StIdList.txt");
		BufferedReader readStIdB=new BufferedReader(readStIdF);
		Scanner readStId=new Scanner(readStIdB);
		
		while(readStId.hasNext()){
			
			id=readStId.next();	
			PrintWriter pw0=new PrintWriter(id+"CourseGrade.txt");
			PrintWriter pw00=new PrintWriter(id+"Gpa.txt");
			pw0.close();
			pw00.close();
		}
		readStId.close();
		PrintWriter pw1=new PrintWriter("StIdList.txt");
		pw1.close();
		PrintWriter pw2=new PrintWriter("StNameList.txt");
		pw2.close();
		PrintWriter pw3=new PrintWriter("StAgeList.txt");
		pw3.close();
		PrintWriter pw4=new PrintWriter("StSexList.txt");
		pw4.close();
		PrintWriter pw5=new PrintWriter("StDepartmentList.txt");
		pw5.close();
		PrintWriter pw6=new PrintWriter("StYearList.txt");
		pw6.close();
		PrintWriter pw8=new PrintWriter("StCumGpaList.txt");
		pw8.close();
		
	}

	public static int readAdminPassword() throws FileNotFoundException{//reading the password of the administrator
		FileReader readPassF=new FileReader("adminPassword.txt");
		BufferedReader readPassB=new BufferedReader (readPassF);
		Scanner readPass=new Scanner(readPassB);
		String password=readPass.next();
		readPass.close();
		return (Integer.parseInt(password));
		
	}
	
	
}
