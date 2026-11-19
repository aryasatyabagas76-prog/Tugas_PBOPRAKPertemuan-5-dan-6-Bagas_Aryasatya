package Prak_p6;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah Mahasiswa: ");
        int jumlah = sc.nextInt();

        String[] mahasiswa = new String[jumlah];
        int[] nilaiMahasiswa = new int[jumlah];
        String[] keterangan = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("Nama Mahasiswa: ");
            mahasiswa[i] = sc.next();

            do {
                System.out.print("Nilai Mahasiswa: ");
                nilaiMahasiswa[i] = sc.nextInt();

                if (nilaiMahasiswa[i] >= 0 && nilaiMahasiswa[i] <= 100) {

                    if (nilaiMahasiswa[i] > 50) {
                        keterangan[i] = "Lulus";
                    } else {
                        keterangan[i] = "Tidak Lulus";
                    }

                } else {
                    System.out.println("Nilai tidak valid, masukkan kembali!");
                }

            } while (nilaiMahasiswa[i] < 0 || nilaiMahasiswa[i] > 100);
        }

        System.out.println("\n===== HASIL DATA MAHASISWA =====");

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData ke-" + (i + 1));
            System.out.println("Nama    : " + mahasiswa[i]);
            System.out.println("Nilai   : " + nilaiMahasiswa[i]);
            System.out.println("Status  : " + keterangan[i]);
        }
    }
}
