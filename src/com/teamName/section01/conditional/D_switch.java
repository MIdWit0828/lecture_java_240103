package com.teamName.section01.conditional;

import java.util.Scanner;

public class D_switch
{
    Scanner sc = new Scanner(System.in);

    public void testSimpleSwitchStatement()
    {
        //switch문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.

        //정수 2개와 연산기호 문자를 입력 받아서 두 수의 연산 결과를 출력해보는 간단한 계산기
        int result = 0;
        boolean isCalulate = false;

        while (true)
        {
            System.out.print("첫 번째 정수 : ");
            int first = sc.nextInt();
            System.out.print("두 번째 정수 : ");
            int second = sc.nextInt();
            System.out.println("연산기호 입력 \n=== + - * / % ===                 ...'e' is quit");
            char ch = sc.next().charAt(0);

            switch (ch)
            {
                case '+':
                    result = first + second;
                    isCalulate = true;
                    break;
                case '-':
                    result = first - second;
                    isCalulate = true;
                    break;
                case '*':
                    result = first * second;
                    isCalulate = true;
                    break;
                case '/':   // 나누는 수가 0이면 java.lang.AritimeticException : / by zero 이 발생한다.
                    if (second == 0)
                    {
                        System.out.println("두 번째 정수 올바르지 않음");
                        System.out.println("=====================");
                        isCalulate = false;
                        break;
                    }
                    result = first / second;
                    isCalulate = true;
                    break;
                case '%':
                    result = first % second;
                    isCalulate = true;
                    break;
                case 'e':
                    System.out.println("프로그램 종료...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("연산기호 올바르지 않음");
                    System.out.println("=====================");
                    isCalulate = false;
                    break;
            }
            if(isCalulate){
                System.out.println("계산결과 : " + result);
                System.out.println("=====================");
                isCalulate = !isCalulate;
            }

        }
    }
    public void testMethod(){
        /* switch문을 이용한 간단한 자판기 */
        System.out.println("=== Samhyook vending machine ===");
        System.out.println(" 사이다 콜라 환타 바스 핫식스 ");
        System.out.println("==============================");
        System.out.print("음료를 선택해주세요 : ");
        /* 원하는 음료를 문자열로 입력받음 */
        Scanner sc = new Scanner(System.in);
        String selectedDrink = sc.nextLine();
        /* 원하는 음료에 맞는 가격을 저장할 변수 */
        int price = 0;
        /* 하지만 한 개의 메뉴를 선택해도 그 메뉴 이후의 메뉴가 전부 선택이 되는 이상한 자판기가 되었다.
         * 가격 또한 음료별로 다르지만 마지막 메뉴 가격인 10000원으로 고정되어 있다.
         * */
        switch(selectedDrink) {
            case "사이다" :
                System.out.println("사이다를 선택하셨습니다.");
                price = 500;
            case "콜라" :
                System.out.println("콜라를 선택하셨습니다.");
                price = 600;
            case "환타" :
                System.out.println("환타를 선택하셨습니다.");
                price = 700;
            case "바카스" :
                System.out.println("바카스를 선택하셨습니다.");
                price = 2000;
            case "핫식스" :
                System.out.println("핫식스를 선택하셨습니다.");
                price = 10000;
        }
        System.out.println(price + "원을 투입해주세요!");
    }


}
