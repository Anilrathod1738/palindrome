import java.util.*;
class Palindrome
{
  public static void main(String[]arg)
  {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the number");
    
     int n=sc.nextInt();
    int i=n;
    int rev=0;
    int rem=0;
    while(i!=0)
      {
         
        rem=i%10;
       rev=rev*10+rem;
       i=i/10;
        }
         
         if(n==rev)
            System.out.print("It is palindrom number="+n);
           else
             System.out.println("It is not palindrom number");
           
        
  
        
    }
}
   