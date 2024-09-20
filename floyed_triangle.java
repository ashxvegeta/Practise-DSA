public class floyed_triangle {
    

    //1
    //1 2
    //1 2 3
    //1 2 3 4
    //1 2 3 4 5

    public static void floyed_triangle_pattern(int n) {
        
        int  counter =1;
        for (int i = 1; i <= n; i++) {
            

            for (int j = 1; j <= i; j++) {

                System.out.print(counter+" ");
                counter++;
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyed_triangle_pattern(5);
    }
}
