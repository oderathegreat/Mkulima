package io.mkulima.mkulima.models;

import java.util.List;

/**
 * Created by walter on 8/31/18.
 */

public class Item {
    String heading;
    List<Content> contentList;

    public Item(String heading, List<Content> contentList) {
        this.heading = heading;
        this.contentList = contentList;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public List<Content> getContentList() {
        return contentList;
    }

    public void setContentList(List<Content> contentList) {
        this.contentList = contentList;
    }
}
