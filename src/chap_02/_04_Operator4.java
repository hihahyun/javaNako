package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음);
        System.out.println(김치찌개 && 계란말이 && 제육볶음);

        //And 연산
        System.out.println((5>3) && (3<1));
        System.out.println((5>3) || 3<1 );

        //System.out.println(1<2<4);
        System.out.println(1<3 && 3<5);

        //논리부정연산자
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(5==5));
        System.out.println(! (5==3));

    }
}
