package Ex6.Question2_3;

import java.util.Scanner;

public abstract class User {
	private String name;
	private double salaryRatio;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalaryRatio() {
		return salaryRatio;
	}
	public void setSalaryRatio(double salaryRatio) {
		this.salaryRatio = salaryRatio;
	}
	
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		String name = sc.nextLine();
		System.out.println("Nhập hệ số: ");
		double sr = sc.nextDouble();
		sc.nextLine();
		this.setName(name);
		this.setSalaryRatio(sr);
	}
	
	public void displayInfo(){
		System.out.println("Tên: " + getName());
		System.out.println("Hệ số lương: " + getSalaryRatio());
	}
	
	public abstract void calculatePay();
}
