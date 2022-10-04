import java.util.Scanner;

public class MoneyCount {
    public static void main(String[] args) {


        int[] moneyCount = {50000, 10000, 5000, 1000, 500, 100, 10 , 1};
        int[] moneyResult = new int[8];

        System.out.println("금액을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int moneyInput = sc.nextInt();



        for(int i=0 ; i<moneyResult.length; i++){

            moneyResult[i] = moneyInput / moneyCount[i];
            moneyInput = moneyInput % moneyCount[i];
            //System.out.println(moneyCount[i]+ "원:" + moneyResult[i]+"개");
            System.out.printf("%d원 : %d개 나머지 : %d\n", moneyCount[i], moneyResult[i], moneyInput);



        }

    }
}
