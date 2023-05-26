package Chap_06_;

public class _07_VariableScope {
    // 지역변수 : {}안에 있을 때만 자유롭게 쓸 수 있음, 다른 메소드에서 쓰고 싶을 땐 전달값을 이용해서 사용 예 int number
    public static void methodA(){
        //System.out.println(number);
       // System.out.println(result);
    }

    public static void methodB() {
        int result = 1; // 지역 변수
    }

    public static void main(String[] args) {
        int number =3;

       // System.out.println(result);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // System.out.println(i);

        {
            int j = 0;
            System.out.println(j);
            System.out.println(number);
        }

        // System.out.println(j);
    }
}
