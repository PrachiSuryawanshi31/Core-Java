

class Person{
	String name;

	void setName(String name)
	{
		this.name = name;
	}
}

class Result extends Person
{

	int rollNo;

	void setRollNo(int rollNo)
	{
		this.rollNo =rollNo;
	}


	int marks;

	void setMarks(int m)
	{
		this.marks = m;
	}

	void display()
	{
		System.out.println("Name: "+name);
		
		System.out.println("Roll No : "+rollNo);

		System.out.println("Marks: "+marks);
	}

	
}

class Student  extends Result{

	
	public static void main(String[] args) {
		
		Result r = new Result();

		r.setName("Prachi");
		r.setRollNo(100);
		r.setMarks(90);
		r.display();

	}

}