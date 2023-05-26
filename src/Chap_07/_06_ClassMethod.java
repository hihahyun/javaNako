package Chap_07;

public class _06_ClassMethod {
    public static void main(String[] args) {
        //객체만들고 static클래스 메서드에 접근
        BlackBox b1 = new BlackBox();
        b1.callServiceCenter();

        BlackBox b2 = new BlackBox();
        b2.callServiceCenter();

        //객체 만들지 않고 static클래스 메서드에 접근
        BlackBox.callServiceCenter();

        String s = String.valueOf(3);
    }
}
