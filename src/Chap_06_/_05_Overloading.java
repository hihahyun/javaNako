package Chap_06_;

public class _05_Overloading {
    public static int getPower (int number) {
        int result = number * number;
        return result;
        //return number * number;
    }
    public static int getPowerStr(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
}
        public static int getPowerByExp (int number, int exponent) {
            int result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= number;
            }
            return result;
        }

    public static void main(String[] args) {
        // 메소드 오버로딩 : 같은 이름의 메소드를 여러번 선언
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 개수가 다르거나
        // 반환형이 다른 같은 이름의 메소드는 오류. 예 public static double getPower 과 public static int getPower은 안됨
        System.out.println(getPower(3)); // 3*3=9
        System.out.println(getPowerStr("4")); //4*4=16
        System.out.println(getPowerByExp(3,3)); //3*3*3=27
    }


}
