package StudentManagement;

import java.io.FileNotFoundException;//are class of an exception because we used "file"
import java.io.IOException;//*
import java.util.Scanner;//for inputing



public class StudentManagment{

    public static void main(String args[])throws IOException{//the main class where the the menus are displayed
    	Scanner s=new Scanner(System.in);
    	short input;//for holding the input of the user
    	short input2;//*
      
     
        System.out.println("\t\t|****************************************************************|");
        System.out.println("\t\t|                   WELCOME TO STUDENT INFORMATION                |");
        System.out.println("\t\t|                              SYSTEM                            |");
        System.out.println("\t\t|****************************************************************|");
        do {
        	System.out.println("\t\t|          please make a selection");
        	System.out.println("\t\t|          1-Admistrator    ");
	        System.out.println("\t\t|          2-Student");
	        System.out.println("\t\t|          0-Exit");
	        input2=s.nextShort();
	        
	        switch(input2) {
	        case 1:
	        	 
	        	if(LogIn.admin()){//checks the administrator user name and password
	        		
	        		do { //If the use name and password is correct this menu will be displayed 
		         	       
		        		System.out.println("\t\t|          please make a selection");
		        		System.out.println("\t\t|          1-ADD STUDENT INFO   ");
		       	        System.out.println("\t\t|          2-ADD COURSE");
		       	        System.out.println("\t\t|          3-SORT AND VIEW\n     \t\t\t\tby:ID,NAME,AGE");
		       	        System.out.println("\t\t|          4-MODIFY  ");
		       	        System.out.println("\t\t|          5-DELETE STUDENT INFORMATION   ");
		       	        System.out.println("\t\t|          6-SEARCH \n  \t\t\t\t by:ID,NAME,SEX,AGE,DEP,YEAR,CU.GPA  ");
		       	        System.out.println("\t\t|          0-EXIT   ");
		       	        System.out.println("\t\t|***************************************************************|");
		             
		       	        System.out.print("\t\tInsert choice:");
		       	   


		       	  
		       	        input=s.nextShort();
		       	        switch(input){
		       	        	case(1):
		       	        		AddData.studentInfo();//calls the method to add new student information
		       	        		break;
		             	
		       	        	case(2):
		       	        		AddData.courseInfo();//calls the method to add new course information
		       	        		break;
		             	
		       	        	case(3):
		       	        		sorter();//calls the sorter method witch is in this class
		       	        		break;
		             		
		       	        	case 4:
		       	        		modifier();//calls the modifier method witch is in this class
		       	        		break;
		             	
		       	        	case 5:
		       	        		Delete.studentInfo();//calls the delete student information method
		             		break;
		       	        	case 6:
		       	        		searcher();//calls the searcher method witch is in this class
		       	        		break;
		       	        }
		        
		        	}while(input!=0);//if the admin enters 0 it will get out of this loop
	        	}
	        	break;
	        	case 2://for the student user, the user can see his information by inserting his/her id;
	        		Scanner s1=new Scanner(System.in);
	        		String id;
	        		System.out.print("Enter Your ID:");
	        		id=s1.nextLine();
	        		Search.byId(id);//this method will search the specfic id and display the information for that specific id
	        		break;
	        	}
        }while(input2!=0);//to terminate the program
    }		
    
    public static void sorter() throws FileNotFoundException //the method for sorting the student and displaying them
    {  
    	System.out.println("sort by:");
    	System.out.println("please make a selection");
	    System.out.println("1-BY ID   ");	
	    System.out.println("2-BY NAME");
	    System.out.println("3-BY AGE");
	    System.out.println("4-BY DEPARTMENT");
	    
	    System.out.print("Insert choice:");
  	  	short input;
  	  	Scanner s=new Scanner(System.in);
        input=s.nextShort();
        
        switch(input){
        	case(1):
        		FileFunction.readStInfo();//for reading the all the student information from the file and adding it to the list in the class function
        		Sort.byId();//for sorting the students based on the id
        		DisplayInfo.studentInfo();//Displays all the sorted student information
        		break;
        	
        	case(2):
        		FileFunction.readStInfo();//*
        		Sort.byName();//*
        		DisplayInfo.studentInfo();//*
        		break;
        	
        	case(3):
        		FileFunction.readStInfo();//*
        		Sort.byAge();//*
        		DisplayInfo.studentInfo();//*
        		break;
        	case(4):
        		FileFunction.readStInfo();//*
        		Sort.byDepartment();//*
        		DisplayInfo.studentInfo();//*
        		break;
        	case(5):
        		FileFunction.readStInfo();//*
    			Sort.byYear();//*
    			DisplayInfo.studentInfo();//*
    			break;
    		default:
    			System.out.print("Wrong input");
    			break;
        }
   
    while(input!=0);
    }
    
