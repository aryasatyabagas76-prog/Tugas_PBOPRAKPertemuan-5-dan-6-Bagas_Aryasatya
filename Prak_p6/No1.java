package Prak_p6;

public class No1 {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        int[] b = {10, 20, 30, 40, 50};

        int[] c = new int[]{10, 20, 30, 40, 50};

        System.out.println("Variasi 1:");
        for (int i = 0; i < 5; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        System.out.println("Variasi 2:");
        for (int i = 0; i < 5; i++) {
            System.out.println("b[" + i + "] = " + b[i]);
        }

        System.out.println("Variasi 3:");
        for (int i = 0; i < 5; i++) {
            System.out.println("c[" + i + "] = " + c[i]);
        }
    }
}