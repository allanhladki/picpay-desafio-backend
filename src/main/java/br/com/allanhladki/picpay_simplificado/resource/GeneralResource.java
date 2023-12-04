package br.com.allanhladki.picpay_simplificado.resource;

import br.com.allanhladki.picpay_simplificado.model.User;
import br.com.allanhladki.picpay_simplificado.service.GeneralService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
@Path("")
public class GeneralResource {
    
    @POST
    @Path("/create/user")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createUser(User user){
        System.out.println("[LOG]GenerealResource.createUser was accessed");
        return GeneralService.createUser(user);
    }

}