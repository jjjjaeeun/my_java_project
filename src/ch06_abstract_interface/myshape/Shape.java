package ch06_abstract_interface.myshape;

public abstract class Shape {
    //일반화: 모든 도형에서 사용하는 면적, 둘레, 라인 색상, 채우기 생상등은 수퍼 클래스에서 사용
    private String linecolcr; //라인 색상
    private String fillcolcr; // 채우기 색상
    protected double area; // 면적
    protected double perimeter;// 도형 둘레

    //추상 메소드는 추상 클래스 안에만 있어야 함
    //내용이 정의되지 않는 모델 개념으로, 불완전한 메소드
    public abstract double calcArea();
    public abstract double calcPerimeter();
    public abstract void display();

    //final 메소드는 오버라이딩 금지(강제성)
    protected final void draw(){
        System.out.println("라인 색상:"+ this.linecolcr);
        System.out.println("채우기 색상:"+ this.fillcolcr);
    }

    public Shape() {
    }

    public Shape(String linecolcr, String fillcolcr) {
        this.linecolcr = linecolcr;
        this.fillcolcr = fillcolcr;
    }


}
