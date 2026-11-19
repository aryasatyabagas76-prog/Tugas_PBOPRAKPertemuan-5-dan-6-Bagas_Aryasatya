package Prak_p6;

import java.util.Scanner;

public class No8 extends Thread {

    public No8(String nama) {
        super(nama);
    }

    @Override
    public void run() {
        System.out.println(getName() + " sedang berjalan");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah Thread: ");
        int jumlah = input.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            No8 anak = new No8("Thread Anak " + i);
            anak.start();
        }
    }
}