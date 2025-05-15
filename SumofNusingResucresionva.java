public class SumofNusingResucresionva {

    
  
    public static int sum(int n) {
        
       //fn = n + f(n-1)
         if( n== 1){
            return 1;
         }
        int snminus1 = sum(n-1);
        int sn = n + snminus1;
        return sn;
    }




    public static void main(String[] args) {
       
        int n = 5;
        int result = sum(n);
        System.out.println("sum of " + n + " is: " + result);
    }
}
