package Ex5.Question1_2;

import java.util.Scanner;


public class CanBo {
	private String name;
	private short age;
	private Gender gioiTinh;
	private String diaChi;
	
	public CanBo(){}
	
	public CanBo(String name,short age,Gender gioiTinh,String diaChi){
		this.name = name;
		this.age = age;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}
	
	public String getName() {
		return name;
	}
	public short getAge() {
		return age;
	}
	public Gender getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(byte gioiTinh) {
		if (gioiTinh == 0) {
			this.gioiTinh = Gender.MALE;
		} else if (gioiTinh == 1) {
			this.gioiTinh = Gender.FEMALE;
		} else {
			this.gioiTinh = Gender.UNKNOWN;
		}
	}
	public String getDiaChi() {
		return diaChi;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(short age) {
		this.age = age;
	}
	
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public void input(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập tên: ");
		setName(sc.nextLine());
		System.out.println("Nhập tuổi: ");
		setAge(sc.nextShort());
		System.out.println("Nhập giới tính: (0: Male, 1: Female)");
		setGioiTinh(sc.nextByte());
		System.out.println("Nhập địa chỉ: ");
		setDiaChi(sc.nextLine());
		sc.nextLine();
	}
	
	public void hienThi(){
		System.out.println("Tên cán bộ: " + name);
		System.out.println("Tuổi: "+ age);
		System.out.println("Giới tính: "+ gioiTinh);
		System.out.println("Địa chỉ: "+ diaChi);
	}

	public boolean check(String otherName){
		if(this.name.equals(otherName))
			return true;
		else
			return false;
	}
}
