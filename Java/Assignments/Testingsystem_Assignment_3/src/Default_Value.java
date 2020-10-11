import java.time.LocalDate;
import java.util.Date;

public class Default_Value {

	public static void main(String[] args) {
		
		Account[] accounts = new Account[5];

		// insert account
		for (int i = 0; i < 5; i++) {
			Account account = new Account();
			account.email = "Email " + (i + 1);
			account.userName = "Username " + (i + 1);
			account.fullName = "Full name " + (i + 1);
			account.createDate = LocalDate.now();

			accounts[i] = account;
		}

		// print accounts
		for (Account account : accounts) {
			System.out.println(account.email);
			System.out.println(account.userName);
			System.out.println(account.fullName);
			System.out.println(account.createDate);
			System.out.println("\n");
		}

	}

}
