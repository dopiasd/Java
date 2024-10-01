package variable;

public class Var2 {
    public static void main(String[] args){
        int a = 100; //정수
        double b = 10.5; //실수
        boolean c = true; //불리언 true or false 둘 중 하나
        char d = 'A'; //문자하나
        String e = "Hello java"; // 문자열을 다루기 위한 타입

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        //정수
        byte q = 127; //-128~127
        short s =32767; // -32,768~9,32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647(약 20억)
        long l = 9223372036854775007L; //제일 길다 뒤에 대소문자 구분 없이 l붙이기
        //실수
        float f = 10.0f; //뒤에 f붙이기
        double z = 10.0;

        //그 외 잘 안쓰는 변수 타입 byte,short,float(표현길이와 정밀도 낮음 실수형은 double사용),char(그냥 String 쓰면됨)
    }
}
