public class RemoveDublicatesUsingRecusion{
    public static void removedublicates(String str, int idx, StringBuilder newstring , boolean[] map){ 

        if(idx == str.length()){
            System.out.println(newstring);
            return;
        }
        //now kaam start hoga
        char curentChar = str.charAt(idx);
        if(map[curentChar-'a']==true){
            //means we have already seen this character
            removedublicates(str, idx+1, newstring, map);
        }else{
            //means we have not seen this character
            map[curentChar-'a'] = true;
             removedublicates(str, idx+1, newstring.append(curentChar), map);

        } 
    }
        
    


    public static void main(String args[]){
        String str = "appnnacollege";
        removedublicates(str,0,new StringBuilder(),new boolean[26]);
    }
}
