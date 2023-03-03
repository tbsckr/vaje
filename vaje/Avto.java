class Avto {
    String znamka;
    String model;
    double cena;
    Voznik voznik;

    String opis() {
        return znamka + " " + model + ", cena: " + cena + ", voznik: "+ voznik;
    }

/*    String vzgi() {

    }

    String ugasni() {

    }

    String premakni() {

    }
    
    String nastaviVoznika() {
        
    }
*/
    String trenutniVoznik() {
        return "Voznik: " + ime + ", št. let imetja vozniškega dovoljenja " + letImetjaVozniskegaIzpita + " let, starost: " + starost + "let";
    }
/*
    String izstopVoznika() {
        
    }*/

    Avto(String vZnamka, String vModel, double vCena, Voznik vVoznik) {
        znamka = vZnamka;
        model = vModel;
        cena = vCena;
        voznik = vVoznik;
    }
}