package com.oliwier.nationalwahlen.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@JacksonXmlRootElement(localName = "electionData")
public class WarehouseData {

	private String regionID;
	private String regionName;
	private String regionAddress;
	private String regionPostalCode;
	private String federalState;

	@Setter(AccessLevel.NONE)
	private String timestamp;


	@JacksonXmlElementWrapper(localName = "countingData")
	@JacksonXmlProperty(localName  = "party")
	private List<PartyData> parties = new ArrayList<>();

	/**
	 * Constructor
	 */
	public WarehouseData() {
		this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
	}

	public void addParty(String partyId, String amountVotes, List<PreferredCandidate> preferredCandidates) {
		PartyData party = new PartyData(partyId, amountVotes, preferredCandidates);
		this.parties.add(party);
	}


	/**
	 * Methods
	 */
	@Override
	public String toString() {
		String info = String.format("Warehouse Info: ID = %s, timestamp = %s", regionID, timestamp );
		return info;
	}
}
