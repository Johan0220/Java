/*Johan*/
package baitap;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class baitap02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[100];
        int n, count = 0;
        do {    
            System.out.println("Nhap so n phan tu (1-100):");
            n = sc.nextInt();
        } while (n < 1 || n > 100);
        System.out.println("Xin moi nhap " + n + " phan tu");
        for(int i = 0; i < n; i++){ 
        System.out.println("Phan tu thu " + i + " :");
        arr[i] = sc.nextDouble();
        }
        System.out.print("Cac phan tu da nhap: ");
        for (int i = 0; i < n; i++){    
            System.out.print(arr[i] + "\t");
        }
        for (int i = 0; i < n; i++){    
            if(arr[i] < 0){ 
                count++;System.out.print(arr[i] + "\t");
            }
        }
        System.out.print("\nSo phan tu am: " + count);
        System.out.print("\nCac phan tu am: ");
        for (int i = 0; i < n; i++){    
            if(arr[i] < 0){ 
                System.out.print(arr[i] + "\t");
            }
        }
        
    }
}