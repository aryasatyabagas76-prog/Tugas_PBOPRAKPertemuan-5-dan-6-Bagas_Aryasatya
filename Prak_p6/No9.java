/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak_p6;

/**
 *
 * @author bagas
 */
public class No9 {
    public static void main(String[] args) {
        int[] age = {12,4,5,2,6};
        
        System.out.println("MEnggunakan Perulangan For");
        for (int i = 0; i < 5; i++) {
            System.out.println(age[i]);
        }
        System.out.println("Menggunakan Foreach");
        for(int angka : age) {
            System.out.println(angka);
        }
    }
}
