public class binaryTodecimal {
    

    public static void binaryTodecimal(int binum) {
        

        int pow=0;
        int dec = 0;

        while (binum>0) {
            
            int lastdigit = binum%10;
            dec = dec + (lastdigit*(int)Math.pow(2, pow));
            pow++;
            binum = binum/10;
        }

        System.out.println("binary number is " + dec);

    }

    public static void main(String[] args) {
        binaryTodecimal(101);
    }
}
