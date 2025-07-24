package ch01_variavle_operator;

public class TernaryOperator {
    public static void main(String[] args) {

        int a= 3, b = 5;
        int result = a>=b ?a-b : b-a ; // 조건식 ? 참일때 : 거짓일때;

        System.out.println("절대 값:" + result);

        int x = 10 ;
        result = x%2 == 0 ? x + 3 : x * x; // 조건식이 짝수면 ? +3 : 홀수면 제곱;

        System.out.println("짝수면:" + result);

        x = 8;
        int y = 4;
        result = x>=y ? x : y ;

        System.out.println("큰 수:" + result);

        result = x<=y ? x : y ;

        System.out.println("작은 수 :" + result);

        x=5;
        y=12;

        char str = y%x == 0 ? 'y' : 'n';

        System.out.println(" 약수 :" + str);

        int su = 7;
        // 숫자 7은(는) 홀수입니다.

        String message = su%2 == 0 ? "짝수" : "홀수" ;

        System.out.println( "숫자 " + su + "은(는) " + message + "입니다.");

        int score= 85 ; // 60점 이상이면 합격
        // 85점이므로 합격입니다.

        String msg = score >= 60 ? "합격" :"불합격" ;

        System.out.println( score + "점이므로 "+ msg + "입니다.");


    }
}
