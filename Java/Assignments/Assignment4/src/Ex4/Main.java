package Ex4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student s = new Student("Dzung","HN");
		Scanner sc = new Scanner(System.in);
		byte score;
		System.out.println("Nhập điểm h�?c lực");
		do{
			score = sc.nextByte();
			if(score >  10 && score < 0)
				System.out.println("Nhập lại");
		}while(score >  10 && score < 0);
		s.setScore(score);
		s.info();
		
		Circle c = new Circle(1.5d,"Blue");
		c.getArea();
		System.out.println(c);
		
	}

}
