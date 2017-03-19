package nl.hu.iac.rest;

import nl.hu.iac.service.ServiceProvider;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import nl.hu.iac.service.WindMolenServiceImpl;
import nl.hu.iac.service.WindMolen;

@Path("/Windmolen")
public class WindMolenRestService {
	
	@GET
	@Path("/{windMolenID}")
	@Produces({MediaType.APPLICATION_JSON})
	public WindMolen getWindMolen(@PathParam("windMolenID") int windMolenID) {
		WindMolenServiceImpl windMolenServiceImpl = ServiceProvider.getWindMolenService();
		return windMolenServiceImpl.getWindMolenById(windMolenID);
	}

	@GET
	@Path("/")
	@Produces({MediaType.APPLICATION_JSON})
	public List<WindMolen> getAllWindmolen() {
		WindMolenServiceImpl windMolenServiceImpl = ServiceProvider.getWindMolenService();
		return windMolenServiceImpl.getWindMolens();
	}
	
	@PUT
	@Consumes ({MediaType.APPLICATION_JSON})
	@Produces ({MediaType.APPLICATION_JSON})
	public WindMolen createWindMolen(@QueryParam("constante") double constante,@QueryParam("mps") double mps,@QueryParam("diameter") double diameter){
		WindMolenServiceImpl windMolenServiceImpl = ServiceProvider.getWindMolenService();
		return windMolenServiceImpl.add(constante, mps, diameter);

	}





}
