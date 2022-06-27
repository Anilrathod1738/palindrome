import java.util.*;
class Prime_number
{
  public static void main(String[]args)
  {
     Scanner sc=new Scanner(System.in);
      System.out.print("Enter any number= ");
       int n=sc.nextInt();
        int i=2;
       while(i<=n)
          {
            if(n%i==0)
              break;
            i++;
            }
     if(n==i)
       System.out.print("This is a prime number= "+n);
       else
         System.out.print("This is not a prime number");
      }
   }