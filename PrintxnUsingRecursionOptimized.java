public class PrintxnUsingRecursionOptimized {
    

    public static int optimizedpower(int x,int n){

        if(n==0){
            return 1;
        }
         // we can do this also
        // int halfpower  = optimizedpower(x,n/2);
        // int halfpowersquare =  halfpower * halfpower;

        int halfpowersquare = optimizedpower(x,n/2)*optimizedpower(x,n/2);

        if(n%2!=0){
        return  halfpowersquare = 2* halfpowersquare;
        }
        return halfpowersquare;
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 5;
        System.out.println(optimizedpower(a,n));
    }
}
