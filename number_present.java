//Q5. to accept n numbers, store into array and accept number.check the given number is present in array or not
import java.util.Scanner; 
 class Number_Present
  { 
public static void main(String[] args)
 { 
Scanner input = new Scanner(System.in); 
System.out.println("Enter size of Array :");
 int n = input.nextInt(); 
 int a[] = new int[n];

 System.out.println("Enter Elements of Array: ");
  for (int i = 0; i<n; i++) 
  { 
    a[i] = input.nextInt();
  }

System.out.println("Enter the number to check: "); 
int num = input.nextInt ();
boolean isInArray = false; 
for (int element : a)
 { 
if (num == element)
 { 
isInArray = true;
 break;
 } 
}
if (isInArray) 
{ 
System.out.println("The value is present & it is " + num);
 }
  else
   { 
System.out.println("The Value is not Found in the Array "); 
   }
input.close(); 
   }
}
 
