import java.util.Scanner;

class Naloga2 {
    public static void main(String[] args) {
        int stevilo;
        int rezultat = 0;

        System.out.print("Vnesite celo število med 10 in 1000: ");
        Scanner ss = new Scanner(System.in);
        stevilo = ss.nextInt();

        if (stevilo >= 10 && stevilo <= 1000) {
            for (int i = 0; i <= stevilo; i++) {
                rezultat = rezultat + i;
            }
            System.out.println("Rezultat: " + rezultat);
        } else {
            System.out.println("Število ne ustreza danim pogojem.");
        }
    }
}