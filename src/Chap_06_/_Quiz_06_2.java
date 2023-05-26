package Chap_06_;

public class _Quiz_06_2 {
    // 이름 : 나**
    // 주민등록번호 : 990130-1*****
    //전화번호 : 010-1234-****

    // 힌트
    //substring()
    //length()
//    public static String getHiddenData(String data, int index) {
//        String firstData = data.substring(0, index);
//        // for (int i=0; i<data.length() - index; i++)
//        for (int i = index; i < data.length(); i++) {
//            firstData += "*";
//        }
//        return firstData;
//    }

    public static void main(String[] args) {
        String name = "나코딩"; //이름
        String id = "990130-1234567"; // 주민등록번호
        String phone = "010-1234-5678"; // 전화번호

        System.out.println("이름 : " + getHiddenData(name, 1)); // 개인정보, 비공개 시작 위치
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }

    public static String getHiddenData(String name, int num) {
        String firstName = " ";
        String secondName = " ";
        for (int i = 0; i < num; i++) {
            firstName += name.charAt(i) ;
        }
        for (int i = num; i < name.length(); i++) {
            secondName += "*";
        }
        return firstName+secondName ;
    }
}