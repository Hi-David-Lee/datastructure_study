package com.data.structure.study.ch01;

import java.util.Scanner;

public class JudgeSign_1_2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");
        int a = stdIn.nextInt();

        if (a > 0)
            System.out.println("정수 입니다.");
        else if (a < 0)
            System.out.println("음수 입니다.");
        else
            System.out.println("0 입니다.");
    }

    /**
     * 프로그래밍 언어에서는 +, - 등의 연산 기호를 연산자(operator)라고 부른다.
     * 그리고 연산의 대상이 되는 것을 피연산자(operand)라고 부른다.
     * 예를 들어 a > b에서
     * 연산자는 >
     * 피연산자는 a, b이다.
     *
     * - 단항 연산자 (unary opertor) : 피연산자 1개 ex) a++
     * - 2항 연산자 (binary operator) : 피연산자 2개 ex) a + b
     * - 3항 연산자 (ternary operator) : 피연산자 3개 ex) a?b:c
     *
     */
}
