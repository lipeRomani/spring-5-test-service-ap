package com.wspot.access_point_service.apservice.services.accessPoint;

import com.wspot.access_point_service.apservice.entities.AccessPoint;

public interface AccessPointCreateService {
    AccessPoint create(AccessPoint accessPoint);
    AccessPoint detail(String id);
}
