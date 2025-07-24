package ch01_variavle_operator;

public class PlusMinus02 {
    public static void main(String[] args) {
        int x = 3, y = 5, z;

        z = x++ + --y; // 4+3

        System.out.println("x = " + x); // 4
        System.out.println("y = " + y); // 4
        System.out.println("z = " + z); // 7

        z += --x + y++; // > z = z + --x + y++; 3+7+4

        System.out.println("x = " + x); // 3
        System.out.println("y = " + y); // 5
        System.out.println("z = " + z); // 14
    }
}
