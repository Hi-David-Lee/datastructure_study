package com.data.structure.study.ch01;

import java.util.Scanner;

public class TriangleLB_1_8 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("왼쪽 아래가 직각인 이등변 삼각항을 출력한다.");

        do {
            System.out.print("몇 단 삼각형 인가요?: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n ; i ++){
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
