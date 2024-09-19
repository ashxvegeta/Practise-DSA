public class inverted_half_pyramid_with_number {
    
    //   12345
    //   1234
    //   123
    //   12
    //   1
    

    public static void inverted_half_pyramid_with_num(int n) {
        
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_half_pyramid_with_num(5);
    }
}
