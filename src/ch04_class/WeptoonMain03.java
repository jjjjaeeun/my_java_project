package ch04_class;

public class WeptoonMain03 {
    public static void main(String[] args) {

        Weptoon03 omn;
        omn=new Weptoon03();

        omn.setDays("수요일");
        omn.setTitle("전지적 독자 시점");
        omn.setGenre("판타지");
        omn.setWriter("UMI, 슬리피-C, 싱숑");
        omn.setGpa(9.93);
        omn.setRanking(1);

        omn.disPlayInfo();
        String message= omn.rankingInfo(1);
        System.out.println(message);


    }
}
