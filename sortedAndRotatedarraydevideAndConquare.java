public class sortedAndRotatedarraydevideAndConquare {

    public static int search(int[] arr, int target, int si, int ei) {

        // base case
        if(si>ei){
            return -1 ;
        }

        int mid = si + (ei-si)/2;

        // find the target in starting
        if(arr[mid] == target){
            return mid;
        }

        // mid on line 1
        if(arr[si]<=arr[mid]){

            // search on left
            if(arr[si]<=target && target<=arr[mid]){
                return search(arr,target,si,mid-1);

            }
            // search on right
            else{
            return search(arr,target,mid+1,ei);
            }
            
        }
        // mid on line 2
        else{
            if(arr[mid]<=target && target<=arr[ei]){
                return search(arr,target,mid+1,ei);

            }else{
                return search(arr,target,si,mid-1);

            }
        }

    }
    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 6;
        int tarIndex = search(arr, target, 0, arr.length - 1);
        System.out.println(tarIndex);
    }
}
