class Naloga1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        int presledki;
        for (int i = 2; i <= 10; i++) {
            System.out.println();
            presledki = 1;
            while (presledki < i) {
                System.out.print("  ");
                presledki++;
            }
            System.out.print(i);
        }
    }
}