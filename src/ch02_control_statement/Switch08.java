package ch02_control_statement;

public class Switch08 {
    public static void main(String[] args) {
        int month = 10;
        switch (month) {
            case 3: case 4: case 5:
                System.out.println(month +"월은 봄입니다."); break;
            case 6: case 7: case 8:
                System.out.println(month+"월은 여름입니다."); break;
            case 9: case 10: case 11:
                System.out.println(month+"월은 가을입니다."); break;
            case 1: case 2: case 12:
                System.out.println(month+"월은 겨울입니다."); break;
            default:
                System.out.println("올바르지 않는 월 형식입니다.");
        }
    }
}
