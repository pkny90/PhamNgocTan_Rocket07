package back_end.service;

import java.sql.SQLException;
import java.util.List;

import entity.Department;

public interface IDepartmentService
{
	public List<Department> showDepartmentList() throws SQLException;

	public boolean insertDepartmment(String name) throws SQLException;
}
