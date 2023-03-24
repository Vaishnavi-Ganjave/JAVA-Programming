import java.io.BufferedReader;
import java.io.InputStreamReader;
class Addition
{
	public static void main(String args[]) throws Exception
	{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("enter first number: ");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("enter second number: ");
		int b = Integer.parseInt(br.readLine());
		
		System.out.println("addition is : "+(a+b));
	}
}
