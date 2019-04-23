package de.thm.schule;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Klasse {

	private String bezeichnung;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne(cascade = CascadeType.PERSIST)
	private Lehrer lehrer;

	@OneToMany(mappedBy = "klasse", cascade = CascadeType.PERSIST)
	private List<Schueler> schueler = new ArrayList<Schueler>();

	public void setSchueler(List<Schueler> schueler) {
		this.schueler = schueler;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public int getId() {
		return id;
	}

	public Lehrer getLehrer() {
		return lehrer;
	}

	public List<Schueler> getSchueler() {
		return schueler;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLehrer(Lehrer lehrer) {
		this.lehrer = lehrer;
	}

	public void addSchueler(Schueler s){
		s.setKlasse(this);
		this.schueler.add(s);
	}
	
}
