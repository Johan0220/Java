
package baitap;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class baitap01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n, tongle;
        do {
            System.out.println("Nhap so phan tu n (1-100):");
            n = sc.nextInt();
        } while (n < 1 || n > 100);
        System.out.println("So moi nhap " + n + " phan tu");
        //vòng lặp nhập n phần tử
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu thu " + i + ":");
            arr[i] = sc.nextInt();
        }
        //hiển thị n phần tử
        System.out.println("Cac phan tu da nhap:");
        //for(int a : arr)
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        //tính tổng số lẻ
        tongle = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                tongle += arr[i];
            }
        }
        System.out.println("\nTong le la:" + tongle);
    }

}
