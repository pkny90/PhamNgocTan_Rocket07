package front_end;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import back_end_entity.Exercise_2_Q1;

public class Program_2 {
	public static void main(String[] args)  {
		
		Question2_1();

	}
	
	public static void Question2_1()
	{
	  ArrayList<Exercise_2_Q1> list = new ArrayList<Exercise_2_Q1>(); 
	  list.add(new Exercise_2_Q1("Tan", 8, 01, LocalDate.parse("1991-01-01"))); 
	  list.add(new Exercise_2_Q1("Hieu",7, 01, LocalDate.parse("1991-02-01"))); 
	  list.add(new Exercise_2_Q1("Dung",6, 03, LocalDate.parse("1991-02-01"))); 
	  list.add(new Exercise_2_Q1("Hung",3, 02, LocalDate.parse("1991-02-01"))); 
	  list.add(new Exercise_2_Q1("Hoa",2, 01, LocalDate.parse("1991-02-01"))); 
	  list.add(new Exercise_2_Q1("Huyen",2, 01, LocalDate.parse("1991-01-01")));
	  
	  Collections.sort(list);
	  
	}
}
