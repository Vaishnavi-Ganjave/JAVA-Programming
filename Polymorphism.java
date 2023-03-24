class Employee
{
  private String name;
  private int id;
  protected static double salary;

  
  static
  {
    salary = 10000;
  }
  
  Employee(String name , int id )
  {
    this.name = name;
    this.id = id;
  }
  
  void setName(String name)
  {
    this.name = name;
  }
  
  
  void setId(int id)
  {
    if(id<=0)
    {
      System.out.println("Invalid ID");
    }
    else
    {
      this.id = id;
    }
  }
  
  String getName()
  {
    return this.name;
  }
  
  int getId()
  {
    return this.id;
  }
  
  double CalculateSalary()
  {
	  return this.salary;
  }
  
  void display()
  {
    System.out.println("Basic Salary : "+salary);
    System.out.println("Name : "+name);
    System.out.println("ID : "+id);
    
  }
}

class Manager extends Employee
{
  private float bonus;
  
  Manager(String name , int id ,float bonus)
  {
    super(name , id );
    this.bonus = bonus;
  }
  
  void setBonus(float bonus)
  {
    this.bonus = bonus;
  }
  
  float getBonus()
  {
    return this.bonus;
  }
  
  double CalculateSalary()
  {
	  return this.salary+this.bonus;
  }
  
  void display()
  {
    super.display();
    System.out.println("Bonus : "+bonus);
    System.out.println("Total Income : "+CalculateSalary());
  }
}

class Developer extends Employee
{
  private float increment;
  
  Developer(String name , int id ,float increment)
  {
    super(name , id );
    this.increment = increment;
  }
  
  void setIncrement(float increment)
  {
    this.increment = increment;
  }
  
  float getIncrement()
  {
    return this.increment;
  }
  
  double CalculateSalary()
  {
	  return this.salary + this.increment;
  }
  
  void display()
  {
    super.display();
    System.out.println("Increment : "+increment);
    System.out.println("Total Income : "+CalculateSalary());
  }
}

class Polymorphism
{
	public static void main(String args[])
	{
		System.out.println("-----Manager Details-----");
		Employee emp1 = new Manager("Vaishnavi", 1, 5000);
		emp1.display();

        System.out.println("-----Developer Details-----");     
		Employee emp3 = new Developer("Mansi", 3, 3000);
		emp3.display();
		
	}
}