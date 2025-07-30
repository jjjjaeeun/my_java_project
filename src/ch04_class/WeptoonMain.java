package ch04_class;

import java.util.concurrent.ForkJoinWorkerThread;

public class WeptoonMain {
    public static void main(String[] args) {

        Weptoon omn;
        omn=new Weptoon();
        Weptoon end;
        end=new Weptoon();
        Weptoon elec;
        elec=new Weptoon();

        omn.days="수요일";
        omn.title="전지적 독자 시점";
        omn.genre="판타지";
        omn.writer="UMI, 슬리피-C, 싱숑";
        omn.gpa=9.93;
        omn.ranking=1;

        omn.displayinfo();
        String message=omn.rankInfo(1);
        System.out.println(message);
        message=omn.grade(9.93);
        System.out.println(message);

        end.days="목요일";
        end.title="종말이 찾아왔다";
        end.genre="생존,스릴러";
        end.writer="전선욱";
        end.gpa=8.78;
        end.ranking=5;

        end.displayinfo();
        message=end.rankInfo(5);
        System.out.println(message);
        message=end.grade(8.78);
        System.out.println(message);

        elec.days="금요일";
        elec.title="일렉시드";
        elec.genre="액션";
        elec.writer="손제호.제나";
        elec.gpa=6.84;
        elec.ranking=7;

        elec.displayinfo();
        message=elec.rankInfo(7);
        System.out.println(message);
        message=elec.grade(6.84);
        System.out.println(message);

    }
}
