package Ex2.Question1;

public class main {
	
	private Student[] st = new Student[10];
	
	public static void main(String[] args) {
		
		Student[] st = new Student[10];
		st[0] = new Student(1,"Tân",1);
		st[1] = new Student(2,"Hoàng",1);
		st[2] = new Student(3,"Tú",2);
		st[3] = new Student(4,"Tùng",3);
		st[4] = new Student(5,"Tuấn",1);
		st[5] = new Student(6, "Tú",2);
		st[6] = new Student(7,"Mai",3);
		st[7] = new Student(8,"Thúy",3);
		st[8] = new Student(9,"Quỳnh",2);
		st[9] = new Student(10,"Trâm",1);
		for(Student std : st ){
			std.diemDanh();
		}
		
		for(Student std : st){
			if(std.getGroup() == 1)
				std.hocBai();
		}
		
		for(Student std : st){
			if(std.getGroup() == 2)
				std.donVS();
		}
	}
}
