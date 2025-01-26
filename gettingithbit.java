

public class gettingithbit {

    public static int GettingithBit(int n,int i) {
        int bitmask = 1<<i;
        if((n&bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {
       System.out.println(GettingithBit(10,2));  
    }


}