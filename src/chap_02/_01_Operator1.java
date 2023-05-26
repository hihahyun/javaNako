package chap_02;

import java.sql.SQLOutput;

public class _01_Operator1 {
    public static void main(String[] args) {
        //산술연산자
        //일반연산
        System.out.println( 4+2 );
        System.out.println( 4-2 );
        System.out.println( 4*2 );
        System.out.println( 4/2 );
        System.out.println( 5/2 );
        System.out.println( 2/4 );
        System.out.println( 4%2 );
        System.out.println( 5%2 );

        //우선순위연산
        System.out.println( 2+2*2 );
        System.out.println( (2+2)*2 );
        System.out.println( 2+(2*2));

        //변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a*b;
        System.out.println(c);

        c=a/b;
        System.out.println(c);

        c=a%b;
        System.out.println(c);

        //증감연산 ++--
        int val;
        val = 10;
        System.out.println(val);
        val = val + 1;

        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); //11
        System.out.println(val); //11

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10
        System.out.println(val); // 11
        System.out.println(val); //11

        val = 10;
        System.out.println(val); //10
        System.out.println((--val)); //9
        System.out.println(val); // 9

        val = 10;
        System.out.println(val); //10
        System.out.println(val--); // 10
        System.out.println(val); //9

        //은행대기표
        int waiting = 0;
        System.out.println("대기인원 : " + waiting++ ); //대기인원 0
        System.out.println("대기인원 : " + waiting++ ); //대기인원 1
        System.out.println("대기인원 : " + waiting++ ); //대기인원 2
        System.out.println("총 대기인원 : " + waiting); //대기인원 3
    }
}
