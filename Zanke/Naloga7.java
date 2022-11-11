import java.util.Scanner;

class Naloga7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int zmnozek;

        System.out.print("Vnesite prvo število: ");
        int a = scan.nextInt();
        System.out.print("Vnesite drugo število: ");
        int b = scan.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("-------------------");


        for (int i = a; i <= b; i++) {
            zmnozek = i * i;
            System.out.println(i + "^2 = " + zmnozek);
        }

    }
}