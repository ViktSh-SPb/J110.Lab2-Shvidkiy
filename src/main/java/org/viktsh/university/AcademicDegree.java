package org.viktsh.university;

public enum AcademicDegree {
    MASTERSCIENCE("MSc"), DOCTORSCIENCE("DSc"), PHD("PhD");
    private String translate;
    AcademicDegree(String translate){
        this.translate = translate;
    }

    public String getTranslate() {
        return translate;
    }
}