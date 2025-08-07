package ch06_abstract_interface;

import ch06_abstract_interface.myshape.Shape;

public class Triangle extends Shape {

    private double width; // 너비
    private double height;//높이

    /*@Override
    protected void draw() {
        System.out.println("하하");
    }*/

    public Triangle(String linecolcr, String fillcolcr, double width, double height) {
        super(linecolcr, fillcolcr);
        this.width = width;
        this.height = height;
    }

    //추상 클래스를 상속 받고 있으면 반드시 추상메소드를 오버라이딩 해야함
    // Implementation: 구체화
    @Override
    public double calcArea() { //각 클래스는 역할을 여기에 구현
        return this.width * this.height / 2.0;
    }

    @Override
    public double calcPerimeter() {
        return 20.0;//편의상 둘레
    }

    @Override
    public void display() {
        super.area = this.calcArea();
        super.perimeter = this.calcPerimeter();
        System.out.println("삼각형 정보");
        System.out.println("면적: " + super.area);
        System.out.println("둘레: " + super.perimeter);
    }


}
