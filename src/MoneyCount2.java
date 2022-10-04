import java.util.Scanner;

public class MoneyCount2 {
    public static void main(String[] args) {

        System.out.println("금액을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int moneyInput = sc.nextInt();

        int curr1 = 50000;
        int curr2 = 10000;
        int curr3 = 5000;
        int curr4 = 1000;
        int curr5 = 500;
        int curr6 = 100;
        int curr7 = 50;
        int curr8 = 10;


        System.out.printf("%d원 : %d장, 나머지 : %d\n", curr1, moneyInput / curr1,
                moneyInput % curr1);
        moneyInput = moneyInput % curr1;
        System.out.printf("%d원 : %d장, 나머지 : %d\n", curr2, moneyInput / curr2,
                moneyInput % curr2);
        moneyInput = moneyInput % curr2;
        System.out.printf("%d원 : %d장, 나머지 : %d\n", curr3, moneyInput / curr3,
                moneyInput % curr3);
        moneyInput = moneyInput % curr3;
        System.out.printf("%d원 : %d장, 나머지 : %d\n", curr4, moneyInput / curr4,
                moneyInput % curr4);
        moneyInput = moneyInput % curr4;
        System.out.printf("%d원 : %d장, 나머지 : %d\n", curr5, moneyInput / curr5,
                moneyInput % curr5);
        moneyInput = moneyInput % curr6;
        System.out.printf("%d원 : %d장, 나머지 : %d\n", curr6, moneyInput / curr6,
                moneyInput % curr6);
        moneyInput = moneyInput % curr6;
        System.out.printf("%d원 : %d장, 나머지 : %d\n", curr7, moneyInput / curr7,
                moneyInput % curr7);
        moneyInput = moneyInput % curr7;
        System.out.printf("%d원 : %d장, 나머지 : %d\n", curr8, moneyInput / curr8,
                moneyInput % curr8);
        moneyInput = moneyInput % curr8;
    }


}
