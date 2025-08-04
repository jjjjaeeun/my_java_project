package ch05_package_inheritance.mybeverage;

public class Beverage04 {
    private String name;
    private double price;

    public Beverage04() {
    }

    void showInfo() {
        System.out.println("\n이름: " + this.name);
        System.out.println("단가: " + this.price);
    }

    public Beverage04(String name, double price) {
        this.name = name;
        this.price = price;
    }

}
