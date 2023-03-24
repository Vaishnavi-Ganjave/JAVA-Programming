class HashCode
{
	int rollno;

	HashCode(int rollno)
	{
	this.rollno = rollno;
	
	}
	public int hashCode()
	{
		return rollno;
	}
	int fun()
	{
		return super.hashCode();
	}
	
}

class Demo
{
	public static void main(String args[])
	{
		HashCode hs = new HashCode(1);
	   HashCode hc = new HashCode(1);
	
		System.out.println(hs.fun());
		System.out.println(hc.fun());
	}
}