package practiceTest1;

class Employee1 extends Exception
{

	String message;


public Employee1(String message)
{
	super (message);
}

public class EmployeeException2
{
	private String firstName ,lastName;

	public EmployeeException2(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	void validation(String firstname ,String lastName)throws Employee1
	{
		if(firstName==null || lastName==null)
		{
			throw new Employee1("Entry Missing");
			
		}
		else if (firstName.length()<3 || lastName.length()<3)
		{
			throw new Employee1("should be minimum 3 characters");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee1 emp1 = new Employee1 ("Tanmay", "Kakare");
		emp1.validation("Ta","ka";)
	}
	}
}

