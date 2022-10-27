import java.util.Scanner;

class Naloga4 {
    public static void main(String[] args) {
        int a;

        System.out.print("Vnesite celo število: ");
        Scanner sa = new Scanner(System.in);
        a = sa.nextInt();

        System.out.print("Število " + a + " ");
        if (a  == 0) {
            System.out.print("je enako 0.");
        } else if (a % 2 == 0) {
            System.out.print("je sodo ");
            if (a < 0) {
                System.out.print("in negativno.");
            } else if (a > 0) {
                System.out.print("in pozitivno.");
            }
        } else if (a % 2 == 1) {
            System.out.print("je liho ");
            if (a < 0) {
                System.out.print("in negativno.");
            } else if (a > 0) {
                System.out.print("in pozitivno.");
            }  
        }

    }
}