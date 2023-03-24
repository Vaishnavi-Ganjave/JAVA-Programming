//Q12. accept n and display n*n identity matrix
import java.util.Scanner; 
class Identity_Matrix 
{ 
    public static void main(String[] args) 
    { 
Scanner input = new Scanner(System.in);
 System.out.println("Enter N: "); 
int c = input.nextInt(); 
int r = c; 
int [][] m1 = new int[r][c]; 

for (int i = 0; i<r; i++) 
{
   for (int j = 0; j <c; j++) 
   {
      if(i == j) 
      {
         m1[i][j] =1; 
      }
      else 
      {
         m1[i][j]=0; 
      }
    }
}
System.out.println("Identity Matrix"); 
 for (int i = 0; i<r; i++) 
 { 
    for (int j = 0; j <c; j++) 
    {
     System.out.print(m1[i][j] +" "); 
    }
     System.out.print("\n") ;
}
     input.close(); 
 }
}