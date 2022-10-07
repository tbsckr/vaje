import java.util.Scanner;

class Naloga2 {
    public static void main(String[] args) {
        System.out.print("Prosimo, vnesite vaše ime: ");
        Scanner sc = new Scanner(System.in);
        String uporabnik = sc.nextLine();
        System.out.println("Pozdravljeni, " + uporabnik + "!");
    }
}