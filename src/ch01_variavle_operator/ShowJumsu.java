package ch01_variavle_operator;

public class ShowJumsu {
    public static void main(String[] args) {

        String name ;
        double kor ; // 국어
        double eng ; // 영어
        double avg ; // 평균

        name = "홍길동" ;
        kor = 40.0 ;
        eng = 43.0 ;
        avg = (kor + eng)/2 ;

        System.out.println("이름 : " + name);
        System.out.println("국어 : " + kor);
        System.out.println("영어 : " + eng);
        System.out.println("평균 : "+ avg);
    }
}
