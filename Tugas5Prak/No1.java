package Tugas5Prak;

import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
           
        
        System.out.println("Masukan Angka ke-1 : ");
        i = input.nextInt();
        
        int terbesar = i;
        int terkecil = i;
        
        for(int a = 2; a <= 10; a++){
            System.out.println("Masukan angka ke-"+ a +" : ");
            i = input.nextInt();
           if(i > terbesar){
               terbesar = i;
           }
           if(i < terkecil){
               terkecil = i;
           }
        }
        System.out.println("Terbesar : " + terbesar);
        System.out.println("Terkecil : " + terkecil);
    }
}
