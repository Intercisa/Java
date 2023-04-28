package model;

public enum TsvInput {
    AGENCY(0),
    SITE_NUMBER(1),
    LOCAL_TIME(2),
    LOCAL(3),
    FLOW_RATE(4),
    QUALIFICATION_CODE(5);

    private final int pos;

    TsvInput(int pos) {
        this.pos = pos;
    }

    public int getPos() {
        return pos;
    }
}
