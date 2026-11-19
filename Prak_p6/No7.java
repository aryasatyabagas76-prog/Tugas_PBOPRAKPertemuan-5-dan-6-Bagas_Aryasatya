package Prak_p6;

public class No7 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread anak sedang berjalan");
    }

    public static void main(String[] args) {
        No7 anak = new No7();
 
        anak.start();
    }
}