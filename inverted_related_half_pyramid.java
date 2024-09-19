public class inverted_related_half_pyramid {
    

        //        *
        //      * *
        //    * * *
        //  * * * * 


    public static void inverted_rotated_half_pyramid(int n){

        //rows

        for (int i = 1; i <=n; i++) {
            
            // no of spaces

            for (int j = 1; j <=n-i; j++) {
                
                System.out.print(" ");
            }
            //no of stars
            for (int j = 1; j <=i; j++) {
                System.err.print("*");
            }

            System.out.println();
        }
    }        
    public static void main(String[] args) {
        inverted_rotated_half_pyramid(4);
    }
}
