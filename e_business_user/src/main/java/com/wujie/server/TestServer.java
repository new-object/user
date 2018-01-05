package com.wujie.server;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

public class TestServer implements TestServerInf{

	@Override
	@GET
	@Path("/test")
	@Consumes("application/x-www-form-urlencoded")
	@Produces("application/json")
	public void ping(@FormParam("pong") String pong) {
		System.out.println(pong);
	}

}
