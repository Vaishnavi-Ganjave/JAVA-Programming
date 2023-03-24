// IS-A, HAS-A, USES-A

class Person
{
String name;
String addr;

  Person(String name,String addr)
   {
	  this.name= name;
	  this.addr = addr;
   }
}

class Employee extends Person
{
   int empid;
   int salary;

  Employee(String name, String addr, int empid,int salary)
  {
	super(name,addr);
	this.empid=empid;
	this.salary=salary;
  }
   String usecar(Car c)
   {
	   return c.car;
   }
   void display()
   {
	   String str= usecar(new Car("audi"));
	   System.out.println("name: "+name+ "Id: "+empid+ "Addr: "+addr.city+ " "+addr.state+ "Salary: "+salary+ "Car name: "+str);
   }
}

class Address
{
	String city;
	String state;
	
	Address(String city, String state)
	{
		this.city= city;
		this.state = state;
	}
}

class Car
{
	String car;
	
	Car(String car)
	{
		this.car = car;
	}
}
	   
class Relationship
{
	public static void main(String args[])
	{
		Address addr = new Address("Sangamner", "Maharashtra");
		Employee emp = new Employee("Vaishnavi", 20, addr);
		emp.display();
	}
}
	