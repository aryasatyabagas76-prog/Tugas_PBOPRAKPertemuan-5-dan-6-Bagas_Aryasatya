package Tugas5Prak;

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris;
        int angka = 1;
        
        System.out.print("Masukan Baris : ");
        baris = input.nextInt();
        
        for(int i = 1; i <= baris; i++){
            for(int a = 1; a <= i; a++){
                System.out.print(angka + " ");
                angka++;
            }
            System.out.println();
            
        }
    }
}
