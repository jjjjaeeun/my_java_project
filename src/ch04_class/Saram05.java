package ch04_class;

public class Saram05 {
    private String name;
    private double height;
    private double weight;
    //hobby는 생성자를 통하여 입력하지 않으면 기본값으로 축구가 할당
    private String hobby = "축구";
    private String blood;

    public Saram05(String name, double height, double weight, String blood) {
        this.name = "김유신";
        this.height = 180.2;
        this.weight = 70.0;
        this.blood = "O";
    }

    public void display() {
        System.out.println("이름: " + this.name);
        System.out.println("키: " + this.height);
        System.out.println("몸무게: " + this.weight);
        System.out.println("취미: " + this.hobby);
        System.out.println("혈액형: " + this.blood);

    }

    public Saram05(String name, double height, double weight, String hobby, String blood) {
        this.name = "이순신";
        this.height = 180.5;
        this.weight = 75.0;
        this.hobby = "농구";
        this.blood = "AB" + "\n";

    }


}
