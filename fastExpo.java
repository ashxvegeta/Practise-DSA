public class fastExpo {
    public static int fastexp(int a ,int n) {
        int ans = 1;    
        while(n>0){
           if ((n & 1) != 0) {  //checked our LSB means its 1 then multiply with power
             ans = ans * a;
            }
            a = a*a ;            
            n = n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastexp(5, 3));
    }
}
