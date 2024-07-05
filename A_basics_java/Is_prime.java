public class Is_prime {

    public static boolean isprime(int n)
    {
        if(n==2)
        {
            return true;
        }
        for(int i=2;i<=n-1;i++)
        {
          if(n%i==0)
          {
            return false;
          }
        }
        return true;
    //     for(int i=2;i<=Math.sqrt(n);i++)
    //     {
    //         if(n%i==0)
    //         {
    //             return false;
    //         }

    //     }
    //     return true;
    }
       
        public static void primeINrange(int n)
        {
            for(int i=2;i<=n;i++)
            {
                if(isprime(i))
                {
                    System.out.print(i+" ");
                }
            }
            // System.out.println();
        }
    


    public static void main(String[] args) {
        System.out.println(isprime(20));
        primeINrange(20);
        
    }
}
