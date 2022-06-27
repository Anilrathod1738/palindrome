class Maximum_number
{
  public static void main(String[]args)
 {
   int n=1274964459;
    int rem=0;
    int k=0;
   while(n!=0)
      {
        rem=n%10;
         if(rem>k)
          k=rem;
      n=n/10;
        }
      System.out.print("Maximum number="+k);
     }
}
            
  