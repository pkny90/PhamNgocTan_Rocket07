import java.util.Scanner;

public class Ex5 {
	static Scanner sc = new Scanner(System.in);
	
	//Question 1: Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương	trình
	public static void Q1(){		
		int a,b,c;
		System.out.println("Nhập vào ba số nguyên dương: ");
		System.out.println("Số thứ 1: ");
		a = sc.nextInt();
		System.out.println("Số thứ 2: ");
		b = sc.nextInt();
		System.out.println("Số thứ 3: ");
		c = sc.nextInt();
		System.out.println("Các số vừa nhập là: ");
		System.out.println(" a = "+ a);
		System.out.println(" b = "+ b);
		System.out.println(" c = "+ c);
	}
	
	//Question 2: Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
	public static void Q2(){
		System.out.println("Nhập vào hai số thực");
		float a,b;
		System.out.println("Số thứ 1: ");
		a = sc.nextFloat();
		System.out.println("Số thứ 2: ");
		b = sc.nextFloat();
		System.out.println("Các số vừa nhập là: ");
		System.out.printf("a = %.1f\n",a);
		System.out.printf("b = %.1f\n",a);
	}
	
	//Question 3: Viết lệnh cho phép người dùng nhập họ và tên
	public static void Q3(){
		System.out.println("Nhập họ và tên: ");
		String str = sc.nextLine();
		System.out.println("Họ tên là : "+ str);
	}
	
	public static void Q4(){

	}
	
	public static void Q5(){

	}
	
	public static void Q6(){

	}
	
	//Question 7: Nhập số chẵn từ console
	public static void Q7(){
		int a= 0;
		do{
			a = sc.nextInt();
			if(a%2 != 0)
				System.out.println("Nhập lại");
		}while(a%2 != 0);
		System.out.println("Số vừa nhập là: "+ a);
	}
	
	//
	public static void main(String[] args) {
		
	}
}
