package operator;

public class Operator3 {

    public static void main(String[] args){
        int sum1 = 1 + 2 * 3; //1 + (2 * 3)
        int sum2 = (1 + 2) * 3;
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);

        int sum3 = 2 * 2 + 3 * 3;
        int sum4 = (2 * 2) + (3 * 3); // 보기에 훨씬 명확하기 때문에 괄호를 쓰는게 효율적 코드는 최대한 단순하게
        System.out.println("sum4 = " + sum4);
        System.out.println("sum3 = " + sum3);

    }
}
