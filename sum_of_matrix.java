//Q7.accept matrix and display sum of all matrix numbers
import java.util.Scanner; 
class sum_of_matrix 
{
public static void main(String[] args) 
{ 
int sum = 0;
 Scanner input = new Scanner(System.in); 
 System.out.println("Enter how many Elements you want in Array :"); 
 int n = input.nextInt(); 
int a[] = new int[n]; 

System.out.println("Enter Elements of Array: "); 
for (int i = 0; i<n; i++)
 { 
a[i] = input.nextInt(); 
 }
for (int element : a)
 { 
   sum += element; 
 }
System.out.println("Array Elements are: ");
 for (int i = 0; i<n; i++)
  { 
System.out.print(a[i] + " "); 
  }
System.out.println("\nSum of Array Elements : " + sum);
 input.close(); 
 }
}
