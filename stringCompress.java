public class stringCompress {
    
 
    public static String compressString(String str){
        String newStr = " ";
        //aaabc
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            //why we took str.length()-1 instead of str.length bcoz we comparing i with i+1 apne se ek age wale charcter kesath comapre kr
            //rahe jb tk same hai count badhate rahege i++ karte raehge 
            while(i<str.length()-1 &&  str.charAt(i)== str.charAt(i+1)){
                  count++;
                  i++;
            }
            newStr += str.charAt(i);
            if(count>1){
                newStr += count.toString();
            }

        }

        return newStr;

    }


    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compressString(str));
     
    }
}
