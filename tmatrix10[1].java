import java.util.Scanner;

public class tmatrix {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter how many rows you want");
int r=sc.nextInt();
System.out.println("Enter how many colum you want");
int c=sc.nextInt();
int[][] matA=new int[r][c];
System.out.println("Enter"+(r*c)+"values:");
for(int i=0; i<r; i++) 
{

    for(int j=0; j<c; j++)
    matA[i][j]=sc.nextInt();
}
System.out.print("original matrix is:\n");
for(int i=0; i<r; i++)
{
    for(int j=0; j<c; j++)
    {
         System.out.print(matA[i][j]+"\t");
    }
    System.out.println();
}
System.out.print("transpose matrix is:\n");
for(int i=0; i<c; i++)
{
    for(int j=0; j<r; j++)
    {
         System.out.print(matA[i][j]+"\t");
    }
    System.out.println();
}
}
    
}
