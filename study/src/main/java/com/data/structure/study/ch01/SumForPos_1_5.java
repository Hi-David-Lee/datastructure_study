package com.data.structure.study.ch01;

import java.util.Scanner;

public class SumForPos_1_5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구한다.");

        do {
            System.out.println("N의 값: ");
            n = stdIn.nextInt();
        }while (n <= 0);

        int sum = 0;

        for (int i = 1; i <= n; i++){
            sum  +=  i;
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum );
    }

    /**
     *  1 ~ n의 합을 구한다 (단, 양수만 입력)
     *
     *  양수만 입력 받기 위해 do 문으로 프로그램을 작성했다.
     *  do문 while(제어식);
     *
     *  do 문은 일단 루프 본문을 한 번 실행한 다음에 계속 반복할 것인지를 판단하는 사후 판단 반복문이다.
     *  while문과 마찬가지로 () 안의 제어식이 0이 아니면 루프 본문의 명령문이 반복된다.
     *
     *  - 사전 판단 반복과 사후 판단 반복의 ㅊ아ㅣ점
     *
     *  사전 판단 반복문인 while, for 문은 처음에 제어식을 평가한 결과가 0이면 루프 본문은 한 번도 실행되지 않는다.
     *  이와 달리 사후 판단 반복문인 do 문은 루프 본문이 반드시 한 번은 실행된다.
     *  이것이 사전 판단 반복문과 사후 판단 반복문의 차이점
     */
}
