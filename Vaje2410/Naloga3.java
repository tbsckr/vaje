import java.util.Scanner;

class Naloga3 {
    public static void main(String[] args) {
        float a;
        float b;

        System.out.print("Vnesite število a: ");
        Scanner sa = new Scanner(System.in);
        a = sa.nextFloat();
        System.out.print("Vnesite število b: ");
        Scanner sb = new Scanner(System.in);
        b = sb.nextFloat();

        if (a < b) {
            System.out.println(a +" <- manjše");
            System.out.println(b +" <- vecje");
            System.out.println("---------------------");
            System.out.println("Števili se razlikujeta.");
        } else if (a > b) {
            System.out.println(a +" <- vecje");
            System.out.println(b +" <- manjše");
            System.out.println("---------------------");
            System.out.println("Števili se razlikujeta.");
        } else if (a == b) {
            System.out.println(a +" <-");
            System.out.println(b +" <-");
            System.out.println("---------------------");
            System.out.println("Števili seta enaki.");
        }
    }
}