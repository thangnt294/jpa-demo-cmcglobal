package com.cmcglobal.demo.api.others;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Language {
    @Column(name = "LANGUAGE_NAME")
    private String languageName;

    @Column(name = "COUNTRY_NAME")
    private String countryName;

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
