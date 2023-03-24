//normal inner class

class Outer
{
	class Inner
	{
		void fun()
		{
		System.out.println("in inner fun function");
		}
    }
	
		static void gun()
		{
		System.out.println("in outer static void gun function");
		}
}
class OuterInner
{
	public static void main(String args[])
	{
		  Outer o = new Outer();
		  Outer.Inner i = o.new Inner();
		  i.fun();
		  o.gun();
		  //new Outer().new Inner().fun();     //without creating object
	}
}