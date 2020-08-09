
package com.project.market.model.teztour;

import java.util.HashMap;
import java.util.Map;

public class ExternalFlights {

    private Boolean value;
    private String comment;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
