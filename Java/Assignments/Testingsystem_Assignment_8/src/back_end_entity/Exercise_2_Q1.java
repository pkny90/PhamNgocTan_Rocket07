package back_end_entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import common.Student;


public class Exercise_2_Q1 implements Comparable <Exercise_2_Q1> {
	private String name;
	private int score;
	private int id;
	private LocalDate birth_day;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public LocalDate getBirth_day() {
		return birth_day;
	}


	public void setBirth_day(LocalDate birth_day) {
		this.birth_day = birth_day;
	}


	public Exercise_2_Q1(String name, int score, int id, LocalDate birth_day) {
		super();
		this.name = name;
		this.score = score;
		this.id = id;
		this.birth_day = birth_day;
	}


	@Override
	public int compareTo(Exercise_2_Q1 other) {
		
		if (this.name.compareTo(other.getName()) > 0)
		{
			return 1;
		} else if (this.name.compareTo(other.getName()) <0)
		{
			return -1;
		} else {
		return 0;
	}
}
	}
