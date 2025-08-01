package ch04_class;

public class WepToon06 {
    private String days;
    private String title;
    private String genre;
    private String writer;
    private double gpa;
    private int ranking;

    public void display() {
        System.out.println("연재 요일: " + this.days);
        System.out.println("제목: " + this.title);
        System.out.println("장르: " + this.genre);
        System.out.println("작가: " + this.writer);
        System.out.println("평점: " + this.gpa);
        System.out.println("순위: " + this.ranking+"\n");
    }
    public WepToon06(String days,String title, String genre,String writer,double gpa, int ranking){
        this.days=days;
        this.title=title;
        this.genre=genre;
        this.writer=writer;
        this.gpa=gpa;
        this.ranking=ranking;


    }

}
