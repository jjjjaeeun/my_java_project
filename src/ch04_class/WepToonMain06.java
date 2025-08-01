package ch04_class;

public class WepToonMain06 {
    public static void main(String[] args) {
        WepToon06[] weptoon=new WepToon06[3];
        weptoon[0]=new WepToon06("수요일", "omn","판타지","UMI",9.84,1);
        weptoon[1]=new WepToon06("목요일", "end","스릴러","전선욱",8.84,4);
        weptoon[2]=new WepToon06("금요일", "elec","액션","손재호",6.84,10);

        for (int i = 0; i < weptoon.length; i++) {
            weptoon[i].display();
        }
    }
}
