package ch07_collection.crudmemver;

import java.util.List;

public class MemberMain {
    public static void main(String[] args) {

        MemberDao dao = new MemberDao();

        dao.insertDate(new Member("kim", "김만수", 10, "남자"));
        dao.insertDate(new Member("park", "박영희", 20, "여자"));
        dao.insertDate(new Member("lee", "이민철", 30, "남자"));
        dao.insertDate(new Member("choi", "최윤식", 40, "남자"));

        int size = dao.getSize();
        System.out.println("회원은 총" + size + "명입니다.");

        System.out.println("\n모든 회원 정보를 출력합니다.");

        List<Member> memverList = dao.selectAll();
        for (Member bean : memverList) {
            String id = bean.getId();
            String name = bean.getName();
            int age = bean.getAge();
            String gender = bean.getGender();

            String message = id + "\t" + name + "\t" + age + "\t" + gender;
            System.out.println(message);

            // System.out.println(bean);
        }

        System.out.println("\n특정 아이디를 이용하여 특정 회원 정보를 조회합니다.");

        String findId = "kim";
        Member one = dao.getOne(findId);

        if (one == null) {
            System.out.println(findId + " 아이디는 존재하지 않습니다.");
        } else {
            System.out.println("발견됨");
            String id = one.getId();
            String name = one.getName();
            int age = one.getAge();
            String gender = one.getGender();

            String message = id + "\t" + name + "\t" + age + "\t" + gender;
            System.out.println(message);
        }

        System.out.println("\n특정 아이디를 사용하여 회원 정보를 삭제합니다.");
        String deleteId = "park";
        int result = dao.deleteData(deleteId);

        if (result != -1) {
            System.out.println(deleteId + " 아이디 삭제 성공");
        } else {
            System.out.println(deleteId + "아이디를 발견하지 못했습니다.");
        }
        System.out.println("\nbefore all deleted: " + dao.getSize());
        dao.deleteAllData();

        System.out.println("\nafter all deleted: " + dao.getSize());
    }
}
