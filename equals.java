class Student
{
	int rollno;
	String name;
	float per;

	Student(int rollno, String name, float per)
	{
	this.rollno = rollno;
	this.name = name;
	this.per = per;
	}
	public boolean equals(Object obj)
	{
	if(this == obj)
	{
	return true;
	}
	else if(obj instanceof Student)
	{
	Student s = (Student)obj;
	return((this.rollno == s.rollno) && (this.name == s.name) && (this.per == s.per));
	}
	else
	{
		return false;
	}
	}
}

class Demo
{
	public static void main(String args[])
	{
	Student s1= new Student(1, "vaishnavi",88.80f);
	Student s2= new Student(1, "vaishnavi",88.80f);

	System.out.println(s1.equals(s2));
	}
}