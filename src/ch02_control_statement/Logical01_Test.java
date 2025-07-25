package ch02_control_statement;

public class Logical01_Test {
    public static void main(String[] args) {
        int month = 7;

        if(month >=3 && month <=5) {
            System.out.println(month+"월은 봄입니다.");

        } else if(month >=6 && month <=8) {
            System.out.println(month+ "월은 여름입니다.");
        } else if(month >=9 && month <=11) {
            System.out.println(month +"월은 가을입니다.");

        }
            else if(month >=1 && month <=12) {
            System.out.println(month + "월은 겨울입니다.");
        }
    }

}
