package pao;

public class Adresa{

    private String oras,tara,strada;

    public Adresa(){}
    public Adresa(String oras, String strada, String tara) {
        this.oras = oras;
        this.strada = strada;
        this.tara = tara;
    }
    public Adresa(String[] part) {
        this.oras = part[4];
        this.strada = part[3];
        this.tara = part[5];
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public String getTara() {
        return tara;
    }

    public void setTara(String tara) {
        this.tara = tara;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public String afis_adresa()
    {
        return "\nAdresa: Strada" + strada + " , " + oras + " , " + tara;
    }

}
