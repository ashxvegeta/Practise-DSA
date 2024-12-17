public class stringCompare {

    public static void main(String[] args){
       String s1 = "tony";
       String s2 = "tony";
       String s3 = new String("tony");

       if(s1==s2){
        System.out.println("string are equals");
       }else{
        System.out.println("string are not equals");
       }
    //    if(s1==s3){
    //     System.out.println("string are equals");
    //    }else{
    //     System.out.println("string are not equals");
    //    }

    if(s1.equals(s3)){
        System.out.println("string are  equals");
    }else{
        System.out.println("string are not equals");
    }
    
    }

}
