package ch07_collection.crudmemver;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {

    private List<Member> memverList = null;// 회원 목록을 담을 컬렉션
    //원래는 데이터 베이스에 들어있는 데이터 나중엔 사용 안함

    public MemberDao() {
        this.memverList = new ArrayList<Member>();
    }

    public int insertDate(Member member) {// 회원 1명 추가
        System.out.println("아이디가 " + member.getId() + "인 회원이 가입합니다.");
        this.memverList.add(member);
        return 1;
    }

    public int getSize() {
        return this.memverList.size();
    }

    public List<Member> selectAll() {
        return this.memverList;
    }

    public Member getOne(String findId) {
        //특정 아이드를 findId를 사용하여 회원이 존재하는 지 검색합니다.
        Member who = null; //발견되면 여깅 값 할당

        for (Member bean : memverList) {
            if (findId == bean.getId()) {
                who = bean;
                break;
            } else {
            }
        }
        return who;
    }

    public int deleteData(String deleteId) {
        int cnt = -1;

        for (Member bean : memverList) {
            // 참조 자료형 일 때 == 대신 .equals 메소드 사용
            if (deleteId.equals(bean.getId())) {
                this.memverList.remove(bean);
                cnt = 1;
                break;
            }
        }
        return cnt;
    }

    public void deleteAllData() {
        this.memverList.clear();
    }
}
