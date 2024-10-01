package loop;

public class For1 {
    public static void main(String[] args){
        /*for(1.초기식; 2.조건식; 4.증감식){
        3.코드
         */
        int sum = 0;
        int endNum = 3;

        for(int i = 1; i <= endNum; i++){
            sum = sum + i;
            System.out.println("i = " + i +", sum = " + sum);
        }

    }
}
