package back_end.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.entiy.Account;

import back_end.service.ILoginService;
import back_end.service.LoginService;
import entity.Employee;
import entity.Manager;

public class LoginController {
	
	private static ILoginService iLoginService;
	


	public LoginController() throws FileNotFoundException, IOException
	{
		iLoginService = new LoginService();
	}


	public List<Employee> showProjectByEmployee(int id) throws SQLException {
		// TODO Auto-generated method stub
		return iLoginService.showProjectByEmployee(id);
	}


	public List<Manager> showProjectByManager(int id) throws SQLException {
		// TODO Auto-generated method stub
		return iLoginService.showProjectByManager(id);
	}


	public List<Manager> SelectManagerID() throws SQLException {
		// TODO Auto-generated method stub
		return iLoginService.SelectManagerID();
	}


	public boolean isLogInEmployee(String email, String pass) throws SQLException {
		// TODO Auto-generated method stub
		return iLoginService.isLogInEmployee(email, pass);
	}


	public boolean isLogInManager(String email, String pass) throws SQLException {
		// TODO Auto-generated method stub
		return iLoginService.isLogInManager(email, pass);
	}

}
