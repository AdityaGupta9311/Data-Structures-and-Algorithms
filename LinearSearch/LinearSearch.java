import java.util.Arrays;

public class LinearSearch {
    
    static boolean searchstr(String name, char target){
        if(name.length()==0){
            return false;
        }
        for(int i = 0; i<=name.length(); i++){
           if (target == name.charAt(i)) {
            return true;
           }
           else{
            return false;
           }
        }
        return false;
    }

    static boolean searchstr2(String name, char target){
        if(name.length()==0){
            return false;
        }
        for(char ch : name.toCharArray()){
            if (target==ch) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String name ="Aditya";
        char target = 'b';

        System.out.println(searchstr(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));

    }
}
