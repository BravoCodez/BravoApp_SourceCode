package com.bravo.inc;

/**
 * Created by Bravo Inc.
 */

public class AdapterData {

    private Integer id;
    private String name;
    private String description;
    private String URL;

    public Integer getThumbnail() {
        return id;
    }

    public void setThumbnail(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return description;
    }

    public void setDetail(String description) {
        this.description = description;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String url) {
        this.URL = url;
    }


}
