

// Question 1 For a given integer array of size N. You have to find all the occurrences (indices) of a given element (Key) and print them. Use a recursive function to solve this problem

// Sample Input arr[] = (3.2, 4, 5, 6, 2, 7. 2. 2), key = 2

// Sample Output: 1578

public class precticeQuestionrecursionOne {
    
    public static void printOC(int[] arr,int i,int key){
        if(i == arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.println(i);
        }
        printOC(arr,i+1,key);
    }

    

    public static void main(String args[]){
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int i =0;
        int key = 2;
        printOC(arr,i,key);
    }
}
