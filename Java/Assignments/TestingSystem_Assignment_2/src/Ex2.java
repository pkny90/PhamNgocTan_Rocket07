import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import java.util.Scanner;

public class Ex2 {
	
	//Question 1: Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số nguyên đó
	public static void Q1(int x){
		System.out.printf("%d\n",x);
	}
	
	//Question 2: Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out
	//printf để in ra số nguyên đó thành định dạng như sau: 100,000,000
	public static void Q2(int x){
		System.out.printf("%,d\n",x);
	}
	
	//Question 3: Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf
	//để in ra số thực đó chỉ bao gồm 4 số đằng sau
	public static void Q3(double x){
		System.out.printf("%.4f\n",x);
	}
	
	/*
	 * Question 4: Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh
	 * đó theo định dạng như sau: Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên
	 * console như sau: Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.
	 */
	public static void Q4(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Họ và tên: " );
		String str = sc.nextLine();
		System.out.printf("Tên tôi là %s và tôi đang độc thân \n", str);
	}
	
	/*
	 * Question 5: Lấy thời gian bây giờ và in ra theo định dạng sau: 24/04/2020 11h:16p:20s
	 */
	public static void Q5(){
		String pattern = "dd/MM/yyyy hh:mm:ss";
	    SimpleDateFormat sd = new SimpleDateFormat(pattern);
	    String date = sd.format(new Date());
	    System.out.println(date);
	}
	
	
	/*
	 * Question 6: in ra thông tin account (như Question 8 phần FOREACH) theo định
	 * dạng table (giống trong Database)
	 */
/*	public static void Q6(){
		System.out.println("ID   email                  Username         FullName         departmentID        CreateDate ");
		System.out.printf("%s    %s     %s          %s   %s %s\n",acc1.ID,acc1.email,acc1.userName,acc1.fullName,acc1.departmentID,acc1.createDate);

	}
*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1(5);
		Q2(100000000);
		Q3(3.12125);
		Q5();
		Q4();
	}

}
