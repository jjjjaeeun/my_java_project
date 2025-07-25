package ch02_control_statement;

public class If01 {
    public static void main(String[] args) {

        int su = 1 ;

        if (su%2 ==0){ // 단순 if 구문 "조건문이 true인 경우에만 실행"
            System.out.println("짝수" + su + "놀쟈");
        }

        if(su%2 == 0){ //양자 택일 구문
            System.out.println("숫자 "+ su + "은(는) 짝수입니다." );
            // 조건식이 참(true)이면 수행될 영역

        }else{

            System.out.println("숫자 " + su + "은(는) 홀수입니다.");
            // 조건식이 거짓(false)이면 수행될 영역
        }

        System.out.println("ㅋㅋㅋ"); // if 해당 없이 수행

        }
}
