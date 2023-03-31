class Oseba {
    private String ime;
    private String priimek;
    private char spol;
    private int letoRojstva;
    private Oseba oce;
    private Oseba mati;

    public Oseba(String ime, String priimek, char spol, int letoRojstva, Oseba oce, Oseba mati) {
        this.ime = ime;
        this.priimek = priimek;
        this.spol = spol;
        this.letoRojstva = letoRojstva;
        this.oce = oce;
        this.mati = mati;
    }

    public String vrniIme(){
        return ime + " " + priimek;
    }

    public int starost(int leto) {
        return leto - letoRojstva;
    }

    public String toString() {
        return vrniIme() + ", " + spol + ", " + letoRojstva;
    }

    public boolean jeStarejsaOd(Oseba oseba) {
        return starost(oseba.letoRojstva) > 0;
    }

    public boolean jeBratAliSestraOd(Oseba oseba) {
        return oce == oseba.oce && mati == oseba.mati;
    }

    public String imeOceta() {
        if (oce != null) {
            return oce.vrniIme();
        }
        return null;
    }

    public String imeMatere() {
        if (mati != null) {
            return mati.vrniIme();
        }
        return null;
    }
}