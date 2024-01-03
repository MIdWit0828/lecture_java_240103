package com.teamName.section01.conditional;

import java.util.Scanner;

public class C_ifElseif
{
    Scanner sc = new Scanner(System.in);

    public void testSimpleIfElseIfStatement()
    {
        // if-else-if문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.
        System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말았다. \n연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.\n나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물어보았다.");


        System.out.println("당신의 도끼는...? (1. 금도끼, 2. 은도끼, 3. 쇠도끼 \n : ");

        int answer = sc.nextInt();

        if (answer == 1)
        {
            System.out.println("거짓말! 아무런 도끼를 출 수 없다.");
        } else if (answer == 2)
        {
            System.out.println("욕심이 과하지는 않지만 거짓말이다");
        } else if (answer == 3)
        {
            System.out.println("정직한사람! 금, 은, 쇠도끼 모두 가져갈 것");
        } else
        {
            System.out.println("대답이 올바르지 않습니다.");
        }
        System.out.println("그렇게 산신령은 사라졌다.");
    }

    public void testNestedIfElseIfStatement()
    {
        // 중첩된 if-else-if문의 흐름을 이해하고 적용할 수 있다.

        //90점 이상이면 'A' 80점 이상이면 B 70점 이상이면 C 60점 이상이면 D 60점 미만이면 F를 학점등급으로 매겨본다
        System.out.println("이름...? ");
        String name = sc.nextLine();
        System.out.println("점수...? ");
        int score = sc.nextInt();
        String rank;
        if (score > 60)
        {
            if (score >= 90)
            {
                rank = "A";
            } else if (score >= 80)
            {
                rank = "B";
            } else if (score >= 70)
            {
                rank = "C";
            } else
            {
                rank = "D";
            }
            if (score % 10 > 4)
            {
                rank += "+";
            }
        } else
        {
            rank = "F";
        }
        System.out.println("이름 : " + name);
        System.out.println("점수 : " + score);
        System.out.println("등급 : " + rank);
    }

    public void improveNestedIfElseIfStatement()
    {
        // 중첩된 if-else-if문의 흐름을 이해하고 적용할 수 있다.

        //90점 이상이면 'A' 80점 이상이면 B 70점 이상이면 C 60점 이상이면 D 60점 미만이면 F를 학점등급으로 매겨본다
        System.out.println("이름...? ");
        String name = sc.nextLine();
        System.out.println("점수...? ");
        int point = sc.nextInt();
        String grade;
        if (point > 60)
        {
            if (point >= 90)
            {
                grade = "A";
            } else if (point >= 80)
            {
                grade = "B";
            } else if (point >= 70)
            {
                grade = "C";
            } else
            {
                grade = "D";
            }
            if (point % 10 > 4 || point > 99)
            {
                grade += "+";
            }
        } else
        {
            grade = "F";
        }
        System.out.println("이름 : " + name);
        System.out.println("점수 : " + point);
        System.out.println("등급 : " + grade);
    }
}
