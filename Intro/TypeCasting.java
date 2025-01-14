package Intro;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float a=25.12f;
        int b=(int)a;//Forcefully convertion is type casting
        System.out.println(b);

        char ch='a';
        char ch1='b';
        int num=ch;
        int num1=ch1;
        System.out.println(num);
        System.out.println(num1 );
    }   
}
