package Ex5.Question3;

public class HighSchoolStudent extends Student {
	private String clazz;
	private String desiredUniversity;
	
	public HighSchoolStudent(String name, short id,String clazz,String desiredUniversity) {
		super(name, id);
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;
	}
	@Override
	public String toString() {
		return "ID: "+ getId() + " Name: " + getName() + " Lớp: " + clazz + " Trường: "+ desiredUniversity;
	}
}
