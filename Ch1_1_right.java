import java.util.Scanner;

public class Ch1_1_right
{
    public static void main(String[] args)
    {
        int i,j,k;
        //input lines num
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // first loop: level of lines
        for(i=1;i<=n;i++)
        {
          //second loop : print star
          for(k=1;k<=2*i-1;k++)
              System.out.print("*");
  
          System.out.print("\n");
        }
    }
}
                  
