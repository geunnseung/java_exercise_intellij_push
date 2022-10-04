import java.util.*;

public class EvenOdd2Refactoring {
    public static String getEvenOdd(int num) {
        //메소드 추상화 - 중복 제거 !!!
        //숫자를 받아서 짝수 홀수 리턴
        if ( num % 2 ==0 ){
            return "짝수";
        } else {
            return "홀수";
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        int resultNum = firstNum + secondNum;

        String sFirstNum = getEvenOdd(firstNum);
        String sSecondNum = getEvenOdd(secondNum);
        String sresultNum = getEvenOdd(resultNum);

        System.out.printf("%s+%s=%s", sFirstNum,sSecondNum,sresultNum);

    }
}
