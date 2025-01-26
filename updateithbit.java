public class updateithbit {
    

    public static int settingithBit(int n, int i){
        int bitmask = 1<<i;
        return n | (bitmask);
    }

    public static int clearithBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
  }

    public static int UpdateIthBit(int n, int i, int newBit) {

        // if(newBit==0){
        //     return clearithBit(n,i);
        // }else{
        //     return settingithBit(n,i);
        // }

        // another approach
        n = clearithBit(n,i);
        int bitmask = newBit<<i;
        return n | bitmask; 
        
    }

    public static void main(String[] args) {
        System.out.println(UpdateIthBit(10,2,1));
    }
}
