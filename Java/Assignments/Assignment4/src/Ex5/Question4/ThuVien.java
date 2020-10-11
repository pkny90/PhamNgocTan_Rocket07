package Ex5.Question4;

import java.util.Scanner;

public class ThuVien {
	private String maTaiLieu;
	private String NXB;
	private int soBanPhatHanh;
	
	public ThuVien(){}
	
	
	public String getMaTaiLieu() {
		return maTaiLieu;
	}


	public void setMaTaiLieu(String maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}


	public String getNXB() {
		return NXB;
	}


	public void setNXB(String nXB) {
		NXB = nXB;
	}


	public int getSoBanPhatHanh() {
		return soBanPhatHanh;
	}


	public void setSoBanPhatHanh(int soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}


	public ThuVien(String maTaiLieu,String NXB,int soBanPhatHanh){
		this.maTaiLieu = maTaiLieu;
		this.NXB = NXB;
		this.soBanPhatHanh = soBanPhatHanh;
	}
	
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Mã tài liệu: ");
		String ma = sc.nextLine();
		System.out.println("NXB: ");
		String nxb = sc.nextLine();
		System.out.println("Số bản phát hành: ");
		int count = sc.nextInt();
		sc.nextLine();
		this.setMaTaiLieu(ma);
		this.setNXB(nxb);
		this.setSoBanPhatHanh(count);
	}
	
	public void output(){
		System.out.println("Mã tài liệu: " + this.getMaTaiLieu());
		System.out.println("NXB: " + this.NXB);
		System.out.println("Số bản phát hành: "+ this.soBanPhatHanh);
	}
	

	public boolean check(String maTaiLieu){
		if(this.maTaiLieu.equals(maTaiLieu))
			return true;
		else
			return false;
	}
}
