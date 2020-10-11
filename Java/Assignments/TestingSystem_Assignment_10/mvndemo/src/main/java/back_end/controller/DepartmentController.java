package mvndemo.src.main.java.back_end.controller;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import back_end.service.DepartmentService;
import back_end.service.IDepartmentService;
import entity.Department;

public class DepartmentController {

	private IDepartmentService iDepartmentService;
	
	public DepartmentController() throws FileNotFoundException, IOException
	{
		iDepartmentService = new DepartmentService();
	}

	public List<Department> showDepartmentList() throws SQLException {
		return iDepartmentService.showDepartmentList();
		
	}

	public boolean insertDepartmment(String name) throws SQLException {
		return iDepartmentService.insertDepartmment(name);
		
	}
	
}
