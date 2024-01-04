package com.teamName.section02.looping;

import java.util.Scanner;

public class C_doWhile
{
    public void testSimpleDoWhileStatement(){
        // do while문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.
        do
        {
            System.out.println("최초로 한 번은 동작함...");
        }while (false);

        /*
        while (false){
            System.out.println("얘는 실행안함");
        }
        */
    }

    public void testDoWhileExample1(){
        //키보드로 문자열 입력 받아 반복적으로 출력하기
        //단 exit강 ㅣㅂ력 되면 반복을 종료한다
        boolean isRunning = true;
        String str;
        /*
        do{
            System.out.print("문자열 입력(종료 exit) :");
            Scanner sc = new Scanner(System.in);
            str = sc.nextLine();
            if(str.equals("exit")){
                isRunning = false;
            }
            System.out.println(str);
        }while (isRunning);         */
        //개선
        do{
            System.out.print("문자열 입력(종료 exit) :");
            Scanner sc = new Scanner(System.in);
            str = sc.nextLine();
        }while (!str.equals("exit"));
    }
}
