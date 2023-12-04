package br.com.allanhladki.picpay_simplificado.resource;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("")
public class GeneralResource {
    
    @POST
    @Path("/create/user")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createUser(){
        System.out.println("GenerealResource.createUser was accessed");
        return Response.status(Response.Status.OK).build();
    }

}
