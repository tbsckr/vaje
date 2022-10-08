import java.util.Scanner;

class Naloga7 {
    public static void main(String[] args) {
        float s;
        float v;
        float t;

        System.out.print("Pot (v kilometrih): ");
        Scanner ss = new Scanner(System.in);
        s = ss.nextFloat();
        System.out.println("Zabeleženo.");

        System.out.print("Čas (v urah): ");
        Scanner st = new Scanner(System.in);
        t = st.nextFloat();
        System.out.println("Zabeleženo.");

        v = s/t;
        System.out.println("Povprečna hitrost: " + v + (" km/h"));
    }
}
