package ch04_class;

public class ShapeArea {

    double PI = 3.141592;


    double area(int a) {
        double ap = 0;
        ap = a * a * PI;
        return ap;
    }


    int area(int a, int b) {
        int ab = 0;
        ab = a * b;
        return ab;
    }

    double area(int a, int b, int c) {
        double abc = 0;
        abc = (a + b) * c / 2;
        return abc;
    }
    //public void area(int top, int bottom, int width){
    // double area=(double)(top+bottom)*width/2.0;
    // System.out.println("사다리꼴의 면적: "+ area);}
}
