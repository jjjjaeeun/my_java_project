package ch04_class;

public class Saram03 {
    private String name;
    private double height;
    private double weight;
    private String hobby;
    private String blood;

    //public 반환타입 메소드이름(매개변수)
    public void setName(String name){
    //인스턴스변수  지역변수
       this.name= name;
    }
    //public 반환타입 메소드이름(매개변수)
    public String getName() {
        return name;
    }

    public void setHeight(double height){
        this.height= height;
    }
    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
