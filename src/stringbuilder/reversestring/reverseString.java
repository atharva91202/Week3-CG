package stringbuilder.reversestring;

public class reverseString {
    public static String reverse(String input){
       StringBuilder sb = new StringBuilder(input);
       return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String userinput = "Hello";
        System.out.println(reverse(userinput));
    }
}
