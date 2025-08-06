package ch06_abstract_interface.myshape.beveragetest;

public class Espresso extends Beverage {
    private int shot;

    public Espresso(String name, double price, int shot) {
        super(name, price);
        this.shot = shot;
    }

    @Override
    public void drink() {
        System.out.println(super.getName() + "맛이 진하고 강렬한 에스프레소를 마십니다.");
    }

    @Override
    public void make() {
        System.out.println(super.getProductName());
        System.out.println("원두를 갈아 템퍼로 눌러줍니다");
        System.out.println("포터필터를 머신에 장착하고, 25~30초 동안 30ml의 에스프레소를 추출합니다.");
        System.out.println("컵에 에스프레소" + this.shot + "샷을 담아줍니다");
    }
}
