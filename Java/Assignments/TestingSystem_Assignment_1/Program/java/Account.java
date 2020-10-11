package Program.java;

import java.util.Date;

public class Account {

	String userName;
	String email;
	String fullName;	// Khai b�o t�n	
	int accountID;
	Department department;
	Position position;		// Khai b�o ID
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

		System.out.println("Group l�: " + groupOfAccount1);
	}
	
	public Account( Date createDate) {

		this.createDate = createDate;
	}

}
