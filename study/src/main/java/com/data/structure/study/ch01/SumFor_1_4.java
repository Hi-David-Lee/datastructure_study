package com.data.structure.study.ch01;

import java.util.Scanner;

public class SumFor_1_4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 N까지의 합을 구한다.");
        System.out.println("N: ");
        int n = stdIn.nextInt();
        int sum = 0;

        for (int i = 1; i <=n; i++){
            sum += i;
        }

        System.out.println("1부터 N의 합의 결과: " + sum);
    }

    /**
     * 하나의 변수를 사용하는 반복문은 While 문보다 for를 사용하는 것이 좋다.
     *
     * *************************************************************************************************************
     * 1. for 문의 초기화 부분, 제어식, 업데이트 부분은 생략이 가능하다, 세 부분 모두 생략이 가능하지만 세미콜론(;)은 생략하면 안 된다.
     * 2. for 문의 초기화 부분에서 선언한 변수는 for문 안에서만 유효하다.
     * 3. for 문을 종료한 다음에도 변수를 사용하려면 위의 sum과 같이 for문 바깥에 변수를 선언해야 한다.
     * 3. 같은 함수의 하나 이상의 for문에서 같은 이름의 변수를 사용하려면 for문 마다 변수를 사용하면 된다. (변수의 의미는 위의 i)
     *
     */
}
