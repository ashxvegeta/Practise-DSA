public class stringcompressQuerybulider {
   
    public static String compressString(String str){
        StringBuilder strnew = new StringBuilder("");
        // String strnew = " ";
        for (int i = 0; i < str.length(); i++) {
          Integer count = 1;
          while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                 count++;
                 i++;
          }
          strnew.append(str.charAt(i));
          if(count>1){
            strnew.append(count.toString());
          }

        }
        return strnew.toString();
         
      }
      public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compressString(str));
      }
   
}
