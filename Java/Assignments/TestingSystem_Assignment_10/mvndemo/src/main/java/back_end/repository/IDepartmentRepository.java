package back_end.repository;

import java.sql.SQLException;
import java.util.List;

import entity.Department;

public interface IDepartmentRepository {
	List<Department> showDepartmentList() throws SQLException;

	boolean insertDepartmment(String name) throws SQLException;

}
