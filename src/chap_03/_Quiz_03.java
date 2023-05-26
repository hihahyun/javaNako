package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String id = "010329-1234567";
        System.out.println(id.substring(0, 8)); //0위치부터 8위치 직전까지
        System.out.println(id.substring(0, id.indexOf("-") + 2)); //0부터 하이픈 위치 +2 직전까지
    }
}
