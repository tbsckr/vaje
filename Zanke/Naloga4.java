import java.util.Scanner;

class Naloga4 {
    public static void main(String[] args) {
        int stevilo;

        System.out.println("Vnesite število, večje od 3: ");
        Scanner sc = new Scanner(System.in);
        stevilo = sc.nextInt();

        if (stevilo <= 3) {
            System.out.println("Število ne ustreza pogojem.");
        }
        else { 
            for (int i = 1; i <= stevilo; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}