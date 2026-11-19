package Prak_p6;

import java.util.Scanner;

public class No6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah Bilangan: ");
        int n = input.nextInt();

        int[] angka = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            try {
                System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
                angka[i] = input.nextInt();

                total += angka[i];

            } catch (Exception e) {
                System.out.println("Input harus berupa angka!");
                input.nextLine();
                i--;
            }
        }

        double rata = (double) total / n;

        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + rata);
    }
}