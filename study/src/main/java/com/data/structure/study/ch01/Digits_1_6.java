package com.data.structure.study.ch01;

import java.util.Scanner;

public class Digits_1_6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;

        System.out.println("2자리의 정수를 입력하세요: ");

        do{
            System.out.println("입력: ");
            no = stdIn.nextInt();
        } while (no <10 || no > 99);

        System.out.println("변수 no의 값은 " + no);
    }

    /**
     * - 구조적 프로그래밍
     * 하나의 입구와 하나의 출구를 가진 구성 요소만을 계층적으로 배치하여 프로그램을 구성하는 방법을 구조적 프로그래밍(structured programming)이라고 한다.
     * 구조적 프로그래밍은 순차, 선택, 반복이라는 3종류의 제어 흐름을 사용한다.
     */

    /**
     * 키보드로 입력한 값을 2자리수의 양수로 제한하는 프로그램
     *
     * while문에서 사용하는 ||는 논리합을 구하는 논리합 연산자
     * ||는 둘 중 하나라도 참이면 참(or) &&는 둘다 참이면 참 (and)
     *
     * - 논리 연산자의 단축 평가
     * 위의 while문 안의 논리 연산자 (||)에서 좌측의 no < 10이 true거나 false면 우측의 평가는 진행하지 않는다.
     * &&의 경우 좌측이 false라면 우측의 평가는 진행하지 않는다
     *
     * 이처럼 논리 연산의 식 전체를 평가한 결과가 왼쪽 피연산자의 평가 결과만으로 정확해지는 경우 오른쪽 피연산자의 평가를 수행하지 않는데 이를 단축평가(short circuit evaluation)이라고 한다.
     */

    /**
     * - 드모르간 법칙
     * 위의 제어식의 논리식(no <10 || no > 99)을 부정 연산자 !를 사용하여 수정하면
     *  !(no >= 10 && no <=99)
     *
     *  각 조건을 부정하고 논리곱을 논리합으로, 논리합을 논리곱으로 바꾸고 다시 전체를 부정하면 원래의 조건과 같다는 법칙
     *  이 법칙은 일반적으로 아래와 같이 표현
     *  x&&y와 !(!x ||!y)는 같다
     *  x || y와 (!x && !y)는 같다.
     */
}
