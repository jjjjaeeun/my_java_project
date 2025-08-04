package ch05_package_inheritance.mybeverage;

public class InheTest04 {
    public static void main(String[] args) {
        //클래스이름 객체이름=new 생성자이름();

        //승급: 서브 클래스가 일시적으로 슈퍼 클래스의 타입으로 변환 = 업캐스팅(Upcasting)
        Beverage04 beverage01 = new Americano04("아메리카노", 4000.0, 250.0);

        //슈퍼 클래스 내에 있는 메소드는 상속 개념에 의하여 접근이 가능
        //private 사용시 접근 불가
        beverage01.showInfo();

        //승급시 서브 클래스 내의 변수와 메소드는 일시적으로 접근을 하지못하도록 설계되어있음
        //다운클래스를 하게 되면 서브클래스 내의 변수와 메소드 접근 가능
        //명시적으로 형변환해야 함
        Americano04 ame =(Americano04) beverage01; //강등, 다운캐스팅(Downcasting)

        ame.sipAmericano();
    }
}
