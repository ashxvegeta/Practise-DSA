public class clearithBit {
    
    public static int Clearithbit(int n, int i){
          int bitmask = ~(1<<i);
          return n & bitmask;
    }

    public static void main(String[] args){
           System.out.println(Clearithbit(10,1));
    }
}
