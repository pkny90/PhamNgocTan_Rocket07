package front_end;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import Utils.ScannerUtils;
import back_end.controller.LoginController;
import entity.Employee;
import entity.Manager;

public class Program {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			int chon;
			do {
				System.out.println("\n*****************************************");
				System.out.println("**             Users system              **");
				System.out.println("*******************************************");
				System.out.println("**                                       **");
				System.out.println("**        1. Input ProjectID	       	 **");
				System.out.println("**        2. Show Manager			     **");
				System.out.println("**        3. Login as Manager     **");
				System.out.println("**        4. Login as Employee     **");
				System.out.println("**        0. Exit    			 **");
				System.out.println("**                                       **");
				System.out.println("*******************************************");
				
				chon = ScannerUtils.inputInt("Input Again!!");
				switch(chon) {
				case 1:
					System.out.println("Nhap ProjectID: ");
					int id = ScannerUtils.inputInt("Nhap lai");
					SelectProjectID(id);
					break;
				case 2:
					SelectManagerID();
					break;
				case 3:
					LoginManager();
					break;
				case 4:
					LoginEmployee();
					break;
				case 0:
					System.out.println("Exit Successful!");
					break;
				default:
					System.err.println("Input Again !");
					break;
				}
			} while(chon != 0);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	private static LoginController userController;
	private static void LoginEmployee() throws SQLException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		userController = new LoginController();
		System.out.println("Nhap Email:");
		String email = ScannerUtils.inputString("Nhap lai!");
		System.out.println("Nhap password:");
		String pass = ScannerUtils.inputString("Nhap lai!");
		if(userController.isLogInEmployee(email, pass))
			System.out.println("Log-in Successful!");
		else
			System.out.println("Wrong Email Or Password, Input Again!");
	}
		
	



	private static void LoginManager() throws SQLException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		userController = new LoginController();
		System.out.println("Nhap Email:");
		String email = ScannerUtils.inputString("Nhap lai!");
		System.out.println("Nhap password:");
		String pass = ScannerUtils.inputString("Nhap lai!");
		if(userController.isLogInManager(email, pass))
			System.out.println("Log-in Successful!");
		else
			System.out.println("Wrong Email Or Password, Input Again!");
	}
		
	



	private static void SelectManagerID() throws FileNotFoundException, IOException, SQLException {
		LoginController uC = new LoginController();
		List<Manager> mngs = uC.SelectManagerID();
		for (Manager mng : mngs) {
			System.out.println(mng.toString());
		}
	}


	private static void SelectProjectID(int id) throws Exception {
		// TODO Auto-generated method stub
	
		LoginController uC = new LoginController();
		List<Employee> employees = uC.showProjectByEmployee(id);
		for (Employee employee : employees) {
			System.out.println(employee.toString());
		}
		List<Manager> managers = uC.showProjectByManager(id);
		for (Manager manager : managers) {
			System.out.println(manager.toString());
		}
	}


	/*
	 * private static void insertEmployee(String firstName, String lastName, String
	 * phone, String email, String pass, String project_Name, String project_Skill)
	 * throws SQLException, FileNotFoundException, IOException {
	 * 
	 * EmployeeController emp_Contr = new EmployeeController();
	 * emp_Contr.insertEmployee(firstName, lastName, phone, email, pass,
	 * project_Name, project_Skill);
	 * 
	 * }
	 */



}
