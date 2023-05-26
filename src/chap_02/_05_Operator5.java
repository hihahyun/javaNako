package chap_02;

import java.sql.SQLOutput;

public class _05_Operator5 {
    public static void main(String[] args) {
        //삼항연산자
        //결과 = (조건)? (참의경우 결과값) : (거짓의경우 결과값)
        int x = 5;
        int y = 3;
        int max = (x>y)? x:y;
        System.out.println(max); //5

        int min = (x<y)? x:y;
        System.out.println(min); //3

        boolean b = (x==y)? true : false;
        System.out.println(b);

        x=3;
        y=3;
        boolean a = (x==y)? true : false;
        System.out.println(a); // true

        x=5;
        y=3;
        String s = (x!=y)? "달라요" : "같아요";
        System.out.println(s); //달라요


    }
}
