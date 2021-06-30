package pao;

public class Aplicant {
    private String liceu;
    private String cnp;
    Nume nume=new Nume();
    Adresa adresa=new Adresa();
    Medie note= new Medie();
    public Aplicant(){}
    public Aplicant(String liceu, String cnp, Nume nume, Adresa adresa, Medie medie)
    {
        this.liceu=liceu;
        this.cnp=cnp;
        this.nume=nume;
        this.adresa=adresa;
        this.note=medie;
    }

    public Aplicant(String[] part)
    {
        this.liceu=part[7];
        this.cnp=part[6];
    }
    public String getter(String liceu, String cnp)
    {
        return liceu + cnp;
    }

    public String getLiceu() {
        return liceu;
    }

    public String getCnp() {
        return cnp;
    }

    public void setLiceu(String liceu) {
        this.liceu = liceu;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }
    public String afis()
    {
        return nume.afis_nume() + adresa.afis_adresa() + "\nCnp: " +  cnp + " Liceul absolvit: " + liceu + note.afis_note();
    }


}