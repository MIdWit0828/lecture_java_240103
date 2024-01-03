package com.teamName.section01.conditional;

public class Application
{
    public static void main(String[] args)
    {
        A_if aIf = new A_if();
        B_ifElse bIfElse = new B_ifElse();
        C_ifElseif cElseif = new C_ifElseif();
        D_switch dSwitch = new D_switch();

        //if문 예제
    //    aIf.testNestedIfStatement();
    //    aIf.testSimpleIfStatement();

        //if-else문 예제
    //    bIfElse.testSimpleIfElseStatement();
    //    bIfElse.testNestedIfElseStatement();
        //if-else-if문 예제
    //    cElseif.testNestedIfElseIfStatement();

        dSwitch.testSimpleSwitchStatement();
    }
}
