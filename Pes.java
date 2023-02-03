class Pes {
    String ime;
    String pasma;
    int starost;
    String barva;

    String opis() {
        return ime + " (pasma: " + pasma + ", starost: " + starost + " let, barva: " + barva + ")";
    }
    String lajaj() {

    }
    String sedi() {

    }
    String spi() {

    }
    

    Pes(String vIme, String vPasma, int vStarost, String vBarva) {
        ime = vIme;
        pasma = vPasma;
        starost = vStarost;
        barva = vBarva;
    }
}