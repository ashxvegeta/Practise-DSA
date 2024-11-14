import java.util.*;
    class largestIntwoDarray{
        
        public static boolean largest(int matrix[][]) {
            int largest = Integer.MIN_VALUE;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if(largest<matrix[i][j]){
                        largest = matrix[i][j];
                    }    
                }
                System.out.println();
            }
            System.out.println("largets value is = "+largest);
            return true;
        }

        public static void main(String args[]) {

            int matrix[][] = new int[3][3];
            int n = matrix.length;
            int m = matrix[0].length;
    
            System.out.println("Enter the numbers");
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            // Output

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            largest(matrix);
    }
}