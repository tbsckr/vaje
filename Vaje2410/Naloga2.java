import java.util.Scanner;

class Naloga2 {
    public static void main(String[] args) {
        int stevilo;

        System.out.print("Vpišite število: ");
        Scanner s = new Scanner(System.in);
        stevilo = s.nextInt();

        System.out.println("Vhod: " + stevilo);
        if (stevilo < 10) {
            System.out.println("Število je enomestno.");
        } else if (stevilo >= 10 && stevilo < 100) {
            System.out.println("Število je dvomestno.");
        } else if (stevilo >= 100 && stevilo < 1000) {
            System.out.println("Število je tromestno.");
        } else if (stevilo >= 1000 && stevilo < 10000) {
            System.out.println("Število je štirimestno.");
        } else if (stevilo >= 10000 && stevilo < 100000) {
            System.out.println("Število je petmestno.");
        } else if (stevilo >= 100000 && stevilo < 1000000) {
            System.out.println("Število je šestmestno.");
        } else if (stevilo >= 1000000) {
            System.out.println("Število je večmestno.");
        }
    }
}