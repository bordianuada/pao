package pao;

public class Departament {

    private int nr_locuri,nr_locuri_buget;
    private String denumire;

    public Departament(){}

    public Departament(String denumire, int nr_locuri, int nr_locuri_buget) {
        this.nr_locuri = nr_locuri;
        this.nr_locuri_buget = nr_locuri_buget;
        this.denumire = denumire;
    }

    public int getNr_locuri() {
        return nr_locuri;
    }

    public void setNr_locuri(int nr_locuri) {
        this.nr_locuri = nr_locuri;
    }

    public int getNr_locuri_buget() {
        return nr_locuri_buget;
    }

    public void setNr_locuri_buget(int nr_locuri_buget) {
        this.nr_locuri_buget = nr_locuri_buget;
    }


    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String afis_departament() {
        return "\n Departament: " + denumire;
    }
}
