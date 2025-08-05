package ch05_package_inheritance.mybeverage;

public class Espresso04 extends Beverage04 {
    private int shotCount;

    @Override
    public String toString() {
        String message ="샷 갯수: " + this.shotCount +"개";
        return super.toString()+ message;
    }

    public Espresso04(String name, double price, int shotCount) {
        super(name, price);
        this.shotCount = shotCount;
    }

    public void drinkEspresso() {
        super.getName();
        String message = "맛이 진하고 강렬한 " + getName() + "을 마십니다.";
        System.out.println(message);
    }


}
