public class oddOrevenBitmanipulation {
    
    public static void oddOreven(int n) {
        int bitmask =1;
        if((n&bitmask)==0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    
    public static void main(String[] args) {
        oddOreven(3);
        oddOreven(11);
        oddOreven(14);
    }
}
