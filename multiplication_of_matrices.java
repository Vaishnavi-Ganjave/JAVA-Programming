//Q10. to display multiplication of two matrices
import java.util.Scanner; 
class Multiplication_of_Matrices 
{ 
 public static void main(String args[]) 
 { 
int sum = 0; 
Scanner input = new Scanner(System.in); 
System.out.println("Enter the number of rows and columns of first matrix"); 
int r1 = input.nextInt();
 int c1 = input.nextInt();

int first[][] = new int[r1][c1];
 System.out.println("Enter elements of first matrix"); 
 for (int c = 0; c < r1; c++)
{ 
  for (int d = 0; d < c1; d++)
 { 
    first[c][d] = input.nextInt();
 } 
System.out.println("The first Matrix: "); 
 }

for (int c = 0; c < r1; c++) 
{
for (int d = 0; d <c1; d++) 
{
System.out.print(first[c][d] + " ");
 } 
System.out.println(" ");
 } 

System.out.println("Enter the number of rows of second matrix (Col of 1st matrix == Rows of 2nd matix)"); 
int r2 = input.nextInt() ;
 System.out.println("Enter the number columns of second matrix "); 
int c2 = input.nextInt(); 
if (c1 != r2) 
{
System.out.println("The matrices can't be multiplied with each other.");
 } 
  else 
  { 
int second[][] = new int[r2][c2]; 
int mult[][] = new int[r1][c2]; 

System.out.println("Enter elements of second matrix"); 

for (int c = 0; c < r2; c++) 
{ 
for (int d = 0; d < c2; d++) 
{ 
second[c][d] = input.nextInt(); 
} 
} 
 System.out.println("The second Matrix: "); 

for (int c = 0; c < r2; c++) 
{
for (int d = 0; d < c2; d++)
{ 
System.out.print(second[c][d] + " "); 
} 
System.out.println(" "); 
} 

for (int c = 0; c < r1; c++) 
{ 
for (int d = 0; d < c2; d++)
 { 
for (int k = 0; k <r2; k++)
 { 
sum = sum + first[c][k] * second[k][d]; 
} 
mult[c][d] = sum; 
sum = 0; 
} 
} 
System.out.println("Product of the matrices:"); 

for (int c = 0; c < r1; c++) 
{ 
for (int d = 0; d < c2; d++) 
System.out.print(mult[c][d] + "\t"); 
System.out.print("\n"); 
//System.out.print("\n"); 
} 
  }
input.close(); 
}
 }