/*Johan*/
package baitap;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class baitap06 {
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
        System.out.print("\nCac phan tu truoc khi sap xep: ");
        for (int i = 0; i < n; i++){    
                System.out.print(arr[i] + "\t");
        }
        System.out.print("\nCac phan tu sau khi sap xep: ");
        for (int i = 0; i < n; i++) {
	    for (int j = i + 1; j < n; j++) {
	        if (arr[i] < arr[j]) {
	                // Nếu arr[i] > arr[j] thì hoán đổi giá trị của arr[i] và arr[j]
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	    }
	}
	    
	for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
