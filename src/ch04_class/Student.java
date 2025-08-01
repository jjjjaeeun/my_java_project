package ch04_class;

public class Student {
    private String name;
    private int age;
    private int studentId;

    /*public Student() {
        this("00", 0, 00000);
    }*/
    // 이름과 나이를 받는 생성자
    public Student(String name) {
        // 모든 정보를 받는 생성자 호출
        this(name, 0, 00000);
    }

    public Student(String name, int age) {
        this(name, age, 00000);
    }

    // 모든 정보를 받는 생성자 (실제 초기화 수행)
    public Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    /*public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Student(String name){
        this.name=name;

    }*/

    public void displayInfo() {
        System.out.println("이름: " + name + " 나이: " + age + "세 학번: " + studentId);
    }

}
