package Ex5.Question4;

import java.util.Scanner;

public class TapChi extends ThuVien {
	private int soPhatHanh;
	private byte thangPhatHanh;

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public byte getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(byte thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}

	public TapChi(String maTaiLieu, String NXB, int soBanPhatHanh, int soPhatHanh, byte thangPhatHanh) {
		super(maTaiLieu, NXB, soBanPhatHanh);
		this.soPhatHanh = soBanPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}
	
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.println("Số phát hành: ");
		String sph = sc.nextLine();
		System.out.println("Tháng phát hành: ");
		byte thang = sc.nextByte();
		sc.nextLine();
		this.setSoPhatHanh(thang);
		this.setThangPhatHanh(thang);
		
	}
	
	@Override
	public void output() {
		super.output();
		System.out.println("Số phát hành: " + this.soPhatHanh);
		System.out.println("Tháng phát hành: "+ this.thangPhatHanh);
	}

}
