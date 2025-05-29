public class SortedornotarrayusingResucrison {
    

    public static boolean isSorted(int arr[],int i) {
        
        //jb last mai index aur i ki value same ho jaye to reutrn true because puri array check ho chuki hai
        // yani sorted hai to true agar soted nahi hoti to bech mai kahi ruk jate
        if (i==arr.length-1) {
            return true;
        }
        // pichla number array ka aage wale number se bada hai yani sorted nahi hai alreday to false
        if (arr[i]>arr[i+1]) {
            return false;
        }
        //array aur uske aaage wale array check karne k lia recusive calls
        return  isSorted(arr, i+1);
    }

    public  static void main(String[] args){

        int arr[] =  {1,2,3,4,5};
        int i = 0;
        System.out.println(isSorted(arr,i));
    }
}
