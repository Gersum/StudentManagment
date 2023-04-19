package StudentManagement;

import java.io.IOException;
import java.util.Scanner;

public class Modify extends Function{//the class where modification takes place
	
	
	public static void stId(String id,String newId) throws IOException{//modify or updates the student id by getting the student id that will be changed and the new id 
		FileFunction.readStInfo();
		FileFunction.clearFiles();
		for(Student st:stList){
			if(st.stId.compareTo(id)==0){
				st.stId=newId;
				System.out.println("\nStudent Id changed successfully");
				
			}
			FileFunction.writeStInfo(st);
		}
		
		
	}
	
	public static void stName(String id,String newName) throws IOException{//the same way as above and every methods below are the same as above
		FileFunction.readStInfo();
		FileFunction.clearFiles();
		for(Student st:stList){
			if(st.stId.compareTo(id)==0){
				st.setStName(newName);
				System.out.println("\nStudent name change successfully");
				
			}
			FileFunction.writeStInfo(st);
		}
	}
	
	public static void stSex(String id,String newSex) throws IOException{
		FileFunction.readStInfo();
		FileFunction.clearFiles();
		for(Student st:stList){
			if(st.stId.compareTo(id)==0){
				st.setStName(newSex);
				System.out.println("\nStudent sex change successfully");
				
			}
			FileFunction.writeStInfo(st);
		}
	}
	
	public static void stAge(String id,short newAge) throws IOException{
		FileFunction.readStInfo();
		FileFunction.clearFiles();
		for(Student st:stList){
			if(st.stId.compareTo(id)==0){
				st.setStAge(newAge);
				System.out.println("\nStudent age change successfully");
				
			}
			FileFunction.writeStInfo(st);
		}
	}
	
	public static void stDepartment(String id,String newDep) throws IOException{
		FileFunction.readStInfo();
		FileFunction.clearFiles();
		for(Student st:stList){
			if(st.stId.compareTo(id)==0){
				st.stDepartment=newDep;
				System.out.println("\nStudent department change successfully");
				
			}
			FileFunction.writeStInfo(st);
		}
	}
	
