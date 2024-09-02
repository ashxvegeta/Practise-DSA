import java.util.*;
public class leapYear {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
//if devided by 4 and not by 100 then leap year and if  devided by 100 and 400 the leap year
        if (year%4==0) {
            
            if (year%100==0) {
                
                if (year%400==0) {
                    
                    System.out.println(" leap year");


                }else{
                    System.out.println("not a leap year");
                }

            }else{
                System.out.println("leap year");
            }



        }else{
            System.out.println("not a leap year");
        }

    }
}