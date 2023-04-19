package StudentManagement;

import java.io.FileNotFoundException;

public class Sort extends Function {
	
	public static void byId() throws FileNotFoundException{//for sorting the students by their Id by selection sorting...
		Student tempSt=new Student();//a temporary object of the student class 
		int smallest;//for holding the smallest index
		for (int i=0;i<stList.size();i++){//for every student in the list
			smallest=i;
			for(int j=i+1;j<stList.size();j++){
				if(stList.get(j).stId.compareTo(stList.get(smallest).stId)<0){//compare by the student id
					smallest=j; 
				}
				tempSt=stList.get(smallest);//swaps the objects....
				stList.set(smallest, stList.get(i));
				stList.set(i,tempSt);
			}
		}
	}
	
	public static void byName() throws FileNotFoundException{//for sorting the students by their Name
		Student tempSt=new Student();
		int smallest;
		for (int i=0;i<stList.size();i++){
			smallest=i;
			for(int j=i+1;j<stList.size();j++){
				if(stList.get(j).getStName().compareTo(stList.get(smallest).getStName())<0){
					smallest=j; 
				}
				tempSt=stList.get(smallest);
				stList.set(smallest, stList.get(i));
				stList.set(i,tempSt);
			}
		}
	}
	
	public static void byAge() throws FileNotFoundException{//for sorting the students by their Age
		Student tempSt=new Student();
		int smallest;
		for (int i=0;i<stList.size();i++){
			smallest=i;
			for(int j=i+1;j<stList.size();j++){
				if(stList.get(j).getStAge()<stList.get(smallest).getStAge()){
					smallest=j; 
				}
				tempSt=stList.get(smallest);
				stList.set(smallest, stList.get(i));
				stList.set(i,tempSt);
			}
		}
	}
	
	public static void byDepartment() throws FileNotFoundException{//for sorting the students by their Department
		Student tempSt=new Student();
		int smallest;
		for (int i=0;i<stList.size();i++){
			smallest=i;
			for(int j=i+1;j<stList.size();j++){
				if(stList.get(j).getStName().compareTo(stList.get(smallest).getStName())<0){
					smallest=j; 
				}
				tempSt=stList.get(smallest);
				stList.set(smallest, stList.get(i));
				stList.set(i,tempSt);
			}
		}
	}
	
	public static void byYear() throws FileNotFoundException{//for sorting the students by their year
		Student tempSt=new Student();
		int smallest;
		for (int i=0;i<stList.size();i++){
			smallest=i;
			for(int j=i+1;j<stList.size();j++){
				if(stList.get(j).stYear<stList.get(smallest).stYear){
					smallest=j; 
				}
				tempSt=stList.get(smallest);
				stList.set(smallest, stList.get(i));
				stList.set(i,tempSt);
			}
		}
	}
	
	public static void byCumGpa() throws FileNotFoundException{//for sorting the students by their Cumulative Gpa
		Student tempSt=new Student();
		int smallest;
		for (int i=0;i<stList.size();i++){
			smallest=i;
			for(int j=i+1;j<stList.size();j++){
				if(stList.get(j).cumGpa>stList.get(smallest).cumGpa){
					smallest=j; 
				}
				tempSt=stList.get(smallest);
				stList.set(smallest, stList.get(i));
				stList.set(i,tempSt);
			}
		}
	}
	
	
}
