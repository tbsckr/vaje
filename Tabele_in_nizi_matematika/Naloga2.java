import java.util.Random;

class Naloga2 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        int nakljucnaStevila[] = new int[5];
        Random random = new Random();
        int min;
        int max;

        System.out.print("Števila: ");
        for (int i = 0; i < nakljucnaStevila.length; i++) {
            nakljucnaStevila[i] = random.nextInt(1000);
            System.out.print(nakljucnaStevila[i] + ", ");
        }

        min = nakljucnaStevila[0];
        for (int i = 1; i < nakljucnaStevila.length; i++) {
            if (nakljucnaStevila[i] < min) {
                min = nakljucnaStevila[i];
            }
        }

        max = nakljucnaStevila[0];
        for (int i = 1; i < nakljucnaStevila.length; i++) {
            if (nakljucnaStevila[i] > max) {
                max = nakljucnaStevila[i];
            }
        }

        System.out.println();
        System.out.println("Najmanjše število: " + min);
        System.out.println("Največje število: " + max);
        System.out.println();
        System.out.println();
    }
}