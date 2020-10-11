package front_end;

import java.io.IOException;
import java.util.ArrayList;

import back_end_entity.Student;
import common.FileUtils;

public class MainProgram {

	public static void main(String[] args) throws IOException {
		// Nhập
		// Viết
		// Đọc
		// In
		Student s1 = new Student("1", "Hưng");
		Student s2 = new Student("2", "Hiếu");
		Student s3 = new Student("3", "Tân");
		Student[] stdList = {s1,s2,s3};
		String filePath = ("C:\\Python]\\Halo\\Hello\\Question5.txt");
		
		FileUtils.writeStudentList(stdList, filePath);
		ArrayList<Student> stds = FileUtils.readStudentsIntoArray(filePath);
		for (Student student : stds)
		{
			System.out.println(student.toString());
		}
	}
	

}
