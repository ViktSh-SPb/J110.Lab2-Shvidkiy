package org.viktsh.files;

public class PictureSize {

    private String size;

    public PictureSize(int width, int height) {
        setSize(width, height);
    }

    public String getSize() {
        return size;
    }

    public void setSize(int width, int height) {
        if (width > 0 || height > 0) {
            this.size = (width + "x" + height);
        } else {
            throw new IllegalArgumentException("Размеры не должны быть меньше нуля");
        }
    }
}
