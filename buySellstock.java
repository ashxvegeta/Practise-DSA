import java.util.*;
public class buySellstock {
 
    public static int Buystockandsell(int price[]){
      int maxprofit = 0;
      int buyprice = Integer.MAX_VALUE;  //sabse km selling price p karidna hai stock to issme compare karneg to isse sb schote hi honge
      for (int i = 0; i < price.length; i++) {
        if(buyprice<price[i]){
           int profit = price[i] - buyprice; 
           maxprofit = Math.max(maxprofit, profit);
        }else{
            buyprice = price[i];
        }
      }
       return maxprofit;
    }
    
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        System.out.println("maximum profit is "+Buystockandsell(price));    
    }

}
