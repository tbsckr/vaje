import java.util.Scanner;

class Naloga0 {
    public static void main(String[] args) {
        int stevilo = 10;
        String besedilo;
        besedilo = "Buki sedi na moji levi.";
        System.out.println("Naloga0: " + stevilo + " " + besedilo);

        System.out.print("Vnesi podatek:");
        Scanner sc = new Scanner(System.in);
        int uporabniskiVhod = sc.nextInt();
        System.out.println(uporabniskiVhod);
    }
}