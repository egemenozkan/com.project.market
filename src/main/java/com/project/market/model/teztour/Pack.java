
package com.project.market.model.teztour;

import java.util.HashMap;
import java.util.Map;

public class Pack {

    private Boolean value;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
