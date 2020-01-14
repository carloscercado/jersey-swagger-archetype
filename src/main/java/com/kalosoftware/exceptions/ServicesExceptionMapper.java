package com.kalosoftware.exceptions;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 *
 * @author Carlos Cercado
 * @email cercadocarlos@gmail.com
 */
public class ServicesExceptionMapper implements ExceptionMapper<ServicesException> {

    @Override
    public Response toResponse(ServicesException exception) {
        if (exception.getMessage() != null) {
            
            if (ConstantErrors.DATA_VALIDATION_ERROR.equals(exception.getError())) {
                return Response.status(exception.getStatus())
                        .type(MediaType.APPLICATION_JSON)
                        .entity(exception.getMessage())
                        .build();
            }
            final JsonObject json = Json.createObjectBuilder().add("message", exception.getMessage()).build();

            return Response.status(exception.getStatus())
                    .type(MediaType.APPLICATION_JSON)
                    .entity(json.toString())
                    .build();
        }

        return Response.status(exception.getStatus()).build();
    }

}
