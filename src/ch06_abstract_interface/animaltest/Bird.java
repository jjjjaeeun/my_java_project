package ch06_abstract_interface.animaltest;

public interface Bird {
    int speed = 300;
    //자동으로 public static final이 붙음

    // public abstract void fly();
    void fly();


    default void flutter(){ // 기본 동작 정의
        System.out.println("날개를 펄럭입니다.");
    }
}
