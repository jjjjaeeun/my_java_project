package ch01_variavle_operator;

public class PlusMinus01 {
    public static void main(String[] args) {

        int a = 10 , b = 20,  c ;

        c = ++a + b++ ;
//순서 >   3   1 2  4
//변수 왼쪽 연산자가 제일 먼저 적용 오른쪽 연산자는 가장 마지막 적용

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

        c = a++ + --b ;
//순서 >   3  4  2  1

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

        a= 15;
        b= 12;
        c= --a + --b;

        System.out.println("a : " + a); // 14
        System.out.println("b : " + b); // 11
        System.out.println("c : " + c); // 25

        a = 10;
        b = 20;

        ++a; // 11
        b--; // 19
        c = ++a + b--; // a= 12, c = 31 , b = 18

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

    }
}
