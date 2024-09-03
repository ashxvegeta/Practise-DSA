public class primenumberOrnot {
    
    public static void main(String[] args) {
        
        int n = 7;


        if (n == 2) {
            System.out.println("no is prime");
        }else{


            boolean isprime  = true;

            for (int i = 2; i < n-1; i++) {
                
                if (n%i==0) {
                    
                isprime = false;
                }
            }
    
            if ( isprime ==true) { 
                System.out.println("no is prime");
            }else{
                System.out.println("no is not prime");
            }

        }


    }
}
