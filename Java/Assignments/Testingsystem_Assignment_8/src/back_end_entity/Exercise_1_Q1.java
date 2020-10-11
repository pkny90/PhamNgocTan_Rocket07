package back_end_entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Scanner;

import common.ScannerUtils;
import common.Student;

public class Exercise_1_Q1 {

	private ArrayList<Student> students;
	private Scanner scanner;

	public Exercise_1_Q1() {
		scanner = new Scanner(System.in);
		students = new ArrayList<>();
		inputStudents();
	}

	private void inputStudents() {
		students.add(new Student("Khang"));
		students.add(new Student("Quân"));
		students.add(new Student("Kiên"));
		students.add(new Student("Duy"));
		students.add(new Student("Thăng"));
		students.add(new Student("Bach"));

	}

	public void printStudent() {
		for (Student student : students) {
			System.out.println(student);
		}
	}

	// In ra tổng số phần tử của students
	public void getAmountOfStudent() {
		System.out.println("Student Amount: " + students.size());
	}

	// Lấy phần tử thứ 4 của students
	public void getIndex4OfStudent() {
		System.out.println("Student thư 4: ");
		System.out.println(students.get(3));
	}

	// In ra phần tử đầu và phần tử cuối của students
	public void printFirstAndLastStudent() {
		System.out.println(students.get(0));

		System.out.println(students.get(students.size() - 1));
	}

	// Thêm 1 phần tử vào vị trí đầu của students
	public void addStudentIntoFirstStudents() {
		students.add(0, new Student("Kiên"));

		System.out.println("List Students after adding: ");
		printStudent();
	}

	// Thêm 1 phần tử vào vị trí cuối của students
	public void addStudentIntoLastStudents() {
		students.add(students.size(), new Student("Quân"));

		System.out.println("List Students after adding: ");
		printStudent();
	}

	// Đảo ngược vị trí của students
	public void reverseStudents() {
		// reverse students
		Collections.reverse(students);

		System.out.println("List students after reverse: ");
		printStudent();
	}

	// Tạo 1 method tìm kiếm student theo id
	public void findStudentById() {
		System.out.println("Nhap id can tim ");
		int id = ScannerUtils.inputIntWithString(scanner);

		for (Student student : students) {
			if (student.getId() == id) {
				System.out.println(student);
			}
		}
	}

	// Tạo 1 method tìm kiếm student theo name
	public void findStudentByName() {
		System.out.println("Nhap ten can tim ");
		String name = ScannerUtils.inputStringWithString(scanner);

		for (Student student : students) {
			if (student.getName().equals(name)) {
				System.out.println(student);
			}
		}
	}

	// Tạo 1 method để in ra các student có trùng tên
	public void findDuplicateStudent() {
		for (int i = 0; i < students.size(); i++) {
			for (int j = i + 1; j < students.size(); j++) {
				// So sánh tên các student
				if (students.get(i).getName().equals(students.get(j).getName())) {
					System.out.println("Các student trùng tên ");
					System.out.println(students.get(i));
					System.out.println(students.get(j));
				}
			}
		}
	}

	// Xóa name của student có id = 2;
	public void deleteNameStudentId2() {
		for (Student student : students) {
			if (student.getId() == 2) {
				student.setName(null);
			}
		}

		System.out.println("Danh sách student sau khi xóa student có id = 2 ");
		printStudent();
	}

	// Delete student có id = 5;
	public void deleteStudentId5() {
		for (Student student : students) {
			if (student.getId() == 5) {
				students.remove(student);
			}
		}
	}

	// Tạo 1 ArrayList tên là studentCopies và add tất cả students vào
	// studentCopies
	public void addAllStudentsToStudentCopies() {
		ArrayList<Student> studentCopies = new ArrayList<>();
		studentCopies.addAll(students);
	}
}
