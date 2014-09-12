import java.util.Scanner;

public class Ch1_1_down
{
    public static void main(String[] args)
    {
        int i,j,k;
        //input lines num
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // first loop: level of lines
        for(i=n;i>=1;i--)
        {
            //second loop : print blank in front of line 
          for(j=1;j<=n-i;j++)
              System.out.print(" ");
          //third loop : print star
          for(k=1;k<=2*i-1;k++)
              System.out.print("*");
  
          System.out.print("\n");
        }
    }
}
                  
