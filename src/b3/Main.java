package b3;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2, 5, 6, 2, 4, 5, 6, 2, 9};
        int sum = 0;
        for (int a : arr) {
            try {
                sum += a;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        } System.out.println("Tổng các số trong mảng là:" + sum);
    }
}
