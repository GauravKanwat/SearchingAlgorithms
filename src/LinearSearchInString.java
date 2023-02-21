import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "Gaurav";
        char target = in.next().charAt(0);
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(linearSearchInStrings(name, target));
    }
    static boolean linearSearchInStrings(String name,char target) {
        if(name.length() == 0)
            return false;
        for (int i = 0; i < name.length(); i++) {
            if(target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
