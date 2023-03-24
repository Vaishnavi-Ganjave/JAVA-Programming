//Q6. accept a matrix and display it.
import java.util.Scanner; 
class Display_Matrix 
{ 
public static void main(String[] args)
 { 
Scanner input = new Scanner(System.in); 
System.out.println("Enter the number of Elements in Array :"); 
int n = input.nextInt(); 
int a[] = new int[n];
 System.out.println("Enter Elements of Array: "); 
 for (int i = 0; i<n; i++)
  { 
a[i] = input.nextInt(); 
  }

System.out.println("Array Elements are: "); 
for (int i = 0; i<n; i++) 
{ 
System.out.print(a[i] + " "); 
}
input.close(); 
} 
}