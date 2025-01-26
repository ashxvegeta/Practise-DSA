
public class settingithBit {   

    public static int SettingithBit(int n, int i){
        int bitmask = 1<<i;
        return n | (bitmask);
    }

    public static void main(String[] args) {
       System.out.println(SettingithBit(10,2));  
    }


}