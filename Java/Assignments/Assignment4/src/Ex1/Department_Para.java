package Ex1;

public class Department_Para {
	
	private int departmentId = 0;
	private String departmentName;
	


	public Department_Para(int departmentid, String departmentname) {
		
		departmentId = departmentid ;
		departmentName = departmentname;
	}

	Department_Para department = new Department_Para(departmentId, departmentName);
	Department_Para department1 = new Department_Para(0, "Sale");
}
