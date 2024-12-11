public class stringscharat {
    
    public static void main(String[] args) {
        String fullname = "Ashutosh roy";
        System.out.println(fullname.charAt(0));
        printletter(fullname);
    }


    public static void  printletter(String fullname){
        for (int i = 0; i < fullname.length(); i++) {
            System.out.print(fullname.charAt(i)+" ");
        }
    }
}
