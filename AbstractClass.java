abstract class AbstractClass
{
int a;
abstract void fun();
AbstractClass(int a)
{
	this.a=a;
}
void gun()
{
	System.out.println("in abstract gun function");
}
	
}

class AbstractTry extends AbstractClass
{

void fun()
{
	System.out.println(" in fun function");
}
AbstractTry(int a)
{
	super(a);
	
}

public static void main(String args[])
{
	System.out.println("in main method");
	
	AbstractTry at = new AbstractTry(16);
	at.fun();
	at.gun();
}

}