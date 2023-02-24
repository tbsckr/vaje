class Pes {
    String ime;
    String pasma;
    int starost;
    String barva;

    String opis() {
        return ime + " (pasma: " + pasma + ", starost: " + starost + " let, barva: " + barva + ")";
    }
    String lajaj() {
        return ime + " (pasma: " + pasma + ", starost: " + starost + " let, barva: " + barva + ") " + "laja!";
    }
    String sedi() {
        return ime + " (pasma: " + pasma + ", starost: " + starost + " let, barva: " + barva + ") "+  "sedi!";
    }
    String spi() {
        return ime + " (pasma: " + pasma + ", starost: " + starost + " let, barva: " + barva + ") " + "spi!";
    }
    

    Pes(String ime, String pasma, int starost, String barva) {
        this.ime = ime;
        this.pasma = pasma;
        this.starost = starost;
        this.barva = barva;
    }
}