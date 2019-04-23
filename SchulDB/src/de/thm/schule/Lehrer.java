package de.thm.schule;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Lehrer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne(mappedBy = "lehrer", cascade = CascadeType.PERSIST)
	private Klasse klasse;
	private String nachname;
	private String vorname;

	public int getId() {
		return id;
	}

	public Klasse getKlasse() {
		return klasse;
	}

	public String getNachname() {
		return nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setKlasse(Klasse klasse) {
		klasse.setLehrer(this);
		this.klasse = klasse;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
}
