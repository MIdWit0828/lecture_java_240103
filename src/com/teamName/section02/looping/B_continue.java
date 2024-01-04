package com.teamName.section02.looping;

public class B_continue
{
    public void testSimpleContinueStatement()
    {
        //continue 문 사용에 대한 흐름을 이해하고 적용할 수 있다.

        // 1부터 100사이의 4의 배수이면서 5의 배수인 값 출력
        for (int i = 1; i <= 100; i++)
        {
            if (i % 4 != 0 || i % 5 != 0)
                continue;
            System.out.println(i);
        }
    }

    public void testSimpleContinueStatement2(){
        //중첩 반복문 내 컨티뉴문 사ㅏ용에 대한 흐름을 이해하고 적용할 수 있다.
        // continue는 모든 반복문을 뛰어넘는ㄴ 것이 아니라 자신에게 가장 인접한 반복문의 실행만 건너뛴다

        //구구단 2~9단을 출력하되 곱해지는 수가 짝수인 경우는 출력하지 않는다
        for (int i = 2; i < 10; i++)
        {
            System.out.println(i + "단-----");
            for (int j = 1; j < 10; j++)
            {
                if(j %2==0)
                    continue;
                System.out.println(i + " X " + j + " = " + (j * i));
            }
        }
        System.out.println("구구단 끝.");
    }

    public void testJumpContinue(){
        //중첩 반복문 내 continue문 사용 시 jump(goto)에 대한 흐름을 이해하고 적용할 수 있다.

        label:
        for (int i = 2; i < 10; i++)
        {
            System.out.println(i + "단-----");
            for (int j = 1; j < 10; j++)
            {
                if(j %2==0)
                    continue label;
                System.out.println(i + " X " + j + " = " + (j * i));
            }
        }
        System.out.println("구구단 끝.");
    }
    }

