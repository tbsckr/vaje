import java.util.Scanner;

class Naloga1 {
    public static void main(String[] args) {
        int stevilo;

        System.out.print("Vpišite število: ");
        Scanner s = new Scanner(System.in);
        stevilo = s.nextInt();

        System.out.println("Vhod: " + stevilo);
        if (stevilo < 10) {
            System.out.println("Število je enomestno.");
        } else if (stevilo >= 10) {
            System.out.println("Število je večmestno.");
        }
    }
}