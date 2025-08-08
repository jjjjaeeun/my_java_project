package ch07_collection;

import java.util.HashSet;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        //set은 인터페이스이므로 객체 생성 불가, 구현체 사용
        Set<Object> set = new HashSet<Object>();

        set.add("아메리카노"); // 원소 더하기
        set.add(123);
        set.add(false);
        set.add("아메리카노");

        set.clear(); // 원소 모두 제거

        set.add("아메리카노"); // 원소 더하기
        set.add("에스프레소");
        set.add("믹스커피");
        set.add("카페라떼");

        String findData = "카푸치노";

        System.out.println(findData + " 존재 여부 " + set.contains(findData));

        if (set.contains(findData)) {
            System.out.println(findData + "있음");
        } else {
            System.out.println(findData + "없음");
        }

        //마키야또가 존재하는 지 확인하고 없으면 추가
        String addData = "마키야또";

        if (set.contains(addData) == false) {
            set.add(addData);
        }

        // remove() 메소드를 사용하여 '믹스커피'를 삭제하고 '삭제 성공'이라는 문구를 출력해 주세요.
        // 없으면 '존재하지 않음'이라는 문구를 출력해 주세요.

        String removeData = "믹스커피";
        if (set.remove(removeData)) {
            System.out.println(removeData + " 삭제 성공");
        } else {
            System.out.println(removeData + "존재하지 않음");
        }

        System.out.println("확장 for 구문을 이용한 요소 출력");

        //for(타입 단수이름:복수이름){...}
        for (Object item : set) {
            System.out.println(item);
        }

        System.out.println("요소 크기: " + set.size()); //원소 크기

    }
}
