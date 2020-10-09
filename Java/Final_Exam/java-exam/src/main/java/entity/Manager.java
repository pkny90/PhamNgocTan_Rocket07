package entity;

public class Manager extends User {
	private int expInYear;
	private int projectID;

	public Manager() {
	}

	public Manager(int id, String fullName, String email, String password, int expInYear,int projectID) {
		super(id, fullName, email, password);
		this.expInYear = expInYear;
		this.projectID = projectID;
	}

	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}

	
	public int getProjectID() {
		return projectID;
	}

	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}

	@Override
	public String toString() {
		return "Manager{" + "id=" + getId() + ", name='" + getFullName() +", email= " + getEmail() + ", ProjectID = "+ getProjectID() + ", ExpInYear = "+ getExpInYear() +'\'' + '}';
	}

}
