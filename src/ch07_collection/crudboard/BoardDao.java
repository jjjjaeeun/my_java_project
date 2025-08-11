package ch07_collection.crudboard;

import java.util.ArrayList;
import java.util.List;

//Dao 클래스: 데이터 베이스에게 데이터를 추가/수정/삭제등의 작업을 요청해 주는 중간 middle-ware 성격의 클래스
public class BoardDao {

    private List<Board> boardList = null; //게시물들을 담는 통

    public BoardDao() {
        this.boardList = new ArrayList<Board>();//게시물 담는 통 초기화
    }

    // Dao 스펙 입력       목록에 추가 하고자 하는 게시물 1개
    public int insertData(Board board) {
        System.out.println("게시물 번호 " + board.getNo() + "이(가) 추가 됩니다.");
        boardList.add(board); //boardList에 게시물 담기
        return 1;
    }

    public int getSize() {
        return boardList.size();
    }

    public List<Board> selsctAll() {
        return this.boardList;
    }

    public int removeData(int deleteId) {
        //deleteId 변수 는 삭제 하고자 하는 게시물 번호
        int cnt = -1; // -1은 '발견' 여부를 나타내는 flag 변수
        for  (Board bean:boardList){

            if(deleteId == bean.getNo()){ //발견됨
                this.boardList.remove(bean);
                cnt = 1;
                break;
            }else { //발견 못함

            }
        }
        return cnt;
    }

    // findId는 찾고자 하는 게시물 번호
    public Board getOne(int findId) {
        Board findData = null; //반환 데이터 정보

        for (Board bean : boardList) {
            if (bean.getNo() == findId){
                // 해당 게시물 발견됨
                findData = bean;
                break;//이하 다른 게시물은 볼 필요 없음
            }else {

            }

        }
        return findData;
    }

    public void removeAllBoards() {
        this.boardList.clear();
    }
}
