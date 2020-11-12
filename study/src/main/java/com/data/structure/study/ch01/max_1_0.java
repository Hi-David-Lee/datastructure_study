package com.data.structure.study.ch01;

import java.util.Scanner;

public class max_1_0 {
    /**3개의 정숫값 가운데 '최댓값'을 구하는 프로그램
    변수 a, b, c에 들어가는 값은 키보드에서 입력한 값이며, 그 3개의 값 중 최댓값을 변수 max로 찾는 프로그램 **/
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구한다.");
        System.out.println("a의 값: ");
        int a = stdIn.nextInt();
        System.out.println("b의 값: ");
        int b = stdIn.nextInt();
        System.out.println("c의 값: ");
        int c = stdIn.nextInt();

        int max = a;
        if (b> max)
            max = b;
        if (c>max)
            max = c;

        System.out.println("최댓값은 " + max + "입니다. ");
    }

    /**
     * 최댓값을 구하는 과정은 다음과 같다.
     * 1. max에 a를 넣는다.
     * 2. b가 max보다 크면 max에 b를 넣는다.
     * 3. c가 max보다 크면 max에 c를 넣는다.
     *
     * 세 문장이 아래로 나란히 있다면 이 문장은 순서대로 실행하는데
     * 프로세스가 순차적으로 실행되는 구조를 순차적(concatenation) 구조라고 함.
     * 1 은 단순한 대입이지만, 2,3은 if문.. ()안에 있는 식의 평가 결과에 따라 프로그램의 실행 흐름을 변경하는 if문을 선택(selection)구조라고 함.
     *
     * - 알고리즘
     *  무제를 해결하기 위한 것으로, 명확하게 정의되고 순서가 있는 유한 개의 규칙으로 이루어진 집합
     */
}
