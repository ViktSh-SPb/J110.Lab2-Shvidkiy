package org.viktsh.university;

public enum Stage {
    BACHELOR("Bachelor"), MASTER("Master");
    private String translate;
    Stage(String translate){
        this.translate = translate;
    }

    public String getTranslate() {
        return translate;
    }
}
