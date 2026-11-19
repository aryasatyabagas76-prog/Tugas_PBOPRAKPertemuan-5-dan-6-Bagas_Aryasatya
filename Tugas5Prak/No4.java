package Tugas5Prak;

import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jml;
        int total = 0;
        int angka = 1;
        
        System.out.print("Masukan Banyak Angka : ");
        jml = input.nextInt();
        
        for(int i = 1; i <= jml; i++){
            System.out.print(angka + " ");
            total = total + angka;
            angka = angka + 2;
        }
        
        System.out.println("\nTotal : " + total);
        
        
    }
}
