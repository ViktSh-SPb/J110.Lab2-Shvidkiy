package org.viktsh.files;

public class MediaDuration {
    private String duration;

    public MediaDuration(String duration) {
        setDuration(duration);
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        if(duration.matches("[0-9][0-9]:[0-5][0-9]:[0-5][0-9]")||duration.matches("[0-5][0-9]:[0-5][0-9]")||duration.matches("[0-5][0-9]")){
            this.duration = duration;
        }else {
            throw new IllegalArgumentException("Недопустимый формат времени");
        }
    }
}
