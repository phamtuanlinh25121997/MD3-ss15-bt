package b1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập số thứ 1:");
            int a = scanner.nextInt();
            System.out.println("Nhập số thứ 2:");
            int b = scanner.nextInt();
            int sum = a + b;
            System.out.println("Tổng 2 số là :" + sum);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
