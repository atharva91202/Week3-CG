package linearsearch.firstnegative;

public class firstNegative {
    public static void main(String[] args) {
        int [] numberArray = {1,2,3,4,5,-1,-6};
        int flag =0;
        for (int i =0; i<= numberArray.length;i++) {
            if (numberArray[i] < 0) {
                System.out.println("The index of first negative number is " + i);
                flag = 1;
                break;
            }
        }
             if (flag == 0){
                 System.out.println(-1);
             }
    }
}
