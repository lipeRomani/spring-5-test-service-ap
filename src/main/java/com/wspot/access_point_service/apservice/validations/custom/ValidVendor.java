package com.wspot.access_point_service.apservice.validations.custom;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Retention(RUNTIME)
@Target({FIELD, ANNOTATION_TYPE, PARAMETER})
@Constraint(validatedBy = VendorValidator.class)
public @interface ValidVendor {
    String message() default "Este vendor não é válido consulte a lista";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
