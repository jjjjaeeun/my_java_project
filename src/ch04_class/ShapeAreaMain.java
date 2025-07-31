package ch04_class;

public class ShapeAreaMain {
    public static void main(String[] args) {

        ShapeArea obj = new ShapeArea();

        int a = 5, b = 10, c = 15;

        //메소드 오버로딩
        obj.area(b); // 원
        obj.area(a, b); // 사각형
        obj.area(a, b, c); // 사다리꼴

        double ap = obj.area(b);
        System.out.println("원의 면적: " + ap);

        int ab = obj.area(a, b);
        System.out.println("사각형의 면적: " + ab);


        double acb = obj.area(a, c, b);
        System.out.println("사다리꼴의 면적: " + acb);

    }
}
