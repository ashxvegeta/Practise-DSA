public class printHalfpyramidPattern {
    
    public static void main(String[] args) {
        
        //1
        //1 2
        //1 2 3
        //1 2 3 4

        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
