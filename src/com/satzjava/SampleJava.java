package com.satzjava;
public class SampleJava {
	private void empDetails() {
		System.out.println("Normal method");
	}
    private void empDetails(int a) {
		System.out.println("Employee id " + a);
	}
    private void empDetails(int a,int yoj) {
		System.out.println("Company id " + a);
		System.out.println("Year of Joining "+ yoj);
	}
    private void empDetails(String name,long mobileNo) {
		System.out.println("Empolyee name " + name);
		System.out.println("Mobile number "+ mobileNo);
	}
    private void empDetails(int salary, String DOB, String Address) {
    	System.out.println("Salary of Employee is " +salary);
    	System.out.println("DOB os Employee is " +DOB);
    	System.out.println("Address of Employee is " +Address);

	}
    public static void main(String[] args) {
		SampleJava p=new SampleJava();
		p.empDetails(100);
		p.empDetails();
		p.empDetails("surya", 8778531564L);
		p.empDetails(1423, 1994);
		p.empDetails(93565, "10.05.1990", "Konur, Dindigul");
	}

}
