package com.oliwier.nationalwahlen.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class PreferredCandidate {
    private String candidateName;
    private String candidateVotes;
}
