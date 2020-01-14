package com.kalosoftware.services;

import com.kalosoftware.exceptions.ServicesException;
import com.kalosoftware.services.dto.ExampleDTO;
import io.swagger.v3.oas.annotations.tags.Tag;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Carlos Cercado
 * @email cercadocarlos@gmail.com
 */
@Path("/example")
@Tag(name = "Recurso de ejemplo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ExampleService {

    @GET
    public Response get() {
        return Response.ok().entity("is alive").build();
    }

    @POST
    public Response register(ExampleDTO body) throws ServicesException {

        body.validate();

        /*
        ExampleDAO dao = new ExampleDAO();
        Example obj =  new Example();
        dao.create(obj);
        */
        return Response.ok().entity("{\"status\": true}").build();
    }

}
