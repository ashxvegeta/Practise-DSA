import java.util.*;
public class oddOreven {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nmber");
        int  num = sc.nextInt();
        if(num%2==0){
          System.out.println("this is even number");
        }else{
            System.out.println("this is odd number");
        }

    }
}
