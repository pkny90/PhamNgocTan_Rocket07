
public class Objects_Method {

	public static void main(String[] args) {
		Department[] departments = new Department[5];
		/*
		 * Department department1 = new Department("Sale", 1); Department department2 =
		 * new Department("Marketing", 2); Department department3 = new
		 * Department("Boss of director", 3); Department department4 = new
		 * Department("Waiting room", 4); Department department5 = new
		 * Department("Accounting", 5);
		 */
	
			
		question6(departments);
		System.out.println("");

	}

	public static void question6(Department[] departments) {

		// order by
		for (int i = 0; i < departments.length; i++) {
			for (int j = 0; j < departments.length - 1; j++) {

				if (departments[i].departmentName.compareToIgnoreCase(departments[j].departmentName) < 0) {
					// swap
					Department temp = departments[i];
					departments[i] = departments[j];
					departments[j] = temp;
				}
			}
		}

		// print departments
		for (Department department : departments) {
			System.out.println(department);
		}
	}
}
