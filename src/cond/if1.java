package cond;

public class if1 {

    public static void main(String[] args){
        int age = 20;//사용자나이

       /* if (age >= 18){
            System.out.println("성인입니다.");
        }
       if (20 >= 18) { "성인입니다"}//age의 값은 20이다.
        if (true){"성인입니다"}//조건이 참으로 판명된다.
        {"성인입니다"}//if문에 있는 코드 블록이 실행된다.

        if (age < 18) {
            System.out.println("미성년자입니다.");
        }
       /* if (20 <= 18) { "미셩년자입니다"}//age의 값은 20이다.
        if (false){"미셩년자입니다"}//조건이 참으로 판명된다.
        {"미셩년자입니다"}//if문에 있는 코드 블록이 실행된다. */

        if(age >= 18){
            System.out.println("성인입니다.");//참일때
        } else {
            System.out.println("미성년자입니다.");//만족하는값이없을때
        }

    }
}
