package ch07_collection;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {

        List<String> coffeeList = new ArrayList<String>();
        //Generic : 특정 데이터만 한정시켜 컬렉션에 저장하기 위한 기법
        //2가지 이상 타입 사용할 시 Object 사용

        coffeeList.add("아메리카노");
        coffeeList.add("카페라떼");
        coffeeList.add("에스프레소");
        coffeeList.add("마키야또");
        coffeeList.add("카페라떼");

        //.indexOf 사용시 몇번째 요소인지 번호 확인 가능
        int idx = -1;
        String findData = "카페라떼";
        idx = coffeeList.indexOf(findData);
        System.out.println(findData + "의 인덱스 번호: " + idx);

        //lastIndexOf 뒤에서 부터 번호
        idx = coffeeList.lastIndexOf(findData);
        System.out.println(findData + "의 인덱스 번호: " + idx);

        findData = "카푸치노";
        idx = coffeeList.indexOf(findData);
        System.out.println(findData + "의 인덱스 번호: " + idx);

        //카푸치노 항목이 존재하지 않으면, 추가해 보세요.
        //조건 없이 추가시 가장 마지막 요소로 추가됨
        //카푸치노 항목이 존재하지 않으면, 두번째 위치에 추가해 보세요.
        //add.(int index, String element) 선택시 위치 지정 추가 가능
        if (coffeeList.indexOf(findData) == -1) {
            coffeeList.add(2, findData);
        }

        System.out.println("확장 for 구문을 이용한 출력");
        //for(타입 단수이름:복수이름){...}
        for (String coffee : coffeeList) {
            System.out.print(coffee + "\t");
        }

        //set.(int index, String element) 선택시 선택 위치 항목 변경
        findData = "콜드브루";
        coffeeList.set(5, findData);

        findData = "카푸치노";
        coffeeList.remove(findData);

        coffeeList.add(findData);

        System.out.println("\n");
        for (String xx : coffeeList) {
            System.out.println(xx);
        }

        String item = coffeeList.get(3);
        System.out.println("특정 위치 요소: " +item);

        System.out.println("일반 for 구문으로 요소 출력");

        for (int i = 0; i < coffeeList.size(); i++) {
            String data = coffeeList.get(i);
            System.out.println(data);

        }

        System.out.println("요소 크기: " + coffeeList.size());
    }
}
