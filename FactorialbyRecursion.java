public class FactorialbyRecursion {

    
    public static int  factorial(int n){

      if(n==0){
        return 1;
      }
      int fnm1 = factorial(n-1);
      int fn = n * fnm1;
      return fn;

    }


    public static void main(String[] args) {
       
        int n = 5;
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
