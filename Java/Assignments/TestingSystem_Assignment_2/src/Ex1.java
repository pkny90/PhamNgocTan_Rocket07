
public class Ex1 {

/*	Q1.Kiểm tra account thứ 2
	Nếu không có phòng ban (tức là department == null) thì sẽ in ra
	text "Nhân viên này chưa có phòng ban"
	Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là
	..."
	
*/	if (account2.department == null) {
		System.out.println("Nhân viên này chưa có phòng ban");
	} else
		System.out.println("Phòng ban của nhân viên này là: "
				+ account2.department.name);
/*Question 2:
Kiểm tra account thứ 2,
Nếu không có group thì sẽ in ra text "Nhân viên này chưa có
group"
Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của
nhân viên này là Java Fresher, C# Fresher"
Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là
người quan trọng, tham gia nhiều group"
Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên
này là người hóng chuyện, tham gia tất cả các group"
*/
if (account2.groups == null || account2.groups.length == 0) {
	System.out.println("Nhân viên này chưa có group");

} else if (account2.groups.length == 1) {
	System.out.println("Group của nhân viên này là"
			+ account2.groups[0]);

} else if (account2.groups.length == 2) {
	System.out.println("Group của nhân viên này là"
			+ account2.groups[0] + ", " + account2.groups[1]);

} else if (account2.groups.length == 3) {
	System.out
			.println("Nhân viên này là người quan trọng, tham gia nhiều group");

} else
	System.out
			.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");



}
