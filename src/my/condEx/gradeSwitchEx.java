package my.condEx;

public class gradeSwitchEx {
    public static void main(String[] args){
        String grade ="B";
        String score;

        switch (grade){
            case "A":
                score = "탁월한 성과입니다.";
            break;
            case "B":
                score = "좋은 성과입니다.";
            break;
            case "C":
                score = "준수한 성과입니다.";
            break;
            case "D":
                score = "향상이 필요합니다.";
            break;
            case "F":
                score = "불합격입니다.";
            break;
            default:
                score = "잘못된 학점입니다.";
        }
        System.out.println(score);
    }
}
