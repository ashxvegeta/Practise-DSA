public class dimondPattern {
    

//      *
//     ***
//    *****
//   *******
//   *******
//    *****
//     ***
//      *


    public static void dimond(int n) {
        
        for (int i = 1; i <=n; i++) {
            
            //for spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");                
            }
            //for stars
            for (int j = 1; j <=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //now create the mirror imgae of above pattern run the for loop in reverse so that will start from n to 1

        for (int i = n; i>=1; i--) {
            
            //for spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");                
            }
            //for stars
            for (int j = 1; j <=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        dimond(4);
    }
}
