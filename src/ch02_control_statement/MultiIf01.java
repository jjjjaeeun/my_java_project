package ch02_control_statement;

public class MultiIf01 {
    public static void main(String[] args) {
        int temperature = 1;

        String message;

        if(temperature>=35){
            message = "폭염 경보";
        } else if(temperature>=30) {
            message= "무더운 날씨";
        } else if(temperature>=20) {
            message= "쾌적한 날씨";

        }
            else if(temperature>=10) {
            message= "쌀쌀한 날씨";
        } else {
                message="추운 날씨";
        }

        String _message = temperature +"도는 " + message +"입니다.";
        System.out.println(_message);
    }
}
