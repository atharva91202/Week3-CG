package stringbuffer.compareconcatenation;

public class comapringmethods {
    public static void comparator(String input){
        int iterations = 1000000;
        long start1 = System.nanoTime();
        StringBuilder stringbuilder = new StringBuilder();
        for(int i =0; i<=iterations;i++){
            stringbuilder.append(input);
        }
        long end1 = System.nanoTime();
        long duration1 = (end1 - start1)/iterations;
        System.out.println("Time Taken by String Builder" + duration1);

        long start2 = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0;i<=iterations;i++){
            stringBuffer.append(input);
        }
        long end2 = System.nanoTime();
        long duration2 = (end2-start1)/iterations;
        System.out.println("Time taken by String buffer is " + duration2);
    }

    public static void main(String[] args) {
        String test = "Hello";
        comparator(test);
    }
}
