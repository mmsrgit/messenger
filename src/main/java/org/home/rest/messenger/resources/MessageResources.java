package org.home.rest.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.home.rest.messenger.beans.Message;
import org.home.rest.messenger.service.MessengerService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("messages")
public class MessageResources {
	
	MessengerService mSvc = new MessengerService();

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@Path("getMessages")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getMessages() {
        return mSvc.getMessages();
    }
	
	@Path("getMessagesJSON")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessage() {
        return mSvc.getMessages();
    }
}
