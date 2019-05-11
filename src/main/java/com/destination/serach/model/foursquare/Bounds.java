
package com.destination.serach.model.foursquare;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ne",
    "sw"
})
public class Bounds {

    @JsonProperty("ne")
    private Ne ne;
    @JsonProperty("sw")
    private Sw sw;

    @JsonProperty("ne")
    public Ne getNe() {
        return ne;
    }

    @JsonProperty("ne")
    public void setNe(Ne ne) {
        this.ne = ne;
    }

    @JsonProperty("sw")
    public Sw getSw() {
        return sw;
    }

    @JsonProperty("sw")
    public void setSw(Sw sw) {
        this.sw = sw;
    }

}
