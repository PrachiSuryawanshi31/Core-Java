
class Employee
{
	int empId;
	String empName;
	double basicSalary;

	void setEmployee(int id , String name, double salary)
	{
		this.empId = id;
		this.empName = name;
		this.basicSalary=salary;
	}
}


class SalaryEmployee extends Employee
{

			double hra; //HRA = House Rent Allowance
			double da;  //DA = Dearness Allowance
			double netSalary;

			void calculateSalary(){

				hra = basicSalary * 0.20; //20%

				da = basicSalary*0.10;   //10%

				netSalary = basicSalary + hra + da;
			}

			void display()
			{
				System.out.println("Employee ID: "+empId);

				System.out.println("Employee Name: "+empName);

				System.out.println("Basic Salary: "+basicSalary);

				System.out.println("HRA:" +hra);

				System.out.println("DA: "+da);

				System.out.println("Net Salary:"+netSalary);
			
			}

			public static void main(String[] args)
			{
				
				SalaryEmployee SE= new SalaryEmployee();

				SE.setEmployee(101, " Prachi", 500000);
				SE.calculateSalary();
				SE.display();

			}

}
