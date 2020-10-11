package back_end_entity;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import common.Student;



public class Exercise_1_Q2 {
	
	public void question2() {

		System.out.println("Thứ tự sớm nhất tới muộn nhất ");
		printStudentComeEarly();

		System.out.println("Thứ tự muộn nhất tới sớm nhất ");
		printStudentComeLate();
	}
	
	public void printStudentComeEarly() {
		// init data
		Stack<Student> students = new Stack<>();
		students.push(new Student("Nguyễn Văn A"));
		students.push(new Student("Trần Văn Nam"));
		students.push(new Student("Nguyễn Văn Huyên"));
		students.push(new Student("Nguyễn Văn Nam"));

		// Sử dụng pop để lấy Data Element trong stack
		System.out.println(students.pop());
		System.out.println(students.pop());
		System.out.println(students.pop());
		System.out.println(students.pop());
	}

	public void printStudentComeLate() {
		// init data
		Queue<Student> students = new LinkedList<>();
		students.add(new Student("Nguyễn Văn A"));
		students.add(new Student("Trần Văn Nam"));
		students.add(new Student("Nguyễn Văn Huyên"));
		students.add(new Student("Nguyễn Văn Nam"));

		// Sử dụng poll để lấy Data Element trong stack
		System.out.println(students.poll());
		System.out.println(students.poll());
		System.out.println(students.poll());
		System.out.println(students.poll());

	}
}
