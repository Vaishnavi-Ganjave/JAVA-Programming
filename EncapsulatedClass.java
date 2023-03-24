class Student
{
	private int age;
	
	void setAge(int age)
	{
		if(age > 0)
		{
			this.age = age;
		}
		else
		{
			System.out.println("Invalid age");
		}
	}
	
	int getAge()
	{
		return this.age;
	}
}

class Clerk
{
	public static void main(String args[])
	{
		
		Student vaishnavi = new Student();
		vaishnavi.setAge(20);
		vaishnavi.getAge();
		
	}
}

