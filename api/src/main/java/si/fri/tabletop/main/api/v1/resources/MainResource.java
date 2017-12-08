package si.fri.tabletop.main.api.v1.resources;

import org.json.JSONArray;
import org.json.JSONObject;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@ApplicationScoped
@Path("/info")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MainResource {

    @Context
    private UriInfo uriInfo;

    @GET
    public Response getPlaces() {
        JSONObject json = new JSONObject();

        JSONArray clani = new JSONArray();
        // TODO
        clani.put("ta6939");

        JSONArray mikrostoritve = new JSONArray();
        // TODO
        mikrostoritve.put("http://35.189.96.119:8081/v1/orders");

        JSONArray github = new JSONArray();
        // TODO
        github.put("https://github.com/jmezna/rso-customers");

        JSONArray travis = new JSONArray();
        // TODO
        travis.put("https://travis-ci.org/jmezna/rso-customers");

        JSONArray dockerhub = new JSONArray();
        // TODO
        dockerhub.put("https://hub.docker.com/r/jmezna/rso-customers");

        json.put("clani", clani);
        // TODO
        json.put("opis_projekta", "Nas projekt implementira aplikacijo za oddajo nepremicnin.");
        json.put("mikrostoritve", mikrostoritve);
        json.put("github", github);
        json.put("travis", travis);
        json.put("dockerhub", dockerhub);

        return Response.ok(json.toString()).build();
    }

}
