package chap_03;

import java.sql.SQLOutput;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Java"));
        System.out.println(s2.equals("Python"));
        System.out.println(s2.equalsIgnoreCase("Python"));

        //문자열 비교 심화
        s1="1234";
        s2="1234";
        System.out.println(s1.equals(s2)); //내용
        System.out.println(s1==s2); // 참조

        s1 = new String ("1234");
        s2 = new String ("1234");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

    }
}
