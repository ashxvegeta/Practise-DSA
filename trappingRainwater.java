import java.util.*;
public class trappingRainwater {
    
    public static int trappingrainwaterfunc(int height[]){
      //1- left max array
      //2- right max array
      //3- waterlevel = min of right max array and left max array
      //4 - trapaed water = waterlevel- height[i](current bar height)
      
      //left max array
      int n = height.length;
      int leftmax[] = new int[n];
      leftmax[0] = height[0];
      for(int i=1; i<n; i++){
        leftmax[i] = Math.max(height[i],leftmax[i-1]);
      }
      
      //right max array
      int rightmax[] = new int[n];
      rightmax[n-1] =  height[n-1];
      for(int i=n-2;i>=0;i--){
        rightmax[i] = Math.max(height[i],rightmax[i+1]);
      }

      int trappedwater = 0;
      for(int i =0; i<n; i++){
         //waterlevel
         int waterlevel = Math.min(rightmax[i],leftmax[i]);
         trappedwater+= waterlevel-height[i];
      }

      return trappedwater; 
    }
 
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
       System.out.println("the total trapped water is = "+trappingrainwaterfunc(height));
        
        
    }
}
