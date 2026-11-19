package Prak_p6;

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah Elemen : ");
        int n = input.nextInt();

        int arr[] = new int[n];

        // (a) Input Array
        for (int i = 0; i < n; i++) {
            System.out.print("Angka ke-" + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }

        // (c) Nilai Terbesar dan Terkecil
        int max = arr[0], min = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Terbesar : " + max );
        System.out.println("Terkecil : " + min );

        // (d) Total dan Rata-rata
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += arr[i];
        }

        System.out.println("Total : " + total);
        System.out.println("Rata-rata : " + (double) total / n);

        // (f) Jumlah Indeks Genap
        int genap = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                genap += arr[i];
            }
        }

        System.out.println("Jumlah Indeks Genap : " + genap);

        // (g) Hasil Genap atau Ganjil
        System.out.println(genap % 2 == 0 ? "Hasil Genap" : "Hasil Ganjil");

        // (h) Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Hasil Pengurutan : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}