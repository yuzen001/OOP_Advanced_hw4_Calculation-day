package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        int Year=0,Month=0,Day=0,TotalDay=0;
        int MonthDay[]={31,28,31,30,31,30,31,31,30,31,30,31};
        boolean LeapYear=false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入西元年 月 日");
        Year = scanner.nextInt();
        Month = scanner.nextInt();
        Day = scanner.nextInt();
        if(Year%4!=0)
            LeapYear=false;
        else if(Year%100!=0)
            LeapYear=true;
        else if(Year%400!=0)
            LeapYear=false;
        else
            LeapYear=true;
        if(LeapYear==true)
            MonthDay[1]=29;
        if(Month>12)
            System.out.println("請輸入正確月份!");
        else if(MonthDay[Month-1]<Day)
            System.out.printf("輸入錯誤!!%d年的%d月只有%d天\n",Year,Month,MonthDay[Month-1]);
        else {
            for(int i=Month-2;i>=0;--i){
                TotalDay+=MonthDay[i];
            }
            TotalDay+=Day;
            System.out.printf("這天是今年第%d天\n",TotalDay);
        }
    }
}