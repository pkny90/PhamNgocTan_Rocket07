package back_end.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import back_end.repository.DepartmentRepository;
import back_end.repository.IDepartmentRepository;
import entity.Department;

public class DepartmentService implements IDepartmentService {

	private IDepartmentRepository iDep_Repo;


	@Override
	public List<Department> showDepartmentList() throws SQLException {
		// TODO Auto-generated method stub
		return iDep_Repo.showDepartmentList();
	}
	
	
	public DepartmentService() throws FileNotFoundException, IOException {
		iDep_Repo = new DepartmentRepository();
	}

	// in + ctrl + cách
	@Override
	public boolean insertDepartmment(String name) throws SQLException {
		// TODO Auto-generated method stub
		return iDep_Repo.insertDepartmment(name);
	}



}
