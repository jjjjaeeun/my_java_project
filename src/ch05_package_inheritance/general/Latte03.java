package ch05_package_inheritance.general;

public class Latte03 extends Beverage03 {
    private String milkType;

    public Latte03(String name, double price, String milkType) {
        super(name, price);
        this.milkType = milkType;
    }

    public void printInfo() {
        super.showInfo();
        System.out.println("우유 타입: " + milkType);
        System.out.println();

    }
}
