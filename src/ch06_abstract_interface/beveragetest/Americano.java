package ch06_abstract_interface.beveragetest;

public class Americano extends Beverage {
    private double water;

    public Americano(String name, double price, double water) {
        super(name, price);
        this.water = water;
    }

    @Override
    public void drink() {
        System.out.println(super.getName() + "를 홀짝 홀짝 마십니다.");
    }

    @Override
    public void make() {
        System.out.println(super.getProductName());
        System.out.println("에스프레소 1샷을 추출합니다.");
        System.out.println("물 " + this.water + "ml를 담은 컵에 에스프레소를 부어줍니다.");
    }
}
