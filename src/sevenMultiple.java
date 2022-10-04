import java.util.*;

public class sevenMultiple {
    public static String getMultiple (int num){
        if( num % 7 ==0 ){
            return "multiple";
        } else {
            return "not multiple";
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        String result = getMultiple(input);
        System.out.println(result);

    }
}
