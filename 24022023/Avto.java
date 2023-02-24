class Avto {
    String znamka;
    String model;
    String cena;
    String voznik;

    String opis() {
        return znamka + " " + model + ", cena: " + cena + ", voznik: "+ voznik;
    }
    
    String nastaviVoznika() {
        
    }

    String trenutniVoznik() {

    }

    String izstopVoznika() {

    }

    String vzgi() {

    }

    String ugasni() {

    }

    String premakni() {

    }*/

    Avto(String vZnamka, String vModel, String vCena, String vVoznik) {
        znamka = vZnamka;
        model = vModel;
        cena = vCena;
        voznik = vVoznik;
    }
}