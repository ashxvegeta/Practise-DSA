public class numberPyramid {

    
//     1
//     22
//    333
//   4444
//  55555

    public static void numberPyramidpattern(int n) {

        for (int i = 1; i <=n; i++) {
            
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        numberPyramidpattern(5);
    }
}
