package ch01_variavle_operator;

public class Casting {
    public static void main(String[] args) {

        double d = 100;
        System.out.println("d : " + d);

        int i = (int) 12.5 ;
        System.out.println( "i = " + i );

        System.out.println(14/5);

        System.out.println((double) 14/5);
        //(double) 14/5 >명시적> 14.0/5 >암시적> 14.0/5.0 >2.8

        System.out.println((double) (14/5));
        //(double) (14/5) >산술연산> (double)(2) >명시적> 2.0

        int kor = 50, eng = 60, math= 80;
        int total = kor + eng + math;
        double average = (double)total / 3;

        System.out.println("총점: " + total);
        System.out.println("평균: " + average);

        char ch1 = 'c';
        char ch2 = 'a';

        // 암시적 형변환 c=99 > a=97
        boolean bool1 = ch1 > ch2;
        System.out.println("bool1 : " + bool1);

        int result = ch1 - ch2 + 5 ;
        System.out.println( "result: " + result );

        char ch3 = 'D';

        String srt = ch3 >= 'A' && ch3 <= 'Z' ? "yes" : "no" ;
        System.out.println("대문자 판단 : " + srt );



    }
}
