import java.util.Scanner;

class Naloga10 {
    public static void main(String[] args) {
        float sirina;
        float dolzina;
        float cenaNaM2;
        float skupnaCena;

        System.out.print("Širina: ");
        Scanner ssirina = new Scanner(System.in);
        sirina = ssirina.nextInt();

        System.out.print("Dolžina: ");
        Scanner sdolzina = new Scanner(System.in);
        dolzina = sdolzina.nextInt();

        System.out.print("Cena na m^2: ");
        Scanner scena = new Scanner(System.in);
        cenaNaM2 = scena.nextInt();

        skupnaCena = sirina * dolzina * cenaNaM2;
        System.out.println("Sirina: " + sirina + " enot");
        System.out.println("Dolzina: " + dolzina + " enot");
        System.out.println("Cena na m^2: " + dolzina + " enot");
        System.out.println("--------------------------");
        System.out.println("Skupna cena sobe: " + skupnaCena + " enot");

    }
}
