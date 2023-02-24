class Voznik {
    String ime;
    String letImetjaVozniskegaIzpita;
    String starost;

    String opis() {
        return znamka + " " + model + ", cena: " + cena + ", voznik: "+ voznik;
    }
    

    Avto(String vZnamka, String vModel, String vCena, String vVoznik) {
        znamka = vZnamka;
        model = vModel;
        cena = vCena;
        voznik = vVoznik;
    }
}