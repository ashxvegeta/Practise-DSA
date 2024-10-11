public class sum_of_n_natural_numbers {
  
    
    public static void main(String[] args) {
        int  n = 3;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            
        }
        System.out.println("the sum is " + sum);
    }
}
