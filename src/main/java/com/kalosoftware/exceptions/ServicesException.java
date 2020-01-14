package com.kalosoftware.exceptions;

import javax.ws.rs.core.Response;

/**
 *
 * @author Carlos Cercado
 * @email cercadocarlos@gmail.com
 */
public class ServicesException extends Exception {

    private final Response.Status status;
    private Integer error;

    public ServicesException(Response.Status status) {
        this.status = status;
    }

    public ServicesException(Response.Status status, String msg) {
        super(msg);
        this.status = status;
    }

    public ServicesException(Response.Status status, String msg, Integer error) {
        super(msg);
        this.status = status;
        this.error = error;
    }

    public Response.Status getStatus() {
        return status;
    }

    public Integer getError() {
        return error;
    }

}
