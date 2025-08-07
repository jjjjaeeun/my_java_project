package ch06_abstract_interface.beveragetest;

public abstract class Beverage {

    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public abstract void drink();

    public abstract void make();

    public String getProductName(){
        return this.name + " 제조법";
    };

    public final void showData() {
        System.out.println("음료 " + this.name + "의 단가는 " + this.price + "입니다.");
    }

    public Beverage() {

    }

    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;
    }

}
