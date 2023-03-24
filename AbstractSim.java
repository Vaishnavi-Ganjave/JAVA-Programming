interface sim
{
	void sendmsg();
	void dialcall();
}

class Mobile
{
	void insertsim(sim s)
	{
		s.sendmsg();
		s.dialcall();	
		
	}
} 

class MobileUser
{
	public static void main(String args[])
	{
		Mobile Nokia = new Mobile();
		Nokia.insertsim(new jio());
		Nokia.insertsim(new Airtel());
		Nokia.insertsim(new Idea());
	}
	
}

class jio implements sim
{
	public void sendmsg()
	{
		System.out.println("jio sending message.....");
	}
	
	public void dialcall()
	{
		System.out.println("jio dialling call....");
	}
}

class Airtel implements sim
{
	public void sendmsg()
	{
		System.out.println("Airtel sending message.....");
	}
	
	public void dialcall()
	{
		System.out.println("Airtel dialling call....");
	}
}

class Idea implements sim
{
	public void sendmsg()
	{
		System.out.println("idea sending message.....");
	}
	
	public void dialcall()
	{
		System.out.println("idea dialling call....");
	}
}