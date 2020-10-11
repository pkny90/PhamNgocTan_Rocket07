

import java.util.Date;

public class Group {
	
	String groupName;	// Khai báo tên	
	int groupID	;		// Khai báo ID
	int creatorID	;
	Date createDate;
	Account[] accounts;
	
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
