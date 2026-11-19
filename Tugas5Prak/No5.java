
package Tugas5Prak;

public class No5 {
    public static void main(String[] args) {
        
        System.out.println("Segitiga /Half Triangle");
        for(int a = 1; a <= 5; a++){

            for(int b = 5; b > a; b--){
                System.out.print(" ");
            }

            for(int c = 1; c <= a; c++){
                System.out.print("* ");
            }

            System.out.println();
        }
        
        
        System.out.println("\nBelah Ketupat/ Full Triangle");
        //atas
        for(int a = 1; a <= 5; a++){

            for(int b = 5; b > a; b--){
                System.out.print(" ");
            }

            for(int c = 1; c <= a; c++){
                System.out.print("* ");
            }

            System.out.println();
        }

        //bawah
        for(int a = 4; a >= 1; a--){

            for(int b = 5; b > a; b--){
                System.out.print(" ");
            }

            for(int c = 1; c <= a; c++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
