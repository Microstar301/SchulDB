package de.thm.schule;

import javax.persistence.*;
import java.sql.Date;

@Entity
@NamedQuery(name = "LEHRER_BY_NACHNAME", query = "select l from Lehrer l where l.nachname = :name")
@DiscriminatorValue(value = "L")
public class Lehrer extends Person {

	@OneToOne(mappedBy = "lehrer", cascade = CascadeType.PERSIST)
	private Klasse klasse;


	public Klasse getKlasse() {
		return klasse;
	}


	public void setKlasse(Klasse klasse) {
		klasse.setLehrer(this);
		this.klasse = klasse;
	}
/*
	public void setNachname(String nachname) {
		super.setNachname(nachname);
	}

	public void setVorname(String vorname) {
		super.setVorname(vorname);
	}

	public String getNachname() {
		return super.getNachname();
	}

	public String getVorname() {
		return super.getVorname();
	}

	public Date getGebdatum() {
		return super.getGebdatum();
	}

	public void setGebdatum(Date gebdatum) {
		super.setGebdatum(gebdatum);
	}
*/
}
