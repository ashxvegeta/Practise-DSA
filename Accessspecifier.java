public class Accessspecifier {
    
    public static void main(String args[]) {
        
        BackAccount myacc = new BackAccount();
        
        myacc.username = "John";
        
        myacc.password("abcd");  // this wll give error as password is private

        myacc.setPassword("1234");
    }
}


class BackAccount {

    public String username;
    private  String password;

    public void setPassword(String  pwd){
        password = pwd;
    }
    
}