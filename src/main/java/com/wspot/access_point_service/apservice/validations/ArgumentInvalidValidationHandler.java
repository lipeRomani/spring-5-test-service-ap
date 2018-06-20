package com.wspot.access_point_service.apservice.validations;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice
@RestController
public class ArgumentInvalidValidationHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        List<ObjectError> allErrors = ex.getBindingResult()
                .getAllErrors();

        HashMap<String,String> map = new HashMap<>();

        for(ObjectError error : allErrors) {
            FieldError fieldError = (FieldError) error;
            map.put(fieldError.getField(), error.getDefaultMessage());
        }

        return map;
    }
}
