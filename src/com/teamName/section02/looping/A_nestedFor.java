package com.teamName.section02.looping;

import java.util.Scanner;

public class A_nestedFor
{
    public static void printGugudanFromTwoToNine()
    {
        // 2단부터 단을 1씩 증가시켜서 9단까지 출력하는 중첩 for문
        for (int i = 2; i < 10; i++)
        {
            System.out.println(i + "단-----");
            for (int j = 1; j < 10; j++)
            {
                System.out.println(i + " X " + j + " = " + (j * i));
            }
        }
        System.out.println("구구단 끝.");
    }

    public static void printStarInputRowTimes(){
        // 키보드로 정수를 하나 입력받아 해당 정수만큼 한행에 *을 5개씩 출력하기

        System.out.print("정수 하나를 입력 : ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for(int i = 0;i<row;i++){
            for(int j=0 ; j<5;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printTriangleStars(){
        // 키보드로 정수를 하나 입력받아 해당 정수만큼 한 횡에 '*'을 행의 번호개씩 출력
        /*
        ex) 5
        *
        **
        ***
        ****
        *****              */

        System.out.print("하나의 정수를 입력 : ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for(int i =1; i<=row;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
