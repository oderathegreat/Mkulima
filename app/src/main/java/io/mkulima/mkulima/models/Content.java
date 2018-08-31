package io.mkulima.mkulima.models;

/**
 * Created by walter on 8/31/18.
 */

public class Content {
    String text;

    public Content(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
