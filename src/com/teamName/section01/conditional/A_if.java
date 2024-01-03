package com.teamName.section01.conditional;

import java.util.Scanner;

public class A_if
{
    public void testSimpleIfStatement()
    {
        //if문 단독 사용에 대한 흐름을 이해하고 적용 할 수 있다.

        //정수 1개를 입력받아 짝수이면 입력하신 숫자는 짝수입니다 라고 출력한다
        //짝수가 아니면 출력하지 않음
        System.out.print("숫자 한 개를 입력 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0)
        {
            System.out.println("입력하신 숫자는 짝수입니다.");
        }
    }

    public void testNestedIfStatement()
    {
        //중첩(nested)된 if문의 흐름을 이해하고 적용할 수 있다.

        //정수 1개를 입력받아 양수인지를 확인하고 그 수가 짝수이면 입력하신 숫자는 짝수입니다 라고 출력한다
        //짝수가 아니면 출력하지 않음
        System.out.print("숫자 한 개를 입력 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0)
        {
            if (num % 2 == 0)
            {
                System.out.println("입력하신 숫자는 짝수입니다.");
            }
        }
    }
}
