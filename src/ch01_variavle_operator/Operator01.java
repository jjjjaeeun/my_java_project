package ch01_variavle_operator;

public class Operator01 {
    public static void main(String[] args) {

        int a = 10 ;
        int b = 8 ;

        boolean bool1 = a != b ; //
        boolean bool2 = --a == b++ ; // --a=9 == b  false // b-- = 9
        boolean bool3 = a++ != --b ;  // a=9 != --b=8 // a++ = 10
        boolean bool4 = bool3 && (5>7) ; // true && false > false
        boolean bool5 = !bool4 || ( bool1 && bool2 ) ; // !false = true || ((true && false)> false) > true

        System.out.println("bool1 : " + bool1);
        System.out.println("bool2 : " + bool2);
        System.out.println("bool3 : " + bool3);
        System.out.println("bool4 : " + bool4);
        System.out.println("bool5 : " + bool5);


    }
}
