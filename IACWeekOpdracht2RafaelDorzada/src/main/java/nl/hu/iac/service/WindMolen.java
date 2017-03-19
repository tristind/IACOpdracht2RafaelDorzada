package nl.hu.iac.service;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WindMolen {

	int id;
	double constante;
	double mps;
	double diameter;
	double vermogen;

	@Override
	public String toString() {
		return "Windmolen [id=" + id + ", constante=" + constante + ", mps=" + mps
				+ ", mps= " + diameter + " , vermogen (watt) = " + vermogen  + "]";
	}

	public WindMolen(int id, double constante, double mps, double diameter, double vermogen) {
		this.id = id;
		this.constante = constante;
		this.mps = mps;
		this.diameter = diameter;
		this.vermogen = vermogen;
	}

	public int getId() {
		return id;
	}

	@XmlAttribute
	public void setId(int id) {
		this.id = id;
	}

	public double getConstante() {
		return constante;
	}

	public void setConstante(double constante) {
		this.constante = constante;
	}

	public double getMps() {
		return mps;
	}

	public void setMps(double mps) {
		this.mps = mps;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}


	public double getVermogen() {
		return vermogen;
	}

	public void setVermogen(double vermogen) {
		this.vermogen = vermogen;
	}
}
