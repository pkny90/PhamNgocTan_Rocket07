package Program.java;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Department department1 = new Department("sale", 1);
		Department department2 = new Department("Marketing", 2);
		
		System.out.println("Thông tin phòng ban 1:  ");
		System.out.println("Department Name: " + department1.departmentName);
		System.out.println("ID: " + department1.departmentID);
		System.out.println("\n");
		
		System.out.println("Thông tin phòng ban 2:  ");
		System.out.println("Department Name: " + department2.departmentName);
		System.out.println("ID: " + department2.departmentID);
		System.out.println("\n");
	
		Group group1 = new Group("Java Fresher", 1);
		Group group2 = new Group("C# Fresher", 2);
		
		Account account1 = new Account("Vananh", 1, "NguyenVanAnh", "NguyenVanAnh@gmail.com");
		account1.createDate = new Date("2020/08/20");
		Account account2 = new Account("NgocTan", 2, "PhamNgocTan", "PhamNgocTan@gmail.com");
		account2.createDate = new Date("2020/04/20");
				
		Group[] groupOfAccount1 = {group1, group2} ;
		account1.groups = groupOfAccount1;
		account2.groups = groupOfAccount1;
		
		System.out.println("Thông tin account 1:  ");
		System.out.println("Account Name: " + account1.userName);
		System.out.println("Full Name: " + account1.fullName);
		System.out.println("ID: " + account1.accountID);
		System.out.println("Email: " + account1.email);
		System.out.println("Create Date: " + account1.createDate);
		System.out.println("Group: " + groupOfAccount1[0]);
		System.out.println("Create Date: " + account1.createDate);
		System.out.println("\n");
		
		System.out.println("Thông tin account 2:  ");
		System.out.println("Account Name: " + account2.userName);
		System.out.println("Full Name: " + account2.fullName);
		System.out.println("ID: " + account2.accountID);
		System.out.println("Email: " + account2.email);
		System.out.println("Create Date: " + account2.createDate);
		System.out.println("Group: " + groupOfAccount1[1]);
		System.out.println("\n");
		
		TypeQuestion typeQuestion1 = new TypeQuestion("Essay", 1);
		TypeQuestion typeQuestion2 = new TypeQuestion("Multiple-Choice", 2);
		
		System.out.println("Thông tin câu hỏi 1:  ");
		System.out.println("Loại câu hỏi: " + typeQuestion1.typeName);
		System.out.println("ID: " + typeQuestion1.typeID);
		System.out.println("\n");
	
		System.out.println("Thông tin câu hỏi 2:  ");
		System.out.println("Loại câu hỏi: " + typeQuestion2.typeName);
		System.out.println("ID: " + typeQuestion2.typeID);
		System.out.println("\n");
		
		CategoryQuestion categoryQuestion1 = new CategoryQuestion("Java", 1);
		CategoryQuestion categoryQuestion2 = new CategoryQuestion("ASP.Net", 2);
		
		System.out.println("Thông tin câu hỏi 1:  ");
		System.out.println("Danh mục: " + categoryQuestion1.categoryName);
		System.out.println("ID: " + categoryQuestion1.categoryID);
		System.out.println("\n");
	
		System.out.println("Thông tin câu hỏi 2:  ");
		System.out.println("Danh mục: " + categoryQuestion2.categoryName);
		System.out.println("ID: " + categoryQuestion2.categoryID);
		System.out.println("\n");
		
		Question question1 = new Question("Câu hỏi về Java", 1);
		Question question2 = new Question("Câu hỏi về C#", 2);
		question1.createDate = new Date("2020/06/09");
		question2.createDate = new Date("2020/10/05");

		
		System.out.println("Thông tin câu hỏi 1:  ");
		System.out.println("Danh Mục: " + question1.contentQ);
		System.out.println("ID: " + question1.questionID);
		System.out.println("Create Date: " + question1.createDate);
		question1.Group(1);
		question1.TypeQuestion(1);
		System.out.println("\n");
	
		System.out.println("Thông tin câu hỏi 2:  ");
		System.out.println("Danh Mục: " + question2.contentQ);
		System.out.println("ID: " + question2.questionID);
		System.out.println("Create Date: " + question2.createDate);
		question2.Group(2);
		question2.TypeQuestion(2);
		System.out.println("\n");
		
		Answer answer1 = new Answer("Trả lời 01", 1, true);
		Answer answer2 = new Answer("Trả lời 02", 2, false);
		
		System.out.println("Thông tin câu trả lời 1:  ");
		System.out.println("Nội Dung: " + answer1.contentA);
		System.out.println("ID: " + answer1.answerID);
		System.out.println("Kết Quả " + answer1.isCorrect);
		System.out.println("\n");
		
		System.out.println("Thông tin câu trả lời 2:  ");
		System.out.println("Nội Dung: " + answer2.contentA);
		System.out.println("ID: " + answer2.answerID);
		System.out.println("Kết Quả " + answer2.isCorrect);
		System.out.println("\n");
		
		Exam exam1 = new Exam("Đề thi C#", "VTIQ001", 1, 60);
		Exam exam2 = new Exam("Đề thi PHP", "VTIQ002", 2, 60);
		exam1.createDate = new Date("2020/09/09");
		exam2.createDate = new Date("2020/11/05");
		
		System.out.println("Thông tin bài KT 1:  ");
		System.out.println("Nội Dung: " + exam1.title);
		System.out.println("ID: " + exam1.examID);
		System.out.println("Code: " + exam1.code);
		System.out.println("Duration " + exam1.duration);
		System.out.println("Create Date: " + exam1.createDate);
		exam1.Group(5);
		exam1.CategoryQuestion(1);
		System.out.println("\n");
		
		System.out.println("Thông tin bài KT 2:  ");
		System.out.println("Nội Dung: " + exam2.title);
		System.out.println("ID: " + exam2.examID);
		System.out.println("Code: " + exam2.code);
		System.out.println("Duration " + exam2.duration);
		System.out.println("Create Date: " + exam2.createDate);
		exam2.Group(1);
		exam2.CategoryQuestion(10);
		System.out.println("\n");
		
		ExamQuestion examQ1 = new ExamQuestion();
		ExamQuestion examQ2 = new ExamQuestion();
		examQ1.Question(5);
		examQ1.Exam(1);
		examQ2.Question(10);
		examQ1.Exam(2);
	}

}
