package de.thm.schule;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Schueler {

	@ManyToMany(mappedBy = "schueler", cascade = CascadeType.PERSIST)
	private List<AG> ags = new ArrayList<AG>();

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne(cascade=CascadeType.PERSIST)
	private Klasse klasse;

	private String nachname;
	private String vorname;

	public List<AG> getAgs() {
		return ags;
	}

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

	public void setAgs(List<AG> ags) {
		for (AG ag : ags)
			this.addAg(ag);
	}

	public void addAg(AG ag) {
		if (!this.ags.contains(ag)) {
			this.ags.add(ag);
			ag.addSchueler(this);
		}
	}

	@Override
	public String toString() {
		return "Schueler [ags=" + ags + ", id=" + id + ", klasse=" + klasse + ", nachname=" + nachname + ", vorname=" + vorname + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setKlasse(Klasse klasse) {
		this.klasse = klasse;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

}
