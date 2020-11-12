package com.data.structure.study.ch01;

import java.util.Scanner;

public class med_1_1 {

    /**
     * 3개의 정숫값을 입력하고 중앙값을 구한 다음 출력한다.
     */

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 중앙 값을 구한다.");

        System.out.println("a: ");
        int a= stdIn.nextInt();
        System.out.println("b: ");
        int b= stdIn.nextInt();
        System.out.println("c: ");
        int c= stdIn.nextInt();

        System.out.println("a, b, c의 중앙값은 : " + median(a, b, c));
    }

    static int median(int a, int b, int c){
        if (a>= b){
            if (b >=c){
                return b;
            }
            else if (a <= c){
                return a;
            }
            else {
                return c;
            }
        }
        else if (a > c){
            return a;
        }
        else if (b > c){
            return c;
        }
        else{
            return b;
        }
    }
}
