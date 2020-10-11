package Program.java;

import java.util.Date;

public class Account {

	String userName;
	String email;
	String fullName;	// Khai báo tên	
	int accountID;
	Department department;
	Position position;		// Khai báo ID
	Date createDate;
	Group[] groups;
	
	public Account(String userName, int accountID, String fullName,String email) {
		super();
		this.userName = userName;
		this.fullName = fullName;
		this.accountID = accountID;
		this.email	=	email;
		
	}
	
	public Account( Group[] groupOfAccount1) {

		System.out.println("Group là: " + groupOfAccount1);
	}
	
	public Account( Date createDate) {

		this.createDate = createDate;
	}

}
