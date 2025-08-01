package ch04_class;

public class StudentMain {
    public static void main(String[] args) {
        Student kim=new Student("김씨",20,11111);
kim.displayInfo();

        Student lee=new Student("이씨",21);
        lee.displayInfo();

        Student park=new Student("박씨");
        park.displayInfo();
    }
}
