package Program.java;

import java.util.Date;

public class GroupAccount {
	
	int groupID	;		// Khai b�o ID
	int accountID	;
	Date joinDate;
	
	public GroupAccount(Date joinDate)
	{
		super();
		this.joinDate = joinDate;
		
	}
	public void Group( int groupID) {

		this.groupID = groupID;
	}

	public void Account( int accountID) {

		this.accountID = accountID;
	}
}
