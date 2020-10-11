package Ex2.Question2;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
	private String name;
	private Gender gender;
	private LocalDate ngaySinh;
	private String diaChi;
	
//	public Person(){}
	
	public Person(String name, Gender gender,LocalDate ngaySinh, String diaChi){
		this.name = name;
		this.gender = gender;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(byte gioiTinh) {
		if (gioiTinh == 0) {
			this.gender = Gender.MALE;
		} else if (gioiTinh == 1) {
			this.gender = Gender.FEMALE;
		} else {
			this.gender = Gender.UNKNOWN;
		}
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public void inputInfo(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		setName(sc.nextLine());
		System.out.println("Giới tính: (0-MALE,1-FEMALE)");
		setGender(sc.nextByte());
		System.out.println("Ngày sinh: ");
		setNgaySinh(LocalDate.now());
		System.out.println("Địa chỉ: ");
		setDiaChi(sc.nextLine());
		sc.nextLine();
	}
	
	public void showInfo(){
		System.out.println("Tên: " + getName());
		System.out.println("Giới tính: " + getGender());
		System.out.println("Ngày sinh: " + getNgaySinh());
		System.out.println("Địa chỉ: " + getDiaChi());
	}
}
