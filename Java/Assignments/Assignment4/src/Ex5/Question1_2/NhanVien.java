package Ex5.Question1_2;

import java.util.Scanner;

public class NhanVien extends CanBo{
	private String congViec;
	public NhanVien(String name, short age, Gender gioiTinh, String diaChi,String congViec) {
		super(name, age, gioiTinh, diaChi);
		this.congViec = congViec;
	}
	public NhanVien(){}

	public String getCongViec() {
		return congViec;
	}
	
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.println("Nhập công việc: ");
		congViec = sc.nextLine();
	}
	
	@Override
	public void hienThi() {
		super.hienThi();
		System.out.println("Ngành đào tạo: "+congViec);
	}
}
