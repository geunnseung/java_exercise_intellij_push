public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("hello");
        // 10칸의 int array를 만들고
        // 1부터 10까지 채우기
        // 출력

        int[] intNum = new int[10];

        for(int i=0; i<10 ; i++){
            intNum[i] = i+1;
            System.out.println(intNum[i]);
        }


    }
}
