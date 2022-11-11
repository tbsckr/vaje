import java.util.Scanner;

class Naloga5 {
    public static void main(String[] args) {
        String konec = "konec";
        String besedilo = "";
        int ponovitve = 0;;
        Scanner sc = new Scanner(System.in);

        System.out.println("Vnesite besedilo: ");

        while (!besedilo.equals(konec)) {
            besedilo = sc.nextLine();
            ponovitve++;
        }
        System.out.print("Konec, število ponovitev: " + ponovitve);
    }
}