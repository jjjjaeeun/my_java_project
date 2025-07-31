package ch04_class;

public class Weptoon03 {
    private String days; // 연재요일
    private String title; // 제목
    private String genre; // 장르
    private String writer; // 작가
    private double gpa; // 평점
    private int ranking; // 순위

    public void setDays(String days) {
        this.days = days;
    }

    public String getDays() {
        return days;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

        void disPlayInfo() {
        System.out.println("연재 요일: " + getDays());
        System.out.println("제목: " + getTitle());
        System.out.println("장르: " + getGenre());
        System.out.println("작가: " + getWriter());
        System.out.println("평점: " + getGpa());
        System.out.println("순위: " + getRanking());

    }

    String rankingInfo(int rank) {
        String _rank = "";
        if (rank <= 3) {
            _rank = "상위권";
        } else if (rank <= 6) {
            _rank = "중위권";
        } else {
            _rank = "하위권";
        }
        String rankingMessage = getTitle() + "의 순위는 " + _rank + "입니다.";
        return rankingMessage;

    }


}

