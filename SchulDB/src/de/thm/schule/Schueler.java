package de.thm.schule;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "S")
public class Schueler extends Person {

	@ManyToMany(mappedBy = "schueler", cascade = CascadeType.PERSIST)
	private List<AG> ags = new ArrayList<AG>();

	@ManyToOne(cascade=CascadeType.PERSIST)
	private Klasse klasse;



	public List<AG> getAgs() {
		return ags;
	}

	public Klasse getKlasse() {
		return klasse;
	}

	public void setKlasse(Klasse klasse){ this.klasse = klasse; }
	/*
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

	/*
	@Override
	public String toString() {
		return "Schueler [ags=" + ags + ", id=" + id + ", klasse=" + klasse + ", nachname=" + super.getNachname() + ", vorname=" + super.getVorname() + "]";
	}
	 */


}
