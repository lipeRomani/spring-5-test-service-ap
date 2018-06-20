package com.wspot.access_point_service.apservice.controllers;

import com.wspot.access_point_service.apservice.entities.AccessPoint;
import com.wspot.access_point_service.apservice.entities.AccessPointResponse;
import com.wspot.access_point_service.apservice.services.accessPoint.AccessPointCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@RestController
@RequestMapping("/access-point")
public class AccessPointController {

    private AccessPointCreateService accessPointCreateService;
    private ObjectError error;

    @Autowired
    public AccessPointController(AccessPointCreateService accessPointCreateService) {
        this.accessPointCreateService = accessPointCreateService;
    }

    @PostMapping
    public AccessPointResponse create(@Valid @RequestBody AccessPoint accessPoint) {
        AccessPoint apCreated = accessPointCreateService.create(accessPoint);

        AccessPointResponse accessPointResponse = new AccessPointResponse()
                .setAccessPointId(apCreated.getId())
                .setAccessPointIdentifier(apCreated.getIdentifier())
                .setAccessPointName(apCreated.getName());

        Link link = linkTo(AccessPointController.class).slash(apCreated.getId()).withSelfRel();

        accessPointResponse.add(link);
        return accessPointResponse;
    }

    @GetMapping("/{id}")
    public AccessPoint detail(@PathVariable("id") String id) {
        return accessPointCreateService.detail(id);
    }
}
