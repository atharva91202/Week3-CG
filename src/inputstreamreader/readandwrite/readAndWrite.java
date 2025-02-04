package inputstreamreader.readandwrite;

import javax.imageio.IIOException;
import java.io.*;

public class readAndWrite {
    public static void main(String[] args) {
        String path = "C:\\CG\\Week3-CG\\src\\Sample.txt";
        BufferedReader userinput = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String input;
            System.out.println("Enter text(Type 'exit' to stop):");
            while (!(input = userinput.readLine()).equalsIgnoreCase("exit")) {
                bufferedWriter.write(input);
                bufferedWriter.newLine();
            }
            System.out.println("input has been written to " + path);
        } catch (IOException e) {
            System.out.println("Error occurred while reading input or writing to file " + e.getMessage());
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
  }

