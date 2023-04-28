package parser;

import error.ParserError;
import model.QualificationCode;
import model.Tsv;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import static model.TsvInput.AGENCY;
import static model.TsvInput.FLOW_RATE;
import static model.TsvInput.LOCAL_TIME;
import static model.TsvInput.QUALIFICATION_CODE;
import static model.TsvInput.SITE_NUMBER;

public class TsvParser implements Parser<Tsv> {
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    @Override
    public Tsv parse(final String input) {
        Objects.requireNonNull(input);
        String[] split = input.split("\t");
        if (split.length != 6) throw new ParserError("Input length error");

        return mapInputToTsv(split);
    }

    private Tsv mapInputToTsv(final String[] split) {
        return Tsv.builder()
                .agency(split[AGENCY.getPos()])
                .siteNumber(split[SITE_NUMBER.getPos()])
                .localTimestamp(getLocalTimeValue(split[LOCAL_TIME.getPos()]))
//                .utcTimestamp(getLocalTimeValue(split[UTC_TIME.getPos()]))
                .flowRate(getDoubleValue(split[FLOW_RATE.getPos()]))
                .qualificationCode(getCodeValue(split[QUALIFICATION_CODE.getPos()])).build();
    }

    private Double getDoubleValue(final String input) {
        return Double.valueOf(input);
    }

    private LocalDateTime getLocalTimeValue(final String input) {
        // 2021-12-30 14:30
        // Local Timestamp: Thu 30 Dec 2021 02:30:00 PM MST
//        return OffsetDateTime.parse(input, DATE_FORMATTER).toLocalDateTime();
        return LocalDateTime.parse(input, DATE_FORMATTER);
    }

    private LocalDateTime getUTCTimeValue(final String input) {
        return OffsetDateTime.parse(input, DATE_FORMATTER)
                .withOffsetSameInstant(ZoneOffset.UTC)
                .toLocalDateTime();
    }

    private QualificationCode getCodeValue(final String input) {
        return QualificationCode.valueOf(input);
    }
}
