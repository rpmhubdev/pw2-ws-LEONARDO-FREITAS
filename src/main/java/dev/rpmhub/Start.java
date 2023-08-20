package dev.rpmhub;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api")
public class Start {

    @POST
    @Path("/miles")
    @Consumes("application/x-www-form-urlencoded; charset = UTF-8")
    @Produces(MediaType.TEXT_PLAIN)
    public String miles(@FormParam("milhas") double milhas) {
        double multiplicador = 0.62137;
        double conversor = (milhas*multiplicador);
        return String.valueOf(conversor);
    }

    @GET
    @Path("/kilo/{quilometros}")
    @Produces(MediaType.APPLICATION_JSON)
    public String kilo(@PathParam("quilometros") double quilometros) {
        double divisor = 1.852;
        double conversor = (quilometros*divisor);
        return String.valueOf(conversor);
    }

}
