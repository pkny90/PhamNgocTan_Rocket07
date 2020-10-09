package back_end.repository;

import java.sql.SQLException;
import java.util.List;

import entity.Employee;
import entity.Manager;

public interface ILoginRepository {



	

	List<Employee> showProjectByEmployee(int id) throws SQLException;

	List<Manager> showProjectByManager(int id) throws SQLException;

	List<Manager> SelectManagerID() throws SQLException;

	boolean isLogInEmployee(String email1, String pass1) throws SQLException;

	boolean isLogInManager(String email1, String pass1) throws SQLException;

}
