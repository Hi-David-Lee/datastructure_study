package com.data.structure.study.ch01;

import java.util.Scanner;

public class SumWhile_1_3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 N까지의 합을 구한다.");
        System.out.println("n의 값: ");
        int n = stdIn.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n ){
            sum += i;
            i ++;
        }

        System.out.println("1부터 N 까지의 합: " + sum);
    }

    /**
     * 어떤 조건이 성립하는 동안 처리(프로그램 명령문 또는 명령어의 집합)를 반복하여 실행하는 것을 반복(repetition)구조라고 하며 일반적으로 루프(loop)라고 부른다.
     * 이때 while문은 실행 전에 반복을 계속할지를 판단하는데, 이런 구조를 '사전 판단 반복 구조'라고 부른다.
     * 제어식의 평갓값이 0이 아니면 프로그램 명령문이 반복된다.
     */
}
