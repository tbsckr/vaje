import java.util.Scanner;

class Naloga3 {
    public static void main(String[] args) {
        int zmnozek = 1;
        double vsota = 0;

        for(int i = 0; i <= 9; i++) {
            System.out.print("Vnesite število: ");
            Scanner sa = new Scanner(System.in);
            int stevilo = sa.nextInt();
            zmnozek = zmnozek * stevilo;
            vsota = vsota + stevilo;
        }
        
        System.out.println("Zmnožek: " + zmnozek);
        System.out.println("Povprečje:" + (vsota / 10));

    }
}