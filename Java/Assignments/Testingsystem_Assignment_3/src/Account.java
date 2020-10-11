

import java.time.LocalDate;
import java.util.Date;



public class Account {

	String userName;
	String email;
	String fullName;	// Khai báo tên	
	int accountID;
	Department department;
	Position position;		// Khai báo ID
	LocalDate createDate;
	Group[] groups;
	
	public Account() {
		super();
		this.userName = userName;
		this.fullName = fullName;
		this.accountID = accountID;
		this.email	=	email;
		
	}
	
	public Account( Group[] groupOfAccount1) {

		System.out.println("Group là: " + groupOfAccount1);
	}
	
	public Account( LocalDate createDate) {

		this.createDate = createDate;
	}

}
