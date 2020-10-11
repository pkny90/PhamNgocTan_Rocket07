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

import entity.Department;
import utils.JDBC_utils;

public class DepartmentRepository implements IDepartmentRepository {

	private JDBC_utils jdbcUtils;
	
	public DepartmentRepository() throws FileNotFoundException, IOException
	{
		jdbcUtils = new JDBC_utils();
	}
	
	@Override
	public List<Department> showDepartmentList() throws SQLException
	{
		List<Department> departments = new ArrayList<Department>();
		Connection cont = jdbcUtils.connect();
		
		String sql = "Select * from department";
		Statement statement = cont.createStatement();
		ResultSet resulSet = statement.executeQuery(sql);
		while (resulSet.next())
		{
			int id = resulSet.getInt("DepartmentID");
			String name = resulSet.getString("DepartmentName");
			
			Department department = new Department(id, name);
			departments.add(department);
		}
		
		jdbcUtils.disconnect();
		return departments;
	}
	@Override
	public boolean insertDepartmment(String name) throws SQLException {
		Connection cont = jdbcUtils.connect();
		String insertStatement = "Insert into department values (?)";
		PreparedStatement preStatement = cont.prepareStatement(insertStatement);
		int effectedRows = preStatement.executeUpdate(insertStatement);
		// TODO Auto-generated method stub
		if (effectedRows == 1)
		{
			return true;
		} else
		return false;
	}
}
