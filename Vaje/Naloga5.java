import java.util.Scanner;

class Naloga5 {
    public static void main(String[] args) {
        float cena;
        float odstotekDDV;
        float znesek;

        System.out.print("Vnesite ceno brez DDV-ja: ");
        Scanner scena = new Scanner(System.in);
        cena = scena.nextFloat();
        System.out.println("Zabeleženo.");

        System.out.print("Vnesite odstotek DDV-ja: ");
        Scanner sodstotekDDV = new Scanner(System.in);
        odstotekDDV = sodstotekDDV.nextFloat();
        System.out.println("Zabeleženo.");

        znesek = cena * (odstotekDDV / 100 + 1);
        System.out.print("Končna cena: " + znesek);
    }
}