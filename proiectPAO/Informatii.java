package pao;

import java.util.List;
public class Informatii {
    private String denumire, oras;
    private List <Departament> departamente;

    public Informatii(){}
    public Informatii(String denumire, String oras, List <Departament> departamente)
    {
        this.denumire = denumire;
        this.oras = oras;
        this.departamente=departamente;
    }


    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public List<Departament> getDepartamente() {
        return departamente;
    }

    public String afis_facultate() {
        return "\nNume Informatii: " + denumire + ", Judet: " + oras + ", Departamente: " + departamente ;
    }
}
