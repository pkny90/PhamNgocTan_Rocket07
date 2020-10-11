import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		//question4();
		//question3();
		question15();

	}
	
	// Question 3:
	// Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chưa
	// viết hoa chữ cái đầu thì viết hoa lên
	public static void question3() {
		Scanner scanner = new Scanner(System.in);
		java.lang.String name;

		System.out.println("Nhập Tên: ");
		name = scanner.nextLine();

		java.lang.String firstCharacter = name.substring(0, 1).toUpperCase();

		java.lang.String leftCharacter = name.substring(1);

		name = firstCharacter + leftCharacter;

		System.out.println(name);

		scanner.close();
	}

	// Question 4:
	// Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên
	// của người dùng ra
	// VD:
	// Người dùng nhập vào "Nam", hệ thống sẽ in ra
	// "Ký tự thứ 1 là: N"
	// "Ký tự thứ 1 là: A"
	// "Ký tự thứ 1 là: M"
	public static void question4() {
		java.lang.String name;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập tên: ");
		name = scanner.nextLine();

		name = name.toUpperCase();

		for (int i = 0; i < name.length(); i++) {
			System.out.println("Ký tự thứ " + i + " là: " + name.charAt(i));
		}

		scanner.close();
	}
	
	// Question 15: Revert string by word
	// Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng
	// thư viện.
	// Ví dụ: " I am developer " => "developer am I".4
	// Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
	// Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt
	// chuỗi theo dấu cách
	public static void question15() {
		Scanner scanner = new Scanner(System.in);
		java.lang.String str;

		System.out.println("Chuỗi: ");
		str = scanner.nextLine();

		scanner.close();

		str = str.trim();
		str = str.replaceAll("\\s+", " ");

		java.lang.String[] words = str.split(" ");

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
	}






	
	
}
