package ch05_package_inheritance.animalpkg01;

public class Eagle01 extends Animal01{
    private int wing; // 날개 개수

    public Eagle01(String name, int lifespan, String habitat, int speed, int wing) {
        super(name,lifespan,habitat,speed);
        this.wing=wing;
    }

    @Override
    public void animalInfo() {
        super.animalInfo();
        System.out.println(super.getName()+"의 날개 개수는 "+this.wing+"개 입니다.");
    }

    public void fly(){//날아 다닙니다.
        System.out.println(super.getName()+"가 "+super.getSpeed()+"의 속도로 날아 다닙니다.");
    }


}
