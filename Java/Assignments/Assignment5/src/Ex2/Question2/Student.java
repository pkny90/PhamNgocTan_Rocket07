package Ex2.Question2;

import java.time.LocalDate;
import java.util.Scanner;



public class Student extends Person{
	private int maSV;
	private float diemTB;
	private String email;
	
	public Student(String name, Gender gender, LocalDate ngaySinh, String diaChi,int maSV,float diemTB,String email) {
		super(name, gender, ngaySinh, diaChi);
		this.maSV = maSV;
		this.diemTB = diemTB;
		this.email = email;
	}
	
	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void inputInfo() {
		Scanner sc = new Scanner(System.in);
		super.inputInfo();
		System.out.println("Nhập mã SV: ");
		setMaSV(sc.nextInt());
		System.out.println("Nhập điểm TB: ");
		setDiemTB(sc.nextFloat());
		System.out.println("Email: ");
		setEmail(sc.nextLine());
		sc.nextLine();
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Mã sinh viên: " + getMaSV());
		System.out.println("Điểm TB: " + getDiemTB());
		System.out.println("Email: " + getEmail());
	}
	
	public void check(){
		if(getDiemTB() >= 8.0f ){
			System.out.println("Học sinh " + getName() + " được học bổng!");
		}
	}
}
