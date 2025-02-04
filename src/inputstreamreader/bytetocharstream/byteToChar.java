package inputstreamreader.bytetocharstream;

import java.io.*;

public class byteToChar {
    public static void main(String[] args) {
        String path = "C:\\CG\\Week3-CG\\src\\Sample.txt";
        String charset ="UTf-8";
        try(FileInputStream fileInputStream = new FileInputStream(path);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,charset);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader)){
        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        }catch (UnsupportedEncodingException e){
            System.out.println("Unsupported Encoding" + e.getMessage());
        }catch (FileNotFoundException e){
            System.out.println("File not found" + e.getMessage());
        }catch (IOException e){
            System.out.println("IO Exception" + e.getMessage());
        }
    }
}
