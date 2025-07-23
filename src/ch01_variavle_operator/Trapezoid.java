package ch01_variavle_operator;

public class Trapezoid {
    public static void main(String[] args) {

        int bottom = 20;
        int top = 10;
        int height = 15;
        int area = (bottom+top)*height/2 ;

        System.out.println("밑변 : " + bottom );
        System.out.println("윗변 : " + top);
        System.out.println("높이 : " + height);
        System.out.println("면적 : " + area);
    }
}
