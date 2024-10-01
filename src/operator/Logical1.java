package operator;

public class Logical1 {
    public static void main(String[] args){
        System.out.println("&&: AND 연산"); //두 피연산자 모두 참이여야 true 반환
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("||: OR 연산"); //두 피연산자 중 하나라도 참이면 true 반환
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("! 연산"); //피연산자의 논리적 부정을 반환. 참이면 거짓을 거짓이면 참 반환
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);
    }
}
