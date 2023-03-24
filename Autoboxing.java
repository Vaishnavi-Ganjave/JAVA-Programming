class Autoboxing
{
	int a;
	
	void Autoboxing(Integer i)
	{
	 this.a = i;
		System.out.println("value of a: "+a);

	}
	void fun(int i)
	{
		Integer b = i;
			System.out.println("value of b: "+b);
	}
}

class AutoboxingMain
{
	public static void main(String args[])
	{
	 Autoboxing ab = new Autoboxing(10);
     System.out.println(ab);	 
	 ab.fun(10);
	 
	}
}