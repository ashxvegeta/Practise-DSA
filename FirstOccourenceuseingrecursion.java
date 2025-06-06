public class FirstOccourenceuseingrecursion {
    

    public static int  findfirstoccourence(int arr[],int key,int index){

        //means we have checked all the array and did't find the key
        if(index == arr.length){
           return -1;
        }
        //find the key
        if(arr[index] == key){
             return index;
        }
        //recursivly calling
       return findfirstoccourence(arr,key,index+1);

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 5;
        System.out.println(findfirstoccourence(arr,key,0));
    }
}
