package ch05_package_inheritance.general;

public class Sport {
    String name; //종목 이름
    int entry; // 선수 명수

    public Sport(String name, int entry) {
        this.name = name;
        this.entry = entry;
    }
    public void showInfo() {
        System.out.println(name + "경기는 " + entry + "명의 엔트리로 구성이 됩니다.");
    }
}
