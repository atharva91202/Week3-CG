package stringbuffer.concatenatestrings;

public class concatenatestring {
    public static String concatenation(String arr[]){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i<arr.length; i++){
               sb.append(arr[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String arr[] = {"Hey","My","Name","is","Atharva"};
        System.out.println(concatenation(arr));
    }
}
