package ch01_variavle_operator;

public class MyBox {
    public static void main(String[] args) {
        double width;
        double height;
        double area;
        double perimeter;

        width= 10.0;
        height= 5.0;
        area= width*height;
        perimeter= (width+height) * 2;

        System.out.println("너비 : "+ width);
        System.out.println("높이 : " + height);
        System.out.println("사각형의 넓이 : " + area);
        System.out.println("사각형의 둘레 : " + perimeter);


    }
}
