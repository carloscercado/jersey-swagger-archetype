package com.kalosoftware.services;

import com.kalosoftware.exceptions.ServicesExceptionMapper;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author Carlos Cercado
 * @email cercadocarlos@gmail.com
 */
@ApplicationPath("rest")
public class Application extends ResourceConfig {

    public Application() {
        packages("io.swagger.v3.jaxrs2.integration.resources,com.kalosoftware.services");

        register(ServicesExceptionMapper.class);
    }

}