	public static void stCourse(String id) throws IOException{
		FileFunction.readStInfo();
		FileFunction.clearFiles();
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		String newCourse;
		String oldCourse;
		String newGrade;
		for(Student st:stList){
			if(st.stId.compareTo(id)==0){
				
				System.out.print("\nEnter the year in which the course will be changed:");
				int year=s1.nextInt();
				if(year==1){
					System.out.print("Year 1\nSemister 1\n");
					for(int i=0;i<st.frsYrFrsSemCrs.size();i++){
						System.out.print(st.frsYrFrsSemCrs.get(i)+'\t'+st.frsYrFrsSemGrade.get(i)+"\n");
					}
					System.out.print("Gpa:\t");
					System.out.print(st.frsYrFrsSemGpa);
					System.out.println();
					System.out.print("\nSemister 2\n");
					for(int i=0;i<st.frsYrSecSemCrs.size();i++){
						System.out.print(st.frsYrSecSemCrs.get(i)+'\t'+st.frsYrSecSemGrade.get(i)+"\n");
					}
					System.out.print("Gpa:\t");
					System.out.print(st.frsYrSecSemGpa);
					System.out.println();
					
					System.out.print("In which semister the course will be changed:");
					int sem=s1.nextInt();
					if(sem==1){
						System.out.println("\nEnter the name of the course that will be changed:");
						oldCourse=s.nextLine();
						
						for(int i=0;i<st.frsYrFrsSemCrs.size();i++){
							if(st.frsYrFrsSemCrs.get(i).compareTo(oldCourse)==0){
								System.out.print("\nEnter the new course name:");
								newCourse=s.nextLine();
								st.frsYrFrsSemCrs.set(i,newCourse);
								System.out.print("\nEnter the grade for the new course:");
								newGrade=s.nextLine();
								st.frsYrFrsSemGrade.set(i,newGrade);
								st.frsYrFrsSemGpa=Calculate.gpa(st.frsYrFrsSemCrs,st.frsYrFrsSemGrade);
								
							}
						}
					}
					if(sem==2){
						System.out.println("\nEnter the name of the course that will be changed:");
						oldCourse=s.nextLine();
						for(int i=0;i<st.frsYrSecSemCrs.size();i++){
							if(st.frsYrSecSemCrs.get(i).compareTo(oldCourse)==0){
								System.out.print("\nEnter the new course name:");
								newCourse=s.nextLine();
								st.frsYrSecSemCrs.set(i,newCourse);
								System.out.print("\nEnter the grade for the new course:");
								newGrade=s.nextLine();
								st.frsYrSecSemGrade.set(i,newGrade);
								st.frsYrSecSemGpa=Calculate.gpa(st.frsYrSecSemCrs,st.frsYrSecSemGrade);
							}
						}
					}
				}
				if(year==2){
					System.out.print("Year 1\nSemister 1\n");
					for(int i=0;i<st.secYrFrsSemCrs.size();i++){
						System.out.print(st.secYrFrsSemCrs.get(i)+'\t'+st.secYrFrsSemGrade.get(i)+"\n");
					}
					System.out.print("Gpa:\t");
					System.out.print(st.secYrFrsSemGpa);
					System.out.println();
					System.out.print("\nSemister 2\n");
					for(int i=0;i<st.secYrSecSemCrs.size();i++){
						System.out.print(st.secYrSecSemCrs.get(i)+'\t'+st.secYrSecSemGrade.get(i)+"\n");
					}
					System.out.print("Gpa:\t");
					System.out.print(st.secYrSecSemGpa);
					System.out.println();
					
					System.out.print("In which semister the course will be changed:");
					int sem=s1.nextInt();
					if(sem==1){
						System.out.println("\nEnter the name of the course that will be changed:");
						oldCourse=s.nextLine();
						for(int i=0;i<st.secYrFrsSemCrs.size();i++){
							if(st.secYrFrsSemCrs.get(i).compareTo(oldCourse)==0){
								System.out.print("\nEnter the new course name:");
								newCourse=s.nextLine();
								st.secYrFrsSemCrs.set(i,newCourse);
								System.out.print("\nEnter the grade for the new course:");
								newGrade=s.nextLine();
								st.secYrFrsSemGrade.set(i,newGrade);
								st.secYrFrsSemGpa=Calculate.gpa(st.secYrFrsSemCrs,st.secYrFrsSemGrade);
							}
						}
					}
					if(sem==2){
						System.out.println("\nEnter the name of the course that will be changed:");
						oldCourse=s.nextLine();
						for(int i=0;i<st.secYrSecSemCrs.size();i++){
							if(st.secYrSecSemCrs.get(i).compareTo(oldCourse)==0){
								System.out.print("\nEnter the new course name:");
								newCourse=s.nextLine();
								st.secYrSecSemCrs.set(i,newCourse);
								System.out.print("\nEnter the grade for the new course:");
								newGrade=s.nextLine();
								st.secYrSecSemGrade.set(i,newGrade);
								st.secYrSecSemGpa=Calculate.gpa(st.secYrSecSemCrs,st.secYrSecSemGrade);
							}
						}
					}
				}
				if(year==3){
					System.out.print("Year 1\nSemister 1\n");
					for(int i=0;i<st.trdYrFrsSemCrs.size();i++){
						System.out.print(st.trdYrFrsSemCrs.get(i)+'\t'+st.trdYrFrsSemGrade.get(i)+"\n");
					}
					System.out.print("Gpa:\t");
					System.out.print(st.trdYrFrsSemGpa);
					System.out.println();
					System.out.print("\nSemister 2\n");
					for(int i=0;i<st.trdYrSecSemCrs.size();i++){
						System.out.print(st.trdYrSecSemCrs.get(i)+'\t'+st.trdYrSecSemGrade.get(i)+"\n");
					}
					System.out.print("Gpa:\t");
					System.out.print(st.trdYrSecSemGpa);
					System.out.println();
					
					System.out.print("In which semister the course will be changed:");
					int sem=s1.nextInt();
					if(sem==1){
						System.out.println("\nEnter the name of the course that will be changed:");
						oldCourse=s.nextLine();
						
						for(int i=0;i<st.trdYrFrsSemCrs.size();i++){
							if(st.trdYrFrsSemCrs.get(i).compareTo(oldCourse)==0){
								System.out.print("\nEnter the new course name:");
								newCourse=s.nextLine();
								st.trdYrFrsSemCrs.set(i,newCourse);
								System.out.print("\nEnter the grade for the new course:");
								newGrade=s.nextLine();
								st.trdYrFrsSemGrade.set(i,newGrade);
								st.trdYrFrsSemGpa=Calculate.gpa(st.trdYrFrsSemCrs,st.trdYrFrsSemGrade);
							}
						}
					}
					if(sem==2){
						System.out.println("\nEnter the name of the course that will be changed:");
						oldCourse=s.nextLine();
						for(int i=0;i<st.trdYrSecSemCrs.size();i++){
							if(st.trdYrSecSemCrs.get(i).compareTo(oldCourse)==0){
								System.out.print("\nEnter the new course name:");
								newCourse=s.nextLine();
								st.trdYrSecSemCrs.set(i,newCourse);
								System.out.print("\nEnter the grade for the new course:");
								newGrade=s.nextLine();
								st.trdYrSecSemGrade.set(i,newGrade);
								st.trdYrSecSemGpa=Calculate.gpa(st.trdYrSecSemCrs,st.trdYrSecSemGrade);
							}
						}
					}
				}
				if(year==4){
					System.out.print("Year 1\nSemister 1\n");
					for(int i=0;i<st.frthYrFrsSemCrs.size();i++){
						System.out.print(st.frthYrFrsSemCrs.get(i)+'\t'+st.frthYrFrsSemGrade.get(i)+"\n");
					}
					System.out.print("Gpa:\t");
					System.out.print(st.frthYrFrsSemGpa);
					System.out.println();
					System.out.print("\nSemister 2\n");
					for(int i=0;i<st.frthYrSecSemCrs.size();i++){
						System.out.print(st.frthYrSecSemCrs.get(i)+'\t'+st.frthYrSecSemGrade.get(i)+"\n");
					}
					System.out.print("Gpa:\t");
					System.out.print(st.frthYrSecSemGpa);
					System.out.println();
					
					System.out.print("In which semister the course will be changed:");
					int sem=s1.nextInt();
					if(sem==1){
						System.out.println("\nEnter the name of the course that will be changed:");
						oldCourse=s.nextLine();
						for(int i=0;i<st.frthYrFrsSemCrs.size();i++){
							if(st.frthYrFrsSemCrs.get(i).compareTo(oldCourse)==0){
								System.out.print("\nEnter the new course name:");
								newCourse=s.nextLine();
								st.frthYrFrsSemCrs.set(i,newCourse);
								System.out.print("\nEnter the grade for the new course:");
								newGrade=s.nextLine();
								st.frthYrFrsSemGrade.set(i,newGrade);
								st.frthYrFrsSemGpa=Calculate.gpa(st.frthYrFrsSemCrs,st.frthYrFrsSemGrade);
							}
						}
					}
					if(sem==2){
						System.out.println("\nEnter the name of the course that will be changed:");
						oldCourse=s.nextLine();
						for(int i=0;i<st.frthYrSecSemCrs.size();i++){
							if(st.frthYrSecSemCrs.get(i).compareTo(oldCourse)==0){
								System.out.print("\nEnter the new course name:");
								newCourse=s.nextLine();
								st.frthYrSecSemCrs.set(i,newCourse);
								System.out.print("\nEnter the grade for the new course:");
								newGrade=s.nextLine();
								st.frthYrSecSemGrade.set(i,newGrade);
								st.frthYrSecSemGpa=Calculate.gpa(st.frthYrSecSemCrs,st.frthYrSecSemGrade);
							}
						}
					}
				}
				
				
			}
			st.cumGpa=Calculate.gpa(st);
			FileFunction.writeStInfo(st);
		}
		
		
	}

