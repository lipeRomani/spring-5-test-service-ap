package com.wspot.access_point_service.apservice.validations.custom;

import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.List;

@Component
public class VendorValidator implements ConstraintValidator<ValidVendor, String> {

    private List<String> validVendors;

    public VendorValidator() {
        this.validVendors = new ArrayList<>();
        validVendors.add("cisco");
        validVendors.add("mikrotik");
        validVendors.add("fortinet");
        validVendors.add("pfsense");
    }

    @Override
    public boolean isValid(String parameter, ConstraintValidatorContext constraintValidatorContext) {
        return validVendors.contains(parameter);
    }
}
