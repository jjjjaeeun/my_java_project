package ch02_control_statement;

public class MultiIf01_Test {
    public static void main(String[] args) {
        int temperature = 90;

        String ss = temperature>=35 ?"폭염 경보" : temperature>=30 ? "무더운 날씨" : temperature >=20 ?"쾌적한 날씨" : temperature >=10 ? "쌀쌀한 날씨" : "추운 날씨" ;

        System.out.println(temperature+"도는 " +ss +"입니다.");
    }
}
