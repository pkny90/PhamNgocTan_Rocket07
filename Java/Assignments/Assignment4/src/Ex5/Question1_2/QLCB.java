package Ex5.Question1_2;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
	private ArrayList<CanBo> canBos;
	
	public QLCB(){
		canBos = new ArrayList<>();
	}
	
	public void addCanBo(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số cán bộ cần nhập: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			CanBo canBo = new CanBo();
		System.out.println("Cán bộ cần nhập là:\n 0.Công nhân\n 1.Kỹ sư\n 2.Nhân viên ");
		byte c = sc.nextByte();
		switch(c){
			case 0:
				canBo = new CongNhan();
				canBo.input();
				break;
			case 1:
				canBo = new KySu();
				canBo.input();
				break;
			case 2:
				canBo = new NhanVien();
				canBo.input();
				break;
			default:
				System.out.println("Nhập lại");
				i--;
				break;
			}
		canBos.add(canBo);
		}
	}
	
	public void show(){
		System.out.println("Tổng số cán bộ: " + canBos.size());
		for(CanBo canBoa : canBos){
			canBoa.hienThi();
		}
	}
		
	public void search(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên mà bạn muốn tìm: ");
		String name = sc.nextLine();
		for(CanBo canBoa : canBos){
			if(canBoa.getName().equals(name)){
				canBoa.hienThi();
			}
		}
	}
	
	public void delete(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên mà bạn muốn xóa: ");
		String name = sc.nextLine();
		for(CanBo canBoa : canBos){
			if(canBoa.getName().equals(name)){
				//canBos.removeIf(canBo -> canBoa.getName().equals(name));
			}
		}
	}
}
