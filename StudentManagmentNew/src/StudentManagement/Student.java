package StudentManagement;

import java.util.ArrayList;//for using arrayLists


public class Student {//the class where all the student information is manipulated
    private String stName; 
    private short stAge;  
    private String stSex; 
    
    
    String stId;
    String stDepartment;
    short stYear;
      
    
    ArrayList<String> frsYrFrsSemCrs= new ArrayList<>();
    ArrayList<String> frsYrSecSemCrs=new ArrayList<>();
    ArrayList<String> secYrFrsSemCrs= new ArrayList<>();
    ArrayList<String> secYrSecSemCrs=new ArrayList<>();
    ArrayList<String> trdYrFrsSemCrs= new ArrayList<>();
    ArrayList<String> trdYrSecSemCrs=new ArrayList<>();
    ArrayList<String> frthYrFrsSemCrs= new ArrayList<>();
    ArrayList<String> frthYrSecSemCrs=new ArrayList<>();
    
    ArrayList<String> frsYrFrsSemGrade= new ArrayList<>();
    ArrayList<String> frsYrSecSemGrade=new ArrayList<>();
    ArrayList<String> secYrFrsSemGrade= new ArrayList<>();
    ArrayList<String> secYrSecSemGrade=new ArrayList<>();
    ArrayList<String> trdYrFrsSemGrade= new ArrayList<>();
    ArrayList<String> trdYrSecSemGrade=new ArrayList<>();
    ArrayList<String> frthYrFrsSemGrade= new ArrayList<>();
    ArrayList<String> frthYrSecSemGrade=new ArrayList<>();
    
    
    double frsYrFrsSemGpa;
    double frsYrSecSemGpa;
    double secYrFrsSemGpa;
    double secYrSecSemGpa;
    double trdYrFrsSemGpa;
    double trdYrSecSemGpa;
    double frthYrFrsSemGpa;
    double frthYrSecSemGpa;
	double cumGpa;
	
	
	
	
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public short getStAge() {
		return stAge;
	}
	public void setStAge(short stAge) {
		this.stAge = stAge;
	}
	public String getStSex() {
		return stSex;
	}
	public void setStSex(String stSex) {
		this.stSex = stSex;
	}
	public String getStId() {
		return stId;
	}
	public void setStId(String stId) {
		this.stId = stId;
	}
	public String getStDepartment() {
		return stDepartment;
	}
	public void setStDepartment(String stDepartment) {
		this.stDepartment = stDepartment;
	}
	public short getStYear() {
		return stYear;
	}
	public void setStYear(short stYear) {
		this.stYear = stYear;
	}
	public ArrayList<String> getFrsYrFrsSemCrs() {
		return frsYrFrsSemCrs;
	}
	public void setFrsYrFrsSemCrs(ArrayList<String> frsYrFrsSemCrs) {
		this.frsYrFrsSemCrs = frsYrFrsSemCrs;
	}
	public ArrayList<String> getFrsYrSecSemCrs() {
		return frsYrSecSemCrs;
	}
	public void setFrsYrSecSemCrs(ArrayList<String> frsYrSecSemCrs) {
		this.frsYrSecSemCrs = frsYrSecSemCrs;
	}
	public ArrayList<String> getSecYrFrsSemCrs() {
		return secYrFrsSemCrs;
	}
	public void setSecYrFrsSemCrs(ArrayList<String> secYrFrsSemCrs) {
		this.secYrFrsSemCrs = secYrFrsSemCrs;
	}
	public ArrayList<String> getSecYrSecSemCrs() {
		return secYrSecSemCrs;
	}
	public void setSecYrSecSemCrs(ArrayList<String> secYrSecSemCrs) {
		this.secYrSecSemCrs = secYrSecSemCrs;
	}
	public ArrayList<String> getTrdYrFrsSemCrs() {
		return trdYrFrsSemCrs;
	}
	public void setTrdYrFrsSemCrs(ArrayList<String> trdYrFrsSemCrs) {
		this.trdYrFrsSemCrs = trdYrFrsSemCrs;
	}
	public ArrayList<String> getTrdYrSecSemCrs() {
		return trdYrSecSemCrs;
	}
	public void setTrdYrSecSemCrs(ArrayList<String> trdYrSecSemCrs) {
		this.trdYrSecSemCrs = trdYrSecSemCrs;
	}
	public ArrayList<String> getFrthYrFrsSemCrs() {
		return frthYrFrsSemCrs;
	}
	public void setFrthYrFrsSemCrs(ArrayList<String> frthYrFrsSemCrs) {
		this.frthYrFrsSemCrs = frthYrFrsSemCrs;
	}
	public ArrayList<String> getFrthYrSecSemCrs() {
		return frthYrSecSemCrs;
	}
	public void setFrthYrSecSemCrs(ArrayList<String> frthYrSecSemCrs) {
		this.frthYrSecSemCrs = frthYrSecSemCrs;
	}
	public ArrayList<String> getFrsYrFrsSemGrade() {
		return frsYrFrsSemGrade;
	}
	public void setFrsYrFrsSemGrade(ArrayList<String> frsYrFrsSemGrade) {
		this.frsYrFrsSemGrade = frsYrFrsSemGrade;
	}
	public ArrayList<String> getFrsYrSecSemGrade() {
		return frsYrSecSemGrade;
	}
	public void setFrsYrSecSemGrade(ArrayList<String> frsYrSecSemGrade) {
		this.frsYrSecSemGrade = frsYrSecSemGrade;
	}
	public ArrayList<String> getSecYrFrsSemGrade() {
		return secYrFrsSemGrade;
	}
	public void setSecYrFrsSemGrade(ArrayList<String> secYrFrsSemGrade) {
		this.secYrFrsSemGrade = secYrFrsSemGrade;
	}
	public ArrayList<String> getSecYrSecSemGrade() {
		return secYrSecSemGrade;
	}
	public void setSecYrSecSemGrade(ArrayList<String> secYrSecSemGrade) {
		this.secYrSecSemGrade = secYrSecSemGrade;
	}
	public ArrayList<String> getTrdYrFrsSemGrade() {
		return trdYrFrsSemGrade;
	}
	public void setTrdYrFrsSemGrade(ArrayList<String> trdYrFrsSemGrade) {
		this.trdYrFrsSemGrade = trdYrFrsSemGrade;
	}
	public ArrayList<String> getTrdYrSecSemGrade() {
		return trdYrSecSemGrade;
	}
	public void setTrdYrSecSemGrade(ArrayList<String> trdYrSecSemGrade) {
		this.trdYrSecSemGrade = trdYrSecSemGrade;
	}
	public ArrayList<String> getFrthYrFrsSemGrade() {
		return frthYrFrsSemGrade;
	}
	public void setFrthYrFrsSemGrade(ArrayList<String> frthYrFrsSemGrade) {
		this.frthYrFrsSemGrade = frthYrFrsSemGrade;
	}
	public ArrayList<String> getFrthYrSecSemGrade() {
		return frthYrSecSemGrade;
	}
	public void setFrthYrSecSemGrade(ArrayList<String> frthYrSecSemGrade) {
		this.frthYrSecSemGrade = frthYrSecSemGrade;
	}
	public double getFrsYrFrsSemGpa() {
		return frsYrFrsSemGpa;
	}
	public void setFrsYrFrsSemGpa(double frsYrFrsSemGpa) {
		this.frsYrFrsSemGpa = frsYrFrsSemGpa;
	}
	public double getFrsYrSecSemGpa() {
		return frsYrSecSemGpa;
	}
	public void setFrsYrSecSemGpa(double frsYrSecSemGpa) {
		this.frsYrSecSemGpa = frsYrSecSemGpa;
	}
	public double getSecYrFrsSemGpa() {
		return secYrFrsSemGpa;
	}
	public void setSecYrFrsSemGpa(double secYrFrsSemGpa) {
		this.secYrFrsSemGpa = secYrFrsSemGpa;
	}
	public double getSecYrSecSemGpa() {
		return secYrSecSemGpa;
	}
	public void setSecYrSecSemGpa(double secYrSecSemGpa) {
		this.secYrSecSemGpa = secYrSecSemGpa;
	}
	public double getTrdYrFrsSemGpa() {
		return trdYrFrsSemGpa;
	}
	public void setTrdYrFrsSemGpa(double trdYrFrsSemGpa) {
		this.trdYrFrsSemGpa = trdYrFrsSemGpa;
	}
	public double getTrdYrSecSemGpa() {
		return trdYrSecSemGpa;
	}
	public void setTrdYrSecSemGpa(double trdYrSecSemGpa) {
		this.trdYrSecSemGpa = trdYrSecSemGpa;
	}
	public double getFrthYrFrsSemGpa() {
		return frthYrFrsSemGpa;
	}
	public void setFrthYrFrsSemGpa(double frthYrFrsSemGpa) {
		this.frthYrFrsSemGpa = frthYrFrsSemGpa;
	}
	public double getFrthYrSecSemGpa() {
		return frthYrSecSemGpa;
	}
	public void setFrthYrSecSemGpa(double frthYrSecSemGpa) {
		this.frthYrSecSemGpa = frthYrSecSemGpa;
	}
	public double getCumGpa() {
		return cumGpa;
	}
	public void setCumGpa(double cumGpa) {
		this.cumGpa = cumGpa;
	}
    
    
    
    
}
