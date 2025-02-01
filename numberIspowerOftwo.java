public class numberIspowerOftwo{

    public static boolean numberIspowerOftwo(int n){
          return (n&(n-1))==0;
    }

     public static void main(String[] args){
         System.out.println(numberIspowerOftwo(7));
 
     }
 
 }