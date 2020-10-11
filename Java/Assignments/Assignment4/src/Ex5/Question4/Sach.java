package Ex5.Question4;

import java.util.Scanner;

public class Sach extends ThuVien {
	private String tacGia;
	private int soTrang;
	
	public Sach() {
	}

	public Sach(String maTaiLieu, String NXB, int soBanPhatHanh, String tacGia,int soTrang) {
		super(maTaiLieu, NXB, soBanPhatHanh);
		this.tacGia = tacGia;
		this.soTrang = soTrang;
	}
	
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.println("Tên tác giả: ");
		String tg = sc.nextLine();
		System.out.println("Số trang: ");
		int st = sc.nextInt();
		sc.nextLine();
		this.setTacGia(tg);
		this.setSoTrang(st);
	}

	public String getTacGia() {
		return tacGia;
	}

	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	
	@Override
	public void output() {
		super.output();
		System.out.println("Tác giả: " + this.getTacGia());
		System.out.println("Số trang: " + this.getSoTrang());
	}
	
}
