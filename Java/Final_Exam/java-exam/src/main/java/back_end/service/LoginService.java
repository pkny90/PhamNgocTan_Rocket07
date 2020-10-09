package back_end.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import Utils.ScannerUtils;
import back_end.repository.ILoginRepository;
import back_end.repository.LoginRepository;
import entity.Employee;
import entity.Manager;

public class LoginService implements ILoginService {
	
	private ILoginRepository iLoginRepository;
	
	public LoginService () throws FileNotFoundException, IOException
	{
		iLoginRepository = new LoginRepository();
	}


	@Override
	public List<Employee> showProjectByEmployee(int id) throws SQLException {
		// TODO Auto-generated method stub
		return iLoginRepository.showProjectByEmployee(id);
	}



	@Override
	public List<Manager> showProjectByManager(int id) throws SQLException {
		// TODO Auto-generated method stub
		return iLoginRepository.showProjectByManager(id);
	}


	@Override
	public List<Manager> SelectManagerID() throws SQLException {
		// TODO Auto-generated method stub
		return iLoginRepository.SelectManagerID();
	}

	private boolean chuanEmail(String email) {
		String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		String email1 = email;
		Boolean check = email1.matches(EMAIL_REGEX);
		return check;
	}
	
	private boolean checkPassword(String pass) {
		boolean check = false;
		boolean check2 = false;
		
		for (int i =0; i<pass.length(); i++) {
			if(Character.isUpperCase(pass.charAt(i)))
				check = true;
		}
		
		if(pass.length()>5 && pass.length()<13 && check==true) {
			check2 = true;
		}
		
		return check2;
	}

	@Override
	public boolean isLogInEmployee(String email, String pass) throws SQLException {
		String email1 = email;
		String pass1 = pass;
		boolean check = false;
		
		while(!check) {
			if (chuanEmail(email1)) {
				check = true;
			}
			else {
				System.out.println("Wrong Email. Input Again!");
				email1 = ScannerUtils.inputString("Input!");
			}
		}
		check = false;
		while(!check) {
			if (checkPassword(pass1)) {
				check = true;
			}
			else {
				System.out.println("Wrong Password. Input Again!");
				pass1 = ScannerUtils.inputString("Input!");
			}
		}
		
		return iLoginRepository.isLogInEmployee(email1, pass1);
	}


	@Override
	public boolean isLogInManager(String email, String pass) throws SQLException {
		String email1 = email;
		String pass1 = pass;
		boolean check = false;
		
		while(!check) {
			if (chuanEmail(email1)) {
				check = true;
			}
			else {
				System.out.println("Wrong Email. Input Again!");
				email1 = ScannerUtils.inputString("Input!");
			}
		}
		check = false;
		while(!check) {
			if (checkPassword(pass1)) {
				check = true;
			}
			else {
				System.out.println("Wrong Password. Input Again!");
				pass1 = ScannerUtils.inputString("Input!");
			}
		}
		
		return iLoginRepository.isLogInManager(email1, pass1);
	}


	


}
