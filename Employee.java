package practiceTest1;



public class Employee {

	

		
//		int id;
		String firstName;
		String lastName;
		@Override
	public String toString() {
			return "Employee [firstName=" + firstName + ", lastname=" + lastName + "]";
		}
	String fName ;
	String lName ;	
		public Employee(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee emp1 = new Employee ("David","Blake");
		Employee emp2 = new Employee ("Sachin","Tendulkar");
		Employee emp3 = new Employee ("David","Tendulkar");
		
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
	

	}

}
