package back_end.service;

import java.sql.SQLException;
import java.util.List;

import entity.Employee;
import entity.Manager;

public interface ILoginService {



	

	List<Employee> showProjectByEmployee(int id) throws SQLException;

	List<Manager> showProjectByManager(int id) throws SQLException;

	List<Manager> SelectManagerID() throws SQLException;



	boolean isLogInManager(String email, String pass) throws SQLException;

	boolean isLogInEmployee(String email, String pass) throws SQLException;

}
