package model;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public class Tsv {
    private String agency;
    private String siteNumber;
    private LocalDateTime localTimestamp;
    private LocalDateTime utcTimestamp;
    private Double flowRate;
    private QualificationCode qualificationCode;

    @Override
    public String toString() {
        return "You entered the following:\nAgency:" + agency + "\nSite Number:" + siteNumber + "\nLocal Timestamp:" + localTimestamp + "\nUTC Timestamp:" + utcTimestamp + "\nFlow Rate:" + flowRate + "\nQualification Code:" + qualificationCode;
    }
}
