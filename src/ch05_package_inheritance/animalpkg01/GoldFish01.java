package ch05_package_inheritance.animalpkg01;

public class GoldFish01 extends Animal01 {
    private int gill; //아가미 개수

    public GoldFish01(String name, int lifespan, String habitat, int speed, int gill) {
        super(name, lifespan, habitat, speed);
        this.gill = gill;
    }

    @Override
    public void animalInfo() {
        super.animalInfo();
        String message =super.getName()+ "의 아가미수는 "+ this.gill+"개입니다.";
        System.out.println(message);
    }

    public void swim() { //헤엄칩니다.
        String message=super.getName()+"가 "+super.getSpeed()+"의 속도로 헤엄칩니다."+"\n";
        System.out.println(message);
    }

}
