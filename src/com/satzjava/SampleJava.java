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
    
    private void qual(String qual, double per) {
    	System.out.println("Qualification of Employee is "+qual);
    	System.out.println("Percentage of Marks Scored is "+per);
	}

    public static void main(String[] args) {
		SampleJava p=new SampleJava();
		p.empDetails(100);
		p.empDetails();
		p.empDetails("surya", 8778531564L);
		p.empDetails(1423, 1994);
		p.qual("B.E. Mechanical Engineering", 72.1);
	}

}
