import java.util.Scanner;

public class palindromeNumber {

    public static boolean isPalindrome(int n) {
        
        int rev = 0;
        int newnumber = n;
        while (newnumber>0) {
            int lastdigit = newnumber%10;
            rev = (rev*10)+lastdigit;
            newnumber = newnumber/10;
        }

        if(rev == n){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        if(isPalindrome(n)){
            System.out.println("number is  palindrome");
        }else{
            System.out.println("number is not palindrome");
        }

    }
}
