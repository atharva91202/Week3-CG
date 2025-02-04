package filereader.countoccurance;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class occuranceCounter {
    public static void main(String[] args) {
        String filepath = "C:\\CG\\Week3-CG\\src\\Sample.txt";
        String target ="World";
        int count = 0;
        try(FileReader fileReader = new FileReader(filepath);
        BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line ;
            while((line = bufferedReader.readLine()) != null){
                String [] words = line.split("\\s+|\\p{Punct}");
                for (String word : words){
                    if(word.equals(target)){
                        count++;
                    }
                }
            }
            System.out.println("The word " + target + " appears " + count + " times" );
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
