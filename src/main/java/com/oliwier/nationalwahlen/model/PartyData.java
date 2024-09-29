package com.oliwier.nationalwahlen.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class PartyData {

    private final String partyID;
    private final String amountVotes;

    @JacksonXmlElementWrapper(localName = "preferredCandidates")
    @JacksonXmlProperty(localName = "preferredCandidate")
    private List<PreferredCandidate> preferredCandidates = new ArrayList<>();

    public PartyData(String partyId, String amountVotes, List<PreferredCandidate> preferredCandidates) {
        this.partyID = partyId;
        this.amountVotes = amountVotes;
        this.preferredCandidates = preferredCandidates;
    }

}
