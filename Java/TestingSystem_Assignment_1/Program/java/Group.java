package Program.java;

import java.util.Date;

public class Group {
	
	String groupName;	// Khai b�o t�n	
	int groupID	;		// Khai b�o ID
	int creatorID	;
	Date createDate;
	
	public  Group(String groupName, int groupID) {
		super();
		this.groupName = groupName;
		this.groupID = groupID;
		
	}
	public void Account( int accountID) {

		this.creatorID = accountID;
	}

	public void Account( Date createDate) {

		this.createDate = createDate;
	}
}
