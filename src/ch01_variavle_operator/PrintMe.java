package ch01_variavle_operator;

public class PrintMe {
    public static void main(String[] args) {
        String name ;
        int age ;
        double height ;
        double weight ;
        String blood ;
        char munja = 'd'; //정의함과 동시에 할당 가능
        boolean bool ;

        name = "홍길동" ;
        age = 30 ;
        height = 175.2 ;
        weight = 75.8 ;
        blood = "AB" ;
//        munja = 'd' ;
        bool = false ;

        String messag = "이름 : " + name ;
        System.out.println(messag);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);
        System.out.println("혈액형 : " + blood);
        System.out.println("문자 : " + munja);
        System.out.println("진위 : " + bool);
    }
}
