package de.thm.schule;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Schueler {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int SNr;
	private String nachname;
	private String vorname;
	private Date GebDatum;
	private Date SchulEintritt;
	private int knr;

	public int getSNr() {
		return SNr;
	}

	public void setSNr(int SNr) {
		this.SNr = SNr;
	}

	public Date getGebDatum() {
		return GebDatum;
	}

	public void setGebDatum(Date gebDatum) {
		GebDatum = gebDatum;
	}

	public Date getSchulEintritt() {
		return SchulEintritt;
	}

	public void setSchulEintritt(Date schulEintritt) {
		SchulEintritt = schulEintritt;
	}


	/*
	private ArrayList<AG> ags;

	public ArrayList<AG> getAgs() {
		return ags;
	}

	public void setAgs(ArrayList<AG> ags) {
		this.ags = ags;
	}
	*/
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

	public int getKnr() {
		return knr;
	}

	public void setKnr(int klasse) {
		this.knr = klasse;
	}

}
