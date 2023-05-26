package chap_04;

public class _01_If {
    public static void main(String[] args) {
        //조건문 If
        int hour = 10; //오전 10시
        if (hour < 14)
            System.out.println("아이스 아메리카노 +1");
        System.out.println("커피 주문 완료");

        //if문 내에서 하나의 문장을 실행할 때는 {} 생략가능
        System.out.println("");
        hour = 15;
        if (hour < 14)
            System.out.println("아이스 아메리카노 +1");
        System.out.println(("샷추가"));
        System.out.println("커피 주문 완료");

        //if 문 내에서 2개 이상의 문장을 실행할 때는 {} 생략불가
        System.out.println("");
        hour = 15;
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println(("샷추가"));
        }
        System.out.println("커피 주문 완료");


        //오후 2시 이전, 모닝 커피를 마시지 않은 경우?
        System.out.println("-----");
        hour = 10;
        boolean morningCoffee = false; // 모닝커피
        if (hour < 14 && morningCoffee == false) {
            System.out.println("아이스아메리카노 +1");
        }
        System.out.println("커피 주문 완료");

        System.out.println("");
        hour = 10;
        morningCoffee = true; // 모닝커피
        if (hour < 14 && morningCoffee == false) { //if (hour<14 && !morningCoffee)
            System.out.println("아이스아메리카노 +1");
        }
        System.out.println("커피 주문 완료");

        //오후 2시 이후이거나 모닝커피를 마신 경우?
        System.out.println("");
        hour = 15;
        morningCoffee = true;
        if (hour>=14 || morningCoffee == true) {
            System.out.println("아아(디카페인) +1");
        }
        System.out.println("커피주문완료");

        System.out.println("");
        hour = 10;
        morningCoffee = false;
        if (hour>=14 || morningCoffee) {
            System.out.println("아아(디카페인) +1");
        }
        System.out.println("커피주문완료");
    }
}
