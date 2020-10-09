package back_end.repository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.entiy.Account;
import com.vti.ultis.properties.MessageProperties;

import Utils.JDBC_utils;
import entity.Employee;
import entity.Manager;

public class LoginRepository implements ILoginRepository {

	private JDBC_utils jdbcUtils;

	public LoginRepository() throws FileNotFoundException, IOException {
		jdbcUtils = new JDBC_utils();
	}

	@Override
	public List<Employee> showProjectByEmployee(int id) throws SQLException {
		// TODO Auto-generated method stub
		List<Employee> emps = new ArrayList<>();
		Connection con = jdbcUtils.connect();
		String query = "SELECT EmployeeID,fullName,email,projectID,proSkill FROM Employee where projectID = ?";
		PreparedStatement preparedStatement = con.prepareStatement(query);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		// TODO Auto-generated method stub
		// Add vao List<>
		while (resultSet.next()) {
			Employee emp = new Employee();
			emp.setId(resultSet.getInt("employeeID"));
			emp.setFullName(resultSet.getString("fullName"));
			emp.setEmail(resultSet.getString("email"));
			emp.setProjectID(resultSet.getInt("projectID"));
			emp.setProSkill(resultSet.getString("proSkill"));
			emps.add(emp);
		}
		if (emps.isEmpty()) {
			System.out.println("Cannot Find Any");
			jdbcUtils.disconnect();
		}
		return emps;
	}

	@Override
	public List<Manager> showProjectByManager(int id) throws SQLException {
		List<Manager> mngs = new ArrayList<>();
		Connection con = jdbcUtils.connect();
		String query = "SELECT managerID,fullName,email,projectID,expInYear FROM Manager where projectID = ?";
		// Select
		PreparedStatement preparedStatement = con.prepareStatement(query);
		preparedStatement.setInt(1, id);
		// Add vao list
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			Manager mng = new Manager();
			mng.setId(resultSet.getInt("managerID"));
			mng.setFullName(resultSet.getString("fullName"));
			mng.setEmail(resultSet.getString("email"));
			mng.setProjectID(resultSet.getInt("projectID"));
			mng.setExpInYear(resultSet.getInt("expInYear"));
			mngs.add(mng);
		}
		if (mngs.isEmpty())
			System.out.println("Cannot Find Any");
		return mngs;
	}

	@Override
	public List<Manager> SelectManagerID() throws SQLException {
		List<Manager> mngs = new ArrayList<>();
		Connection con = jdbcUtils.connect();
		Statement statement = con.createStatement();
		// Select
		String query = "Select * from manager";

		// Add vao list
		ResultSet resultSet = statement.executeQuery(query);
		while (resultSet.next()) {
			Manager mng = new Manager();
			mng.setId(resultSet.getInt("managerID"));
			mng.setFullName(resultSet.getString("fullName"));
			mng.setProjectID(resultSet.getInt("projectID"));
			mng.setEmail(resultSet.getString("email"));
			mng.setExpInYear(resultSet.getInt("ExpInYear"));
			mngs.add(mng);
		}
		return mngs;
	}

	@Override
	public boolean isLogInEmployee(String email, String pass) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = jdbcUtils.connect();
		String query = "select * from Employee where email = ? and pass = ?";
		PreparedStatement preparedStatement = con.prepareStatement(query);
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, pass);

		boolean check = false;
		ResultSet set = preparedStatement.executeQuery();

		if (set.next())
			check = true;

		jdbcUtils.disconnect();
		return check;

	}

	@Override
	public boolean isLogInManager(String email, String pass) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = jdbcUtils.connect();
		String query = "select * from Employee where email = ? and pass = ?";
		PreparedStatement preparedStatement = con.prepareStatement(query);
		preparedStatement.setString(1,email);
		preparedStatement.setString(2,pass);
		
		boolean check = false;
		ResultSet set = preparedStatement.executeQuery();
		
		if(set.next())
			check = true;

		jdbcUtils.disconnect();
		return check;
	}

}
