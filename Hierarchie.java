abstract class Employee
{
  private String name;
  private int id;
  protected static double salary;
  protected static String company;
  Address adr;
  
  static
  {
    salary = 10000;
    company = "Infosys";
  }
  
  Employee(String name , int id , Address adr)
  {
    this.name = name;
    this.id = id;
    this.adr = adr;
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
  
  void displayEmployee()
  {
    System.out.println("Company Name : "+company);
    System.out.println("Basic Salary : "+salary);
    System.out.println("Name : "+name);
    System.out.println("ID : "+id);
    System.out.println("Address :"+this.adr.getLane()+","+this.adr.getStreet()+","+this.adr.getCity()+","+this.adr.getState()+","+this.adr.getCountry());
  }
}

class Manager extends Employee
{
  private float bonus;
  
  Manager(String name , int id ,Address adr , float bonus)
  {
    super(name , id , adr);
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
  
  double income()
  {
    return this.salary+this.bonus;
  }
  
  void displayManager()
  {
    super.displayEmployee();
    System.out.println("Bonus : "+bonus);
    System.out.println("Total Income : "+income());
  }
}

class Developer extends Employee
{
  private float increment;
  
  Developer(String name , int id ,Address adr , float increment)
  {
    super(name , id ,adr);
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
  
  double income()
  {
    return this.salary+this.increment;
  }
  
  void displayDeveloper()
  {
    super.displayEmployee();
    System.out.println("Increment : "+increment);
    System.out.println("Total Income : "+income());
  }
}

class Salesman extends Employee
{
  private float insentive;
  
  Salesman(String name , int id , Address adr , float insentive)
  {
    super(name , id , adr);
    this.insentive = insentive;
  }
  
  void setInsentive(float insentive)
  {
    this.insentive = insentive;
  }
  
  float getInsentive()
  {
    return this.insentive;
  }
  
  double income()
  {
    return this.salary+this.insentive;
  }
  
  void displaySalesman()
  {
    super.displayEmployee();
    System.out.println("Insentive : "+insentive);
    System.out.println("Total Income : "+income());
  }
  
}


class Tester extends Employee
{
  Tester(String name , int id , Address adr)
  {
    super(name , id , adr);
  }
  
  double income()
  {
    return this.salary;
  }
  
  void displayTester()
  {
    super.displayEmployee();
    System.out.println("Total Income : "+income());
  }
}


class Address
{
   private int lane_no;
   private String street_name;
   private String city_name;
   private String state_name;
   private static String country_name;
  
  static
  {
    country_name = "India";
  }
  
  Address(int lane_no , String street_name , String city_name , String state_name)
  {
    this.lane_no = lane_no;
    this.street_name = street_name;
    this.city_name = city_name;
    this.state_name = state_name;
  }
  
  void setLane(int lane_no)
  {
    this.lane_no = lane_no;
  }
  
  void setStreet(String street_name)
  {
    this.street_name = street_name;
  }
  
  void setCity(String city_name)
  {
    this.city_name = city_name;
  }
  
  void setState(String state_name)
  {
    this.state_name = state_name;
  }
  
  int getLane()
  {
    return this.lane_no;
  }
  
  String getStreet()
  {
    return this.street_name;
  }
  
  String getCity()
  {
    return this.city_name;
  }
  
  String getState()
  {
    return this.state_name;
  }
  
  String getCountry()
  {
    return country_name;
  }
}

final class Demo
{
  public static void main(String args[])
  {
    Address a = new Address(11 , "M.G.Road" ," Pune" , "Maharashtra");
    Address b = new Address(12 , "Main Road" ,"Mumbai" , "Maharashtra");
    Address c = new Address(13 , "Atal Road" ," Delhi" , "Maharashtra");
    Address d = new Address(14 , "Nagar Road" ,"Nasik" , "Maharashtra");
    
	Manager m = new Manager("Vaishnavi" , 10 , b,10000);
	Developer de = new Developer("Shreya" , 20 ,c , 5000);
    Salesman s = new Salesman("Mansi" , 30 , a ,1000);
    Tester t = new Tester("Priya" , 40 , d);
    
    System.out.println(" ");
    
    System.out.println("-----Manager Details-----");
    m.displayManager();
    System.out.println(" ");
    
    System.out.println("-----Developer Details-----");
    de.displayDeveloper();
    System.out.println(" ");
    
	System.out.println("-----Salesman Details-----");
    s.displaySalesman();
    System.out.println(" ");
	  
    System.out.println("-----Tester Details-----");
    t.displayTester();
   
  }
}
