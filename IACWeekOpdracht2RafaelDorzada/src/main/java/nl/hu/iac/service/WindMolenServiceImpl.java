package nl.hu.iac.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import nl.hu.iac.service.WindMolen;

public class WindMolenServiceImpl {
	private List<WindMolen> windmolens = new ArrayList<WindMolen>();

	public WindMolenServiceImpl() {
		windmolens.add(new WindMolen(1, 5, 5, 5, 125));
	}

	public WindMolen getWindMolenById(int id) {
		for (WindMolen windmolen : windmolens) {
			if (windmolen.getId() == id) {
				return windmolen;
			}
		}
		return null;
	}

	public List<WindMolen> getWindMolens() {
		return windmolens;
	}

	public WindMolen add(double constante, double mps, double diameter) {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(10000);
		WindMolen windmolen = new WindMolen(0,0,0,0, 0);
		windmolen.setId(randomInt);
		windmolen.setConstante(constante);
		windmolen.setDiameter(diameter);
		windmolen.setMps(mps);
		windmolen.setVermogen(constante * diameter * mps);
		if (windmolens.add(windmolen)) {
			return windmolen;
		} else {
			return null;
		}
	}

}
