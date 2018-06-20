package com.wspot.access_point_service.apservice.services.accessPoint;

import com.wspot.access_point_service.apservice.Repositories.AccessPointRepository;
import com.wspot.access_point_service.apservice.entities.AccessPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccessPointCreateServiceImp implements AccessPointCreateService {

    private AccessPointRepository accessPointRepository;

    @Autowired
    public AccessPointCreateServiceImp(AccessPointRepository accessPointRepository) {
        this.accessPointRepository = accessPointRepository;
    }

    public AccessPoint create(AccessPoint accessPoint) {
        return accessPointRepository.save(accessPoint);
    }

    @Override
    public AccessPoint detail(String id) {
        return accessPointRepository.findById(id).get();
    }
}
