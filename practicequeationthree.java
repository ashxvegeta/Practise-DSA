public class PracticeQuestionThree {

 public static int countSubstr(String str, int start, int end, int n) {
        // base case: when starting index reaches the end of string

        if(start == n){
            return 0;
        }

        // base case: when ending index exceeds the string length
        if(end == n){
           return  countSubstr(str,start + 1,start + 1, n);
        }

        int count = 0;
        // If start and end characters match
        if(str.charAt(start) == str.charAt(end)){
           count++;
           System.out.println(str.substring(start,end + 1));
        }
        // Move end pointer ahead
        return count + countSubstr(str,start,end + 1,n);
    }

    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();

        int result =  countSubstr(str,0,0,n);
        System.out.println("the count of contious substsring is "+ result);
    }
}
