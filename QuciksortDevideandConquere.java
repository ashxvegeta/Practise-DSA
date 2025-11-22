public class QuciksortDevideandConquere {
    
    //function for printing the sorted array
    public static void printArr(int arr[]){
       for(int i =0 ;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
       System.out.println();
    }

    // quick sort function
    // 1.find pivot
    // 2.do partition
    //3.call left and right array recusivly
    public static void quickSort(int arr[],int si, int ei){
        // base case
        if(si>ei){
            return;
        }
        int pidx = partition(arr,si,ei);
        quickSort(arr, si, pidx-1);//for left array
        quickSort(arr, pidx+1, ei);//for right array
    }

    public static int  partition(int arr[],int si,int ei){
        int pivot = arr[ei];// find pivot
        int i = si-1; // to make the space for elements which are smaller than 
        for(int j = si; j<ei ;j++){
            //now swap all the elements
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // for finding the right index of pivot
        i++;
        int temp = pivot;
        arr[ei] = arr[i] ;// pivot our ending index
        arr[i] = pivot;
        return i ;




    }



    public static void main(String args[]){
        int arr[] = {6,3,9,8,2,5};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
