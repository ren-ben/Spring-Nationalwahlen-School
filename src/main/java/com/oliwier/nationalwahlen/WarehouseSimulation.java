package com.oliwier.nationalwahlen;

import com.oliwier.nationalwahlen.model.PreferredCandidate;
import com.oliwier.nationalwahlen.model.WarehouseData;

import java.util.Arrays;

public class WarehouseSimulation {

	private int getRandomInt( int inMinimum, int inMaximum ) {
		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum; 
		long rounded = Math.round(number);
		return (int) rounded;
	}

	public WarehouseData getData(String inID) {

		WarehouseData data = new WarehouseData();
		data.setRegionID(inID);
		data.setRegionName("Linz Bahnhof");
		data.setRegionAddress("Bahnhofstraße 27/9");
		data.setRegionPostalCode("4020");
		data.setFederalState("Austria");

		data.addParty("OEVP", String.valueOf(getRandomInt(200, 500)), Arrays.asList(
				new PreferredCandidate("Karl Nehammer", String.valueOf(getRandomInt(10, 100))),
				new PreferredCandidate("Elisabeth Köstinger", String.valueOf(getRandomInt(10, 100)))
		));

		data.addParty("SPOE", String.valueOf(getRandomInt(200, 500)), Arrays.asList(
				new PreferredCandidate("Pamela Rendi-Wagner", String.valueOf(getRandomInt(10, 100))),
				new PreferredCandidate("Andreas Babler", String.valueOf(getRandomInt(10, 100)))
		));

		data.addParty("FPOE", String.valueOf(getRandomInt(200, 500)), Arrays.asList(
				new PreferredCandidate("Herbert Kickl", String.valueOf(getRandomInt(10, 100))),
				new PreferredCandidate("Norbert Hofer", String.valueOf(getRandomInt(10, 100)))
		));

		data.addParty("GRUENE", String.valueOf(getRandomInt(200, 500)), Arrays.asList(
				new PreferredCandidate("Werner Kogler", String.valueOf(getRandomInt(10, 100))),
				new PreferredCandidate("Leonore Gewessler", String.valueOf(getRandomInt(10, 100)))
		));

		data.addParty("NEOS", String.valueOf(getRandomInt(200, 500)), Arrays.asList(
				new PreferredCandidate("Beate Meinl-Reisinger", String.valueOf(getRandomInt(10, 100))),
				new PreferredCandidate("Sepp Schellhorn", String.valueOf(getRandomInt(10, 100)))
		));

		data.addParty("MFG", String.valueOf(getRandomInt(200, 500)), Arrays.asList(
				new PreferredCandidate("Michael Brunner", String.valueOf(getRandomInt(10, 100))),
				new PreferredCandidate("Gerald Hauser", String.valueOf(getRandomInt(10, 100)))
		));

		return data;
	}


}
