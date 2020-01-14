package com.kalosoftware.services;

import io.swagger.v3.oas.annotations.tags.Tag;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author Carlos Cercado
 * @email cercadocarlos@gmail.com
 */
@Path("/example")
@Tag(name = "Recurso de ejemplo")
public class ExampleService {
    
    @GET
    public Response get() {
        return Response.ok().entity("is alive").build();
    }

}
