package stringbuilder.duplicateremoval;
import java.util.HashSet;
public class removeDuplicate {
    public static String duplicates(String input){
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();
        for (char c : input.toCharArray()){
            if(!seen.contains(c)){
                seen.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
         String st = "rremovvalee";
        System.out.println(duplicates(st));
    }
}
