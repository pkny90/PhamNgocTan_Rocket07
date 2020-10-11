package back_end_entity;

import java.io.Serializable;

public class Student  implements Serializable{

	private static final long serialVersionUID = 1123213L;
	private String id;
	private String name;
	
	public String getId() {
		return id;
	}
	
	

	
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}




	public String toString ()
	{
		return getId() + "-" + getName();
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
