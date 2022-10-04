import java.util.Scanner;

public class MoneyCount {
    public static void main(String[] args) {

        int result;
        int[] moneyCount = {50000, 10000, 5000, 1000, 500, 100, 10 , 1};
        int[] moneyResult = new int[8];

        System.out.println("금액을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int moneyInput = sc.nextInt();



        for(int i=0 ; i<8; i++){

            moneyResult[i] = moneyInput / moneyCount[i];
            moneyInput = moneyInput % moneyCount[i];
            System.out.println(moneyCount[i]+ "원:" + moneyResult[i]+"개");




        }

    }
}
