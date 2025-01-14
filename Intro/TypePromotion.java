package Intro;

public class TypePromotion {
    public static void main(String[] args) {
        //Type Promotion is a process of promoting each
        //byte, short or char operand to int when evaluating
        // an expression
        
        // char a='a';
        // char b='b';
        // System.out.println(b-a);
        //Type promotion is done in expression only

        // short a=5;
        // byte b= 25;
        // char c='c';
        // byte bt=(byte)(a+b+c);//Forcefully convertion by Type Casting
        // System.out.println(bt);

        // int a= 10;
        // float b= 20.25f;
        // long c=25;
        // double d=30;
        // double dd=a+b+c+d; //TypeConvetion
        // System.out.println(dd);
        // int ans=(int)(a+b+c+d); //Type Casting 
        // System.out.println(ans);
        

        byte b=5;
        byte a=(byte)(b*2);
        System.out.println(a);
    }
}
