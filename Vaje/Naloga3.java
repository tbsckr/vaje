import java.util.Scanner;

class Naloga3 {
    public static void main(String[] args){
        float a;
        float b;
        float c;

        System.out.print("Vpišite a: ");
        Scanner sa = new Scanner(System.in);
        a = sa.nextFloat();
        
        System.out.print("Vpišite b: ");
        Scanner sb = new Scanner(System.in);
        b = sb.nextFloat();

        c = a + b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + c);
    }
}