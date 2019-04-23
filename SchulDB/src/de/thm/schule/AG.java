package de.thm.schule;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class AG {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String bezeichnung;
	@ManyToMany(cascade=CascadeType.PERSIST)
	private List<Schueler> schueler = new ArrayList<Schueler>();

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Schueler> getSchueler() {
		return schueler;
	}

	public void addSchueler(Schueler s) {
		if (!this.schueler.contains(s)) {
			this.schueler.add(s);
			s.addAg(this);
		}
	}

	public void setSchueler(List<Schueler> schueler) {
		for (Schueler s : schueler) {
			this.addSchueler(s);
		}
	}

}
