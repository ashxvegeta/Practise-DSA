public class decimalTobinary {
 
    public static void decimalTobinary(int n) {
        
        int binary =0;
        int pow =0;

        while(n>0){
            int rem  = n%2;
            binary = binary + rem * (int)Math.pow(10,pow);
            pow++;
            n = n/2;
        }

        System.out.println(binary);
    }
    public static void main(String[] args) {
        decimalTobinary(5);
    }
}
