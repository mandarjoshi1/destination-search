
package com.destination.serach.model.foursquare;

import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "location",
    "categories",
    "venuePage",
    "referralId",
    "hasPerk"
})
public class Venue {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("categories")
    private List<Category> categories = null;
    @JsonProperty("venuePage")
    private VenuePage venuePage;
    @JsonProperty("referralId")
    private String referralId;
    @JsonProperty("hasPerk")
    private Boolean hasPerk;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("categories")
    public List<Category> getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @JsonProperty("venuePage")
    public VenuePage getVenuePage() {
        return venuePage;
    }

    @JsonProperty("venuePage")
    public void setVenuePage(VenuePage venuePage) {
        this.venuePage = venuePage;
    }

    @JsonProperty("referralId")
    public String getReferralId() {
        return referralId;
    }

    @JsonProperty("referralId")
    public void setReferralId(String referralId) {
        this.referralId = referralId;
    }

    @JsonProperty("hasPerk")
    public Boolean getHasPerk() {
        return hasPerk;
    }

    @JsonProperty("hasPerk")
    public void setHasPerk(Boolean hasPerk) {
        this.hasPerk = hasPerk;
    }

    public boolean checkCategories(String category){
       List filteredCatagories =  categories.stream().filter(c -> c.getName().contains(category)).collect(Collectors.toList());
       return filteredCatagories.size()>0;
    }
}
