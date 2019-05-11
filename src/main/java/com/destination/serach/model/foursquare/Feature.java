
package com.destination.serach.model.foursquare;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cc",
    "name",
    "displayName",
    "matchedName",
    "highlightedName",
    "woeType",
    "slug",
    "id",
    "longId",
    "geometry"
})
public class Feature {

    @JsonProperty("cc")
    private String cc;
    @JsonProperty("name")
    private String name;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("matchedName")
    private String matchedName;
    @JsonProperty("highlightedName")
    private String highlightedName;
    @JsonProperty("woeType")
    private Integer woeType;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("id")
    private String id;
    @JsonProperty("longId")
    private String longId;
    @JsonProperty("geometry")
    private Geometry geometry;

    @JsonProperty("cc")
    public String getCc() {
        return cc;
    }

    @JsonProperty("cc")
    public void setCc(String cc) {
        this.cc = cc;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("matchedName")
    public String getMatchedName() {
        return matchedName;
    }

    @JsonProperty("matchedName")
    public void setMatchedName(String matchedName) {
        this.matchedName = matchedName;
    }

    @JsonProperty("highlightedName")
    public String getHighlightedName() {
        return highlightedName;
    }

    @JsonProperty("highlightedName")
    public void setHighlightedName(String highlightedName) {
        this.highlightedName = highlightedName;
    }

    @JsonProperty("woeType")
    public Integer getWoeType() {
        return woeType;
    }

    @JsonProperty("woeType")
    public void setWoeType(Integer woeType) {
        this.woeType = woeType;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("longId")
    public String getLongId() {
        return longId;
    }

    @JsonProperty("longId")
    public void setLongId(String longId) {
        this.longId = longId;
    }

    @JsonProperty("geometry")
    public Geometry getGeometry() {
        return geometry;
    }

    @JsonProperty("geometry")
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

}
