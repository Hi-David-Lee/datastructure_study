package com.data.structure.study.ch01;

import java.util.Scanner;

public class MultipleTable_1_7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("---------------------곱셈표---------------------");

        for (int i = 1; i <10 ; i++){
            for (int y = 1; y <10 ; y++){
//                System.out.println(i + " x " + y + " = " + i*y );
                System.out.printf("%3d", i * y);
            }
            System.out.println();
        }
    }

    /**
     * - 다중 루프
     * 반복안에 다시 반복문을 중첩할 수 있는데 이런 반복을 루프가 중첩되는 수준에 따라 '이중루프', '삼중르프'라고 한다.
     */
}
