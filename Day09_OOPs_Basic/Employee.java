
class Employee   //class
{
	int empId;
	String empName;
	double empsalary;

	void show()   //Method
	{
		System.out.println("Employee ID:"+empId);
		System.out.println("Employee Name:"+empName);
		System.out.println("Salary:"+empsalary);
	}

	public static void main(String[] args) {
		
		Employee e1= new Employee(); //Object creation

		e1.empId = 1;
		e1.empName = "Prachi";
		e1.empsalary =1200000;

		e1.show(); //method call by using referance object
	}
}