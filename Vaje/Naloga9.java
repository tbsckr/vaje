import java.util.Scanner;

class Naloga9 {
    public static void main(String[] args) {
        int a;
        int b;
        int kvadratOdA;
        int kvadratOdB;
        int razlika;

        System.out.print("a: ");
        Scanner sa = new Scanner(System.in);
        a = sa.nextInt();

        System.out.print("b: ");
        Scanner sb = new Scanner(System.in);
        b = sb.nextInt();

        kvadratOdA = a * a;
        kvadratOdB = b * b;
        razlika = kvadratOdA - kvadratOdB;

        System.out.println("a = " + a + ", a^2 = " + kvadratOdA);
        System.out.println("b = " + b + ", b^2 = " + kvadratOdB);
        System.out.println("---------------------");
        System.out.println("Razlika: " + kvadratOdA + " - " + kvadratOdB + " = " + razlika);
    }
}
