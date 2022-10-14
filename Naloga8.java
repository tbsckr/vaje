import java.util.Scanner;

class Naloga8 {
   public static void main(String[] args) {
        int osnova = 400;
        int koncna;
        int stLet;
        int stOtrok;

        System.out.println("Koliko let ste zaposleni? ");
        Scanner sl = new Scanner(System.in);
        stLet = sl.nextInt();

        System.out.println("Koliko otrok imate? ");
        Scanner so = new Scanner(System.in);
        stOtrok = so.nextInt();

        koncna = osnova + stLet * 20 + stOtrok * 30;
        System.out.println("Skupna plača zaposlenega znaša: " + koncna + " enot");
        System.out.println("----------------------------------------------");
        System.out.println("Osnova: " + osnova + " enot");
        System.out.println("Dodatek za leta: " + stLet*20 + " za " + stLet + " let zaposlitve");
        System.out.println("Otroci: " + stOtrok*30 + " za " + stOtrok + " otrok/a/e");

   } 
}
