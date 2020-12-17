package com.stargate.subscript.api;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stargate.subscript.controller.SubscriptionController;
import com.stargate.subscript.models.SubscriptionRequest;
import com.stargate.subscript.models.SubscriptionResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@Path("/subscription")
@Api(value = "Subscription", description = "Resource for getting and modifying Subscription")
@Component
public class SubscriptionApi {
	@Autowired
	SubscriptionController service;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Create a Subscription", response = SubscriptionResponse.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Bad request format") })
	public SubscriptionResponse save(@ApiParam(value = "Subscription to be created",required = true) final SubscriptionRequest request) {
		return service.save(request);
	}
//	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	@ApiOperation(value = "Get all Subscription", response = SubscriptionResponse.class, responseContainer = "List")
//	public Collection<SubscriptionResponse> getAll() {
//		return service.getAll();
//	}
//	
//	@PUT
//	@Path("{id}")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	@ApiOperation(value = "Update a Subscription", response = SubscriptionResponse.class)
//	@ApiResponses(value = { @ApiResponse(code = 400, message = "Bad request format"),
//			@ApiResponse(code = 404, message = "Subscription not found") })
//	public SubscriptionResponse update(@ApiParam(value = "Subscription id to update", required = true) @PathParam("id") final Long id,
//			@ApiParam(value = "Subscription details to be updated", required = true) final SubscriptionRequest request) {
//		return service.update(id, request);
//	}
//	
//	@DELETE
//	@Path("{id}")
//	@ApiOperation(value = "Delete a Subscription")
//	@ApiResponses(value = {
//	        @ApiResponse(code = 204, message = "Subscription deleted successfully"),
//	        @ApiResponse(code = 404, message = "Subscription not found")})
//	public void delete(@ApiParam(value = "Subscription id to delete", required = true) @PathParam("id") final Long id) {
//		service.delete(id);
//	}
}
