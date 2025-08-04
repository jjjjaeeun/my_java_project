package ch05_package_inheritance.general;

public class FootBall extends Sport {
    int halves; //하프 타임
    int golas; // 골수

    public FootBall(String name, int entry, int halves, int golas) {
        super(name, entry);
        this.golas = golas;
        this.halves = halves;
    }
    public void display() {
        super.showInfo();
        System.out.println(halves + "개의 하프타임으로 구성이 되며, " + golas + "골이 들어갔습니다.");

    }
}