	public static void stGrade(String id) throws IOException{
		FileFunction.readStInfo();
		FileFunction.clearFiles();
		
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		
		String course;
		String newGrade;
		
		for(Student st:stList){
			if(st.stId.compareTo(id)==0){
				System.out.print("\nEnter the year in which the grade will be changed:");
				int year1=s1.nextInt();
				if(year1==1){
					System.out.print("Year 1\nSemister 1\n");
					for(int i=0;i<st.frsYrFrsSemCrs.size();i++){
						System.out.print(st.frsYrFrsSemCrs.get(i)+'\t'+st.frsYrFrsSemGrade.get(i)+"\n");
					}
					System.out.print("Gpa:\t");
					System.out.print(st.frsYrFrsSemGpa);
					System.out.println();
					System.out.print("\nSemister 2\n");
					for(int i=0;i<st.frsYrSecSemCrs.size();i++){
						System.out.print(st.frsYrSecSemCrs.get(i)+'\t'+st.frsYrSecSemGrade.get(i)+"\n");
					}
					System.out.print("Gpa:\t");
					System.out.print(st.frsYrSecSemGpa);
					System.out.println();
					
					System.out.print("In which semister the grade will be changed:");
					int sem=s1.nextInt();
					if(sem==1){
						System.out.println("\nEnter the name of the course that in which the grade will be changed:");
						course=s.nextLine();
						
						for(int i=0;i<st.frsYrFrsSemCrs.size();i++){
							if(st.frsYrFrsSemCrs.get(i).compareTo(course)==0){
								System.out.print("\nEnter the new grade for the course:");
								newGrade=s.nextLine();
								st.frsYrFrsSemGrade.set(i,newGrade);
								st.frsYrFrsSemGpa=Calculate.gpa(st.frsYrFrsSemCrs,st.frsYrFrsSemGrade);
								
							}
						}
					}
					if(sem==2){
						System.out.println("\nEnter the name of the course that in which the grade will be changed:");
						course=s.nextLine();
						for(int i=0;i<st.frsYrSecSemCrs.size();i++){
							if(st.frsYrSecSemCrs.get(i).compareTo(course)==0){
								
								System.out.print("\nEnter the grade for the new course:");
								newGrade=s.nextLine();
								st.frsYrSecSemGrade.set(i,newGrade);
								st.frsYrSecSemGpa=Calculate.gpa(st.frsYrSecSemCrs,st.frsYrSecSemGrade);
							}
						}
					}
				}
				if(year1==2){
					System.out.print("Year 1\nSemister 1\n");
					for(int i=0;i<st.secYrFrsSemCrs.size();i++){
						System.out.print(st.secYrFrsSemCrs.get(i)+'\t'+st.secYrFrsSemGrade.get(i)+"\n");
					}
					System.out.print("Gpa:\t");
					System.out.print(st.secYrFrsSemGpa);
					System.out.println();
					System.out.print("\nSemister 2\n");
					for(int i=0;i<st.secYrSecSemCrs.size();i++){
						System.out.print(st.secYrSecSemCrs.get(i)+'\t'+st.secYrSecSemGrade.get(i)+"\n");
					}
					System.out.print("Gpa:\t");
					System.out.print(st.secYrSecSemGpa);
					System.out.println();
					
					System.out.print("In which semister the course will be changed:");
					int sem=s1.nextInt();
					if(sem==1){
						System.out.println("\nEnter the name of the course that in which the grade will be changed:");
						course=s.nextLine();
						for(int i=0;i<st.secYrFrsSemCrs.size();i++){
							if(st.secYrFrsSemCrs.get(i).compareTo(course)==0){
								
								

								System.out.print("\nEnter the grade for the new course:");
								newGrade=s.nextLine();
								st.secYrFrsSemGrade.set(i,newGrade);
								st.secYrFrsSemGpa=Calculate.gpa(st.secYrFrsSemCrs,st.secYrFrsSemGrade);
							}
						}
					}
					if(sem==2){
						System.out.println("\nEnter the name of the course that in which the grade will be changed:");
						course=s.nextLine();
						for(int i=0;i<st.secYrSecSemCrs.size();i++){
							if(st.secYrSecSemCrs.get(i).compareTo(course)==0){
							
								System.out.print("\nEnter the grade for the new course:");
								newGrade=s.nextLine();
								st.secYrSecSemGrade.set(i,newGrade);
								st.secYrSecSemGpa=Calculate.gpa(st.secYrSecSemCrs,st.secYrSecSemGrade);
							}
						}
					}
				}
				if(year1==3){
					System.out.print("Year 1\nSemister 1\n");
					for(int i=0;i<st.trdYrFrsSemCrs.size();i++){
						System.out.print(st.trdYrFrsSemCrs.get(i)+'\t'+st.trdYrFrsSemGrade.get(i)+"\n");
					}
					System.out.print("Gpa:\t");
					System.out.print(st.trdYrFrsSemGpa);
					System.out.println();
					System.out.print("\nSemister 2\n");
					for(int i=0;i<st.trdYrSecSemCrs.size();i++){
						System.out.print(st.trdYrSecSemCrs.get(i)+'\t'+st.trdYrSecSemGrade.get(i)+"\n");
					}
					System.out.print("Gpa:\t");
					System.out.print(st.trdYrSecSemGpa);
					System.out.println();
					
					System.out.print("In which semister the course will be changed:");
					int sem=s1.nextInt();
					if(sem==1){
						System.out.println("\nEnter the name of the course that in which the grade will be changed:");
						course=s.nextLine();
						
						for(int i=0;i<st.trdYrFrsSemCrs.size();i++){
							if(st.trdYrFrsSemCrs.get(i).compareTo(course)==0){
								
								System.out.print("\nEnter the grade for the new course:");
								newGrade=s.nextLine();
								st.trdYrFrsSemGrade.set(i,newGrade);
								st.trdYrFrsSemGpa=Calculate.gpa(st.trdYrFrsSemCrs,st.trdYrFrsSemGrade);
							}
						}
					}
					if(sem==2){
						System.out.println("\nEnter the name of the course that in which the grade will be changed:");
						course=s.nextLine();
						for(int i=0;i<st.trdYrSecSemCrs.size();i++){
							if(st.trdYrSecSemCrs.get(i).compareTo(course)==0){
						
								System.out.print("\nEnter the grade for the new course:");
								newGrade=s.nextLine();
								st.trdYrSecSemGrade.set(i,newGrade);
								st.trdYrSecSemGpa=Calculate.gpa(st.trdYrSecSemCrs,st.trdYrSecSemGrade);
							}
						}
					}
				}
				if(year1==4){
					System.out.print("Year 1\nSemister 1\n");
					for(int i=0;i<st.frthYrFrsSemCrs.size();i++){
						System.out.print(st.frthYrFrsSemCrs.get(i)+'\t'+st.frthYrFrsSemGrade.get(i)+"\n");
					}
					System.out.print("Gpa:\t");
					System.out.print(st.frthYrFrsSemGpa);
					System.out.println();
					System.out.print("\nSemister 2\n");
					for(int i=0;i<st.frthYrSecSemCrs.size();i++){
						System.out.print(st.frthYrSecSemCrs.get(i)+'\t'+st.frthYrSecSemGrade.get(i)+"\n");
					}
					System.out.print("Gpa:\t");
					System.out.print(st.frthYrSecSemGpa);
					System.out.println();
					
					System.out.print("In which semister the course will be changed:");
					int sem=s1.nextInt();
					if(sem==1){
						System.out.println("\nEnter the name of the course that in which the grade will be changed:");
						course=s.nextLine();
						for(int i=0;i<st.frthYrFrsSemCrs.size();i++){
							if(st.frthYrFrsSemCrs.get(i).compareTo(course)==0){

								System.out.print("\nEnter the grade for the new course:");
								newGrade=s.nextLine();
								st.frthYrFrsSemGrade.set(i,newGrade);
								st.frthYrFrsSemGpa=Calculate.gpa(st.frthYrFrsSemCrs,st.frthYrFrsSemGrade);
							}
						}
					}
					if(sem==2){
						System.out.println("\nEnter the name of the course that in which the grade will be changed:");
						course=s.nextLine();
						for(int i=0;i<st.frthYrSecSemCrs.size();i++){
							if(st.frthYrSecSemCrs.get(i).compareTo(course)==0){
								
								System.out.print("\nEnter the grade for the new course:");
								newGrade=s.nextLine();
								st.frthYrSecSemGrade.set(i,newGrade);
								st.frthYrSecSemGpa=Calculate.gpa(st.frthYrSecSemCrs,st.frthYrSecSemGrade);
							}
						}
					}
				}
			}
			st.cumGpa=Calculate.gpa(st);
			FileFunction.writeStInfo(st);
		}
	}


}
