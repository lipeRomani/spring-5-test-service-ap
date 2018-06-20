package com.wspot.access_point_service.apservice.Repositories;

import com.wspot.access_point_service.apservice.entities.AccessPoint;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessPointRepository extends CrudRepository<AccessPoint, String> {
}
