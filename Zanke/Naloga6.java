import java.util.Scanner;

class Naloga6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Vnesite prvo letnico: ");
        int prva = scan.nextInt();
        System.out.println();
        System.out.print("Vnesite drugo letnico: ");
        int druga = scan.nextInt();
        System.out.println();

        for (int i = (prva + 1); i < druga; i++) {
            if (i % 4 != 0) {
                System.out.println("Število " + i + " ni prestopno leto.");
            } else {
                if (i % 100 != 0) {
                    System.out.println("Število " + i + " je prestopno leto. <-");
                } else if (i % 400 == 0) {
                    System.out.println("Število " + i + " je prestopno leto. <-");
                } else {
                    System.out.println("Število " + i + " ni prestopno leto.");
                }
            }
        }

    }
}