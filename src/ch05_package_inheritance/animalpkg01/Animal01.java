package ch05_package_inheritance.animalpkg01;

public class Animal01 {
    private String name;
    private int lifespan; //평균 수명
    private String habitat;//서식지
    private int speed;//속도

    public Animal01() {
    }

    public Animal01(String name, int lifespan, String habitat, int speed) {
        this.name = name;
        this.lifespan = lifespan;
        this.habitat = habitat;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void animalInfo() {
        String message = "평균 수명이 " + lifespan + "인 " + name + "의 ";
        message += "서식지는 " + habitat + "입니다.";
        System.out.println(message);

        // System.out.println("평균 수명이 "+lifespan+"인 "+name+"의 서식지는 "+habitat+"입니다.");
    }


}
