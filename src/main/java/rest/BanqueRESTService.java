package rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import metier.Compte;
@Path("banque")
public class BanqueRESTService {
    @GET 
    @Path("conversion/{montant}") 
    @Produces(MediaType.APPLICATION_JSON)
    public double conversion(@PathParam(value = "montant") double mt){
        return mt*10;
    }
    @GET 
    @Path("comptes/{code}") 
    @Produces(MediaType.APPLICATION_JSON)
    public Compte consulterCompte(@PathParam(value = "code") int code){
        Compte compte=new Compte(1,Math.random()*9000,new Date());

        return compte;
    }
    @GET 
    @Path("comptes") 
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public List<Compte> listComptes(){
        List<Compte> comptes = new ArrayList<Compte>();
        comptes.add(new Compte(1,Math.random()*9000,new Date()));
        comptes.add(new Compte(2,Math.random()*9000,new Date()));
        comptes.add(new Compte(3,Math.random()*9000,new Date()));

        return comptes;
    }
}