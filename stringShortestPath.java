import java.util.*;
public class stringShortestPath {
    public static float ShortestPath(String path) {
          int x =0;
          int y =0;
          
          for (int i = 0; i < path.length(); i++) {
               char dir = path.charAt(i);
               if(dir=='N'){
                y++;
               }
               else if(dir=='S'){
                y--; 
               }
               else if(dir=='W'){
                 x--;
               }
               else{
                x++;
               }
          }
           

          int X2 = x*x;  //(x2-x1)ka square
          int Y2 = y*y;  //(y2-y1)ka s
          return  (float)Math.sqrt(X2+Y2);

    }

    public static void main(String[] args){
        String path = "WNEENESENNN";
        System.out.println(ShortestPath(path));
    }

}
