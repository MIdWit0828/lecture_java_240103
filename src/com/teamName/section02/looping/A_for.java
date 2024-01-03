package com.teamName.section02.looping;

import java.util.Scanner;

public class A_for
{
    public static void testSimpleForStatement()
    {
        // for문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.

        //1부터 10까지 1씩 증가시키면서 값을 출력하는 반복문
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }
    }

    public static void testForExample1()
    {
        //무엇을 반복해야 하는지 확인한 뒤 반복문으로 코드 개선하기
        /* 10명의 학생 이름을 입력받아 이름을 출력해보자 */

        /* 반복해야 할 내용이 무엇인지와 몇 번 반복해야 하는지를 확인해보자!! */
        Scanner sc = new Scanner(System.in);
        /*
        System.out.print("1 번째 학생의 이름을 입력해주세요 : ");
        String student1 = sc.nextLine();
        System.out.println("1 번째 학생의 이름은 " + student1 + "입니다.");
        System.out.print("2 번째 학생의 이름을 입력해주세요 : ");
        String student2 = sc.nextLine();
        System.out.println("2 번째 학생의 이름은 " + student2 + "입니다.");
        System.out.print("3 번째 학생의 이름을 입력해주세요 : ");
        String student3 = sc.nextLine();
        System.out.println("3 번째 학생의 이름은 " + student3 + "입니다.");
        System.out.print("4 번째 학생의 이름을 입력해주세요 : ");
        String student4 = sc.nextLine();
        System.out.println("4 번째 학생의 이름은 " + student4 + "입니다.");
        System.out.print("5 번째 학생의 이름을 입력해주세요 : ");
        String student5 = sc.nextLine();
        System.out.println("5 번째 학생의 이름은 " + student5 + "입니다.");
        System.out.print("6 번째 학생의 이름을 입력해주세요 : ");
        String student6 = sc.nextLine();
        System.out.println("6 번째 학생의 이름은 " + student6 + "입니다.");
        System.out.print("7 번째 학생의 이름을 입력해주세요 : ");
        String student7 = sc.nextLine();
        System.out.println("7 번째 학생의 이름은 " + student7 + "입니다.");
        System.out.print("8 번째 학생의 이름을 입력해주세요 : ");
        String student8 = sc.nextLine();
        System.out.println("8 번째 학생의 이름은 " + student8 + "입니다.");
        System.out.print("9 번째 학생의 이름을 입력해주세요 : ");
        String student9 = sc.nextLine();
        System.out.println("9 번째 학생의 이름은 " + student9 + "입니다.");
        System.out.print("10 번째 학생의 이름을 입력해주세요 : ");
        String student10 = sc.nextLine();
        System.out.println("10 번째 학생의 이름은 " + student10 + "입니다.");
        */

        //개선함
        String[] students = new String[10];
        for (int i = 0; i < 10; i++)
        {
            System.out.print((i + 1) + " 번째 학생의 이름을 입력해주세요 : ");
            students[i] = sc.nextLine();
        }
        for (int i = 0; i < 10; i++)
        {
            System.out.println((i + 1) + " 번째 학생의 이름은 " + students[i] + "입니다.");
        }
        System.out.println("10명의 학생 이름을 입력 받고 출력하는 기능을 완료했습니다!");
    }

    public static void tsrtForExample2()
    {
        // 문장 속에서 규칙을 찾아 반복문으로 구현하기
        int sum = 0;
        //1~10까지의 합계를 구하시오
        for (int i = 1; i <= 10; i++) sum += i;
        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
    }

    public static void testForExample3()
    {
        // 5~10사이의 난수를 발생 시켜서 1부터 발생한 난수까지의 합계를 구한다
        int random = (int) (Math.random() * 6) + 5;
        int sum = 0;
        for (int i = 1; i <= random; i++)
        {
            sum += i;
        }
        System.out.println("1부터 " + random + "까지의 합계 : " + sum);
    }

    public static void testForExample4()
    {
        //숫자 2개를 입력 받아 작은 수에서 큰 수까지의 합계를 구하시오
        //단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결한다.

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 입력 :");
        int first = sc.nextInt();
        System.out.print("두 번째 정수 입력 :");
        int second = sc.nextInt();

        if (first == second)
        {
            System.out.println("경고! 두 정수의 값이 같음");
            System.exit(0);
        }

        int min, max, sum = 0;
        min = Math.min(first, second);
        max = Math.max(first, second);

        for (int i = min; i <= max; i++)
        {
            sum += i;
        }
        System.out.println(min + "부터 " + max + "까지의 합은 " + sum + "입니다.");
    }
    public static void printSimpleGugudan(){
        //구구단은 곱하는 수가 1부터 시작하여 9까지 증가하며 곱하는 규칙을 가지고 있다.

        //2~9 사이의 수를 입력받아 구구단을 출력하고 해당 범위의 수를 입력하지 않으면
        //반드시 2~9사이의 양수를 입력해야 합니다.를 출력한다.

        System.out.println("2~9사이의 수를 입력하라.");
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();

        if(dan<2 || dan>9){
            System.out.println("반드시 2~9사이의 양수를 입력해야 합니다.");
            System.exit(0);
        }
        else {
            System.out.println("<<<<<"+dan+"단>>>>>");
            for(int i = 1 ; i<10;i++){
                System.out.println(dan + " X " + i + " = " + (dan*i));
            }
            System.out.println(dan+"단 끝.");
        }
    }
}
