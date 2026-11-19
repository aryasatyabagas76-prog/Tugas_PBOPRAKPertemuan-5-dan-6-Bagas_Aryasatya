package Tugas5Prak;

import java.util.Scanner;


public class No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jml;
        int total = 0;
        int bil;
        
        
        System.out.println("Masukan Jumlah Bilangan : ");
        jml = input.nextInt();
        
        for(int a = 1; a <= jml; a++ ){
            System.out.println("Masukan Bilangan");
            bil = input.nextInt();
            total = total + bil;
        }
        System.out.println(total);
    }
}
