package ch01_variavle_operator;

public class Increment01 {
    public static void main(String[] args) {
        int x = 5 ;

        x += 3; // x = x + 3; > 누적된다
        System.out.println("x: " + x);

        x *= 4; // x = x * 4; > 누적되서 x = 8 >32
        System.out.println("x: " + x);

        x %= 5;// x = 32 > 2
        System.out.println("x: " + x);

        x -= 1; // x = 2 > 1
        System.out.println("x: " + x);

        x += 7; // x = 1 > 8
        System.out.println("x: " + x);
    }
}
