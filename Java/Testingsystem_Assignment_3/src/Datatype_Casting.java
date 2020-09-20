import java.util.Scanner;

//    Exercise 1: Datatype Casting
public class Datatype_Casting {

	// Ở đây Account không có thuộc tính Salary nên không add vào
	public static void main(String[] args) {
		
		 question23();
		
	}

	// Question 2:
	// Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm
	// số 0 ở đầu cho đủ 5 chữ số)

	// Question 3:
	// Lấy 2 số cuối của số ở Question 2 và in ra.
	// Gợi ý:
	// Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
	// Cách 2: chia lấy dư số đó cho 100
	public static void question23() {
		int min = 0;
		int max = 99999;
		int a = (int) (Math.random() * max) + min;
		
        if (a < 10000) {
   		 	System.out.printf("===Question2======\n");
   		 	System.out.println("Số ngẫu nhiên: " +"0"+ a);
        } else {
   		 	System.out.printf("===Question2======\n");
   		 	System.out.println("Số ngẫu nhiên: " + a);
        }
		/*
		 * while (a < 10000) { a = a * 10; } 
		 * System.out.printf("===Question2======\n");
		 * System.out.println("Số ngẫu nhiên: " +"0"+ a);
		 */

		System.out.println("======Question3=======");
		String b = String.valueOf(a);
		System.out.println("Hai số cuối: " + b.substring(3));
	}

}
