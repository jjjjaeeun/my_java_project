package ch04_class;

public class Weptoon {
    String days; // 요일
    String title; // 제목
    String genre;// 장르
    String writer;// 작가
    double gpa;// 평점
    int ranking;// 순위

    String rankInfo(int rank) {
        String ran = "";
        if (3 >= rank) {
            ran = "상위권";
        } else if (6 >= rank) {
            ran = "중위권";
        } else {
            ran = "하위권";
        }
        String rankingmessage = title + "은(는) " + ran + "입니다.";
        return rankingmessage;
    }

    void displayinfo() {
        System.out.println("'"+title +"'"+ " 웹툰 정보");
        System.out.println("제목: " + title);
        System.out.println("연재 요일: " + days);
        System.out.println("장르: " + genre);
        System.out.println("작가: " + writer);
        System.out.println("평점: " + gpa);
        System.out.println("순위: " + ranking);

    }

    String grade(double grad) {
        String gra = "";
        if (9.0 <= grad) {
            gra = "매우 좋습니다";
        } else if (8.0 <= grad) {
            gra = "좋습니다.";
        } else if (7.0 <= grad) {
            gra = "살짝 아쉽습니다.";
        } else if (6.0 < grad) {
            gra = "관리가 필요합니다.";

        }
        String gpamessage = "웹툰의 평점이 " + gra + "\n";
        return gpamessage;
    }

}
