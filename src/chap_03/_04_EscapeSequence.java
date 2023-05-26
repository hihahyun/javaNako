package chap_03;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class _04_EscapeSequence {
    public static void main(String[] args) {
    //특수문자, 이스케이프 문자 (Escape sequence, Escape Character, Special Character)
    // \n \t \\ \" \'

    System.out.println("자바가\n너무\n재밌어요");

        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");

        System.out.println("C;\\Program Files\\Java");

        System.out.println("단비가 \"냐옹\"이라고 했어요");

        System.out.println("단비가\'뭘봐\'라고 했어요");

        char c='\'';
        System.out.println(c);


}}
