public class reverseNumber {
    public static void main(String[] args) {
        
        int number =  99880;
        while (number>0) {
            int lastdigit = number%10;  //get the last digit
            System.out.print(lastdigit); // print the last digit in loop
            number = number/10; // remove the last digit from number so that we can get the latest lastdigit number
        }
        System.out.println();


    }
}
