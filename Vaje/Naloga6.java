import java.util.Scanner;

class Naloga6 {
    public static void main(String[] args) {
        float znesek;
        float odstotekDDV;
        float cena;

        System.out.print("Vnesite ceno z DDV-jem: ");
        Scanner sznesek = new Scanner(System.in);
        znesek = sznesek.nextFloat();
        System.out.println("Zabeleženo.");

        System.out.print("Vnesite odstotek DDV-ja: ");
        Scanner sodstotekDDV = new Scanner(System.in);
        odstotekDDV = sodstotekDDV.nextFloat();
        System.out.println("Zabeleženo.");

        cena = znesek / (odstotekDDV / 100 + 1);
        System.out.println("Osnovna cena (brez DDV-ja): " + cena);

    }
}