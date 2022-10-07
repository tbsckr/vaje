import java.util.Scanner;

class Naloga4 {
    public static void main(String[] args) {
        int a = 100;
        int b = 6;
        int c;
        int d;

        System.out.println("Pred zamenjavo: a = " + a + ", b = " + b);
        
        c = a;
        d = b;

        a = d;
        b = c;

        System.out.println("Po zamenjavi: a = " + a + ", b = " + b);
    }
}