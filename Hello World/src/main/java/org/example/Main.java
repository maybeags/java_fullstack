package org.example;

public class Main {
    public static void main(String[] args) {
        int value1;     // 변수 선언
        value1 = 1;     // 변수 할당

        int value2 = 2; // 이것을 초기화라 한

        int value3 = 10, value4;    // 이거 오류 안 value3은 초기화, value4는 선언
        value4 = value3*20;

        System.out.println(value3 + value4);
    }
}