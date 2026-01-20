class StudentEncap
{
	private int rollNo;
	private String name;

	public void setRollNo(int r)
	{
		rollNo = r;
	}

	public int getRollNo()
	{
		return  rollNo;
	}

	public void setName(String n)
	{
		name = n;
	}

	public String getName()
	{
		return name;
	}

	public static void main(String[] args) {

		StudentEncap s = new StudentEncap();

		s.setRollNo(101);
		s.setName("Prachi");

		System.out.println("Roll No: "+ s.getRollNo());
		System.out.println("Name: "+s.getName());
	}
}