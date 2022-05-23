package com.example.swedishuniversities.model;


import java.util.List;

public class SimpleUniversity {

    String country;
    String name;
    List<String> domains;
    List<String> webPages;


    public SimpleUniversity(String country, String name, List<String> domains, List<String> webPages) {
        this.country = country;
        this.name = name;
        this.domains = domains;
        this.webPages = webPages;
    }

    public SimpleUniversity() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDomain() {
        return domains;
    }

    public void setDomain(List<String> domain) {
        this.domains = domain;
    }

    public List<String> getWebPages() {
        return webPages;
    }

    public void setWebPages(List<String> webPages) {
        this.webPages = webPages;
    }

    @Override
    public String toString() {
        return "SimpleUniversity{" +
                "country='" + country + '\'' +
                ", name='" + name + '\'' +
                ", domains=" + domains +
                ", webPages=" + webPages +
                '}';
    }
}
