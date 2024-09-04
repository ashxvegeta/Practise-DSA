
import java.util.*;
public class printSumofOddandEven {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int oddtotal = 0;
        int eventotal = 0;

        do {
            
            System.out.println("enter the number");
            number = sc.nextInt();
            if (number%2==0) {
                eventotal += number;
            }else{

                oddtotal += number;
            }

            System.out.println("enter 1 to continue and 2 to exit");

            choice = sc.nextInt();

        } while (choice==1);

        System.out.println("total of even number " + eventotal);
        System.out.println("total of odd number " + oddtotal);

    }
}
