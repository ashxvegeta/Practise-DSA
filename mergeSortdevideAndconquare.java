public class mergeSortdevideAndconquare {
    
    //function for printing the sorted array
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
    }

    public static void mergeSort(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        //now find out the middle
        int mid = si+(ei-si)/2;

        // call recursive funtion for left side sorted array
        mergeSort(arr,si,mid);//it will go from strating index to mid index

        //call recursive function for right side sorted array
        mergeSort(arr, mid+1, ei);//it will go from mid+1 to ending index 

        //now will merge both right side and left side sorted array
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si, int mid ,int ei){
        
        int temp [] = new int[ei-si+1];//temporary array 
       // why [ei-si+1]  left(0,3) right(4,6) 
       //need to 7 size of array (6-0+1=7) ei=6 si =0 
       
       //now we have to make iterator for left and right side array and for 
       //temporary array for tracking the current index
       int i = si; //iterator for left part
       int j = mid+1; //iterator for right part
       int k =0; //iterator for temporary array

       while(i<=mid && j<=ei){

        if(arr[i]<arr[j]){
            temp[k] = arr[i];
            i++;k++;
        }else{
            temp[k] = arr[j];
            j++; k++;
        }

       }
    //    for left over elmenets because may be left array is 
    //    fully copied in temp array but some left from rigft array

    //left part
    while(i<=mid){
        temp[k++] = arr[i++];
    }
    //right part array
    while(j<=ei){
        temp[k++] = arr[j++];
    }
    //now will copy temporary array to orignal array
    for(k=0,i=si;k<temp.length;k++,i++){
        arr[i] = temp[k];
    }
    }
    
    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
