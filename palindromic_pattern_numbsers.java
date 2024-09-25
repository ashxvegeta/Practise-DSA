public class palindromic_pattern_numbsers {
    
    
    public static void palindromicpattern(int n) {
        
        //no of rowa
        for (int i = 1; i <=n; i++) {
            
            //for spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //for descending order
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }
            //for asending order
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        palindromicpattern(5);
    }

}
