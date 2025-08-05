package ch05_package_inheritance.general;

public class Beverage03 {
    private String name; //음료 이름
    private double price; //단가

    public Beverage03() {
    }

    public Beverage03(String name, double price) {
        this.name = name;
        this.price = price;
    }
    protected void showInfo() {
        System.out.println("음료 이름: " + name);
        System.out.println("단가: " + price);
    }
}
