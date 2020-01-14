package com.kalosoftware.services.dto;

import com.kalosoftware.exceptions.ServicesException;
import java.util.Set;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.ws.rs.core.Response;

/**
 *
 * @author Carlos Cercado
 * @email cercadocarlos@gmail.com
 */
public abstract class DTOFacade<T> {

    private Set<ConstraintViolation<DTOFacade<T>>> getViolaciones() {
        final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        final Validator validator = factory.getValidator();
        return validator.validate(this);
    }

    private JsonObject getErrors() {
        final JsonObjectBuilder builder = Json.createObjectBuilder();

        this.getViolaciones().stream().forEach(x -> {
            builder.add(x.getPropertyPath().toString(), x.getMessage());
        });
        return builder.build();
    }
    
    public void validate() throws ServicesException{
        final JsonObject errors = this.getErrors();

        if(!errors.isEmpty()){
            throw new ServicesException(Response.Status.BAD_REQUEST, errors.toString());
        }
    }

}
