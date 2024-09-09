public class binomial_coffician {
    
    public static int factorial(int n) {
        

        int fact = 1;

        for (int i = n; i > 0; i--) {
            
            fact = fact*i;
        }

        return fact;


    }


    public static int binomial_cofficiance(int n,int r) {
        
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int mcr_fact = factorial(n-r);

        int binomial_cofficiance = n_fact/(r_fact *mcr_fact);
        return binomial_cofficiance;
    }


    public static void main(String[] args) {
        
        System.out.println(binomial_cofficiance(5,2));
    }
}
