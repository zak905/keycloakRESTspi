package org.restfull.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/custom")
public class UserResource {


    @GET
    @Path("/data")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomData() {
        return Response.ok("Custom data").build();
    }
}
