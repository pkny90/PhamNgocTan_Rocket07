package mvndemo.src.main.java.front_end;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import back_end.controller.DepartmentController;
import entity.Department;

public class User_interface {

	public static void main(String[] args) {
		
		// Question 1
		try {
			try {
				showDepartmentList();
				insertDepartmment("DepartmentName");
				
			} catch (IOException e) {
				System.out.println("Errors");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private static void showDepartmentList() throws SQLException, FileNotFoundException, IOException {
		DepartmentController dep_contr = new DepartmentController();
		List<Department> departmentList = dep_contr.showDepartmentList();
		for (Department department : departmentList) {
			System.out.println(department.toString());
		}
		
	}
	
	private static void insertDepartmment(String name) throws SQLException, FileNotFoundException, IOException {
		DepartmentController dep_contr = new DepartmentController(); 
		dep_contr.insertDepartmment(name);
	}

}
