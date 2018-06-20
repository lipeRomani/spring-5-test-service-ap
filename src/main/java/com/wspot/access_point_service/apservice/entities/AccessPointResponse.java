package com.wspot.access_point_service.apservice.entities;

import org.springframework.hateoas.ResourceSupport;

public class AccessPointResponse extends ResourceSupport {
    private String accessPointId;
    private String accessPointName;
    private String accessPointIdentifier;

    public String getAccessPointId() {
        return accessPointId;
    }

    public AccessPointResponse setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }

    public String getAccessPointName() {
        return accessPointName;
    }

    public AccessPointResponse setAccessPointName(String accessPointName) {
        this.accessPointName = accessPointName;
        return this;
    }

    public String getAccessPointIdentifier() {
        return accessPointIdentifier;
    }

    public AccessPointResponse setAccessPointIdentifier(String accessPointIdentifier) {
        this.accessPointIdentifier = accessPointIdentifier;
        return this;
    }
}
