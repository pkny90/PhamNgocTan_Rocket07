package Ex5.Question1_2;

import java.util.Scanner;

public class KySu extends CanBo{
	private String nganhDaoTao;
	
	public KySu(String name, short age, Gender gioiTinh, String diaChi,String nganhDaoTao) {
		super(name, age, gioiTinh, diaChi);
		this.nganhDaoTao = nganhDaoTao;
	}
	public KySu(){}
	

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}
	
	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.println("Nhập ngành đào tạo: ");
		nganhDaoTao = sc.nextLine();
	}
	
	@Override
	public void hienThi() {
		super.hienThi();
		System.out.println("Ngành đào tạo: "+nganhDaoTao);
	}
}
