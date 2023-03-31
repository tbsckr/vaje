class Naloga10 {
    public static void main(String[] args) {
        Oseba oce = new Oseba("Oce", "Janez", 'M', 1980, null, null);
        Oseba mati = new Oseba("Mati", "Marija", 'Z', 1980, null, null);
        Oseba sin = new Oseba("Sin", "Franci", 'M', 2000, oce, mati);

        System.out.println(oce.starost(2023));
        System.out.println(mati.jeStarejsaOd(sin));
    }
}