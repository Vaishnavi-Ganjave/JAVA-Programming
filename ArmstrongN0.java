//Write a program to print given no is armstrong or not


class ArmstrongNo
{
	public static void main(String args[])
	{
		int n= Integer.parseInt(args[0]);
		int sum=0,cnt=0,pow;
		int temp, rem;

	temp = n;
	while(temp != 0)
	{
		temp = temp/ 10;
		cnt++;
	}
	
	temp = n;
	while(temp != 0)
	{
		rem = temp %10;
		pow = 1;
		for(int i=0; i<cnt; i++)
		{
			pow = pow * rem;
		}
		sum = sum + pow;
		temp = temp/10;
	}
	
    if(temp==sum)
    {
      System.out.println("given no is armstrong");
    }
   else
   {
   	System.out.println("given no is not armstrong");
   }

 }
}