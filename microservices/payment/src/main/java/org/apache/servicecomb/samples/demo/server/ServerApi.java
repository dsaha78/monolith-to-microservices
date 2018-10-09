
package org.apache.servicecomb.samples.demo.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@RestSchema(schemaId = "payment")
@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class ServerApi {

	@Path("/payment")
	@GET
	public String payment(@QueryParam("total")  String total) {
		return total;
	}
}