    public static void searcher() throws FileNotFoundException {//the method for searching a student
	  
	  System.out.println("SEARCH by:");
 	 System.out.println("please make a selection");
	        System.out.println("1-BY ID   ");
	        System.out.println("2-BY NAME");
	        System.out.println("3-BY SEX");
	        System.out.println("4-BY AGE  ");
	        System.out.println("5-BY DEPARTMENT");
	        System.out.println("6-BY YEAR"); 
	        System.out.println("7-BY CUMULATIVE.GPA");
	        
 	  System.out.print("Insert choice:");        
	    

 short input;
 Scanner s1=new Scanner(System.in);
 Scanner s=new Scanner(System.in);
     input=s1.nextShort();
     switch(input){
     	case(1):
     		String stId;
     		System.out.print("Enter the id of the student:");
     		stId=s.nextLine();//inserting the id of the student to be searched
     		Search.byId(stId);//searching the specific id and dispalyin their info
     		break;
     	
     	case(2):
     		String stName;
     		System.out.print("Enter the name of the student:");
     		stName=s.nextLine();//*
     		Search.byName(stName);//8
     		break;
     	
     	case(3):
     		String stSex;
     		System.out.print("Enter the Sex:");
     		stSex=s.nextLine();//*
     	    Search.bySex(stSex);//*
     		break;
     	case(4):
     		short stAge;
     		System.out.print("Enter the age:");
     		stAge=s1.nextShort();//*
     		Search.byAge(stAge);//*
     		break;
     	
     	case(5):
     		String stDep;
     		System.out.print("Enter the Department:");
     		stDep=s.nextLine();//*
     		Search.byDepartment(stDep);//*
     		break;
     	
     	case(6):
     		short stYear;
     		System.out.print("Enter the year:");
     		stYear=s1.nextShort();//*
     	    Search.byYear(stYear);//*
     		break;
     	case(7):
     		double stCumGpa;
     		System.out.print("Enter the Cumulative Gpa");
     		stCumGpa=s1.nextDouble();//*
     	    Search.byCumGpa(stCumGpa);//*
     		break;
     		
     }

 while(input!=0);
 
}
  
    public static void modifier() throws IOException{//the method for editing the student informations
    	
    	String id;
    	int input;
    	Scanner s=new Scanner(System.in);
    	Scanner s1=new Scanner(System.in);
    	
    	System.out.println("Enter the Id of the student you want to Modify:");
    	id=s.nextLine();//getting the id that should be edited
    	if(Search.ifStExist(id)){//check if that specific id exists and edit it if it exist
    		System.out.println("What do you want to edit");
			System.out.println("1.Id\t2.Name\t3.Sex\t4.Age\n5.Department\6.Course\n7.Grade");
			input=s1.nextInt();
			
			switch(input){
				
			case 1:
				String newId;
				System.out.print("Enter the new id:");
				newId=s.nextLine();
				Modify.stId(id, newId);//calling the method Modify.stId for modifying the student of the specific id 
				break;
				
			case 2:
				String newName;
				System.out.print("Enter the new Name:");
				newName=s.nextLine();
				Modify.stName(id, newName);//*
				break;
			
			case 3:
				String newSex;
				System.out.print("Enter the new Sex:");
				newSex=s.nextLine();
				Modify.stName(id, newSex);//*
				break;
			
			case 4:
				short newAge;
				System.out.print("Enter the new age:");
				newAge=s1.nextShort();
				Modify.stAge(id, newAge);//*
				break;
				
			case 5:
				String newDep;
				System.out.print("Enter the new Department:");
				newDep=s.nextLine();
				Modify.stName(id, newDep);//*
				break;
			
			case 6:
				Modify.stCourse(id);//*
				break;
			
			case 7:
				Modify.stGrade(id);//*
				break;
				
			default:
				System.out.print("Wrong input!!!");
			}
			
    	}
    	else
    		System.out.println("There is no student with the id "+id);//display this if the id the admin entered to modify doesn't exist
    	
    	
    }

}
