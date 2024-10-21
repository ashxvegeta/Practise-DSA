import java.util.*;

public class selection_sort {
   

    public static void selectionsort(int arr[]) {
        
        for (int i = 0; i < arr.length-1; i++) {
            int minimumpos = i;
             for (int j = i+1; j <= arr.length-1; j++) {
                  if(arr[minimumpos]>arr[j]){
                    minimumpos = j;
                  }
             }

             int temp = arr[minimumpos];
             arr[minimumpos] = arr[i];
             arr[i] = temp;
        }
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        
   int arr[] ={5,4,1,3,2};
   selectionsort(arr);  
   printarr(arr);

    }
}
