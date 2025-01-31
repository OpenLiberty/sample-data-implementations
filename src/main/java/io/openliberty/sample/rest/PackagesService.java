package io.openliberty.sample.rest;

import io.openliberty.sample.data.Packages;
import io.openliberty.sample.data.Package;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/packages")
@ApplicationScoped
public class PackagesService {
    
    @Inject
    Packages packages;

    @GET //For testing eventually change to POST
    @Path("/{id}") 
    public void add(@PathParam("id") Integer id) {
        packages.save(new Package(id, "Rochester, MN"));
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN) 
    public String get() {
        StringBuilder sb = new StringBuilder();
        packages.findAll().forEach(p -> {
            sb.append(p.id() + ": " +p.destination()).append(System.lineSeparator());
        });
        return sb.toString();
    }

}
