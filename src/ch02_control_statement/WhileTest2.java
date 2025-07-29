package ch02_control_statement;

import java.util.Scanner;

public class WhileTest2 {
    public static void main(String[] args) {
        //스캐너 장치 준비
        Scanner scan = new Scanner(System.in);

        int total= 0;// 총점
        int count=0;// 시행 횟수
        double average = 0.0; // 평균

        while(true){
            System.out.print("점수 입력: ");
            int grade = scan.nextInt(); //입력 값이 grade에 할당
            //System.out.println("숫자: "+ grade);

            if(grade<=0){
                System.out.println("음수 또는 0이어서 종료합니다.");
                break;
            }
            total += grade;
            count ++;
        }
        System.out.println("총점: "+ total);
        average = (double)total/count; //정수 출력을 위해 명시적 형변환
        System.out.println("총점: "+ average);

    }
}
