package challengeproblem1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class challengeproblem {
    public static void stringBuilderAndBuffer(String input){
        int iterations = 10;
          long start1 = System.nanoTime();
          StringBuilder stringBuilder = new StringBuilder(input);
          for (int i =0;i<=iterations;i++){
              stringBuilder.append(input);
          }
          long end1 = System.nanoTime();
          long duration1 = (end1 - start1)/iterations;
        System.out.println("Time taken by String Builder is " + duration1);

        long start2 = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer(input);
        for (int i = 0 ; i<=iterations;i++){
            stringBuffer.append(input);
        }
        long end2 = System.nanoTime();
        long duration2 = (end2-start2)/iterations;
        System.out.println("Time taken by String Buffer is " + duration2);
    }

    public static void fileReaderAndInputStream(String filepath){
       try(FileReader fileReader = new FileReader(filepath);
           BufferedReader bufferedReader = new BufferedReader(fileReader)){
           long startTime = System.nanoTime();
           int wordcount= 0;
           String line;
           while((line = bufferedReader.readLine()) != null){
            String [] words = line.split("\\s+");
               wordcount += words.length;
           }
           long endTime = System.nanoTime();
           long duration = endTime - startTime;
           System.out.println("Total word count is " + wordcount);
           System.out.println("Duration is " + duration);
       }catch (FileNotFoundException e){
           System.out.println("File not found exception " + e.getMessage());
       }catch (IOException e){
           System.out.println("Unable to read file " + e.getMessage());
       }
    }

    public static void main(String[] args) {
       String input = "Hello";
       String path = "C:\\CapgeminiHandsOn\\learnings\\Java Strings Notes.docx";
       stringBuilderAndBuffer(input);
       fileReaderAndInputStream(path);
    }
}
