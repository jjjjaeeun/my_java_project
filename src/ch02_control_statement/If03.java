package ch02_control_statement;

public class If03 {
    public static void main(String[] args) {
        int su = 124;

        if(su%3 == 0){
            System.out.println(su +"은(는) 3의 배수입니다.");
            System.out.println( su*su );

        } else {
            System.out.println(su+"은(는) 3의 배수가 아닙니다.");
            System.out.println( su + 5);

        }

    }
}
