package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;

import back_end_entity.Student;

public class FileUtils {
	
	/**
	 * Mổ tả về mục đích của function, mô tả các trường hợp cụ thể bên trong code
	 * @param std chỉ rõ tưng thuộc tính là gì
	 * @param i :số thứ tự
	 * @param filePath: đường dẫn tới file
	 * throws exception: có thể có ngoại lệ xảy ra
	 */
	// Hàm tiện ích sẽ dùng static
	private static Writer txtWrite = null;
	private static FileReader txtRead = null;
	private static int c = -1;
	private static BufferedReader bufRead;
	public static void writeStudent (Student std, int sốThứTự, String filePath) throws IOException{
		txtWrite = new FileWriter(new File(filePath), true); // crtl + cách ---> chọn append, để ko bị ghi đè text
		txtWrite.write("Student" + sốThứTự + ":" + std.toString() + "\n"); // Những thông tin bên trong student thì ta biết ở class Student
		txtWrite.close();
	}
	
	
	public static void writeStudentList (Student[] stds, String filePath) throws IOException{
		for (int i = 0; i < stds.length; i++) {
			writeStudent(stds[i], i+1, filePath);
		}
	}
	
/*	Cách viết khác của Student[]
 * public static void writeStudentList (ArrayList<Student> stds, String filePath) throws IOException{
		for (int i = 0; i < stds.length; i++) {
			writeStudent(stds.get(i), i+1, filePath);
		}
	}*/
	public static void readStudent (String filePath) throws IOException{

		
		while (( c = txtRead.read()) != -1)
		{
			System.out.println((char) c);
		}
		
		txtRead.close();
	}
	
		/**
		 * Đọc tất cả các Student từ file và trả về 1 danh sách Student
		 * filePath: đường dẫn tới file
		 * @throws IOException 
		 */
		public static ArrayList<Student> readStudentsIntoArray(String filePath) throws IOException
		{
			ArrayList<Student> stdList = new ArrayList<Student>();
			txtRead = new FileReader(new File(filePath));
			bufRead = new BufferedReader(txtRead);
			String line = null;
			while ((line = bufRead.readLine()) != null)
			{
				Student currentStudent = convertStringToStudent(line);
				stdList.add(currentStudent);
			}
			return stdList;
		}
		
		private static Student convertStringToStudent(String line)
		{
			String id = null;
			String name = null;
			// Phân tích cú pháp text để lấy đc id và nam
			// Substring(beginIndex, endIndex: "Hieu".suctring(1,4) <=> "yeu"
			// beginIndIndex của id là sau dấu: 1 ký tự
			int beginIndexOfID = line.indexOf(":") + 1; // Bắt chuỗi sau dấu :
			int endIndexOfID = line.indexOf("-");		// Bắt chuỗi trước dấu -
			int beginIndexOfName =  endIndexOfID + 1; // Chuỗi tiếp theo sẽ bắt đầu từ ký tự tiếp theo của chuỗi trước
			id = line.substring(beginIndexOfID, endIndexOfID);
			name = line.substring(beginIndexOfName);
			return new Student(id,name);
		
		}
		
}
