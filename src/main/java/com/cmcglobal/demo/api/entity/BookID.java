package com.cmcglobal.demo.api.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class BookID implements Serializable {
    private int id;

    private String serialNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
