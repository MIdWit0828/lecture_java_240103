package com.teamName.section02.looping;

import java.util.Scanner;

public class B_while
{
    public void testSimpleWhileStatement()
    {
        // while문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.

        // 1부터 10까지 1씩 증가시키면서 10번 출력하는 기본 반복문
        int i = 1;
        while (i < 11)
        {
            System.out.println(i);
            i++;
        }
    }

    public void testWhileExample()
    {
        // 입력한 문자열의 인덱스를 이용하여 문자 하나씩 출력하기

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();

        int i = 0;
        while (i < str.length())
        {
            System.out.println(i + " : " + str.charAt(i));
            i++;
        }
        //같은 내용을 for문으로...
        for (int j = 0; j < str.length(); j++)
        {
            System.out.println(j + " : " + str.charAt(j));
        }
        //i는 0부터 시작하고 마지막 i는 항상 길이보다 한 개 작은 숫자를 가진다
        // 존재하지 않는 i에 접근할 경우 런타임에러 발생
    }

    public void testWhileExample2(){
        //정수 하나를 입력 받아 1부터 입력 받은 정수까지의 합계 구하기

        System.out.print("정수 하나 입력 :");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int sum =0;
        int i = 1;
        while (i<= num){
            sum += i++;
        }
        System.out.println("합계 : "+sum);
    }

    public void testWhileExample3(){
        //중첩 while문을 이용한 구구단 출력
        int dan =2;
        while (dan <10){
            int su = 1;
            while (su<10){
                System.out.println(dan + " X " + su + " = " + dan*su);
                su++;
            }
            System.out.println("================");
            dan++;
        }
    }
}
