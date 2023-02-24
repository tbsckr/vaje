import java.util.Scanner;

class Naloga2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            
        Avto avto = new Avto(
            "Mercedes-Benz",
            "Citaro",
            "tristo tisoč evrov",
            "ni voznika"
        );

        boolean jeVoznik = false;

        for (int i = 0; ; i++) {
            System.out.print("Izberite želeno funkcijo: ");
            String vhod = scan.nextLine();

            if (vhod.equals("opis")) {
                System.out.println(avto.opis());
            }
            else if (vhod.equals("nastaviVoznika")) {
                System.out.println(avto.nastaviVoznika());
            }
        }
    }
}