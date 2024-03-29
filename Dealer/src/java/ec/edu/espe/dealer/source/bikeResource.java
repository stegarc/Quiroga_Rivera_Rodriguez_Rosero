/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.dealer.source;

import ec.edu.espe.dealer.controler.BikeDao;
import ec.edu.espe.dealer.model.Bike;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author kevinquiroga
 */
@Path("bike")
public class bikeResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of bikeResource
     */
    public bikeResource() {
    }

    /**
     * Retrieves representation of an instance of ec.edu.espe.dealer.source.bikeResource
     * @return an instance of ec.edu.espe.dealer.model.Bike
     */
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Bike getBikeById(@PathParam("id") String id) {
        String id_product;
        BikeDao bikeDat=new BikeDao();
      
       
        /*bike=bikeDat.buscarMoto(id);*/
        return   bikeDat.buscarMotos(id);
    }
      BikeDao bikeDat=new BikeDao();
  @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bike> getAllBikes() {
  
        return bikeDat.searchAllBikes();
    }
 
    
    /**
     * PUT method for updating or creating an instance of bikeResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(Bike content) {
    }
}
