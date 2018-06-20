package com.wspot.access_point_service.apservice.entities;

import com.wspot.access_point_service.apservice.validations.custom.ValidVendor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Document
public class AccessPoint {

    @Id
    private String id;

    @NotNull
    @Size(min = 0, max = 100)
    private String name;
    private String local;

    @NotNull
    @Size(min = 5, max = 20)
    private String identifier;

    @ValidVendor
    private String vendor;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
}