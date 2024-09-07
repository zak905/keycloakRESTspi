package org.restfull.api;

import org.keycloak.models.KeycloakSession;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


public class UserResource {

    private final KeycloakSession session;


   public UserResource(KeycloakSession session) {
    this.session = session;
   }
   

    @GET
    @Path("/data")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomData() {
        return Response.ok("Custom data").build();
    }

    @GET @Path("")
    @Produces("text/plain; charset=utf-8")
    public String get() {
        String name = session.getContext().getRealm().getDisplayName();
        if (name == null) {
            name = session.getContext().getRealm().getName();
        }
        return "Hello " + name;
    }

    @GET
    @Path("/user")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomData2() {
        return Response.ok("Custom user data").build();
    }
}
