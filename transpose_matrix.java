//Q9. to display transpose matrix of given matrix
import java.util.Scanner; 
 class transpose_matrix 
 { 
public static void main(String[] args) 
{ 
Scanner input = new Scanner(System.in);
 System.out.println("Enter total rows in Array :"); 
 int r = input.nextInt();
  System.out.println("Enter total column in Array :");
   int c = input.nextInt();
    int[][] matrix = new int[r][c]; 

System.out.println("Enter first Array elements : "); 
for (int i = 0; i<r; i++)
 { 
for (int j = 0; j <c; j++)
 { 
matrix[i][j] = input.nextInt(); 
 }
    System.out.println("\nThe Matrix");
 }
 for (int i = 0; i <r; i++)
  { 
for (int j = 0; j <c; j++) 
{ 
     System.out.print(matrix[i][j] + " ");
}
      System.out.println(" "); 
  }

System.out.println("\nThe Transpose Matrix is: "); 
for (int i = 0; i <r; i++) 
{
for (int j = 0; j <c; j++) 
{ 
System.out.print(matrix[j][i] + " "); 
}
System.out.println(" "); 
}
input.close(); 
 }
}
