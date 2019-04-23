package de.thm.schule;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Lehrer{

    @OneToOne
    private Klasse klasse;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pnr;



    public Lehrer(){

    }

	private String nachname;
	private String vorname;

    public void setPnr(int pnr) {
        this.pnr = pnr;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setStufe(String stufe) {
        this.stufe = stufe;
    }

    public void setGebdatum(Date gebdatum) {
        this.gebdatum = gebdatum;
    }

    public void setSchuleintritt(Date schuleintritt) {
        this.schuleintritt = schuleintritt;
    }


    private String titel;
	private String stufe;
	private Date gebdatum;
	private Date schuleintritt;

    public int getPnr() {
        return pnr;
    }

    public String getTitel() {
        return titel;
    }

    public String getStufe() {
        return stufe;
    }

    public Date getGebdatum() {
        return gebdatum;
    }

    public Date getSchuleintritt() {
        return schuleintritt;
    }

    public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
}
