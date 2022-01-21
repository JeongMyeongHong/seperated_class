package com.bitcamp.name;

public class CalcApp {

    public static String name = "CalcApp 입니다.";
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    String opcode = "";

    public String calc(int paramnum1, String paramopcode, int paramnum2){
        num1 = paramnum1;
        opcode = paramopcode;
        num2 = paramnum1;
        int num3 = num1+num2;

        return num1+" "+opcode+" "+num2+" = "+num3;
    }
}