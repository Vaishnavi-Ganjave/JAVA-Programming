import java.util.Scanner;

class Student
{
	int id;
	String name;
	float per;
	Student(int id, String name, float per)
	{
		this.id = id;
		this.name = name;
		this.per = per;
	}
	Student()
	{
	}
	
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Percentage: "+per);
	}
	
	static void sort(Student s[], int n)
	{
		Student temp = new Student();
		for(int i = 0; i<4; i++)
		{
			for(int j = i+1; j<n; j++)
			{
				if(s[i].per < s[j].per)
				{
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
	}
}

class main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("How many student you want to insert: ");
		n = sc.nextInt();
		
		Student s[] = new Student[n];
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter "+(i+1)+" Student information: ");
			System.out.println("Enter Id: ");
			int id = sc.nextInt();
			System.out.println("Enter name: ");
			String name = sc.next();
			System.out.println("Enter percentage: ");
			Float per = sc.nextFloat();
			s[i] = new Student(id,name,per);
		}
		System.out.println("Students Details: ");
		for(int i=0; i<n; i++)
		{
			s[i].display();
			System.out.println("  ");
		}
		System.out.println("Sorted Students Details:  ");
		Student.sort(s,n);
		
		for(int i=0; i<n; i++)
		{
			s[i].display();
			System.out.println("  ");
		}
	}
}