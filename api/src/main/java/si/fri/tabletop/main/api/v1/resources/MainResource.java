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
@Path("/demo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MainResource {

    @Context
    private UriInfo uriInfo;

    @GET
    @Path("/info")
    public Response getPlaces() {
        JSONObject json = new JSONObject();

        JSONArray clani = new JSONArray();
        clani.put("ta6939");
        clani.put("dgXXXX"); // TODO
        clani.put("naXXXX"); // TODO

        JSONArray mikrostoritve = new JSONArray();
        // TODO: spremenit porte
        mikrostoritve.put("http://169.51.8.66:8081/v1/places");
        mikrostoritve.put("http://169.51.8.66:8081/v1/menus");
        mikrostoritve.put("http://169.51.8.66:8081/v1/orders");
        mikrostoritve.put("http://169.51.8.66:8081/v1/customers");

        JSONArray github = new JSONArray();
        github.put("https://github.com/TableTopLtd/tt-places");
        github.put("https://github.com/TableTopLtd/tt-menus");
        github.put("https://github.com/TableTopLtd/tt-orders");
        github.put("https://github.com/TableTopLtd/tt-customers");
        github.put("https://github.com/TableTopLtd/tt-main");

        JSONArray travis = new JSONArray();
        travis.put("https://travis-ci.org/TableTopLtd/tt-places/");
        travis.put("https://travis-ci.org/TableTopLtd/tt-menus/");
        travis.put("https://travis-ci.org/TableTopLtd/tt-orders/");
        travis.put("https://travis-ci.org/TableTopLtd/tt-customers/");
        travis.put("https://travis-ci.org/TableTopLtd/tt-main/");

        JSONArray dockerhub = new JSONArray();
        dockerhub.put("https://hub.docker.com/r/tabletopltd/tt-places/");
        dockerhub.put("https://hub.docker.com/r/tabletopltd/tt-menus/");
        dockerhub.put("https://hub.docker.com/r/tabletopltd/tt-orders/");
        dockerhub.put("https://hub.docker.com/r/tabletopltd/tt-customers/");
        dockerhub.put("https://hub.docker.com/r/tabletopltd/tt-main/");

        json.put("clani", clani);
        json.put("opis_projekta", "TableTop - Nas projekt implementira aplikacijo za rezervacijo miz in naročilo hrane v restavracijah.");
        json.put("mikrostoritve", mikrostoritve);
        json.put("github", github);
        json.put("travis", travis);
        json.put("dockerhub", dockerhub);

        return Response.ok(json.toString()).build();
    }

}
