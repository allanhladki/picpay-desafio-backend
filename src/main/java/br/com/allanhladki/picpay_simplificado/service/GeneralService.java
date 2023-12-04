package br.com.allanhladki.picpay_simplificado.service;

import br.com.allanhladki.picpay_simplificado.model.User;
import jakarta.ws.rs.core.Response;

public class GeneralService {
    
    public static Response createUser(User user){
        System.out.println("[LOG]GeneralService.createUser was accessed");
        return Response.status(Response.Status.OK).entity(user).build();
    }
}
