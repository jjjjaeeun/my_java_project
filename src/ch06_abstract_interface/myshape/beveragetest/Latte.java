package ch06_abstract_interface.myshape.beveragetest;

public class Latte extends Beverage {
    private String milk;

    public Latte(String name, double price, String milk) {
        super(name, price);
        this.milk = milk;
    }

    @Override
    public void drink() {
        System.out.println(super.getName() + "부드럽고 크리미한 " + super.getName() + "를 마십니다.");
    }

    @Override
    public void make() {
        System.out.println(super.getProductName());
        System.out.println("에스프레소 1샷을 추출합니다.");
        System.out.println(this.milk + "에 샷을 넣습니다.");
    }
}
