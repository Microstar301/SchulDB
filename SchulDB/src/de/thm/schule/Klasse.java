package de.thm.schule;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Klasse{

	public int getKNr() {
		return KNr;
	}

	public void setKNr(int knr) {
		this.KNr = KNr;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int KNr;
	private String bezeichnung;
	private int klassenlehrer;
	private int AnzahlSchueler;

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public int getKlassenlehrer() {
		return klassenlehrer;
	}

	public void setLehrer(int klassenlehrer){
		this.klassenlehrer = klassenlehrer;
	}

	public int getAnzahlSchueler() {
		return AnzahlSchueler;
	}

	public void setAnzahlSchueler(int anzahlSchueler) {
		AnzahlSchueler = anzahlSchueler;
	}


	/*
	private Lehrer lehrer;
	private ArrayList<Schueler> schueler;

	public ArrayList<Schueler> getSchueler() {
		return schueler;
	}

	public void setSchueler(ArrayList<Schueler> schueler) {
		this.schueler = schueler;
	}

	public Lehrer getLehrer() {
		return lehrer;
	}

	public void setLehrer(Lehrer lehrer) {
		this.lehrer = lehrer;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	 */

	@OneToOne(mappedBy = "klasse", optional = false)
	private Lehrer lehrer;

	public Lehrer getLehrer() {
		return lehrer;
	}

	public void setLehrer(Lehrer lehrer) {
		this.lehrer = lehrer;
	}
}
