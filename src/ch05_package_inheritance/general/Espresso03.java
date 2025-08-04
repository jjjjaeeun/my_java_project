package ch05_package_inheritance.general;

public class Espresso03 extends Beverage03 {
    private int shotCount; //샷 갯수

    public Espresso03(String name, double price, int shotCount) {
        super(name,price);
        this.shotCount=shotCount;
    }

    public void printInfo(){
        super.showInfo();
        System.out.println("샷 갯수: "+shotCount);
        System.out.println();
    }

}
