//Write a program to accept 4 string from user and count the number of character in each string.
import java.util.*;
public class NoOfCharacter
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int count = 0,count1 =0, count2 =0, count3 = 0;
		
		System.out.println("Enter first string: ");
		String str1 = sc.nextLine();
		for(int i=0; i<str1.length(); i++)
		{
			if(str1.charAt(i) != ' ')
				count++;
		}
		System.out.println("Total no of characters in a string: " + count);
		
		System.out.println("Enter second string: ");
		String str2 = sc.nextLine();
		for(int i=0; i<str2.length(); i++)
		{
			if(str2.charAt(i) != ' ')
				count1++;
		}
		System.out.println("Total no of characters in a string: " + count1);
		
		
		System.out.println("Enter third string: ");
		String str3 = sc.nextLine();
		for(int i=0; i<str3.length(); i++)
		{
			if(str3.charAt(i) != ' ')
				count2++;
		}
		System.out.println("Total no of characters in a string: " + count2);
		
		System.out.println("Enter fourth string: ");
		String str4 = sc.nextLine();
		for(int i=0; i<str4.length(); i++)
		{
			if(str4.charAt(i) != ' ')
				count3++;
		}
		System.out.println("Total no of characters in a string: " + count3);
		
		
	}
}



