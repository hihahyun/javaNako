package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        arr[0] = 250;
        for (int i=0; i<arr.length; i++){
            arr[i] = 250 + (5*i);
            System.out.println("사이즈 " + arr[i] +" (재고 있음)");
        }

        System.out.println("---------------------------------");
        for (int size : arr) {
            System.out.println("사이즈 " + size + " (재고있음)");
        }
    }
}
