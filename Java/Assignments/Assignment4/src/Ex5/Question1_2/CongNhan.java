package Ex5.Question1_2;

import java.util.Scanner;

public class CongNhan extends CanBo {
	private byte level;
	public CongNhan(){}
	
	public CongNhan(String name, short age, Gender gioiTinh, String diaChi,byte level) {
		super(name, age, gioiTinh, diaChi);
		this.level = level;
	}

	
	public void setLevel(byte level) {
		this.level = level;
	}

	public byte getLevel() {
		return level;
	}
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.println("Nhập level(1-10): ");
		do{
			level = sc.nextByte();
			if(level < 1 || level >10){
				System.out.println("Nhập lại level (1-10)");
			}
		}while(level < 1 || level >10);
	}
	
	@Override
	public void hienThi() {
		// TODO Auto-generated method stub
		super.hienThi();
		System.out.println("Level: "+ level);
	}
}
