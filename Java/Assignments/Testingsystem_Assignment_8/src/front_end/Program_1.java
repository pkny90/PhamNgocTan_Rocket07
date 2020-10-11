package front_end;

import java.util.HashMap;
import java.util.Map;

import back_end_entity.Exercise_1_Q1;
import back_end_entity.Exercise_1_Q2;

public class Program_1 {

	public static void main(String[] args)  {
		question1();
		
		Exercise_1_Q2 stackAndQueue = new Exercise_1_Q2();
		stackAndQueue.question2();
		
		Map();
	}

	public static void question1()  {

		Exercise_1_Q1 list = new Exercise_1_Q1();

		// a
		list.getAmountOfStudent();

		// b
		list.getIndex4OfStudent();

		// c
		list.printFirstAndLastStudent();

		// d
		list.addStudentIntoFirstStudents();

		// e
		list.addStudentIntoLastStudents();

		// f
		list.reverseStudents();

		// g
		list.findStudentById();

		// h
		list.findStudentByName();

		// i
		list.findDuplicateStudent();

		// j
		list.deleteNameStudentId2();
		
		// k
	//	list.deleteStudentId5();
		
		//l
	//	list.addAllStudentsToStudentCopies();
	}
	
	public static void Map()
	{
		Map<Integer, String> students = new HashMap<>();
		students.put(1, "Thăng");
		students.put(2, "Quân");
		students.put(3, "Kiên");
		students.put(4, "Duy");
		students.put(5, "Bach");

		for (Map.Entry<Integer, String> entry : students.entrySet()) {
			System.out.println("ID: " + entry.getKey() + " / " + "Name: " + entry.getValue());
		}
	}

}
