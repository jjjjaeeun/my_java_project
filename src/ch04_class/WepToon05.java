package ch04_class;

public class WepToon05 {
    public String days;
    public String title;
    public String genre;
    public String writer;
    public double gpa;
    public double ranking;

    public WepToon05(String days,String title, String genre,String writer,double gpa,double ranking){
        this.days=days;
        this.title=title;
        this.genre=genre;
        this.writer=writer;
        this.gpa=gpa;
        this.ranking=ranking;
    }
    public void display(){
        System.out.println("연재요일: "+days);
        System.out.println("제목: "+title);
        System.out.println("장르: "+genre);
        System.out.println("작가: "+writer);
        System.out.println("평점: "+gpa);
        System.out.println("순위: "+ranking);
    }


}
