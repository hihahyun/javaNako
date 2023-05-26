package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        //문자열 길이
        System.out.println(s.length());

        //대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로
        System.out.println(s.toLowerCase()); // 소문자로

        System.out.println(s.contains("c#"));
        System.out.println((s.indexOf("Java")));
        System.out.println(s.indexOf("C#"));
        System.out.println(s.indexOf("and"));
        System.out.println(s.lastIndexOf("and"));
        System.out.println(s.startsWith("I like"));
        System.out.println(s.endsWith("."));


    }
}