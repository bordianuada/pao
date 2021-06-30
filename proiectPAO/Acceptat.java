package pao;

public class Acceptat {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String telefon,mail;
    Medie medie=new Medie();
    Departament departament=new Departament();
    Aplicant aplicant =new Aplicant();
    public Acceptat(){}
    public Acceptat(String telefon, String mail, Aplicant aplicant, Departament departament)
    {
        this.telefon=telefon;
        this.mail=mail;
        this.aplicant = aplicant;
        this.departament= departament;

    }
    public Acceptat(String[] part)
    {
        this.telefon=part[8];
        this.mail=part[9];

    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Aplicant getAplicant()
    {
        return aplicant;
    }

    public void setAplicant(Aplicant aplicant)
    {
        this.aplicant = aplicant;
    }


    public Boolean compare(Acceptat a)
        {
        if(this.departament.getNr_locuri()<a.departament.getNr_locuri())
            return Boolean.TRUE;
        return Boolean.FALSE;
        }





    public String afis_acceptat()
    {

        return "Acceptat: "+ aplicant.afis()   + departament.afis_departament()+
                "\nTelefon: " +telefon + ", Email: "+ mail;
    }



}

