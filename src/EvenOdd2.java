import java.util.*;

public class EvenOdd2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        int resultNum = firstNum + secondNum;

        if ( firstNum % 2 ==0 ){
            System.out.print("짝수");
        }
        else {
            System.out.print("홀수");
        }
        System.out.print("+");
        if ( secondNum % 2 ==0 ){
            System.out.print("짝수");
        }
        else {
            System.out.print("홀수");
        }
        System.out.print("=");

        if(resultNum % 2 == 0 ){
            System.out.print("짝수");
        }
        else{
            System.out.print("홀수");
        }

    }
}
