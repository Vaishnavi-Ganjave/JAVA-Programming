//Anonymous inner class
class Employee
{
	int Salary= 10000;
	static class Demo
	{
		void fun()
		{
			System.out.println("in fun function");
		}
	}
	int CalculateSalary()
	{
		return Salary;
	}
}

class Calc_Salary
{
	public static void main(String args[])
	{
		sEmployee vaishnavi = new Employee()
		{
			int bonus=5000;
			int CalculateSalary()
			{
				System.out.println(super.Salary + this.bonus);
				return Salary;
			}
			
		};
		vaishnavi.CalculateSalary();  
		/*Employee.Demo es = new Employee.Demo();
		es.fun();*/
	}
}