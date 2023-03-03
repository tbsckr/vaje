import java.util.Scanner;

class Naloga2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Voznik voznik = new Voznik(
            "Andreja",
            34,
            53
        );           

        Avto avto = new Avto(
            "Mercedes-Benz",
            "Citaro",
            300000,
            voznik
        );

        boolean jeVoznik = true;
        boolean jeVzgan = false;

        for (int i = 0; ; i++) {
            System.out.print("Izberite želeno funkcijo: ");
            String vhod = scan.nextLine();

            if (vhod.equals("opis")) {
                System.out.println(avto.opis());
            } else if (vhod.equals("vzgi")) {
                if (jeVoznik == true && jeVzgan == false) {
                    jeVzgan = true;
                } else {
                    System.out.println("Avto nima voznika ali pa je motor že vžgan!");
                }
            } else if (vhod.equals("ugasni")) {
                if (jeVoznik == true && jeVzgan == true) {
                    jeVzgan = false;
                } else {
                    System.out.println("Avto nima voznika ali pa je motor že ugasnjen!");
                }
            } else if (vhod.equals("premakni")) {
                if (jeVoznik == true && jeVzgan == true) {
                    System.out.println("OK");
                } else {
                    System.out.println("Avto nima voznika ali pa je motor ugasnjen!");
                }
            }
        }
    }
}