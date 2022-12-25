/*Johan*/
package baitap;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class baitap05 {
    public static void main (String[] args){   
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n;
        do {
            System.out.println("Nhap so phan tu n (1-100):");
            n = sc.nextInt();
        } while (n < 1 || n > 100);
        System.out.println("Xin moi nhap " + n + " phan tu");
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu thu " + i + " :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Cac phan tu da nhap: ");
        for (int i = 0; i < n; i++){    
                System.out.print(arr[i] + "\t");
        }
        System.out.println("\nCac so chinh phuong la: ");
        double sqrt;
        int count = 0;
        for (int i = 0; i < n; i++) {
            sqrt = Math.sqrt(arr[i]);
            if (sqrt * sqrt == arr[i]) {
                System.out.print(arr[i] + "\t");
                count++;
            }
        }
        System.out.println("\nSo luong cac so chinh phuong la: " + count);
    }
}
