import java.util.Random;

class Naloga1 {
    public static void main(String[] args) {
        Random random = new Random();
        int nakljucnaStevila[] = new int[5];
        double povprecje;
        double vsota = 0;

        System.out.print("Števila: ");
        for (int i = 0; i < nakljucnaStevila.length; i++) {
            nakljucnaStevila[i] = random.nextInt(1000);
            System.out.print(nakljucnaStevila[i] + ", ");
            vsota = vsota + nakljucnaStevila[i];
        }
        System.out.println();
        povprecje = vsota / nakljucnaStevila.length;
        System.out.println("Vsota: " + vsota);
        System.out.println("Povprečje: " + povprecje);
    }
}