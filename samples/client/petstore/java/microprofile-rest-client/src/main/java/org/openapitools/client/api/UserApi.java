/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import org.openapitools.client.model.User;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 * OpenAPI Petstore
 *
 * <p>This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 */

@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("/user")
public interface UserApi  {

    /**
     * Create user
     *
     * This can only be done by the logged in user.
     *
     */
    @POST
    
    public void createUser(User body) throws ApiException, ProcessingException;

    /**
     * Creates list of users with given input array
     *
     */
    @POST
    @Path("/createWithArray")
    public void createUsersWithArrayInput(List<User> body) throws ApiException, ProcessingException;

    /**
     * Creates list of users with given input array
     *
     */
    @POST
    @Path("/createWithList")
    public void createUsersWithListInput(List<User> body) throws ApiException, ProcessingException;

    /**
     * Delete user
     *
     * This can only be done by the logged in user.
     *
     */
    @DELETE
    @Path("/{username}")
    public void deleteUser(@PathParam("username") String username) throws ApiException, ProcessingException;

    /**
     * Get user by user name
     *
     */
    @GET
    @Path("/{username}")
    @Produces({ "application/xml", "application/json" })
    public User getUserByName(@PathParam("username") String username) throws ApiException, ProcessingException;

    /**
     * Logs user into the system
     *
     */
    @GET
    @Path("/login")
    @Produces({ "application/xml", "application/json" })
    public String loginUser(@QueryParam("username") String username, @QueryParam("password") String password) throws ApiException, ProcessingException;

    /**
     * Logs out current logged in user session
     *
     */
    @GET
    @Path("/logout")
    public void logoutUser() throws ApiException, ProcessingException;

    /**
     * Updated user
     *
     * This can only be done by the logged in user.
     *
     */
    @PUT
    @Path("/{username}")
    public void updateUser(@PathParam("username") String username, User body) throws ApiException, ProcessingException;
}

