
package com.example.swedishuniversities.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "alpha_two_code",
    "domains",
    "country",
    "state-province",
    "web_pages",
    "name"
})
@Generated("jsonschema2pojo")
public class University {

    @JsonProperty("alpha_two_code")
    private String alphaTwoCode;
    @JsonProperty("domains")
    private List<String> domains = null;
    @JsonProperty("country")
    private String country;
    @JsonProperty("state-province")
    private Object stateProvince;
    @JsonProperty("web_pages")
    private List<String> webPages = null;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("alpha_two_code")
    public String getAlphaTwoCode() {
        return alphaTwoCode;
    }

    @JsonProperty("alpha_two_code")
    public void setAlphaTwoCode(String alphaTwoCode) {
        this.alphaTwoCode = alphaTwoCode;
    }

    @JsonProperty("domains")
    public List<String> getDomains() {
        return domains;
    }

    @JsonProperty("domains")
    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("state-province")
    public Object getStateProvince() {
        return stateProvince;
    }

    @JsonProperty("state-province")
    public void setStateProvince(Object stateProvince) {
        this.stateProvince = stateProvince;
    }

    @JsonProperty("web_pages")
    public List<String> getWebPages() {
        return webPages;
    }

    @JsonProperty("web_pages")
    public void setWebPages(List<String> webPages) {
        this.webPages = webPages;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


}
