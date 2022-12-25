/*Johan*/
package baitap;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class baitap07 {
    public static void main (String[] args){   
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[100];
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
        System.out.print("\nCac phan truoc khi dao: ");
        for (int i = 0; i < n; i++){    
                System.out.print(arr[i] + "\t");
        }
        System.out.print("\nCac phan sau khi dao: ");
        
        for (int i = 0; i < n; i++){
	    for (int j = n-1-i; j < n; j++) {
	       double temp = arr[i];
	       arr[i] = arr[j];     
	       arr[j] = temp;          
	    }
	}
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
