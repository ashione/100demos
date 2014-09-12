import java.util.Scanner;

public class Ch1_1
{
    public static void main(String[] args)
    {
        int i,j,k;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(i=1;i<=n;i++)
        {
  
  
          for(j=1;j<=n-i;j++)
              System.out.print(" ");
          for(k=1;k<=2*i-1;k++)
              System.out.print("*");
  
          System.out.print("\n");
        }
    }
}
                  
