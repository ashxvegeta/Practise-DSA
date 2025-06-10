public class LastOccourecenusingrecursion {
    

    public static int  findlastoccourence(int arr[],int key,int i){

     
        if(i == arr.length){
            return -1;
        }

       int isfound = findlastoccourence(arr,key,i+1);
       // means it's a valid i where we found the key
       if(isfound != -1){
             return isfound;
       }
       if(arr[i] == key){
        return i;
       }
       return isfound;

    }

    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int key = 5;
        System.out.println(findlastoccourence(arr,key,0));
    }
}
