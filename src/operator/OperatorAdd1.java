package operator;

public class OperatorAdd1 {

    public static void main(String[] args){
        int a = 0;

        a = a + 1;
        System.out.println("a = " + a);//1

        a = a + 2;
        System.out.println("a = " + a);//3

        //전위 증감 연산자
        int c = 1;
        int d = 0;

        d = ++c; //c값을 먼저 증가시키고, 그 결과를 d에 대입
        System.out.println("c = " + c + ", d = " + d);

        //후위 증감 연산자
        c = 1; //a값을 다시 1로 지정
        d = 0; //d값을 다시 0으로 지정

        d = c++; //c의 현재 값을 d에 먼저 대입하고, 그 후 c값을 증가시킴
        System.out.println("c = " + c + ", d = " + d);


    }
}
